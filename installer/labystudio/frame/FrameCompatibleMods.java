package installer.labystudio.frame;

import installer.Main;
import installer.ModTemplate;
import installer.Utils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrameCompatibleMods
  extends JFrame
{
  JTextArea textArea;
  JButton clearButton;
  private int sizeA = 666;
  private int sizeB = 443;
  
  public FrameCompatibleMods()
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
    setSize(this.sizeA, this.sizeB);
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
    
    JButton btnNext = new JButton("Next");
    btnNext.setFont(new Font("Dialog", 0, 15));
    btnNext.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        int optifine = 0;
        for (ModTemplate mod : Main.modTempates) {
          if ((mod.isEnabled()) && (mod.getModName().toLowerCase().contains("optifine"))) {
            optifine++;
          }
        }
        if (optifine > 1)
        {
          Utils.error("You may only choose one OptiFine version!");
          return;
        }
        FrameCompatibleMods.this.dispose();
        new FrameList();
      }
    });
    btnNext.setBounds(435, 366, 220, 39);
    mainPanel.add(btnNext);
    
    JPanel panel = new JPanel();
    panel.setBounds(10, 11, 278, 47);
    mainPanel.add(panel);
    panel.setLayout(null);
    
    JLabel lblAddOtherMods = new JLabel();
    lblAddOtherMods.setText("Add other mods");
    lblAddOtherMods.setPreferredSize(new Dimension(385, 42));
    lblAddOtherMods.setOpaque(false);
    lblAddOtherMods.setHorizontalAlignment(0);
    lblAddOtherMods.setFont(new Font("Dialog", 1, 19));
    lblAddOtherMods.setEnabled(true);
    lblAddOtherMods.setBounds(28, 11, 227, 21);
    panel.add(lblAddOtherMods);
    
    JPanel modList = new JPanel();
    modList.setLayout(null);
    modList.setBounds(10, 63, 278, 305);
    mainPanel.add(modList);
    
    int y = 0;
    for (final ModTemplate mod : Main.modTempates)
    {
      JCheckBox checkBox = new JCheckBox(mod.getModName());
      checkBox.setSelected(mod.isEnabled());
      checkBox.setBounds(6, 7 + y, 150, 14);
      checkBox.addItemListener(new ItemListener()
      {
        public void itemStateChanged(ItemEvent e)
        {
          mod.setEnabled(e.getStateChange() == 1);
        }
      });
      modList.add(checkBox);
      if (!mod.getAuthor().isEmpty())
      {
        JLabel labelAuthor = new JLabel("by " + mod.getAuthor());
        labelAuthor.setFont(new Font(labelAuthor.getFont().getName(), 0, 8));
        labelAuthor.setForeground(Color.GRAY);
        labelAuthor.setBounds(200, 7 + y, 266, 14);
        modList.add(labelAuthor);
      }
      y += 20;
    }
    JButton btnBack = new JButton("Back");
    btnBack.setFont(new Font("Dialog", 0, 15));
    btnBack.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        FrameCompatibleMods.this.dispose();
        new FrameMain();
      }
    });
    btnBack.setBounds(299, 366, 126, 39);
    mainPanel.add(btnBack);
    
    JButton button = new JButton("Choose file");
    button.setBounds(104, 377, 184, 28);
    mainPanel.add(button);
    button.setFont(new Font("Dialog", 0, 15));
    button.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        FrameCompatibleMods.this.selectMods();
        FrameCompatibleMods.this.initList();
      }
    });
    this.clearButton = new JButton("Clear");
    this.clearButton.setBounds(10, 377, 86, 28);
    mainPanel.add(this.clearButton);
    this.clearButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        Main.mods = null;
        FrameCompatibleMods.this.initList();
      }
    });
    this.clearButton.setFont(new Font("Dialog", 0, 15));
    
    JLabel label = new JLabel(new ImageIcon(FrameCompatibleMods.class.getResource("/installer/images/addons.jpg")));
    label.setBounds(298, 11, 357, 305);
    mainPanel.add(label);
    
    this.textArea = new JTextArea();
    this.textArea.setBounds(662, 11, 284, 379);
    mainPanel.add(this.textArea);
    this.textArea.setEditable(false);
    this.textArea.setEnabled(true);
    this.textArea.setFont(new Font("Dialog", 0, 10));
    this.textArea.setLineWrap(true);
    this.textArea.setOpaque(false);
    this.textArea.setText("");
    this.textArea.setWrapStyleWord(true);
    
    show();
    
    initList();
  }
  
  private void initList()
  {
    String list = "";
    if (Main.mods != null)
    {
      setSize(this.sizeA + 300, this.sizeB);
      File[] arrayOfFile;
      int j = (arrayOfFile = Main.mods).length;
      for (int i = 0; i < j; i++)
      {
        File mod = arrayOfFile[i];
        list = list + "+ " + mod.getName() + "\n";
      }
    }
    else
    {
      setSize(this.sizeA, this.sizeB);
    }
    this.textArea.setText(list);
    if (this.clearButton != null) {
      this.clearButton.setEnabled(!list.isEmpty());
    }
  }
  
  private boolean selectMods()
  {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Minecraft Mods", new String[] { "jar", "zip" });
    chooser.setFileFilter(filter);
    chooser.setMultiSelectionEnabled(true);
    chooser.setCurrentDirectory(new File(Utils.getDesktop()));
    chooser.setDialogTitle("Minecraft Mod");
    int returnVal = chooser.showOpenDialog(getParent());
    if (returnVal != 0) {
      return false;
    }
    if (Main.mods == null) {
      Main.mods = chooser.getSelectedFiles();
    } else {
      Main.mods = Utils.concat(Main.mods, chooser.getSelectedFiles());
    }
    return true;
  }
}
