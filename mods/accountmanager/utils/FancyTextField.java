package mods.accountmanager.utils;

import avn;
import avp;
import awg.b;
import axu;
import bfd;
import bfl;
import bfx;
import bms;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import f;
import java.awt.Color;
import ns;

public class FancyTextField
  extends avp
{
  private int field_175208_g;
  private avn fontRendererInstance;
  public int xPosition;
  public int yPosition;
  public int width;
  public int height;
  private String text = "";
  private int maxStringLength = 32;
  private int cursorCounter;
  private boolean enableBackgroundDrawing = true;
  private boolean canLoseFocus = true;
  private boolean isFocused;
  private boolean isEnabled = true;
  private int lineScrollOffset;
  private int cursorPosition;
  private int selectionEnd;
  private int enabledColor = 14737632;
  private int disabledColor = 7368816;
  private boolean visible = true;
  private awg.b field_175210_x;
  private Predicate field_175209_y = Predicates.alwaysTrue();
  private static final String __OBFID = "CL_00000670";
  private boolean password;
  private int fadeGreater;
  
  public FancyTextField(int p_i45542_1_, avn p_i45542_2_, int p_i45542_3_, int p_i45542_4_, int p_i45542_5_, int p_i45542_6_)
  {
    field_175208_g = p_i45542_1_;
    fontRendererInstance = p_i45542_2_;
    xPosition = p_i45542_3_;
    yPosition = p_i45542_4_;
    width = p_i45542_5_;
    height = p_i45542_6_;
  }
  
  public void setPassword(boolean password)
  {
    this.password = password;
  }
  
  public boolean isPassword()
  {
    return password;
  }
  
  public void func_175207_a(awg.b p_175207_1_)
  {
    field_175210_x = p_175207_1_;
  }
  
  public void updateCursorCounter()
  {
    cursorCounter += 1;
  }
  
  public void setText(String p_146180_1_)
  {
    if (field_175209_y.apply(p_146180_1_))
    {
      if (p_146180_1_.length() > maxStringLength) {
        text = p_146180_1_.substring(0, maxStringLength);
      } else {
        text = p_146180_1_;
      }
      setCursorPositionEnd();
    }
  }
  
  public String getText()
  {
    return text;
  }
  
  public String getSelectedText()
  {
    int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
    int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
    return text.substring(i, j);
  }
  
  public void func_175205_a(Predicate p_175205_1_)
  {
    field_175209_y = p_175205_1_;
  }
  
  public void writeText(String p_146191_1_)
  {
    String s1 = "";
    String s2 = f.a(p_146191_1_);
    int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
    int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
    int k = maxStringLength - text.length() - (i - j);
    boolean flag = false;
    if (text.length() > 0) {
      s1 = s1 + text.substring(0, i);
    }
    int l;
    int l;
    if (k < s2.length())
    {
      s1 = s1 + s2.substring(0, k);
      l = k;
    }
    else
    {
      s1 = s1 + s2;
      l = s2.length();
    }
    if ((text.length() > 0) && (j < text.length())) {
      s1 = s1 + text.substring(j);
    }
    if (field_175209_y.apply(s1))
    {
      text = s1;
      moveCursorBy(i - selectionEnd + l);
      if (field_175210_x != null) {
        field_175210_x.a(field_175208_g, text);
      }
    }
  }
  
  public void deleteWords(int p_146177_1_)
  {
    if (text.length() != 0) {
      if (selectionEnd != cursorPosition) {
        writeText("");
      } else {
        deleteFromCursor(getNthWordFromCursor(p_146177_1_) - cursorPosition);
      }
    }
  }
  
  public void deleteFromCursor(int p_146175_1_)
  {
    if (text.length() != 0) {
      if (selectionEnd != cursorPosition)
      {
        writeText("");
      }
      else
      {
        boolean flag = p_146175_1_ < 0;
        int j = flag ? cursorPosition + p_146175_1_ : cursorPosition;
        int k = flag ? cursorPosition : cursorPosition + p_146175_1_;
        String s = "";
        if (j >= 0) {
          s = text.substring(0, j);
        }
        if (k < text.length()) {
          s = s + text.substring(k);
        }
        text = s;
        if (flag) {
          moveCursorBy(p_146175_1_);
        }
        if (field_175210_x != null) {
          field_175210_x.a(field_175208_g, text);
        }
      }
    }
  }
  
  public int func_175206_d()
  {
    return field_175208_g;
  }
  
  public int getNthWordFromCursor(int p_146187_1_)
  {
    return getNthWordFromPos(p_146187_1_, getCursorPosition());
  }
  
  public int getNthWordFromPos(int p_146183_1_, int p_146183_2_)
  {
    return func_146197_a(p_146183_1_, p_146183_2_, true);
  }
  
  public int func_146197_a(int p_146197_1_, int p_146197_2_, boolean p_146197_3_)
  {
    int k = p_146197_2_;
    boolean flag1 = p_146197_1_ < 0;
    int l = Math.abs(p_146197_1_);
    for (int i1 = 0; i1 < l; i1++)
    {
      if (flag1)
      {
        while ((p_146197_3_) && (k > 0) && (text.charAt(k - 1) == ' ')) {
          k--;
        }
        while ((k > 0) && (text.charAt(k - 1) != ' ')) {
          k--;
        }
      }
      int j1 = text.length();
      k = text.indexOf(' ', k);
      if (k == -1) {
        k = j1;
      } else {
        while ((p_146197_3_) && (k < j1) && (text.charAt(k) == ' ')) {
          k++;
        }
      }
    }
    return k;
  }
  
  public void moveCursorBy(int p_146182_1_)
  {
    setCursorPosition(selectionEnd + p_146182_1_);
  }
  
  public void setCursorPosition(int p_146190_1_)
  {
    cursorPosition = p_146190_1_;
    int j = text.length();
    cursorPosition = ns.a(cursorPosition, 0, j);
    setSelectionPos(cursorPosition);
  }
  
  public void setCursorPositionZero()
  {
    setCursorPosition(0);
  }
  
  public void setCursorPositionEnd()
  {
    setCursorPosition(text.length());
  }
  
  public boolean textboxKeyTyped(char p_146201_1_, int p_146201_2_)
  {
    if (!isFocused) {
      return false;
    }
    if (axu.g(p_146201_2_))
    {
      setCursorPositionEnd();
      setSelectionPos(0);
      return true;
    }
    if (axu.f(p_146201_2_))
    {
      axu.e(getSelectedText());
      return true;
    }
    if (axu.e(p_146201_2_))
    {
      if (isEnabled) {
        writeText(axu.o());
      }
      return true;
    }
    if (axu.d(p_146201_2_))
    {
      axu.e(getSelectedText());
      if (isEnabled) {
        writeText("");
      }
      return true;
    }
    switch (p_146201_2_)
    {
    case 14: 
      if (axu.q())
      {
        if (isEnabled) {
          deleteWords(-1);
        }
      }
      else if (isEnabled) {
        deleteFromCursor(-1);
      }
      return true;
    case 199: 
      if (axu.r()) {
        setSelectionPos(0);
      } else {
        setCursorPositionZero();
      }
      return true;
    case 203: 
      if (axu.r())
      {
        if (axu.q()) {
          setSelectionPos(getNthWordFromPos(-1, getSelectionEnd()));
        } else {
          setSelectionPos(getSelectionEnd() - 1);
        }
      }
      else if (axu.q()) {
        setCursorPosition(getNthWordFromCursor(-1));
      } else {
        moveCursorBy(-1);
      }
      return true;
    case 205: 
      if (axu.r())
      {
        if (axu.q()) {
          setSelectionPos(getNthWordFromPos(1, getSelectionEnd()));
        } else {
          setSelectionPos(getSelectionEnd() + 1);
        }
      }
      else if (axu.q()) {
        setCursorPosition(getNthWordFromCursor(1));
      } else {
        moveCursorBy(1);
      }
      return true;
    case 207: 
      if (axu.r()) {
        setSelectionPos(text.length());
      } else {
        setCursorPositionEnd();
      }
      return true;
    case 211: 
      if (axu.q())
      {
        if (isEnabled) {
          deleteWords(1);
        }
      }
      else if (isEnabled) {
        deleteFromCursor(1);
      }
      return true;
    }
    if (f.a(p_146201_1_))
    {
      if (isEnabled) {
        writeText(Character.toString(p_146201_1_));
      }
      return true;
    }
    return false;
  }
  
  public void mouseClicked(int p_146192_1_, int p_146192_2_, int p_146192_3_)
  {
    boolean flag = (p_146192_1_ >= xPosition) && (p_146192_1_ < xPosition + width) && (p_146192_2_ >= yPosition) && (p_146192_2_ < yPosition + height);
    if (canLoseFocus) {
      setFocused(flag);
    }
    if ((isFocused) && (flag) && (p_146192_3_ == 0))
    {
      int l = p_146192_1_ - xPosition;
      if (enableBackgroundDrawing) {
        l -= 4;
      }
      String s = fontRendererInstance.a(text.substring(lineScrollOffset), getWidth());
      setCursorPosition(fontRendererInstance.a(s, l).length() + lineScrollOffset);
    }
  }
  
  public void drawTextBox()
  {
    if (getVisible())
    {
      if (getText().contains(" ")) {
        setText(getText().replace(" ", ""));
      }
      if (getEnableBackgroundDrawing()) {
        if (isFocused)
        {
          if (fadeGreater < 1) {
            fadeGreater += 1;
          }
          a(xPosition - fadeGreater, yPosition - fadeGreater, xPosition + width + fadeGreater, yPosition + height + fadeGreater, new Color(255, 255, 255, 100).getRGB());
        }
        else
        {
          if (fadeGreater > -2) {
            fadeGreater -= 1;
          }
          a(xPosition - fadeGreater, yPosition - fadeGreater, xPosition + width + fadeGreater, yPosition + height + fadeGreater, new Color(255, 255, 255, 40).getRGB());
        }
      }
      int i = isEnabled ? enabledColor : disabledColor;
      int j = cursorPosition - lineScrollOffset;
      int k = selectionEnd - lineScrollOffset;
      String s = fontRendererInstance.a(text.substring(lineScrollOffset), getWidth());
      boolean flag = (j >= 0) && (j <= s.length());
      boolean flag1 = (isFocused) && (cursorCounter / 6 % 2 == 0) && (flag);
      int l = enableBackgroundDrawing ? xPosition + 4 : xPosition;
      int i1 = enableBackgroundDrawing ? yPosition + (height - 8) / 2 : yPosition;
      int j1 = l;
      if (k > s.length()) {
        k = s.length();
      }
      if (isPassword())
      {
        String copyString = s;
        
        s = "";
        for (int i2 = 0; i2 < copyString.length(); i2++) {
          s = s + "*";
        }
      }
      if (s.length() > 0)
      {
        String s1 = flag ? s.substring(0, j) : s;
        j1 = fontRendererInstance.a(s1, l, i1, i);
      }
      boolean flag2 = (cursorPosition < text.length()) || (text.length() >= getMaxStringLength());
      int k1 = j1;
      if (!flag)
      {
        k1 = j > 0 ? l + width : l;
      }
      else if (flag2)
      {
        k1 = j1 - 1;
        j1--;
      }
      if ((s.length() > 0) && (flag) && (j < s.length())) {
        j1 = fontRendererInstance.a(s.substring(j), j1, i1, i);
      }
      if (flag1) {
        if (flag2) {
          avp.a(k1, i1 - 1, k1 + 1, i1 + 1 + fontRendererInstance.a, -3092272);
        }
      }
      if (k != j)
      {
        int l1 = l + fontRendererInstance.a(s.substring(0, k));
        drawCursorVertical(k1, i1 - 1, l1 - 1, i1 + 1 + fontRendererInstance.a);
      }
    }
  }
  
  private void drawCursorVertical(int p_146188_1_, int p_146188_2_, int p_146188_3_, int p_146188_4_)
  {
    if (p_146188_1_ < p_146188_3_)
    {
      int i1 = p_146188_1_;
      p_146188_1_ = p_146188_3_;
      p_146188_3_ = i1;
    }
    if (p_146188_2_ < p_146188_4_)
    {
      int i1 = p_146188_2_;
      p_146188_2_ = p_146188_4_;
      p_146188_4_ = i1;
    }
    if (p_146188_3_ > xPosition + width) {
      p_146188_3_ = xPosition + width;
    }
    if (p_146188_1_ > xPosition + width) {
      p_146188_1_ = xPosition + width;
    }
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    bfl.c(0.0F, 0.0F, 255.0F, 255.0F);
    bfl.x();
    bfl.u();
    bfl.f(5387);
    worldrenderer.a(7, bms.i);
    worldrenderer.b(p_146188_1_, p_146188_4_, 0.0D).b(0, 0, 255, 255).d();
    worldrenderer.b(p_146188_3_, p_146188_4_, 0.0D).b(0, 0, 255, 255).d();
    worldrenderer.b(p_146188_3_, p_146188_2_, 0.0D).b(0, 0, 255, 255).d();
    worldrenderer.b(p_146188_1_, p_146188_2_, 0.0D).b(0, 0, 255, 255).d();
    tessellator.b();
    bfl.v();
    bfl.w();
  }
  
  public void setMaxStringLength(int p_146203_1_)
  {
    maxStringLength = p_146203_1_;
    if (text.length() > p_146203_1_) {
      text = text.substring(0, p_146203_1_);
    }
  }
  
  public int getMaxStringLength()
  {
    return maxStringLength;
  }
  
  public int getCursorPosition()
  {
    return cursorPosition;
  }
  
  public boolean getEnableBackgroundDrawing()
  {
    return enableBackgroundDrawing;
  }
  
  public void setEnableBackgroundDrawing(boolean p_146185_1_)
  {
    enableBackgroundDrawing = p_146185_1_;
  }
  
  public void setTextColor(int p_146193_1_)
  {
    enabledColor = p_146193_1_;
  }
  
  public void setDisabledTextColour(int p_146204_1_)
  {
    disabledColor = p_146204_1_;
  }
  
  public void setFocused(boolean p_146195_1_)
  {
    if ((p_146195_1_) && (!isFocused)) {
      cursorCounter = 0;
    }
    isFocused = p_146195_1_;
  }
  
  public boolean isFocused()
  {
    return isFocused;
  }
  
  public void setEnabled(boolean p_146184_1_)
  {
    isEnabled = p_146184_1_;
  }
  
  public int getSelectionEnd()
  {
    return selectionEnd;
  }
  
  public int getWidth()
  {
    return getEnableBackgroundDrawing() ? width - 8 : width;
  }
  
  public void setSelectionPos(int p_146199_1_)
  {
    int j = text.length();
    if (p_146199_1_ > j) {
      p_146199_1_ = j;
    }
    if (p_146199_1_ < 0) {
      p_146199_1_ = 0;
    }
    selectionEnd = p_146199_1_;
    if (fontRendererInstance != null)
    {
      if (lineScrollOffset > j) {
        lineScrollOffset = j;
      }
      int k = getWidth();
      String s = fontRendererInstance.a(text.substring(lineScrollOffset), k);
      int l = s.length() + lineScrollOffset;
      if (p_146199_1_ == lineScrollOffset) {
        lineScrollOffset -= fontRendererInstance.a(text, k, true).length();
      }
      if (p_146199_1_ > l) {
        lineScrollOffset += p_146199_1_ - l;
      } else if (p_146199_1_ <= lineScrollOffset) {
        lineScrollOffset -= lineScrollOffset - p_146199_1_;
      }
      lineScrollOffset = ns.a(lineScrollOffset, 0, j);
    }
  }
  
  public void setCanLoseFocus(boolean p_146205_1_)
  {
    canLoseFocus = p_146205_1_;
  }
  
  public boolean getVisible()
  {
    return visible;
  }
  
  public void setVisible(boolean p_146189_1_)
  {
    visible = p_146189_1_;
  }
}
