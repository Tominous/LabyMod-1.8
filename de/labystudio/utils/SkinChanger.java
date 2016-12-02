package de.labystudio.utils;

import avm;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.List;
import java.util.UUID;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SkinChanger
  extends Thread
{
  private MessageCallBack callBack;
  private avm session;
  private boolean steveModel;
  
  public SkinChanger(avm session, boolean steveModel, MessageCallBack callback)
  {
    this.callBack = callback;
    this.session = session;
    this.steveModel = steveModel;
  }
  
  public void run()
  {
    File file = selectTexture();
    if ((file == null) || (!file.exists()))
    {
      this.callBack.ok("File not found");
      return;
    }
    upload(file);
  }
  
  private File selectTexture()
  {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG image files", new String[] { "png" });
    chooser.setFileFilter(filter);
    chooser.setMultiSelectionEnabled(false);
    chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
    chooser.setDialogTitle("Select your skin");
    JFrame frame = new JFrame();
    chooser.showOpenDialog(frame.getParent());
    chooser.requestFocus();
    chooser.requestFocusInWindow();
    chooser.setVisible(true);
    return chooser.getSelectedFile();
  }
  
  private boolean upload(File file)
  {
    try
    {
      String url = "https://api.mojang.com/user/profile/" + this.session.e().getId().toString().replace("-", "") + "/skin";
      MultipartUtility request = new MultipartUtility(url, "UTF-8");
      request.addRequestProperty("Authorization", "Bearer " + this.session.d());
      
      request.open();
      request.addFormField("model", this.steveModel ? "classic" : "slim");
      request.addFilePart("file", file);
      List<String> all = request.finish();
      String content = "";
      for (String line : all) {
        content = content + line;
      }
      this.callBack.ok(content);
      return true;
    }
    catch (Exception error)
    {
      error.printStackTrace();
      
      this.callBack.ok("Error");
    }
    return false;
  }
  
  public static abstract interface MessageCallBack
  {
    public abstract void ok(String paramString);
  }
}
