package installer;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URI;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Modlist
  extends JFrame
{
  private JPanel contentPanel;
  private JPanel textPanel;
  private JTextArea textArea;
  private JPanel topPanel;
  private JButton listManagerButton;
  private JButton clearButton;
  boolean chooserOpen = false;
  
  class EventHandler
    implements ActionListener
  {
    EventHandler() {}
    
    public void actionPerformed(ActionEvent e)
    {
      if ((e.getSource() == Modlist.this.listManagerButton()) && 
        (!Modlist.this.chooserOpen))
      {
        Modlist.this.chooserOpen = true;
        if (!Modlist.this.selectMods())
        {
          Main.installMods = false;
          Main.mods = null;
        }
        else
        {
          Main.installMods = true;
        }
        Modlist.this.chooserOpen = false;
        Main.offFrame.init();
      }
      if ((e.getSource() == Modlist.this.clearButton()) && 
        (!Modlist.this.chooserOpen))
      {
        Main.installMods = false;
        Main.mods = null;
        Modlist.this.chooserOpen = false;
        Main.offFrame.init();
      }
    }
  }
  
  public static void openWebpage(String url)
  {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if ((desktop != null) && (desktop.isSupported(Desktop.Action.BROWSE))) {
      try
      {
        desktop.browse(new URI(url));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }
  
  public Modlist()
  {
    create();
  }
  
  public static void main()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      Modlist frm = new Modlist();
      Main.offFrame = frm;
      Utils.centerWindow(frm, null);
      frm.setBounds(frm.getX() + 295, frm.getY(), frm.getWidth(), frm.getHeight());
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
        this.textArea.setPreferredSize(new Dimension(220, 210));
        this.textArea.setText("");
        this.textArea.setWrapStyleWord(true);
      }
      catch (Throwable localThrowable) {}
    }
    return this.textArea;
  }
  
  private JPanel getPanelCenter()
  {
    if (this.textPanel == null) {
      try
      {
        this.textPanel = new JPanel();
        this.textPanel.add(getTextArea(), getTextArea().getName());
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.textPanel;
  }
  
  private JButton listManagerButton()
  {
    if (this.listManagerButton == null) {
      try
      {
        this.listManagerButton = new JButton();
        this.listManagerButton.setPreferredSize(new Dimension(245, 26));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.listManagerButton;
  }
  
  private JButton clearButton()
  {
    if (this.clearButton == null) {
      try
      {
        this.clearButton = new JButton();
        this.clearButton.setPreferredSize(new Dimension(245, 26));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.clearButton;
  }
  
  private boolean selectMods()
  {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Minecraft Mods (jar/zip files)", new String[] { "jar", "zip" });
    chooser.setFileFilter(filter);
    chooser.setMultiSelectionEnabled(true);
    chooser.setCurrentDirectory(new File(Utils.getDesktop()));
    chooser.setDialogTitle("Choose all Mods (Zip files)");
    int returnVal = chooser.showOpenDialog(getParent());
    if (returnVal != 0)
    {
      Utils.error("Please select a Mod");
      return false;
    }
    if (Main.mods == null) {
      Main.mods = chooser.getSelectedFiles();
    } else {
      Main.mods = Utils.concat(Main.mods, chooser.getSelectedFiles());
    }
    return true;
  }
  
  private JPanel getPanelTop()
  {
    if (this.topPanel == null) {
      try
      {
        this.topPanel = new JPanel();
        this.topPanel.setPreferredSize(new Dimension(20, 65));
        this.topPanel.add(listManagerButton(), listManagerButton().getName());
        this.topPanel.add(clearButton(), clearButton().getName());
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    return this.topPanel;
  }
  
  private JPanel getPanelContentPane()
  {
    if (this.contentPanel == null) {
      try
      {
        this.contentPanel = new JPanel();
        this.contentPanel.setLayout(new BorderLayout(5, 5));
        this.contentPanel.add(getPanelCenter(), "Center");
        this.contentPanel.add(getPanelTop(), "South");
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
      setSize(250, 315);
      setDefaultCloseOperation(3);
      setTitle("Install Mod list");
      setResizable(false);
      setContentPane(getPanelContentPane());
      BufferedImage image = ImageIO.read(getClass().getResource("/installer/icon.png"));
      setIconImage(image);
      initConnections();
      setUndecorated(true);
      
      addWindowStateListener(new WindowStateListener()
      {
        public void windowStateChanged(WindowEvent arg0)
        {
          Modlist.this.frame__windowStateChanged(arg0);
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
    if ((e.getNewState() & 0x1) != 1) {
      Main.mainFrame.setExtendedState(0);
    }
  }
  
  EventHandler eventHandler = new EventHandler();
  
  private void initConnections()
  {
    listManagerButton().addActionListener(this.eventHandler);
    clearButton().addActionListener(this.eventHandler);
  }
  
  public void init()
  {
    try
    {
      setDefaultCloseOperation(3);
      String modList = "Install list:\n- LabyMod v" + Main.modVersion + "\n";
      if (Main.mods != null)
      {
        Main.notCompatible = null;
        File[] arrayOfFile;
        int j = (arrayOfFile = Main.mods).length;
        for (int i = 0; i < j; i++)
        {
          File file = arrayOfFile[i];
          if ((file.getName().toLowerCase().startsWith("optifine_")) && (!file.getName().toLowerCase().contains(Main.optifine.toLowerCase()))) {
            Main.notCompatible = file.getName();
          }
          modList = modList + "- " + file.getName() + "\n";
        }
      }
      if (Main.installMods)
      {
        if (Main.mods != null)
        {
          if (Main.mods.length == 1) {
            this.clearButton.setText("Clear Modlist (" + Main.mods.length + " Mod)");
          } else {
            this.clearButton.setText("Clear Modlist (" + Main.mods.length + " Mods)");
          }
          this.clearButton.setEnabled(true);
        }
      }
      else
      {
        this.listManagerButton.setText("Add other Mods to install list");
        this.clearButton.setText("Clear Modlist");
        this.clearButton.setEnabled(false);
      }
      getTextArea().setText(modList);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
