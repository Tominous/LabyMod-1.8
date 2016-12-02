package de.labystudio.games;

import ave;
import avs;
import axu;
import bfl;
import de.labystudio.gui.GuiGames;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.StatsLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class Snake
  extends axu
{
  DrawUtils draw;
  
  public Snake()
  {
    draw = getInstancedraw;
  }
  
  int lengthX = 0;
  int posX = 1;
  int posY = 4;
  int lengthY = 0;
  int speed = 120;
  int powerUpAmount = 40;
  boolean cooldown = false;
  avs quit;
  avs restart;
  int score = 0;
  Thread thread;
  boolean gameOver = false;
  EnumDirection snakeDirection = EnumDirection.DOWN;
  ArrayList<Location> points = new ArrayList();
  ArrayList<Location> snake = new ArrayList();
  
  static enum EnumDirection
  {
    UP,  RIGHT,  DOWN,  LEFT;
    
    private EnumDirection() {}
  }
  
  static enum EnumPixelType
  {
    PIXEL,  SNEAK,  FRUIT,  INCREASESPEED,  DECREASESPEED,  MOREFRUITS;
    
    private EnumPixelType() {}
  }
  
  class Location
  {
    int x = 0;
    int y = 0;
    Snake.EnumPixelType type = Snake.EnumPixelType.PIXEL;
    
    public Location(int x, int y, Snake.EnumPixelType type)
    {
      this.x = x;
      this.y = y;
      this.type = type;
    }
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    
    quit = new avs(0, 5, 5, 30, 20, de.labystudio.utils.Color.cl("c") + "Quit");
    n.add(quit);
    
    lengthX = (l / 10 - 2);
    lengthY = (m / 10 - 4);
    if (gameOver)
    {
      restart = new avs(1, l / 2 - 100, m - 25, 200, 20, "Play again");
      n.add(restart);
      super.b();
      return;
    }
    if (thread == null)
    {
      create();
    }
    else
    {
      points.clear();
      addPoint();
      if ((getHeadx > lengthX) || (getHeady > lengthY)) {
        expand(lengthX / 2, lengthY / 2);
      }
    }
    super.b();
  }
  
  private void create()
  {
    score = 0;
    snakeDirection = EnumDirection.DOWN;
    gameOver = false;
    snake.clear();
    for (int i = 0; i < 3; i++) {
      expand(lengthX / 2, lengthY / 2 + i);
    }
    addPoint();
    start();
  }
  
  private void start()
  {
    thread = new Thread(new Runnable()
    {
      public void run()
      {
        for (;;)
        {
          if ((gameOver) || (j.m != Snake.this)) {
            return;
          }
          Snake.this.tick();
          try
          {
            synchronized (thread)
            {
              thread.wait(speed);
            }
          }
          catch (Exception e)
          {
            e.printStackTrace();
          }
        }
      }
    });
    thread.start();
  }
  
  private void gameOver()
  {
    if (!gameOver)
    {
      ArrayList<String> list = new ArrayList();
      if (StatsLoader.stats.containsKey("snake")) {
        list = (ArrayList)StatsLoader.stats.get("snake");
      }
      if (StatsLoader.isHighScore(score, list)) {
        list.add(0, "" + score);
      }
      if (list.size() > 15) {
        list.remove(15);
      }
      StatsLoader.stats.put("snake", list);
      StatsLoader.savestats();
    }
    gameOver = true;
    b();
  }
  
  private void tick()
  {
    boolean devalue = true;
    if (snakeDirection == EnumDirection.UP)
    {
      Location head = getHead();
      if (y < posY) {
        y = lengthY;
      }
      devalue = expand(x, y - 1);
    }
    if (snakeDirection == EnumDirection.DOWN)
    {
      Location head = getHead();
      if (y > lengthY) {
        y = posY;
      }
      devalue = expand(x, y + 1);
    }
    if (snakeDirection == EnumDirection.RIGHT)
    {
      Location head = getHead();
      if (x > lengthX) {
        x = posX;
      }
      devalue = expand(x + 1, y);
    }
    if (snakeDirection == EnumDirection.LEFT)
    {
      Location head = getHead();
      if (x < posX) {
        x = lengthX;
      }
      devalue = expand(x - 1, y);
    }
    if (devalue) {
      devalue();
    }
    cooldown = false;
  }
  
  private Location getHead()
  {
    ArrayList<Location> s = getSnake();
    if (s.size() == 0) {
      return new Location(0, 0, EnumPixelType.PIXEL);
    }
    return (Location)s.get(s.size() - 1);
  }
  
  private void devalue()
  {
    if (snake != null) {
      snake.remove(0);
    }
  }
  
  private void setSpeed(int speed)
  {
    if (speed > 300) {
      speed = 300;
    }
    if (speed < 10) {
      speed = 10;
    }
    this.speed = speed;
  }
  
  private boolean expand(int x, int y)
  {
    Location l = new Location(x, y, EnumPixelType.SNEAK);
    for (Location a : getSnake()) {
      if (a != null) {
        if ((x == x) && (y == y))
        {
          gameOver();
          return false;
        }
      }
    }
    for (Location a : points) {
      if (a != null) {
        if ((x == x) && (y == y))
        {
          addScore();
          addPoint();
          if (type == EnumPixelType.MOREFRUITS)
          {
            addScore();
            addPoint();
          }
          if (type == EnumPixelType.INCREASESPEED)
          {
            addScore();
            setSpeed(speed - LabyMod.random.nextInt(50));
          }
          if (type == EnumPixelType.DECREASESPEED)
          {
            addScore();
            setSpeed(speed + LabyMod.random.nextInt(50));
          }
          snake.add(l);
          points.remove(a);
          return false;
        }
      }
    }
    snake.add(l);
    return true;
  }
  
  private void addScore()
  {
    score += 10;
  }
  
  public void addPoint()
  {
    EnumPixelType type = EnumPixelType.FRUIT;
    int i = LabyMod.random.nextInt(powerUpAmount);
    if (i == 0) {
      type = EnumPixelType.INCREASESPEED;
    }
    if (i == 1) {
      type = EnumPixelType.DECREASESPEED;
    }
    if (i == 2) {
      type = EnumPixelType.MOREFRUITS;
    }
    Location l = new Location(LabyMod.random.nextInt(lengthX - posX) + posX, LabyMod.random.nextInt(lengthY - posY) + posY, type);
    for (Location a : points) {
      if (a != null) {
        if ((x == x) && (y == y))
        {
          addPoint();
          return;
        }
      }
    }
    points.add(l);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(avs button)
    throws IOException
  {
    if (k == 0) {
      j.a(new GuiGames());
    }
    if (k == 1) {
      j.a(new Snake());
    }
    super.a(button);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      j.a(new GuiGames());
      return;
    }
    if ((!gameOver) && (!cooldown))
    {
      boolean boost = true;
      if (((keyCode == 200) || (keyCode == 17)) && 
        (snakeDirection != EnumDirection.DOWN) && (snakeDirection != EnumDirection.UP))
      {
        snakeDirection = EnumDirection.UP;
        cooldown = true;
        boost = false;
      }
      if (((keyCode == 208) || (keyCode == 31)) && 
        (snakeDirection != EnumDirection.UP) && (snakeDirection != EnumDirection.DOWN))
      {
        snakeDirection = EnumDirection.DOWN;
        cooldown = true;
        boost = false;
      }
      if (((keyCode == 205) || (keyCode == 32)) && 
        (snakeDirection != EnumDirection.LEFT) && (snakeDirection != EnumDirection.RIGHT))
      {
        snakeDirection = EnumDirection.RIGHT;
        cooldown = true;
        boost = false;
      }
      if (((keyCode == 203) || (keyCode == 30)) && 
        (snakeDirection != EnumDirection.RIGHT) && (snakeDirection != EnumDirection.LEFT))
      {
        snakeDirection = EnumDirection.LEFT;
        cooldown = true;
        boost = false;
      }
      if ((boost) && 
        (LabyMod.random.nextInt(3) == 0)) {
        tick();
      }
    }
    super.a(typedChar, keyCode);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (LabyMod.getInstance().isInGame())
    {
      bfl.l();
      draw.drawTransparentBackground(0, 32, l, m - 33);
    }
    else
    {
      c();
      draw.drawChatBackground(0, 32, l, m - 33);
    }
    for (Location loc : getSnake()) {
      if (loc != null) {
        drawPixel(x, y, java.awt.Color.WHITE.getRGB());
      }
    }
    for (Location loc : getPoints()) {
      if (loc != null)
      {
        if (type == EnumPixelType.FRUIT) {
          drawPixel(x, y, java.awt.Color.RED.getRGB());
        }
        if (type == EnumPixelType.MOREFRUITS) {
          drawPixel(x, y, java.awt.Color.ORANGE.getRGB());
        }
        if (type == EnumPixelType.INCREASESPEED) {
          drawPixel(x, y, java.awt.Color.CYAN.getRGB());
        }
        if (type == EnumPixelType.DECREASESPEED) {
          drawPixel(x, y, java.awt.Color.BLUE.getRGB());
        }
      }
    }
    if (gameOver)
    {
      GL11.glPushMatrix();
      int k = 3;
      GL11.glScaled(k, k, k);
      draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + "Game Over", l / 2 / k, (m / 4 - 5) / k);
      GL11.glPopMatrix();
      int i;
      if (StatsLoader.stats.containsKey("snake"))
      {
        ArrayList<String> list = (ArrayList)StatsLoader.stats.get("snake");
        i = 1;
        for (String sc : list)
        {
          draw.drawString(i + ". Place - " + de.labystudio.utils.Color.cl("b") + sc + " Points", l / 2 - 50, m / 4 - 5 + i * 10 + 20);
          i++;
          if (i > 10) {
            break;
          }
        }
      }
      else
      {
        draw.drawCenteredString(de.labystudio.utils.Color.cl("f") + "No stats found", l / 2, m / 4 - 5 + 30);
      }
    }
    bfl.k();
    draw.overlayBackground(0, 32);
    draw.overlayBackground(m - 33, m);
    
    draw.drawString("Score: " + score, 5.0D, m - 24);
    draw.drawString("Speed: " + speed / 1000.0D + " pixel/s", 5.0D, m - 13);
    
    super.a(mouseX, mouseY, partialTicks);
  }
  
  private ArrayList<Location> getSnake()
  {
    ArrayList<Location> s = new ArrayList();
    s.addAll(snake);
    return s;
  }
  
  private ArrayList<Location> getPoints()
  {
    ArrayList<Location> s = new ArrayList();
    s.addAll(points);
    return s;
  }
  
  public void drawPixel(int x, int y, int color)
  {
    DrawUtils.a(x * 10, y * 10, (x + 1) * 10, (y + 1) * 10, color);
  }
}
