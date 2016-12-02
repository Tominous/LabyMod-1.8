package com.minimap.interfaces;

import ave;
import avn;
import avp;
import bnq;
import bnr;
import bns;
import java.util.ArrayList;

public class CursorBox
{
  private ArrayList<String> strings;
  private String language;
  private String fullCode;
  private int boxWidth;
  private static final int color = -2147483640;
  
  public CursorBox(String code)
  {
    this.fullCode = "";
    this.boxWidth = 150;
    this.fullCode = code;
    String text = bnq.a(code, new Object[0]);
    createLines(text);
  }
  
  public void createLines(String text)
  {
    this.language = ave.A().S().c().a();
    this.strings = new ArrayList();
    String[] words = text.split(" ");
    int spaceWidth = ave.A().k.a(" ");
    String line = "";
    int width = 0;
    for (int i = 0; i < words.length; i++)
    {
      int wordWidth = ave.A().k.a(words[i]);
      if ((width == 0) && (wordWidth > this.boxWidth - 15)) {
        this.boxWidth = (wordWidth + 15);
      }
      if (width + wordWidth <= this.boxWidth - 15)
      {
        width += spaceWidth + wordWidth;
        line = line + words[i] + " ";
      }
      else
      {
        this.strings.add(line);
        line = new String("");
        width = 0;
        i--;
      }
      if (i == words.length - 1) {
        this.strings.add(line);
      }
    }
  }
  
  public CursorBox(int size)
  {
    this.fullCode = "";
    this.boxWidth = 150;
    this.strings = new ArrayList();
    for (int i = 0; i < size; i++) {
      this.strings.add("");
    }
  }
  
  public String getString(int line)
  {
    return (String)this.strings.get(line);
  }
  
  public void drawBox(int x, int y, int width, int height)
  {
    try
    {
      if (!this.language.equals(ave.A().S().c().a())) {
        createLines(bnq.a(this.fullCode, new Object[0]));
      }
    }
    catch (Exception localException) {}
    int fix = x + this.boxWidth > width ? x + this.boxWidth - width : 0;
    int h = 5 + this.strings.size() * 10 + 5;
    int fiy = y + h > height ? y + h - height : 0;
    avp.a(x - fix, y - fiy, x + this.boxWidth - fix, y + h - fiy, -2147483640);
    for (int i = 0; i < this.strings.size(); i++)
    {
      String s = getString(i);
      ave.A().k.a("§f" + s, x + 10 - fix, y + 5 + 10 * i - fiy, 16777215);
    }
  }
}
