package de.labystudio.gui;

import ave;
import avs;
import avw;
import axu;
import bfl;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.Scrollbar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiNotePad
  extends GuiMenuScreen
{
  private DrawUtils draw;
  private Scrollbar scrollbar;
  private static ArrayList<String> notes = new ArrayList();
  private ArrayList<avw> lineTextField = new ArrayList();
  
  public static ArrayList<String> getNotes()
  {
    return notes;
  }
  
  public GuiNotePad()
  {
    super(null);
    childScreen = this;
    draw = getInstancedraw;
    id = "NotePad";
    scrollbar = new Scrollbar(10);
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    
    super.b();
    
    refreshButtons();
    
    scrollbar.setSpeed(10);
    scrollbar.setPosition(l - 6, 30, l - 1, m);
    scrollbar.update(notes.size());
  }
  
  public void refreshButtons()
  {
    if (notes.isEmpty()) {
      notes.add(" ");
    }
    lineTextField.clear();
    for (String line : notes)
    {
      avw field = new avw(-1, j.k, 0, 0, l - 10, 10);
      field.a(false);
      field.f(l - 10);
      field.g(Color.toRGB(255, 125, 125, 100));
      field.a(line);
      lineTextField.add(field);
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    scrollbar.mouseAction(mouseX, mouseY, false);
    for (Iterator localIterator = lineTextField.iterator(); localIterator.hasNext();)
    {
      field = (avw)localIterator.next();
      field.e(0);
      field.b(false);
    }
    avw field;
    boolean selected = false;
    for (avw field : lineTextField) {
      if (field != null)
      {
        field.a(mouseX, mouseY, mouseButton);
        if (field.m()) {
          selected = true;
        }
      }
    }
    if ((!selected) && (lineTextField.size() != 0))
    {
      ((avw)lineTextField.get(0)).b(true);
      ((avw)lineTextField.get(0)).f();
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(avs button)
    throws IOException
  {
    super.actionPermformed(button);
    
    refreshButtons();
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    scrollbar.mouseAction(mouseX, mouseY, true);
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  public void k()
    throws IOException
  {
    scrollbar.mouseInput();
    super.k();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 0) {
      j.a(childScreen);
    }
    avw latestFilledMark = null;
    String finalCopy = "";
    boolean markAll = axu.g(keyCode);
    boolean paste = axu.e(keyCode);
    boolean copy = axu.f(keyCode);
    ArrayList<String> pasteLines = new ArrayList();
    if (axu.o().contains("\n"))
    {
      String[] all = axu.o().split("\n");
      for (String l : all) {
        pasteLines.add(l);
      }
    }
    if (pasteLines.size() < 2)
    {
      paste = false;
      pasteLines.clear();
    }
    if (paste) {
      for (int i = 0; i < pasteLines.size(); i++)
      {
        avw nfield = new avw(-1, j.k, 0, 0, this.l - 10, 10);
        nfield.a(false);
        nfield.f(this.l - 10);
        lineTextField.add(nfield);
      }
    }
    boolean down = false;
    boolean up = false;
    int id = 0;
    int selectedId = 0;
    int removeLine = -1;
    boolean moveDown = false;
    for (Iterator localIterator = lineTextField.iterator(); localIterator.hasNext();)
    {
      field = (avw)localIterator.next();
      if (field != null) {
        if (((paste) || (keyCode == 14)) && (!field.c().isEmpty()))
        {
          field.a("");
          if (id == 0)
          {
            field.b(true);
            field.e();
          }
          else
          {
            field.b(false);
          }
          id++;
        }
      }
    }
    id = 0;
    
    Object all = new ArrayList();
    ((ArrayList)all).addAll(lineTextField);
    for (avw field = ((ArrayList)all).iterator(); field.hasNext();)
    {
      field = (avw)field.next();
      if (field != null) {
        if (markAll)
        {
          field.b(true);
          field.a(typedChar, keyCode);
          field.b(false);
          if ((id == 0) || (field.b().length() != 0)) {
            latestFilledMark = field;
          }
          id++;
        }
        else if (copy)
        {
          if ((id == 0) || (field.b().length() != 0)) {
            finalCopy = finalCopy + field.b() + "\n";
          }
          id++;
        }
        else
        {
          if ((paste) && (field.m()))
          {
            if (pasteLines.size() != 0)
            {
              String line = (String)pasteLines.get(0);
              pasteLines.remove(0);
              field.b(line);
              if (lineTextField.size() > id + 1)
              {
                avw nextField = (avw)lineTextField.get(id + 1);
                nextField.b(true);
                field.b(false);
              }
            }
            else
            {
              paste = false;
            }
          }
          else {
            field.a(typedChar, keyCode);
          }
          if ((!up) && (keyCode == 14) && (lineTextField.size() > id + 1))
          {
            avw nextField = (avw)lineTextField.get(id + 1);
            if ((nextField.m()) && (nextField.i() == 0))
            {
              up = true;
              nextField.b(false);
              field.b(true);
              field.f();
              if (nextField.b().isEmpty())
              {
                removeLine = id + 1;
              }
              else
              {
                removeLine = id;
                nextField.b(true);
                field.b(false);
              }
            }
          }
          if ((!up) && (keyCode == 200) && (lineTextField.size() > id + 1))
          {
            avw nextField = (avw)lineTextField.get(id + 1);
            if (nextField.m())
            {
              up = true;
              nextField.b(false);
              field.b(true);
              if (field.i() <= nextField.b().length()) {
                field.e(nextField.i());
              }
            }
          }
          if ((!down) && (keyCode == 208) && (id - 1 >= 0))
          {
            avw prevField = (avw)lineTextField.get(id - 1);
            if (prevField.m())
            {
              down = true;
              prevField.b(false);
              field.b(true);
              if (prevField.i() <= field.b().length()) {
                field.e(prevField.i());
              }
            }
          }
          if (field.m()) {
            selectedId = id;
          }
          id++;
        }
      }
    }
    avw field;
    if ((keyCode == 28) || (moveDown))
    {
      avw nfield = new avw(-1, j.k, 0, 0, this.l - 10, 10);
      nfield.a(false);
      nfield.f(this.l - 10);
      if ((selectedId + 1 >= 0) && (selectedId + 1 <= lineTextField.size()))
      {
        ((avw)lineTextField.get(selectedId)).b(false);
        lineTextField.add(selectedId + 1, nfield);
        nfield.b(true);
      }
    }
    if ((copy) && (!finalCopy.isEmpty())) {
      axu.e(finalCopy);
    }
    if ((removeLine > 0) && (removeLine < lineTextField.size())) {
      lineTextField.remove(removeLine);
    }
    if (latestFilledMark != null)
    {
      latestFilledMark.b(true);
      latestFilledMark.f();
      latestFilledMark.a(typedChar, keyCode);
    }
    notes.clear();
    int max = 0;
    for (avw field : lineTextField) {
      if (field != null)
      {
        max++;
        if (max > 120) {
          break;
        }
        notes.add(field.b());
      }
    }
    scrollbar.update(notes.size());
    
    super.a(typedChar, keyCode);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      draw.drawTransparentBackground(0, 0, l, 30);
      DrawUtils.a(0, 30, l, m, Color.toRGB(135, 135, 135, 220));
      bfl.k();
    }
    else
    {
      c();
      DrawUtils.a(0, 30, l, m, Integer.MAX_VALUE);
    }
    int yLinePosition = 35 + scrollbar.getScrollY();
    for (avw field : lineTextField) {
      if (field != null)
      {
        a = 2;
        f = yLinePosition;
        if (yLinePosition > 30) {
          field.g();
        }
        yLinePosition += 10;
        field.g(Color.toRGB(255, 255, 255, 100));
      }
    }
    scrollbar.draw();
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
