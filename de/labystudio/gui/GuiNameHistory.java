package de.labystudio.gui;

import ave;
import avo;
import avs;
import avt;
import avw;
import awv;
import axu;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.NameHistory;
import de.labystudio.utils.NameMCUtil;
import de.labystudio.utils.Scrollbar;
import de.labystudio.utils.UUIDFetcher;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiNameHistory
  extends axu
{
  private DrawUtils draw;
  private ModGuiTextField search;
  private avw chatField;
  private avs searchButton;
  private Scrollbar scroll;
  private NameHistory history;
  private String text;
  
  public GuiNameHistory(String text)
  {
    this.text = text;
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    this.search.a(mouseX, mouseY, mouseButton);
    this.chatField.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(char typedChar, int keyCode)
    throws IOException
  {
    super.a(typedChar, keyCode);
    if (this.chatField.m())
    {
      this.text = this.chatField.b();
      if (keyCode == 1)
      {
        this.j.a((axu)null);
      }
      else if ((keyCode != 28) && (keyCode != 156))
      {
        if ((keyCode != 200) && 
          (keyCode != 208)) {
          if (keyCode == 201) {
            this.j.q.d().b(this.j.q.d().i() - 1);
          } else if (keyCode == 209) {
            this.j.q.d().b(-this.j.q.d().i() + 1);
          } else {
            this.chatField.a(typedChar, keyCode);
          }
        }
      }
      else
      {
        String var3 = this.chatField.b().trim();
        if (var3.length() > 0) {
          f(var3);
        }
        this.j.a((axu)null);
      }
    }
    if (this.search.m())
    {
      if (keyCode == 28) {
        this.history = NameMCUtil.getNameHistory(this.search.b());
      }
      this.search.a(typedChar, keyCode);
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.chatField = new avw(0, this.q, 4, this.m - 12, this.l - 4, 12);
    this.chatField.f(500);
    this.chatField.a(false);
    this.chatField.b(true);
    this.chatField.a(this.text);
    this.chatField.f();
    
    this.search = new ModGuiTextField(0, this.q, this.l - 190, 5, 140, 18);
    this.search.f(100);
    this.search.b(false);
    
    this.searchButton = new avs(24, this.l - 46, 4, 42, 20, "Search");
    this.n.add(this.searchButton);
  }
  
  protected void a(avs button)
  {
    switch (button.k)
    {
    case 0: 
      this.j.a(new awv(this.text));
      break;
    case 24: 
      this.history = NameMCUtil.getNameHistory(this.search.b());
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    this.draw = LabyMod.getInstance().draw;
    a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
    a(this.l - 193, 3, this.l - 3, 25, Integer.MIN_VALUE);
    if ((this.history != null) && (this.history.getChanges().length > 1)) {
      a(this.l - 193, 27, this.l - 3, 35 + this.history.getChanges().length * 10, Integer.MIN_VALUE);
    }
    this.chatField.g();
    this.search.g();
    
    this.searchButton.l = ((!this.search.b().isEmpty()) && (this.search.b().length() > 2) && (this.search.b().length() <= 16));
    
    super.a(mouseX, mouseY, partialTicks);
    if ((this.history != null) && (this.history.getChanges().length != 0))
    {
      if (this.history.getChanges().length == 1)
      {
        this.draw.drawString(Color.cl("c") + "No name changes found", this.l - 190, 28.0D);
      }
      else
      {
        boolean currentNameDisplayed = true;
        int yPosition = 30;
        for (UUIDFetcher change : this.history.getChanges())
        {
          if (change.changedToAt != 0L)
          {
            long time = System.currentTimeMillis() - change.changedToAt;
            long secs = time / 1000L;
            long mins = secs / 60L;
            long hours = mins / 60L;
            long days = hours / 24L;
            long months = days / 31L;
            long years = months / 12L;
            
            String date = null;
            if (months >= 12L) {
              date = years + " year" + (years == 1L ? "" : "s");
            } else if (days >= 31L) {
              date = months + " month" + (months == 1L ? "" : "s");
            } else if (hours >= 24L) {
              date = days + " day" + (days == 1L ? "" : "s");
            } else if (mins >= 60L) {
              date = hours + " hour" + (hours == 1L ? "" : "s");
            } else if (secs >= 60L) {
              date = mins + " min" + (mins == 1L ? "" : "s");
            } else {
              date = secs + "sec" + (secs == 1L ? "" : "s");
            }
            date = date + " ago";
            if (time < 0L) {
              date = "In the future!";
            }
            if (currentNameDisplayed)
            {
              this.draw.drawString(Color.cl("a") + Color.cl("l") + "x " + Color.cl("7") + change.name + Color.cl("8") + " - " + Color.cl("e") + date, this.l - 190, yPosition);
              currentNameDisplayed = false;
            }
            else
            {
              this.draw.drawString(Color.cl("c") + Color.cl("l") + "x " + Color.cl("7") + change.name + Color.cl("8") + " - " + Color.cl("e") + date, this.l - 190, yPosition);
            }
          }
          else
          {
            this.draw.drawString(Color.cl("4") + Color.cl("l") + "x " + Color.cl("7") + change.name, this.l - 190, yPosition);
          }
          yPosition += 10;
        }
      }
    }
    else {
      this.draw.drawString(Color.cl("4") + "Not found", this.l - 190, 28.0D);
    }
  }
}
