package de.resourcepacks24.utils;

import ave;
import avm;
import bnm;
import de.resourcepacks24.main.Pack;
import de.resourcepacks24.main.ResourcePacks24;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class PackFileDownloader
  extends Thread
{
  PackInfoCallback callBack;
  Pack pack;
  
  public PackFileDownloader(Pack pack, PackInfoCallback callBack)
  {
    this.callBack = callBack;
    this.pack = pack;
    start();
  }
  
  public void run()
  {
    File file = ave.A().R().d();
    String s = file.getAbsolutePath();
    try
    {
      countDownload();
      downloadFile(ResourcePacks24.creator_home + pack.getCreator() + "/rp_d/" + pack.getHashName() + ".zip", new File(s, pack.getBestPossibleName() + ".zip"));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    callBack.progress(100);
    ResourcePacks24.getInstance().getDeletedPacks().remove(file.getName());
  }
  
  private boolean countDownload()
  {
    try
    {
      HttpURLConnection connection = (HttpURLConnection)new URL(ResourcePacks24.download_count + pack.getId() + "&username=" + ave.A().L().c()).openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      connection.connect();
      if (connection.getResponseCode() / 100 == 2) {
        return true;
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return false;
  }
  
  private void downloadFile(String s, File dest)
    throws IOException
  {
    URL website = new URL(s);
    URLConnection web = website.openConnection();
    web.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    long completeFileSize = web.getContentLength();
    BufferedInputStream in = new BufferedInputStream(web.getInputStream());
    FileOutputStream fos = new FileOutputStream(dest);
    BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
    byte[] data = new byte['Ѐ'];
    long downloadedFileSize = 0L;
    int x = 0;
    while ((x = in.read(data, 0, 1024)) >= 0)
    {
      downloadedFileSize += x;
      int currentProgress = (int)(downloadedFileSize / completeFileSize * 100.0D);
      if (currentProgress < 0) {
        currentProgress = 2;
      }
      callBack.progress(currentProgress);
      bout.write(data, 0, x);
    }
    bout.close();
    in.close();
  }
}
