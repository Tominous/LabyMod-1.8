package de.labystudio.gui.extras;

import avn;
import avp;
import avw;
import awg.b;
import axu;
import bfd;
import bfl;
import bfx;
import bms;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import f;
import ns;

public class ModGuiTextField
  extends avw
{
  private final int id;
  private final avn fontRendererInstance;
  public int a;
  public int f;
  private final int width;
  private final int height;
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
  private Predicate<String> field_175209_y = Predicates.alwaysTrue();
  
  public ModGuiTextField(int componentId, avn fontrendererObj, int x, int y, int par5Width, int par6Height)
  {
    super(componentId, fontrendererObj, x, y, par5Width, par6Height);
    id = componentId;
    fontRendererInstance = fontrendererObj;
    a = x;
    f = y;
    width = par5Width;
    height = par6Height;
  }
  
  public void a(awg.b p_175207_1_)
  {
    field_175210_x = p_175207_1_;
  }
  
  public void a()
  {
    cursorCounter += 1;
  }
  
  public void a(String p_146180_1_)
  {
    if (field_175209_y.apply(p_146180_1_))
    {
      if (p_146180_1_.length() > maxStringLength) {
        text = p_146180_1_.substring(0, maxStringLength);
      } else {
        text = p_146180_1_;
      }
      f();
    }
  }
  
  public String b()
  {
    return text;
  }
  
  public String c()
  {
    int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
    int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
    return text.substring(i, j);
  }
  
  public void a(Predicate<String> p_175205_1_)
  {
    field_175209_y = p_175205_1_;
  }
  
  public void b(String p_146191_1_)
  {
    String s = "";
    String s1 = f.a(p_146191_1_);
    int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
    int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
    int k = maxStringLength - text.length() - (i - j);
    int l = 0;
    if (text.length() > 0) {
      s = s + text.substring(0, i);
    }
    if (k < s1.length())
    {
      s = s + s1.substring(0, k);
      l = k;
    }
    else
    {
      s = s + s1;
      l = s1.length();
    }
    if ((text.length() > 0) && (j < text.length())) {
      s = s + text.substring(j);
    }
    if (field_175209_y.apply(s))
    {
      text = s;
      d(i - selectionEnd + l);
      if (field_175210_x != null) {
        field_175210_x.a(id, text);
      }
    }
  }
  
  public void a(int p_146177_1_)
  {
    if (text.length() != 0) {
      if (selectionEnd != cursorPosition) {
        b("");
      } else {
        b(c(p_146177_1_) - cursorPosition);
      }
    }
  }
  
  public void b(int p_146175_1_)
  {
    if (text.length() != 0) {
      if (selectionEnd != cursorPosition)
      {
        b("");
      }
      else
      {
        boolean flag = p_146175_1_ < 0;
        int i = flag ? cursorPosition + p_146175_1_ : cursorPosition;
        int j = flag ? cursorPosition : cursorPosition + p_146175_1_;
        String s = "";
        if (i >= 0) {
          s = text.substring(0, i);
        }
        if (j < text.length()) {
          s = s + text.substring(j);
        }
        if (field_175209_y.apply(s))
        {
          text = s;
          if (flag) {
            d(p_146175_1_);
          }
          if (field_175210_x != null) {
            field_175210_x.a(id, text);
          }
        }
      }
    }
  }
  
  public int d()
  {
    return id;
  }
  
  public int c(int p_146187_1_)
  {
    return a(p_146187_1_, i());
  }
  
  public int a(int p_146183_1_, int p_146183_2_)
  {
    return a(p_146183_1_, p_146183_2_, true);
  }
  
  public int a(int p_146197_1_, int p_146197_2_, boolean p_146197_3_)
  {
    int i = p_146197_2_;
    boolean flag = p_146197_1_ < 0;
    int j = Math.abs(p_146197_1_);
    for (int k = 0; k < j; k++) {
      if (!flag)
      {
        int l = text.length();
        i = text.indexOf(' ', i);
        if (i == -1) {
          i = l;
        } else {
          while ((p_146197_3_) && (i < l) && (text.charAt(i) == ' ')) {
            i++;
          }
        }
      }
      else
      {
        while ((p_146197_3_) && (i > 0) && (text.charAt(i - 1) == ' ')) {
          i--;
        }
        while ((i > 0) && (text.charAt(i - 1) != ' ')) {
          i--;
        }
      }
    }
    return i;
  }
  
  public void d(int p_146182_1_)
  {
    e(selectionEnd + p_146182_1_);
  }
  
  public void e(int p_146190_1_)
  {
    cursorPosition = p_146190_1_;
    int i = text.length();
    cursorPosition = ns.a(cursorPosition, 0, i);
    i(cursorPosition);
  }
  
  public void e()
  {
    e(0);
  }
  
  public void f()
  {
    e(text.length());
  }
  
  public void a(int p_146192_1_, int p_146192_2_, int p_146192_3_)
  {
    boolean flag = (p_146192_1_ >= a) && (p_146192_1_ < a + width) && (p_146192_2_ >= f) && (p_146192_2_ < f + height);
    if (canLoseFocus) {
      b(flag);
    }
    if ((isFocused) && (flag) && (p_146192_3_ == 0))
    {
      int i = p_146192_1_ - a;
      if (enableBackgroundDrawing) {
        i -= 4;
      }
      String s = fontRendererInstance.a(text.substring(lineScrollOffset), p());
      e(fontRendererInstance.a(s, i).length() + lineScrollOffset);
    }
  }
  
  private boolean modPasswordBox = false;
  private String modBlacklistWord = "";
  
  public void setBlacklistWord(String modBlacklistWords)
  {
    modBlacklistWord = modBlacklistWords;
  }
  
  public String getBlacklistWord()
  {
    return modBlacklistWord;
  }
  
  public void setPasswordBox(boolean modPasswordBox)
  {
    this.modPasswordBox = modPasswordBox;
  }
  
  public boolean isPasswordBox()
  {
    return modPasswordBox;
  }
  
  public void g()
  {
    if (r())
    {
      if ((!getBlacklistWord().isEmpty()) && (b().contains(getBlacklistWord()))) {
        a(b().replace(getBlacklistWord(), ""));
      }
      if (j())
      {
        a(a - 1, f - 1, a + width + 1, f + height + 1, -6250336);
        a(a, f, a + width, f + height, -16777216);
      }
      int var1 = isEnabled ? enabledColor : disabledColor;
      int var2 = i() - lineScrollOffset;
      int var3 = o() - lineScrollOffset;
      String theText = b().substring(lineScrollOffset);
      if (isPasswordBox()) {
        theText = theText.replaceAll(".", "*");
      }
      String var4 = fontRendererInstance.a(theText, p());
      boolean var5 = (var2 >= 0) && (var2 <= var4.length());
      boolean var6 = (m()) && (cursorCounter / 6 % 2 == 0) && (var5);
      int var7 = j() ? a + 4 : a;
      int var8 = j() ? f + (height - 8) / 2 : f;
      int var9 = var7;
      if (var3 > var4.length()) {
        var3 = var4.length();
      }
      if (var4.length() > 0)
      {
        String var10 = var5 ? var4.substring(0, var2) : var4;
        var9 = fontRendererInstance.a(var10, var7, var8, var1);
      }
      boolean var13 = (i() < text.length()) || (text.length() >= h());
      int var11 = var9;
      if (!var5)
      {
        var11 = var2 > 0 ? var7 + width : var7;
      }
      else if (var13)
      {
        var11 = var9 - 1;
        var9--;
      }
      if ((var4.length() > 0) && (var5) && (var2 < var4.length())) {
        var9 = fontRendererInstance.a(var4.substring(var2), var9, var8, var1);
      }
      if (var6) {
        if (var13) {
          avp.a(var11, var8 - 1, var11 + 1, var8 + 1 + fontRendererInstance.a, -3092272);
        } else {
          fontRendererInstance.a("_", var11, var8, var1);
        }
      }
      if (var3 != var2)
      {
        int var12 = var7 + fontRendererInstance.a(var4.substring(0, var3));
        drawCursorVertical(var11, var8 - 1, var12 - 1, var8 + 1 + fontRendererInstance.a);
      }
    }
  }
  
  private void drawCursorVertical(int p_146188_1_, int p_146188_2_, int p_146188_3_, int p_146188_4_)
  {
    if (p_146188_1_ < p_146188_3_)
    {
      int i = p_146188_1_;
      p_146188_1_ = p_146188_3_;
      p_146188_3_ = i;
    }
    if (p_146188_2_ < p_146188_4_)
    {
      int j = p_146188_2_;
      p_146188_2_ = p_146188_4_;
      p_146188_4_ = j;
    }
    if (p_146188_3_ > a + width) {
      p_146188_3_ = a + width;
    }
    if (p_146188_1_ > a + width) {
      p_146188_1_ = a + width;
    }
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    bfl.c(0.0F, 0.0F, 255.0F, 255.0F);
    bfl.x();
    bfl.u();
    bfl.f(5387);
    worldrenderer.a(7, bms.e);
    worldrenderer.b(p_146188_1_, p_146188_4_, 0.0D).d();
    worldrenderer.b(p_146188_3_, p_146188_4_, 0.0D).d();
    worldrenderer.b(p_146188_3_, p_146188_2_, 0.0D).d();
    worldrenderer.b(p_146188_1_, p_146188_2_, 0.0D).d();
    tessellator.b();
    bfl.v();
    bfl.w();
  }
  
  public boolean a(char p_146201_1_, int p_146201_2_)
  {
    super.a(p_146201_1_, p_146201_2_);
    if (!isFocused) {
      return false;
    }
    if (axu.g(p_146201_2_))
    {
      f();
      i(0);
      return true;
    }
    if (axu.f(p_146201_2_))
    {
      if (!isPasswordBox()) {
        axu.e(c());
      }
      return true;
    }
    if (axu.e(p_146201_2_))
    {
      if (isEnabled) {
        b(axu.o());
      }
      return true;
    }
    if (axu.d(p_146201_2_))
    {
      if (!isPasswordBox()) {
        axu.e(c());
      }
      if (isEnabled) {
        b("");
      }
      return true;
    }
    switch (p_146201_2_)
    {
    case 14: 
      if (axu.q())
      {
        if (isEnabled) {
          a(-1);
        }
      }
      else if (isEnabled) {
        b(-1);
      }
      return true;
    case 199: 
      if (axu.r()) {
        i(0);
      } else {
        e();
      }
      return true;
    case 203: 
      if (axu.r())
      {
        if (axu.q()) {
          i(a(-1, o()));
        } else {
          i(o() - 1);
        }
      }
      else if (axu.q()) {
        e(c(-1));
      } else {
        d(-1);
      }
      return true;
    case 205: 
      if (axu.r())
      {
        if (axu.q()) {
          i(a(1, o()));
        } else {
          i(o() + 1);
        }
      }
      else if (axu.q()) {
        e(c(1));
      } else {
        d(1);
      }
      return true;
    case 207: 
      if (axu.r()) {
        i(text.length());
      } else {
        f();
      }
      return true;
    case 211: 
      if (axu.q())
      {
        if (isEnabled) {
          a(1);
        }
      }
      else if (isEnabled) {
        b(1);
      }
      return true;
    }
    if (f.a(p_146201_1_))
    {
      if (isEnabled) {
        b(Character.toString(p_146201_1_));
      }
      return true;
    }
    return false;
  }
  
  public void f(int p_146203_1_)
  {
    maxStringLength = p_146203_1_;
    if (text.length() > p_146203_1_) {
      text = text.substring(0, p_146203_1_);
    }
  }
  
  public int h()
  {
    return maxStringLength;
  }
  
  public int i()
  {
    return cursorPosition;
  }
  
  public boolean j()
  {
    return enableBackgroundDrawing;
  }
  
  public void a(boolean p_146185_1_)
  {
    enableBackgroundDrawing = p_146185_1_;
  }
  
  public void g(int p_146193_1_)
  {
    enabledColor = p_146193_1_;
  }
  
  public void h(int p_146204_1_)
  {
    disabledColor = p_146204_1_;
  }
  
  public void b(boolean p_146195_1_)
  {
    if ((p_146195_1_) && (!isFocused)) {
      cursorCounter = 0;
    }
    isFocused = p_146195_1_;
  }
  
  public boolean m()
  {
    return isFocused;
  }
  
  public void c(boolean p_146184_1_)
  {
    isEnabled = p_146184_1_;
  }
  
  public int o()
  {
    return selectionEnd;
  }
  
  public int p()
  {
    return j() ? width - 8 : width;
  }
  
  public void i(int p_146199_1_)
  {
    int i = text.length();
    if (p_146199_1_ > i) {
      p_146199_1_ = i;
    }
    if (p_146199_1_ < 0) {
      p_146199_1_ = 0;
    }
    selectionEnd = p_146199_1_;
    if (fontRendererInstance != null)
    {
      if (lineScrollOffset > i) {
        lineScrollOffset = i;
      }
      int j = p();
      String s = fontRendererInstance.a(text.substring(lineScrollOffset), j);
      int k = s.length() + lineScrollOffset;
      if (p_146199_1_ == lineScrollOffset) {
        lineScrollOffset -= fontRendererInstance.a(text, j, true).length();
      }
      if (p_146199_1_ > k) {
        lineScrollOffset += p_146199_1_ - k;
      } else if (p_146199_1_ <= lineScrollOffset) {
        lineScrollOffset -= lineScrollOffset - p_146199_1_;
      }
      lineScrollOffset = ns.a(lineScrollOffset, 0, i);
    }
  }
  
  public void d(boolean p_146205_1_)
  {
    canLoseFocus = p_146205_1_;
  }
  
  public boolean r()
  {
    return visible;
  }
  
  public void e(boolean p_146189_1_)
  {
    visible = p_146189_1_;
  }
}
