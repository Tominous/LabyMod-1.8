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
    fullCode = "";
    boxWidth = 150;
    fullCode = code;
    String text = bnq.a(code, new Object[0]);
    createLines(text);
  }
  
  public void createLines(String text)
  {
    language = ave.A().S().c().a();
    strings = new ArrayList();
    String[] words = text.split(" ");
    int spaceWidth = Ak.a(" ");
    String line = "";
    int width = 0;
    for (int i = 0; i < words.length; i++)
    {
      int wordWidth = Ak.a(words[i]);
      if ((width == 0) && (wordWidth > boxWidth - 15)) {
        boxWidth = (wordWidth + 15);
      }
      if (width + wordWidth <= boxWidth - 15)
      {
        width += spaceWidth + wordWidth;
        line = line + words[i] + " ";
      }
      else
      {
        strings.add(line);
        line = new String("");
        width = 0;
        i--;
      }
      if (i == words.length - 1) {
        strings.add(line);
      }
    }
  }
  
  public CursorBox(int size)
  {
    fullCode = "";
    boxWidth = 150;
    strings = new ArrayList();
    for (int i = 0; i < size; i++) {
      strings.add("");
    }
  }
  
  public String getString(int line)
  {
    return (String)strings.get(line);
  }
  
  public void drawBox(int x, int y, int width, int height)
  {
    try
    {
      if (!language.equals(ave.A().S().c().a())) {
        createLines(bnq.a(fullCode, new Object[0]));
      }
    }
    catch (Exception localException) {}
    int fix = x + boxWidth > width ? x + boxWidth - width : 0;
    int h = 5 + strings.size() * 10 + 5;
    int fiy = y + h > height ? y + h - height : 0;
    avp.a(x - fix, y - fiy, x + boxWidth - fix, y + h - fiy, -2147483640);
    for (int i = 0; i < strings.size(); i++)
    {
      String s = getString(i);
      Ak.a("§f" + s, x + 10 - fix, y + 5 + 10 * i - fiy, 16777215);
    }
  }
}
