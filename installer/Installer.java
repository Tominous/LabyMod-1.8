package installer;

import installer.json.JSONArray;
import installer.json.JSONObject;
import installer.json.JSONParser;
import installer.json.JSONWriter;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Installer
  extends JFrame
{
  private JLabel mainTitle = null;
  private JLabel subTitle = null;
  private JPanel textPanel = null;
  private JButton installButton = null;
  private JPanel buttonPanel = null;
  private JPanel contentPanel = null;
  EventHandler eventHandler = new EventHandler();
  private JTextArea textArea = null;
  JProgressBar pbar;
  static final int MY_MINIMUM = 0;
  static final int MY_MAXIMUM = 100;
  
  class EventHandler
    implements ActionListener
  {
    EventHandler() {}
    
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == Installer.this.getButtonInstall()) {
        Installer.this.installAction(e);
      }
    }
  }
  
  public Installer()
  {
    create();
  }
  
  public void updateBar(int newValue)
  {
    this.pbar.setValue(newValue);
  }
  
  private void init()
  {
    try
    {
      setDefaultCloseOperation(3);
      getButtonInstall().setEnabled(false);
      getMainTitle().setText(
        "LabyMod " + Main.modVersion + " for Minecraft " + 
        Main.mcVersion);
      if (Main.installing) {
        getSubTitel().setText(Main.installerStatus);
      }
      if (!Main.installing) {
        getButtonInstall().setEnabled(true);
      }
      getButtonInstall().requestFocus();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static void main()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      Installer frm = new Installer();
      Main.mainFrame = frm;
      Utils.centerWindow(frm, null);
      frm.show();
    }
    catch (Exception e)
    {
      String msg = e.getMessage();
      if ((msg != null) && (msg.equals("QUIET"))) {
        return;
      }
      e.printStackTrace();
      String str = Utils.getExceptionStackTrace(e);
      str = str.replace("\t", "  ");
      JTextArea textArea = new JTextArea(str);
      textArea.setEditable(false);
      Font f = textArea.getFont();
      Font f2 = new Font("Monospaced", f.getStyle(), f.getSize());
      textArea.setFont(f2);
      JScrollPane scrollPane = new JScrollPane(textArea);
      scrollPane.setPreferredSize(new Dimension(600, 400));
      JOptionPane.showMessageDialog(null, scrollPane, "Error", 0);
    }
  }
  
  private JLabel getMainTitle()
  {
    if (this.mainTitle == null) {
      try
      {
        this.mainTitle = new JLabel();
        this.mainTitle.setBounds(2, 5, 385, 42);
        this.mainTitle.setFont(new Font("Dialog", 1, 18));
        this.mainTitle.setHorizontalAlignment(0);
        this.mainTitle.setPreferredSize(new Dimension(385, 42));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.mainTitle;
  }
  
  private JLabel getSubTitel()
  {
    if (this.subTitle == null) {
      try
      {
        this.subTitle = new JLabel();
        this.subTitle.setBounds(2, 38, 385, 25);
        this.subTitle.setFont(new Font("Dialog", 1, 14));
        this.subTitle.setHorizontalAlignment(0);
        this.subTitle.setPreferredSize(new Dimension(385, 25));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.subTitle;
  }
  
  private JPanel getPanelCenter()
  {
    if (this.textPanel == null) {
      try
      {
        this.textPanel = new JPanel();
        this.textPanel.add(getMainTitle(), getMainTitle().getName());
        this.textPanel.add(getPBar());
        this.textPanel.add(getTextArea(), getTextArea().getName());
        this.textPanel.add(getLink(), getLink().getName());
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.textPanel;
  }
  
  private Component getPBar()
  {
    this.pbar = new JProgressBar();
    this.pbar.setMinimum(0);
    this.pbar.setMaximum(100);
    this.pbar.setPreferredSize(new Dimension(280, 20));
    return this.pbar;
  }
  
  private Component getLink()
  {
    return linkify("Click here to download all compatible Mods", 
      Main.compatibleMods, "All compatible Mods for LabyMod v" + 
      Main.modVersion);
  }
  
  private JButton getButtonInstall()
  {
    if (this.installButton == null) {
      try
      {
        this.installButton = new JButton();
        this.installButton.setPreferredSize(new Dimension(293, 26));
        this.installButton.setText("Install LabyMod");
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.installButton;
  }
  
  boolean chooserOpen = false;
  
  private JPanel getPanelBottom()
  {
    if (this.buttonPanel == null) {
      try
      {
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new FlowLayout(1, 15, 10));
        this.buttonPanel.setPreferredSize(new Dimension(300, 45));
        this.buttonPanel.add(getButtonInstall(), getButtonInstall()
          .getName());
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.buttonPanel;
  }
  
  private JPanel getPanelContentPane()
  {
    if (this.contentPanel == null) {
      try
      {
        this.contentPanel = new JPanel();
        this.contentPanel.setLayout(new BorderLayout(5, 5));
        this.contentPanel.add(getPanelCenter(), "Center");
        this.contentPanel.add(getPanelBottom(), "South");
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.contentPanel;
  }
  
  private void create()
  {
    try
    {
      setSize(320, 318);
      setDefaultCloseOperation(3);
      setTitle("LabyMod " + Main.modVersion + " Installer");
      setResizable(false);
      setContentPane(getPanelContentPane());
      initConnections();
      BufferedImage image = ImageIO.read(getClass().getResource(
        "/installer/icon.png"));
      setIconImage(image);
      
      addWindowStateListener(new WindowStateListener()
      {
        public void windowStateChanged(WindowEvent arg0)
        {
          Installer.this.frame__windowStateChanged(arg0);
        }
      });
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    init();
  }
  
  public void frame__windowStateChanged(WindowEvent e)
  {
    if ((e.getNewState() & 0x1) == 1) {
      Main.offFrame.setExtendedState(1);
    } else {
      Main.offFrame.setExtendedState(0);
    }
  }
  
  public void onInstallThread()
  {
    Main.installing = true;
    Main.status = 0;
    status("Installing..");
    File versionsFolder = new File(Utils.getWorkingDirectory().getAbsolutePath() + 
      "/versions");
    File installerZip = null;
    try
    {
      installerZip = new File(Main.class.getProtectionDomain()
        .getCodeSource().getLocation().getPath()
        .replace("%20", " "));
    }
    catch (Exception e)
    {
      e.printStackTrace();
      errorAndClose("Can't find currently running Installer jar! Try to launch the installer on your Desktop.");
      return;
    }
    if ((installerZip.isDirectory()) || (installerZip == null) || 
      (!installerZip.exists()))
    {
      Utils.showMessage("Can't find currently running Installer jar! Please select the LabyMod Installer");
      JFileChooser chooser = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "LabyMod Installer (jar file)", new String[] { "jar" });
      chooser.setFileFilter(filter);
      chooser.setCurrentDirectory(new File(Utils.getDesktop()));
      chooser.setDialogTitle("Can't find currently running Installer jar! Please select the LabyMod Installer");
      status("Selecting LabyMod Installer");
      int returnVal = chooser.showOpenDialog(getParent());
      if (returnVal != 0)
      {
        errorAndClose("Can't find currently running Installer jar!");
        return;
      }
      if ((chooser.getSelectedFile() != null) && 
        (chooser.getSelectedFile().exists()))
      {
        installerZip = chooser.getSelectedFile();
      }
      else
      {
        errorAndClose("Invalid file!");
        return;
      }
    }
    File defaultVersion = new File(versionsFolder, Main.mcVanillaJar);
    
    File modVersion = new File(versionsFolder, "LabyMod");
    if (!defaultVersion.exists())
    {
      errorAndClose("Can't find vanilla minecraft version, please launch minecraft with minecraft " + 
        Main.mcVersion + " and try again");
      return;
    }
    File defaultVersionJar = new File(defaultVersion, 
      Main.mcVanillaJar + ".jar");
    File defaultVersionJson = new File(defaultVersion, 
      Main.mcVanillaJar + ".json");
    File targetLabyModJar = new File(modVersion, "LabyMod.jar");
    File targetLabyModJson = new File(modVersion, "LabyMod.json");
    try
    {
      Files.deleteIfExists(targetLabyModJar.toPath());
    }
    catch (IOException e)
    {
      e.printStackTrace();
      errorAndClose("Can't delete LabyMod.jar! Please close minecraft!");
      return;
    }
    try
    {
      status("Deleting old LabyMod.json");
      Files.deleteIfExists(targetLabyModJson.toPath());
    }
    catch (IOException e)
    {
      e.printStackTrace();
      errorAndClose("Unable to delete old LabyMod.json file");
      return;
    }
    status("Copying Vanilla " + Main.mcVanillaJar + ".json to LabyMod.json");
    Utils.copyFile(defaultVersionJson, targetLabyModJson);
    
    ArrayList<File> mods = new ArrayList();
    mods.add(installerZip);
    if ((Main.mods != null) && (Main.mods.length != 0))
    {
      File[] arrayOfFile1;
      int j = (arrayOfFile1 = Main.mods).length;
      for (int i = 0; i < j; i++)
      {
        File mod = arrayOfFile1[i];
        mods.add(mod);
      }
    }
    mods.add(defaultVersionJar);
    status("Injecting " + mods.size() + " Mods");
    if (!Utils.copyJars(mods, targetLabyModJar))
    {
      errorAndClose("Unable to Install Mods");
      return;
    }
    status("Editing " + targetLabyModJson.getName());
    
    writeVersionJson(targetLabyModJson);
    
    status("Updating Launcher Configuration");
    File launcherProfiles = new File(Utils.getWorkingDirectory(), 
      "launcher_profiles.json");
    updateLauncherJson(launcherProfiles);
    if ((Main.mods != null) && (Main.mods.length != 0))
    {
      File out = new File(Utils.getWorkingDirectory().getAbsolutePath() + "/LabyMod/mods/");
      if (out.exists()) {
        Utils.deleteDir(out);
      }
      if ((out.getParentFile().getParentFile().exists()) && (!out.exists())) {
        out.mkdirs();
      }
      File[] arrayOfFile2;
      int m = (arrayOfFile2 = Main.mods).length;
      for (int k = 0; k < m; k++)
      {
        File mod = arrayOfFile2[k];
        Utils.copyFile(mod, new File(out, mod.getName()));
      }
    }
    System.out.println("unzip " + installerZip.getAbsolutePath());
    try
    {
      File outDir = new File(Utils.getWorkingDirectory().getAbsolutePath() + "/LabyMod/");
      File oldUpdater = new File(outDir.getAbsolutePath(), "Updater.jar");
      if (oldUpdater.exists()) {
        oldUpdater.delete();
      }
      ZipFile zipFile = new ZipFile(installerZip);
      Object entries = zipFile.entries();
      while (((Enumeration)entries).hasMoreElements())
      {
        ZipEntry entry = (ZipEntry)((Enumeration)entries).nextElement();
        if (entry.getName().contains("Updater.jar"))
        {
          File entryDestination = new File(outDir, entry.getName());
          if (entry.isDirectory())
          {
            entryDestination.mkdirs();
          }
          else
          {
            entryDestination.getParentFile().mkdirs();
            InputStream in = zipFile.getInputStream(entry);
            OutputStream out = new FileOutputStream(entryDestination);
            Utils.copyAll(in, out);
            in.close();
            out.close();
          }
        }
      }
      zipFile.close();
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    status("Done");
    if (Main.installing)
    {
      init();
      toFront();
      Utils.showMessage("LabyMod is successfully installed.");
    }
    else
    {
      Utils.error("LabyMod installation failed!");
    }
    dispose();
    System.exit(0);
  }
  
  private void updateLauncherJson(File fileJson)
  {
    try
    {
      String json = Utils.readFile(fileJson);
      JSONParser jp = new JSONParser();
      JSONObject root = (JSONObject)jp.parse(json);
      JSONObject profiles = (JSONObject)root.get("profiles");
      JSONObject prof = (JSONObject)profiles.get("LabyMod");
      if (prof == null)
      {
        prof = new JSONObject();
        prof.put("name", "LabyMod");
        profiles.put("LabyMod", prof);
      }
      prof.put("lastVersionId", "LabyMod");
      root.put("selectedProfile", "LabyMod");
      FileWriter fwJson = new FileWriter(fileJson);
      JSONWriter jw = new JSONWriter(fwJson);
      jw.writeObject(root);
      fwJson.flush();
      fwJson.close();
    }
    catch (Exception error)
    {
      errorAndClose(error.getMessage());
      dispose();
      System.exit(0);
    }
  }
  
  public boolean writeVersionJson(File modJsonFile)
  {
    boolean result = false;
    try
    {
      String json = Utils.readFile(modJsonFile);
      JSONParser jp = new JSONParser();
      JSONObject root = (JSONObject)jp.parse(json);
      root.put("id", "LabyMod");
      root.put("jar", "LabyMod");
      root.put("inheritsFrom", Main.mcVersion);
      if (Utils.shader)
      {
        root.put("mainClass", "net.minecraft.launchwrapper.Launch");
        root.put("minecraftArguments", root.get("minecraftArguments") + " --tweakClass shadersmod.launch.SMCTweaker");
        JSONArray array = (JSONArray)root.get("libraries");
        array.add(libraryAsJso("shadersmodcore:ShadersModCore:2.4.12mc1.8"));
        array.add(libraryAsJso("net.minecraft:launchwrapper:1.12"));
        array.add(libraryAsJso("org.ow2.asm:asm-all:5.0.3"));
      }
      PrintWriter pw = new PrintWriter(modJsonFile);
      JSONWriter writer = new JSONWriter(pw);
      writer.writeObject(root);
      pw.flush();
      pw.close();
      pw = null;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return result;
  }
  
  JSONObject libraryAsJso(String library)
  {
    JSONObject jso = new JSONObject();
    jso.put("name", library);
    return jso;
  }
  
  class onInstall
    extends Thread
  {
    onInstall() {}
    
    public void run()
    {
      Installer.this.onInstallThread();
    }
  }
  
  public void status(String newStatus)
  {
    System.out.println("[" + Main.status + "%] Status: " + newStatus);
    updateBar(Main.status);
    Main.installerStatus = Main.status + "%";
    Main.status += 16;
    if (Main.status > 100) {
      Main.status = 100;
    }
    init();
  }
  
  public void errorAndClose(String message)
  {
    if (message != null)
    {
      Main.installing = false;
      Utils.showErrorMessage(message);
      dispose();
      System.exit(0);
    }
  }
  
  private void installAction(ActionEvent arg)
  {
    if (Main.notCompatible != null)
    {
      Utils.showErrorMessage(Main.notCompatible + " is not compatible! Use " + Main.optifine);
      return;
    }
    Main.offFrame.dispose();
    if (Utils.getPlatform() == Utils.OS.WINDOWS) {
      Main.offFrame.setVisible(false);
    }
    Main.offFrame.disable();
    new onInstall().start();
  }
  
  private void initConnections()
    throws Exception
  {
    getButtonInstall().addActionListener(this.eventHandler);
  }
  
  private JTextArea getTextArea()
  {
    if (this.textArea == null) {
      try
      {
        this.textArea = new JTextArea();
        this.textArea.setBounds(15, 66, 365, 44);
        this.textArea.setEditable(false);
        this.textArea.setEnabled(true);
        this.textArea.setFont(new Font("Dialog", 0, 12));
        this.textArea.setLineWrap(true);
        this.textArea.setOpaque(false);
        this.textArea.setPreferredSize(new Dimension(290, 144));
        this.textArea.setText(Main.text);
        this.textArea.setWrapStyleWord(true);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.textArea;
  }
  
  public static JLabel linkify(final String text, String URL, String toolTip)
  {
    URI temp = null;
    try
    {
      temp = new URI(URL);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    final URI uri = temp;
    JLabel link = new JLabel();
    link.setText("<HTML><FONT color=\"#000099\">" + text + "</FONT></HTML>");
    if (!toolTip.equals("")) {
      link.setToolTipText(toolTip);
    }
    link.setCursor(new Cursor(12));
    link.addMouseListener(new MouseListener()
    {
      public void mouseExited(MouseEvent arg0)
      {
        Installer.this.setText("<HTML><FONT color=\"#000099\">" + text + 
          "</FONT></HTML>");
      }
      
      public void mouseEntered(MouseEvent arg0)
      {
        Installer.this.setText("<HTML><FONT color=\"#000099\"><U>" + text + 
          "</U></FONT></HTML>");
      }
      
      public void mouseClicked(MouseEvent arg0)
      {
        if (Desktop.isDesktopSupported())
        {
          try
          {
            Desktop.getDesktop().browse(uri);
          }
          catch (Exception e)
          {
            e.printStackTrace();
          }
        }
        else
        {
          JOptionPane pane = new JOptionPane("Could not open link.");
          JDialog dialog = pane.createDialog(new JFrame(), "");
          dialog.setVisible(true);
        }
      }
      
      public void mousePressed(MouseEvent e) {}
      
      public void mouseReleased(MouseEvent e) {}
    });
    return link;
  }
}
