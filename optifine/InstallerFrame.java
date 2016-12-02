package optifine;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class InstallerFrame
  extends JFrame
{
  private JLabel ivjLabelOfVersion = null;
  private JLabel ivjLabelMcVersion = null;
  private JPanel ivjPanelCenter = null;
  private JButton ivjButtonInstall = null;
  private JButton ivjButtonClose = null;
  private JPanel ivjPanelBottom = null;
  private JPanel ivjPanelContentPane = null;
  IvjEventHandler ivjEventHandler = new IvjEventHandler();
  private JTextArea ivjTextArea = null;
  
  class IvjEventHandler
    implements ActionListener
  {
    IvjEventHandler() {}
    
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == InstallerFrame.this.getButtonClose()) {
        InstallerFrame.this.connEtoC2(e);
      }
      if (e.getSource() == InstallerFrame.this.getButtonInstall()) {
        InstallerFrame.this.connEtoC1(e);
      }
    }
  }
  
  public InstallerFrame()
  {
    initialize();
  }
  
  private void customInit()
  {
    try
    {
      setDefaultCloseOperation(3);
      
      getButtonInstall().setEnabled(false);
      
      String ofVer = Installer.getOptiFineVersion();
      Utils.dbg("OptiFine Version: " + ofVer);
      String[] ofVers = Utils.tokenize(ofVer, "_");
      
      String mcVer = ofVers[1];
      Utils.dbg("Minecraft Version: " + mcVer);
      
      String ofEd = Installer.getOptiFineEdition(ofVers);
      Utils.dbg("OptiFine Edition: " + ofEd);
      
      String ofEdClear = ofEd.replace("_", " ");
      ofEdClear = ofEdClear.replace(" U ", " Ultra ");
      ofEdClear = ofEdClear.replace("L ", "Light ");
      
      getLabelOfVersion().setText("OptiFine " + ofEdClear);
      getLabelMcVersion().setText("for Minecraft " + mcVer);
      
      getButtonInstall().setEnabled(true);
      
      getButtonInstall().requestFocus();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args)
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      
      InstallerFrame frm = new InstallerFrame();
      
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
  
  private void handleException(Throwable e)
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
  
  private JLabel getLabelOfVersion()
  {
    if (ivjLabelOfVersion == null) {
      try
      {
        ivjLabelOfVersion = new JLabel();
        ivjLabelOfVersion.setName("LabelOfVersion");
        ivjLabelOfVersion.setBounds(2, 5, 385, 42);
        ivjLabelOfVersion.setFont(new Font("Dialog", 1, 18));
        ivjLabelOfVersion.setHorizontalAlignment(0);
        ivjLabelOfVersion.setPreferredSize(new Dimension(385, 42));
        ivjLabelOfVersion.setText("OptiFine ...");
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjLabelOfVersion;
  }
  
  private JLabel getLabelMcVersion()
  {
    if (ivjLabelMcVersion == null) {
      try
      {
        ivjLabelMcVersion = new JLabel();
        ivjLabelMcVersion.setName("LabelMcVersion");
        ivjLabelMcVersion.setBounds(2, 38, 385, 25);
        ivjLabelMcVersion.setFont(new Font("Dialog", 1, 14));
        ivjLabelMcVersion.setHorizontalAlignment(0);
        ivjLabelMcVersion.setPreferredSize(new Dimension(385, 25));
        ivjLabelMcVersion.setText("for Minecraft ...");
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjLabelMcVersion;
  }
  
  private JPanel getPanelCenter()
  {
    if (ivjPanelCenter == null) {
      try
      {
        ivjPanelCenter = new JPanel();
        ivjPanelCenter.setName("PanelCenter");
        ivjPanelCenter.setLayout(null);
        ivjPanelCenter.add(getLabelOfVersion(), getLabelOfVersion().getName());
        ivjPanelCenter.add(getLabelMcVersion(), getLabelMcVersion().getName());
        ivjPanelCenter.add(getTextArea(), getTextArea().getName());
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjPanelCenter;
  }
  
  private JButton getButtonInstall()
  {
    if (ivjButtonInstall == null) {
      try
      {
        ivjButtonInstall = new JButton();
        ivjButtonInstall.setName("ButtonInstall");
        ivjButtonInstall.setPreferredSize(new Dimension(100, 26));
        ivjButtonInstall.setText("Install");
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjButtonInstall;
  }
  
  private JButton getButtonClose()
  {
    if (ivjButtonClose == null) {
      try
      {
        ivjButtonClose = new JButton();
        ivjButtonClose.setName("ButtonClose");
        ivjButtonClose.setPreferredSize(new Dimension(100, 26));
        ivjButtonClose.setText("Cancel");
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjButtonClose;
  }
  
  private JPanel getPanelBottom()
  {
    if (ivjPanelBottom == null) {
      try
      {
        ivjPanelBottom = new JPanel();
        ivjPanelBottom.setName("PanelBottom");
        ivjPanelBottom.setLayout(new FlowLayout(1, 15, 10));
        ivjPanelBottom.setPreferredSize(new Dimension(390, 55));
        ivjPanelBottom.add(getButtonInstall(), getButtonInstall().getName());
        ivjPanelBottom.add(getButtonClose(), getButtonClose().getName());
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjPanelBottom;
  }
  
  private JPanel getPanelContentPane()
  {
    if (ivjPanelContentPane == null) {
      try
      {
        ivjPanelContentPane = new JPanel();
        ivjPanelContentPane.setName("PanelContentPane");
        ivjPanelContentPane.setLayout(new BorderLayout(5, 5));
        ivjPanelContentPane.add(getPanelCenter(), "Center");
        ivjPanelContentPane.add(getPanelBottom(), "South");
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjPanelContentPane;
  }
  
  private void initialize()
  {
    try
    {
      setName("InstallerFrame");
      setSize(400, 200);
      setDefaultCloseOperation(0);
      setTitle("OptiFine Installer");
      setContentPane(getPanelContentPane());
      initConnections();
    }
    catch (Throwable ivjExc)
    {
      handleException(ivjExc);
    }
    customInit();
  }
  
  public void onInstall()
  {
    try
    {
      Installer.doInstall();
      
      Utils.showMessage("OptiFine is successfully installed.");
      
      dispose();
    }
    catch (Exception e)
    {
      handleException(e);
    }
  }
  
  public void onClose()
  {
    dispose();
  }
  
  private void connEtoC1(ActionEvent arg1)
  {
    try
    {
      onInstall();
    }
    catch (Throwable ivjExc)
    {
      handleException(ivjExc);
    }
  }
  
  private void connEtoC2(ActionEvent arg1)
  {
    try
    {
      onClose();
    }
    catch (Throwable ivjExc)
    {
      handleException(ivjExc);
    }
  }
  
  private void initConnections()
    throws Exception
  {
    getButtonInstall().addActionListener(ivjEventHandler);
    getButtonClose().addActionListener(ivjEventHandler);
  }
  
  private JTextArea getTextArea()
  {
    if (ivjTextArea == null) {
      try
      {
        ivjTextArea = new JTextArea();
        ivjTextArea.setName("TextArea");
        ivjTextArea.setBounds(15, 66, 365, 44);
        ivjTextArea.setEditable(false);
        ivjTextArea.setEnabled(true);
        ivjTextArea.setFont(new Font("Dialog", 0, 12));
        ivjTextArea.setLineWrap(true);
        ivjTextArea.setOpaque(false);
        ivjTextArea.setPreferredSize(new Dimension(365, 44));
        ivjTextArea.setText("This installer will install OptiFine in the official Minecraft launcher and will create a new profile \"OptiFine\" for it.");
        ivjTextArea.setWrapStyleWord(true);
      }
      catch (Throwable ivjExc)
      {
        handleException(ivjExc);
      }
    }
    return ivjTextArea;
  }
}
