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
    this.xOffset = 0;
    this.yOffset = 0;
    this.realOptions = new String[0];
    this.options = new String[0];
    this.realValues = new int[0];
    this.values = new int[0];
    this.selected = 0;
    this.closed = true;
    this.x = x;
    this.y = y;
    this.w = w;
    this.realOptions = options;
    this.realValues = values;
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
    return this.options.length;
  }
  
  public int getX()
  {
    return this.x + this.xOffset;
  }
  
  public int getY()
  {
    return this.y + this.yOffset;
  }
  
  public int getValue(int slot)
  {
    return this.values[slot];
  }
  
  public String getSelectedOption()
  {
    return this.realOptions[this.selected];
  }
  
  public void drawSlot(int id, int pos, int mouseX, int mouseY)
  {
    if (((this.closed) && (onDropDown(mouseX, mouseY))) || ((!this.closed) && (onDropDown(mouseX, mouseY, id)))) {
      a(getX(), getY() + 11 * pos, getX() + this.w, getY() + 11 + 11 * pos, trimInside.hashCode());
    } else {
      a(getX(), getY() + 11 * pos, getX() + this.w, getY() + 11 + 11 * pos, background.hashCode());
    }
    a(getX() + 1, getX() + this.w - 1, getY() + 11 * pos, trimInside.hashCode());
    a(ave.A().k, bnq.a(this.options[id], new Object[0]), getX() + this.w / 2, getY() + 2 + 11 * pos, 16777215);
  }
  
  public void drawSelection(int first, int amount, int mouseX, int mouseY)
  {
    int totalH = 11 * amount;
    avr scaledresolution = new avr(ave.A());
    int height = scaledresolution.b();
    if (this.y + totalH + 1 > height) {
      this.yOffset = (height - this.y - totalH - 1);
    } else {
      this.yOffset = 0;
    }
    for (int i = first; i < first + amount; i++) {
      drawSlot(i, i - first, mouseX, mouseY);
    }
    b(getX(), getY(), getY() + totalH, trim.hashCode());
    b(getX() + this.w, getY(), getY() + totalH, trim.hashCode());
    a(getX(), getX() + this.w, getY(), trim.hashCode());
    a(getX(), getX() + this.w, getY() + totalH, trim.hashCode());
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton)
  {
    if (!this.closed)
    {
      int clickedValue = getClickedValue(mouseX, mouseY);
      if (clickedValue != -1) {
        selectValue(clickedValue);
      }
    }
    else if (this.options.length > 1)
    {
      this.closed = false;
    }
  }
  
  private int getClickedValue(int mouseX, int mouseY)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    if ((xOnMenu < 0) || (yOnMenu < 0) || (xOnMenu > this.w) || (yOnMenu >= this.options.length * 11)) {
      return -1;
    }
    int slot = yOnMenu / 11;
    if (slot >= this.options.length) {
      slot = this.options.length - 1;
    }
    return this.values[slot];
  }
  
  public boolean onDropDown(int mouseX, int mouseY)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    if ((xOnMenu >= 0) && (yOnMenu >= 0) && (xOnMenu <= this.w)) {}
    return yOnMenu < (this.closed ? 11 : this.options.length * 11);
  }
  
  public boolean onDropDown(int mouseX, int mouseY, int id)
  {
    int xOnMenu = mouseX - getX();
    int yOnMenu = mouseY - getY();
    return (xOnMenu >= 0) && (yOnMenu >= id * 11) && (xOnMenu <= this.w) && (yOnMenu < id * 11 + 11);
  }
  
  public void selectValue(int id)
  {
    this.selected = id;
    this.closed = true;
    this.options = ((String[])this.realOptions.clone());
    this.values = ((int[])this.realValues.clone());
    this.options[0] = this.realOptions[this.selected];
    this.values[0] = this.realValues[this.selected];
    for (int i = this.selected; i > 0; i--)
    {
      this.options[i] = this.realOptions[(i - 1)];
      this.values[i] = this.realValues[(i - 1)];
    }
  }
  
  public void drawButton(int mouseX, int mouseY)
  {
    drawSelection(0, this.closed ? 1 : this.options.length, mouseX, mouseY);
  }
  
  public static final Color background = new Color(0, 0, 0, 200);
  public static final Color trim = new Color(160, 160, 160, 255);
  public static final Color trimInside = new Color(50, 50, 50, 255);
  private static final int h = 11;
  public int selected;
  public boolean closed;
  protected String screenTitle;
}
