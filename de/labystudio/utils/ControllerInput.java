package de.labystudio.utils;

import ave;
import avh;
import axp;
import beu;
import bew;
import java.awt.Robot;
import java.lang.reflect.Field;
import org.lwjgl.input.Controller;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class ControllerInput
{
  private static Controller controllers;
  private static Robot robot;
  private static Field dxField;
  private static Field dyField;
  private static long delay = 0L;
  private static int mouseX = 0;
  private static int mouseY = 0;
  private static beu input = new beu();
  private static beu oldInput;
  private static boolean pressedAttack = false;
  private static boolean pressedInteract = false;
  private static boolean active = false;
  private static long lastCheck = 0L;
  
  public static void init()
  {
    try
    {
      
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    Controllers.poll();
    try
    {
      dxField = getSetField("dx");
      dyField = getSetField("dy");
      
      robot = new Robot();
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
  }
  
  public static void tick()
  {
    if (lastCheck < System.currentTimeMillis())
    {
      lastCheck = System.currentTimeMillis() + 2000L;
      for (int i = 0; i < Controllers.getControllerCount(); i++)
      {
        String name = Controllers.getController(i).getName().toLowerCase();
        if ((name.contains("xbox")) || (name.contains("controller")) || (name.contains("playstation")) || (name.contains("joystick")))
        {
          controllers = Controllers.getController(i);
          break;
        }
      }
    }
    bew player = Ah;
    if ((controllers == null) || (player == null)) {
      return;
    }
    controllers.poll();
    if (!active)
    {
      for (int i = 0; i < controllers.getButtonCount(); i++) {
        if (controllers.isButtonPressed(i)) {
          active = true;
        }
      }
      if ((controllers.getAxisValue(3) > 0.5D) || (controllers.getAxisValue(2) > 0.5D) || 
        (controllers.getAxisValue(3) < -0.5D) || (controllers.getAxisValue(2) < -0.5D) || 
        (controllers.getAxisValue(0) > 0.5D) || (controllers.getAxisValue(1) > 0.5D) || 
        (controllers.getAxisValue(0) < -0.5D) || (controllers.getAxisValue(1) < -0.5D)) {
        active = true;
      }
    }
    else if ((Keyboard.getEventKeyState()) && (Keyboard.getEventKey() != 1))
    {
      active = false;
      if (oldInput != null)
      {
        b = oldInput;
        oldInput = null;
      }
    }
    if (!active) {
      return;
    }
    boolean ingame = Am == null;
    if (delay < System.currentTimeMillis())
    {
      if (controllers.isButtonPressed(4))
      {
        if (ingame) {
          robot.mouseWheel(-1);
        }
        delay = System.currentTimeMillis() + 150L;
      }
      if (controllers.isButtonPressed(5))
      {
        if (ingame) {
          robot.mouseWheel(1);
        }
        delay = System.currentTimeMillis() + 150L;
      }
      if (controllers.isButtonPressed(1))
      {
        if (ingame)
        {
          robot.mousePress(8);
          robot.mouseRelease(8);
        }
        delay = System.currentTimeMillis() + 200L;
      }
      if (controllers.isButtonPressed(7))
      {
        robot.keyPress(27);
        delay = System.currentTimeMillis() + 200L;
      }
      if (controllers.isButtonPressed(3))
      {
        player.a(controllers.isButtonPressed(8));
        delay = System.currentTimeMillis() + 200L;
      }
      if ((controllers.getZAxisValue() < -0.5D) || ((controllers.isButtonPressed(9)) && (!ingame)))
      {
        robot.mousePress(16);
        delay = System.currentTimeMillis() + 200L;
        pressedAttack = true;
      }
      if (controllers.getZAxisValue() > 0.5D)
      {
        robot.mousePress(4);
        delay = System.currentTimeMillis() + 200L;
        pressedInteract = true;
      }
      if (controllers.isButtonPressed(6))
      {
        if (ingame) {
          if (At.aA >= 2) {
            At.aA = 0;
          } else {
            At.aA += 1;
          }
        }
        delay = System.currentTimeMillis() + 200L;
      }
    }
    if ((controllers.getZAxisValue() >= -0.5D) && (pressedAttack))
    {
      robot.mouseRelease(16);
      pressedAttack = false;
    }
    if ((controllers.getZAxisValue() <= 0.5D) && (pressedInteract))
    {
      robot.mouseRelease(4);
      pressedInteract = false;
    }
    if (ingame)
    {
      inputc = ((controllers.isButtonPressed(2)) || (controllers.isButtonPressed(9)));
      inputb = ((0.0F + controllers.getAxisValue(0) > 0.5D ? -1 : controllers.getAxisValue(0) < -0.5D ? 1 : 0) * (At.aA == 2 ? -1 : 1));
      inputa = ((0.0F + controllers.getAxisValue(1) > 0.5D ? -1 : controllers.getAxisValue(1) < -0.5D ? 1 : 0) * (At.aA == 2 ? -1 : 1));
      inputd = controllers.isButtonPressed(8);
      if (inputd)
      {
        inputa = ((float)(inputa * 0.3D));
        inputb = ((float)(inputb * 0.3D));
      }
      else if (inputb > 0.0F)
      {
        player.d(true);
      }
    }
    else
    {
      inputc = false;
      inputb = 0.0F;
      inputa = 0.0F;
      inputd = false;
    }
    if (oldInput == null) {
      oldInput = b;
    }
    b = input;
  }
  
  public static void mouseTick()
  {
    if ((!active) || (controllers == null) || (Ah == null) || ((Am instanceof axp))) {
      return;
    }
    try
    {
      float inputX = controllers.getAxisValue(3);
      float inputY = controllers.getAxisValue(2);
      if (Am == null)
      {
        float multiplier = 4.0F * At.a * (Ah.aw() ? 1.5F : 1.0F);
        dxField.setInt(null, (int)(inputX * multiplier));
        dyField.setInt(null, (int)(inputY * -multiplier));
        mouseX = Mouse.getX();
        mouseY = Mouse.getY();
      }
      else
      {
        float multiplier = 2.0F * At.a;
        if ((inputX != 1.0F) && (inputX != -1.0F)) {
          inputX = 0.0F;
        }
        if ((inputY != 1.0F) && (inputY != -1.0F)) {
          inputY = 0.0F;
        }
        mouseX = (int)(mouseX + inputX * multiplier);
        mouseY = (int)(mouseY + inputY * multiplier);
        robot.mouseMove(mouseX, mouseY);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  private static Field getSetField(String fieldName)
    throws NoSuchFieldException, SecurityException
  {
    Field f = Mouse.class.getDeclaredField(fieldName);
    f.setAccessible(true);
    return f;
  }
  
  public static void exit()
  {
    Controllers.destroy();
    Controllers.clearEvents();
  }
}
