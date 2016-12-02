package net.labymod.spm;

import bnq;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import nm;

public class SPMBinding
  implements Comparable<SPMBinding>
{
  private static final List<SPMBinding> keybindArray = ;
  private static final nm<SPMBinding> hash = new nm();
  private static final Set<String> keybindSet = Sets.newHashSet();
  private final String keyDescription;
  private final int keyCodeDefault;
  private final String keyCategory;
  private int keyCode;
  private boolean pressed;
  private int pressTime;
  
  public static void onTick(int keyCode)
  {
    if (keyCode != 0)
    {
      SPMBinding keybinding = (SPMBinding)hash.a(keyCode);
      if (keybinding != null) {
        keybinding.pressTime += 1;
      }
    }
  }
  
  public static void setKeyBindState(int keyCode, boolean pressed)
  {
    if (keyCode != 0)
    {
      SPMBinding keybinding = (SPMBinding)hash.a(keyCode);
      if (keybinding != null) {
        keybinding.pressed = pressed;
      }
    }
  }
  
  public static void unPressAllKeys()
  {
    for (SPMBinding keybinding : keybindArray) {
      keybinding.unpressKey();
    }
  }
  
  public static void resetKeyBindingArrayAndHash()
  {
    hash.c();
    for (SPMBinding keybinding : keybindArray) {
      hash.a(keybinding.keyCode, keybinding);
    }
  }
  
  public static Set<String> getKeybinds()
  {
    return keybindSet;
  }
  
  public SPMBinding(String description, int keyCode, String category)
  {
    this.keyDescription = description;
    this.keyCode = keyCode;
    this.keyCodeDefault = keyCode;
    this.keyCategory = category;
    keybindArray.add(this);
    hash.a(keyCode, this);
    keybindSet.add(category);
  }
  
  public boolean isKeyDown()
  {
    return this.pressed;
  }
  
  public String getKeyCategory()
  {
    return this.keyCategory;
  }
  
  public boolean isPressed()
  {
    if (this.pressTime == 0) {
      return false;
    }
    this.pressTime -= 1;
    return true;
  }
  
  private void unpressKey()
  {
    this.pressTime = 0;
    this.pressed = false;
  }
  
  public String getKeyDescription()
  {
    return this.keyDescription;
  }
  
  public int getKeyCodeDefault()
  {
    return this.keyCodeDefault;
  }
  
  public int getKeyCode()
  {
    return this.keyCode;
  }
  
  public void setKeyCode(int keyCode)
  {
    this.keyCode = keyCode;
  }
  
  public int compareTo(SPMBinding p_compareTo_1_)
  {
    int i = bnq.a(this.keyCategory, new Object[0]).compareTo(bnq.a(p_compareTo_1_.keyCategory, new Object[0]));
    if (i == 0) {
      i = bnq.a(this.keyDescription, new Object[0]).compareTo(bnq.a(p_compareTo_1_.keyDescription, new Object[0]));
    }
    return i;
  }
}
