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
    search.a(mouseX, mouseY, mouseButton);
    chatField.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(char typedChar, int keyCode)
    throws IOException
  {
    super.a(typedChar, keyCode);
    if (chatField.m())
    {
      text = chatField.b();
      if (keyCode == 1)
      {
        j.a((axu)null);
      }
      else if ((keyCode != 28) && (keyCode != 156))
      {
        if ((keyCode != 200) && 
          (keyCode != 208)) {
          if (keyCode == 201) {
            j.q.d().b(j.q.d().i() - 1);
          } else if (keyCode == 209) {
            j.q.d().b(-j.q.d().i() + 1);
          } else {
            chatField.a(typedChar, keyCode);
          }
        }
      }
      else
      {
        String var3 = chatField.b().trim();
        if (var3.length() > 0) {
          f(var3);
        }
        j.a((axu)null);
      }
    }
    if (search.m())
    {
      if (keyCode == 28) {
        history = NameMCUtil.getNameHistory(search.b());
      }
      search.a(typedChar, keyCode);
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
    chatField = new avw(0, q, 4, m - 12, l - 4, 12);
    chatField.f(500);
    chatField.a(false);
    chatField.b(true);
    chatField.a(text);
    chatField.f();
    
    search = new ModGuiTextField(0, q, l - 190, 5, 140, 18);
    search.f(100);
    search.b(false);
    
    searchButton = new avs(24, l - 46, 4, 42, 20, "Search");
    n.add(searchButton);
  }
  
  protected void a(avs button)
  {
    switch (k)
    {
    case 0: 
      j.a(new awv(text));
      break;
    case 24: 
      history = NameMCUtil.getNameHistory(search.b());
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    draw = getInstancedraw;
    a(2, m - 14, l - 2, m - 2, Integer.MIN_VALUE);
    a(l - 193, 3, l - 3, 25, Integer.MIN_VALUE);
    if ((history != null) && (history.getChanges().length > 1)) {
      a(l - 193, 27, l - 3, 35 + history.getChanges().length * 10, Integer.MIN_VALUE);
    }
    chatField.g();
    search.g();
    
    searchButton.l = ((!search.b().isEmpty()) && (search.b().length() > 2) && (search.b().length() <= 16));
    
    super.a(mouseX, mouseY, partialTicks);
    if ((history != null) && (history.getChanges().length != 0))
    {
      if (history.getChanges().length == 1)
      {
        draw.drawString(Color.cl("c") + "No name changes found", l - 190, 28.0D);
      }
      else
      {
        boolean currentNameDisplayed = true;
        int yPosition = 30;
        for (UUIDFetcher change : history.getChanges())
        {
          if (changedToAt != 0L)
          {
            long time = System.currentTimeMillis() - changedToAt;
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
              draw.drawString(Color.cl("a") + Color.cl("l") + "x " + Color.cl("7") + name + Color.cl("8") + " - " + Color.cl("e") + date, l - 190, yPosition);
              currentNameDisplayed = false;
            }
            else
            {
              draw.drawString(Color.cl("c") + Color.cl("l") + "x " + Color.cl("7") + name + Color.cl("8") + " - " + Color.cl("e") + date, l - 190, yPosition);
            }
          }
          else
          {
            draw.drawString(Color.cl("4") + Color.cl("l") + "x " + Color.cl("7") + name, l - 190, yPosition);
          }
          yPosition += 10;
        }
      }
    }
    else {
      draw.drawString(Color.cl("4") + "Not found", l - 190, 28.0D);
    }
  }
}
