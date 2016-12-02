package com.minimap.gui;

import ave;
import avp;
import avr;
import bnq;
import java.awt.Color;

public class GuiDropDown
  extends avp
{
  public int x;
  public int y;
  public int xOffset;
  public int yOffset;
  public int w;
  private String[] realOptions;
  private String[] options;
  private int[] realValues;
  private int[] values;
  
  public GuiDropDown(String[] options, int x, int y, int w, Integer selected)
  {
    this(options, createDefaultValues(options.length), x, y, w, selected);
  }
  
  public GuiDropDown(String[] options, int[] values, int x, int y, int w, Integer selected)
  {
    xOffset = 0;
    yOffset = 0;
    realOptions = new String[0];
    this.options = new String[0];
    realValues = new int[0];
    this.values = new int[0];
    this.selected = 0;
    closed = true;
    this.x = x;
    this.y = y;
    this.w = w;
    realOptions = options;
    realValues = values;
    selectValue(selected.intValue());
  }
  
  public static int[] createDefaultValues(int length)
  {
    int[] values = new int[length];
    for (int i = 0; i < length; i++) {
      values[i] = i;
    }
    return values;
  }
  
  public int size()
  {
    return options.length;
  }
  
  public int getX()
  {
    return x + xOffset;
  }
  
  public int getY()
  {
    return y + yOffset;
  }
  
  public int getValue(int slot)
  {
    return values[slot];
  }
  
  public String getSelectedOption()
  {
    return realOptions[selected];
  }
  
  public void drawSlot(int id, int pos, int mouseX, int mouseY)
  {
    if (((closed) && (onDropDown(mouseX, mouseY))) || ((!closed) && (onDropDown(mouseX, mouseY, id)))) {
      a(getX(), getY() + 11 * pos, getX() + w, getY() + 11 + 11 * pos, trimInside.hashCode());
    } else {
      a(getX(), getY() + 11 * pos, getX() + w, getY() + 11 + 11 * pos, background.hashCode());
    }
    a(getX() + 1, getX() + w - 1, getY() + 11 * pos, trimInside.hashCode());
    a(Ak, bnq.a(options[id], new Object[0]), getX() + w / 2, getY() + 2 + 11 * pos, 16777215);
  }
  
  public void drawSelection(int first, int amount, int mouseX, int mouseY)
  {
    int totalH = 11 * amount;
    avr scaledresolution = new avr(ave.A());
    int height = scaledresolution.b();
    if (y + totalH + 1 > height) {
      yOffset = (height - y - totalH - 1);
    } else {
      yOffset = 0;
    }
    for (int i = first; i < first + amount; i++) {
      drawSlot(i, i - first, mouseX, mouseY);
    }
    b(getX(), getY(), getY() + totalH, trim.hashCode());
    b(getX() + w, getY(), getY() + totalH, trim.hashCode());
    a(getX(), getX() + w, getY(), trim.hashCode());
    a(getX(), getX() + w, getY() + totalH, trim.hashCode());
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!closed)
    {
      int clickedValue = getClickedValue(mouseX, mouseY);
      if (clickedValue != -1) {
        selectValue(clickedValue);
      }
    }
    else if (options.length > 1)
    {
      closed = false;
    }
  }
  
  private int getClickedValue(int mouseX, int mouseY)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    if ((xOnMenu < 0) || (yOnMenu < 0) || (xOnMenu > w) || (yOnMenu >= options.length * 11)) {
      return -1;
    }
    int slot = yOnMenu / 11;
    if (slot >= options.length) {
      slot = options.length - 1;
    }
    return values[slot];
  }
  
  public boolean onDropDown(int mouseX, int mouseY)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    if ((xOnMenu >= 0) && (yOnMenu >= 0) && (xOnMenu <= w)) {}
    return yOnMenu < (closed ? 11 : options.length * 11);
  }
  
  public boolean onDropDown(int mouseX, int mouseY, int id)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    return (xOnMenu >= 0) && (yOnMenu >= id * 11) && (xOnMenu <= w) && (yOnMenu < id * 11 + 11);
  }
  
  public void selectValue(int id)
  {
    selected = id;
    closed = true;
    options = ((String[])realOptions.clone());
    values = ((int[])realValues.clone());
    options[0] = realOptions[selected];
    values[0] = realValues[selected];
    for (int i = selected; i > 0; i--)
    {
      options[i] = realOptions[(i - 1)];
      values[i] = realValues[(i - 1)];
    }
  }
  
  public void drawButton(int mouseX, int mouseY)
  {
    drawSelection(0, closed ? 1 : options.length, mouseX, mouseY);
  }
  
  public static final Color background = new Color(0, 0, 0, 200);
  public static final Color trim = new Color(160, 160, 160, 255);
  public static final Color trimInside = new Color(50, 50, 50, 255);
  private static final int h = 11;
  public int selected;
  public boolean closed;
  protected String screenTitle;
}
