package de.labystudio.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MultipartUtility
{
  private final String boundary;
  private static final String LINE_FEED = "\r\n";
  private HttpURLConnection httpConn;
  private String charset;
  private OutputStream outputStream;
  private PrintWriter writer;
  
  public MultipartUtility(String requestURL, String charset)
    throws IOException
  {
    this.charset = charset;
    
    this.boundary = ("" + System.currentTimeMillis() + "");
    
    URL url = new URL(requestURL);
    this.httpConn = ((HttpURLConnection)url.openConnection());
    this.httpConn.setUseCaches(false);
    this.httpConn.setDoOutput(true);
    this.httpConn.setDoInput(true);
    this.httpConn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.boundary);
    this.httpConn.setRequestProperty("User-Agent", "curl/7.49.0");
    this.httpConn.setRequestMethod("PUT");
  }
  
  public void addRequestProperty(String key, String value)
  {
    this.httpConn.setRequestProperty(key, value);
  }
  
  public void open()
  {
    try
    {
      this.outputStream = this.httpConn.getOutputStream();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    try
    {
      this.writer = new PrintWriter(new OutputStreamWriter(this.outputStream, this.charset), true);
    }
    catch (UnsupportedEncodingException e)
    {
      e.printStackTrace();
    }
  }
  
  public void addFormField(String name, String value)
  {
    this.writer.append("--" + this.boundary).append("\r\n");
    this.writer.append("Content-Disposition: form-data; name=\"" + name + "\"")
      .append("\r\n");
    
    this.writer.append("\r\n");
    this.writer.append(value).append("\r\n");
    this.writer.flush();
  }
  
  public void addFilePart(String fieldName, File uploadFile)
    throws IOException
  {
    String fileName = uploadFile.getName();
    this.writer.append("--" + this.boundary).append("\r\n");
    this.writer.append("Content-Disposition: form-data; name=\"" + fieldName + "\"; filename=\"" + fileName + "\"").append("\r\n");
    this.writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(fileName)).append("\r\n");
    this.writer.append("\r\n");
    this.writer.flush();
    
    FileInputStream inputStream = new FileInputStream(uploadFile);
    byte[] buffer = new byte['က'];
    int bytesRead = -1;
    while ((bytesRead = inputStream.read(buffer)) != -1) {
      this.outputStream.write(buffer, 0, bytesRead);
    }
    this.outputStream.flush();
    inputStream.close();
    
    this.writer.append("\r\n");
    this.writer.flush();
  }
  
  public void addHeaderField(String name, String value)
  {
    this.writer.append(name + ": " + value).append("\r\n");
    this.writer.flush();
  }
  
  public List<String> finish()
    throws IOException
  {
    List<String> response = new ArrayList();
    
    this.writer.append("\r\n").flush();
    this.writer.append("--" + this.boundary + "--").append("\r\n");
    this.writer.close();
    
    int status = this.httpConn.getResponseCode();
    if (status == 200)
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(this.httpConn.getInputStream()));
      String line = null;
      while ((line = reader.readLine()) != null) {
        response.add(line);
      }
      reader.close();
      this.httpConn.disconnect();
    }
    else
    {
      try
      {
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.httpConn.getErrorStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
          response.add(line);
        }
        reader.close();
        this.httpConn.disconnect();
      }
      catch (Exception error)
      {
        System.out.println(status);
        return response;
      }
    }
    return response;
  }
}
