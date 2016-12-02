package pw.cinque.keystrokes.render;

import ave;
import avn;
import org.lwjgl.input.Keyboard;

public class Key
{
  private final String name;
  private boolean isMouseKey;
  private int key;
  private final int x;
  private final int y;
  private final int width;
  private boolean pressed;
  
  public Key(String name, int x, int y)
  {
    pressed = false;
    this.name = name;
    isMouseKey = false;
    key = Keyboard.getKeyIndex(name);
    if (key == 0) {
      if (name.equalsIgnoreCase("LMB"))
      {
        key = 0;
        isMouseKey = true;
      }
      else
      {
        if (!name.equalsIgnoreCase("RMB")) {
          throw new IllegalArgumentException("Invalid key '" + name + "'");
        }
        key = 1;
        isMouseKey = true;
      }
    }
    this.x = x;
    this.y = y;
    width = Math.max(18, Ak.a(name) + 8);
  }
  
  public String getName()
  {
    return name;
  }
  
  public boolean isMouseKey()
  {
    return isMouseKey;
  }
  
  public int getKey()
  {
    return key;
  }
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int getHeight()
  {
    return 18;
  }
  
  public boolean isPressed()
  {
    return pressed;
  }
  
  public void setPressed(boolean pressed)
  {
    this.pressed = pressed;
  }
}
