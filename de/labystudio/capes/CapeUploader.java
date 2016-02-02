package de.labystudio.capes;

import de.labystudio.chat.Client;
import de.labystudio.chat.ClientConnection;
import de.labystudio.chat.EnumAlertType;
import de.labystudio.gui.GuiAchievementMod;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.Source;
import de.labystudio.utils.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CapeUploader
  extends Thread
{
  public static boolean upload;
  public static boolean openUpload = false;
  private final String CrLf = "\r\n";
  
  public void run()
  {
    upload = false;
    openUpload = true;
    URLConnection conn = null;
    OutputStream os = null;
    InputStream is = null;
    File file = selectCape();
    if ((file == null) || (!file.exists()))
    {
      openUpload = false;
      return;
    }
    try
    {
      openUpload = false;
      upload = true;
      System.out.println("[LabyMod] Uploading cape " + file.getName());
      LabyMod.getInstance().getClient().getClientConnection();URL url = new URL(Source.url_changeCape + "?username=" + LabyMod.getInstance().getPlayerName() + "&capeKey=" + ClientConnection.getCapeKey());
      conn = url.openConnection();
      conn.setDoOutput(true);
      String postData = "";
      InputStream imgIs = new FileInputStream(file);
      byte[] imgData = new byte[imgIs.available()];
      imgIs.read(imgData);
      imgIs.close();
      String message1 = "";
      message1 = message1 + "-----------------------------4664151417711\r\n";
      message1 = message1 + "Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"" + "\r\n";
      message1 = message1 + "Content-Type: image/png\r\n";
      message1 = message1 + "\r\n";
      String message2 = "";
      message2 = message2 + "\r\n-----------------------------4664151417711--\r\n";
      conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=---------------------------4664151417711");
      conn.setRequestProperty("Content-Length", String.valueOf(message1.length() + message2.length() + imgData.length));
      os = conn.getOutputStream();
      os.write(message1.getBytes());
      int index = 0;
      int size = 1024;
      do
      {
        if (index + size > imgData.length) {
          size = imgData.length - index;
        }
        os.write(imgData, index, size);
        index += size;
      } while (index < imgData.length);
      os.write(message2.getBytes());
      os.flush();
      is = conn.getInputStream();
      
      char buff = 'Ȁ';
      
      byte[] data = new byte[buff];
      int len;
      do
      {
        len = is.read(data);
        if (len > 0)
        {
          String output = new String(data, 0, len);
          System.out.println("[LabyMod] Cape upload: " + output);
          if (output.equalsIgnoreCase("OK"))
          {
            LabyMod.getInstance().achievementGui.displayBroadcast("CapeManager", Color.cl("a") + "Cape uploaded!", EnumAlertType.LABYMOD);
            CapeManager.refresh();
          }
          else
          {
            LabyMod.getInstance().achievementGui.displayBroadcast("CapeManager", Color.cl("c") + "Error: " + output, EnumAlertType.LABYMOD);
          }
        }
      } while (len > 0);
      try
      {
        os.close();
      }
      catch (Exception e) {}
      try
      {
        is.close();
      }
      catch (Exception e) {}
      upload = false;
    }
    catch (Exception e)
    {
      e.printStackTrace();
      LabyMod.getInstance().achievementGui.displayBroadcast("CapeManager", Color.cl("c") + "Error: " + e.getMessage(), EnumAlertType.LABYMOD);
    }
    finally
    {
      try
      {
        os.close();
      }
      catch (Exception e) {}
      try
      {
        is.close();
      }
      catch (Exception e) {}
    }
    openUpload = false;
  }
  
  private File selectCape()
  {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG image files", new String[] { "png" });
    chooser.setFileFilter(filter);
    chooser.setMultiSelectionEnabled(false);
    chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
    chooser.setDialogTitle("Select your cape");
    
    JFrame frame = new JFrame();
    
    chooser.showOpenDialog(frame.getParent());
    return chooser.getSelectedFile();
  }
}
