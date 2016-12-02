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
    this.name = name;
      if (name.equalsIgnoreCase("LMB"))
      {
      }
      else
      {
        if (!name.equalsIgnoreCase("RMB")) {
          throw new IllegalArgumentException("Invalid key '" + name + "'");
        }
      }
    }
    this.x = x;
    this.y = y;
  }
  
  public String getName()
  {
  }
  
  public boolean isMouseKey()
  {
  }
  
  public int getKey()
  {
  }
  
  public int getX()
  {
  }
  
  public int getY()
  {
  }
  
  public int getWidth()
  {
  }
  
  public int getHeight()
  {
    return 18;
  }
  
  public boolean isPressed()
  {
  }
  
  public void setPressed(boolean pressed)
  {
    this.pressed = pressed;
  }
}
