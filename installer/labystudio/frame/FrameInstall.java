package installer.labystudio.frame;

import installer.Installer;
import installer.Utils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class FrameInstall
  extends JFrame
{
  private JProgressBar progressBar;
  private JTextArea installTitle;
  private JTextArea installSubTitle;
  
  public JProgressBar getProgressBar()
  {
    return progressBar;
  }
  
  public JTextArea getInstallTitle()
  {
    return installTitle;
  }
  
  public JTextArea getInstallSubTitle()
  {
    return installSubTitle;
  }
  
  public FrameInstall()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception e1)
    {
      e1.printStackTrace();
    }
    setDefaultCloseOperation(3);
    setVisible(true);
    setSize(452, 145);
    setTitle("LabyMod Installer");
    setResizable(false);
    Utils.centerWindow(this, null);
    try
    {
      BufferedImage image = ImageIO.read(getClass().getResource("/installer/images/icon.png"));
      setIconImage(image);
    }
    catch (IOException localIOException) {}
    JPanel mainPanel = new JPanel();
    mainPanel.setBackground(Color.WHITE);
    setContentPane(mainPanel);
    mainPanel.setLayout(null);
    
    progressBar = new JProgressBar();
    progressBar.setForeground(new Color(255, 204, 102));
    progressBar.setValue(0);
    progressBar.setStringPainted(true);
    progressBar.setBounds(10, 36, 423, 39);
    mainPanel.add(progressBar);
    
    installTitle = new JTextArea();
    installTitle.setText("Installing LabyMod..");
    installTitle.setPreferredSize(new Dimension(290, 144));
    installTitle.setOpaque(false);
    installTitle.setFont(new Font("Dialog", 0, 12));
    installTitle.setEnabled(true);
    installTitle.setEditable(false);
    installTitle.setBounds(10, 11, 384, 19);
    mainPanel.add(installTitle);
    
    JButton btnCancel = new JButton("Cancel");
    btnCancel.setBounds(344, 79, 89, 23);
    btnCancel.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
      }
    });
    mainPanel.add(btnCancel);
    
    installSubTitle = new JTextArea();
    installSubTitle.setText("Setup installer..");
    installSubTitle.setPreferredSize(new Dimension(290, 144));
    installSubTitle.setOpaque(false);
    installSubTitle.setFont(new Font("Dialog", 0, 12));
    installSubTitle.setEditable(false);
    installSubTitle.setBounds(10, 79, 321, 23);
    mainPanel.add(installSubTitle);
    
    JTextArea textArea = new JTextArea();
    show();
    
    new Installer(this);
  }
}
