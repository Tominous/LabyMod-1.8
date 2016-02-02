package com.minimap.gui;

import avw;
import java.text.DecimalFormat;

public class GuiMisc
{
  public static void checkField(avw field)
  {
    String text = field.b();
    char[] charArray = text.toCharArray();
    char[] allowed = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-' };
    text = "";
    boolean found;
    int j;
    for (int i = 0; i < charArray.length; i++)
    {
      found = false;
      for (j = 0; j < allowed.length; j++) {
        if (charArray[i] == allowed[j])
        {
          found = true;
          break;
        }
      }
      if ((!found) || ((charArray[i] == '-') && (i != 0))) {
        charArray[i] = '_';
      }
    }
    for (char c : charArray) {
      text = text + (c != '_' ? Character.valueOf(c) : "");
    }
    field.a(text);
  }
  
  public static final DecimalFormat simpleFormat = new DecimalFormat("0.0");
}
