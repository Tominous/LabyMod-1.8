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
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class Mario
  extends axu
{
  DrawUtils draw;
  
  public Mario()
  {
    draw = getInstancedraw;
    thread = null;
  }
  
  int lengthX = 0;
  int posX = 1;
  int posY = 4;
  int lengthY = 0;
  int speed = 60;
  int score = 0;
  avs quit;
  avs restart;
  Thread thread;
  boolean gameOver = false;
  ArrayList<Location> terrain = new ArrayList();
  double fallDistance = 0.0D;
  int jumpVelocity = 0;
  Location playerLocation;
  
  static enum EnumDirection
  {
    UP,  RIGHT,  DOWN,  LEFT;
    
    private EnumDirection() {}
  }
  
  static enum EnumPixelType
  {
    PIXEL,  MARIO,  LAVA,  BLOCK,  CLOUD,  BUSH,  TUBE,  BONUS,  CLOUDBLOCK;
    
    private EnumPixelType() {}
  }
  
  class Location
  {
    int x = 0;
    int y = 0;
    Mario.EnumPixelType type = Mario.EnumPixelType.PIXEL;
    
    public Location(int x, int y, Mario.EnumPixelType type)
    {
      this.x = x;
      this.y = y;
      this.type = type;
    }
    
    public Location add(int x, int y)
    {
      this.x += x;
      this.y += y;
      return this;
    }
    
    public Location clone()
    {
      return new Location(Mario.this, x, y, type);
    }
    
    public int getX()
    {
      return x;
    }
    
    public int getY()
    {
      return y;
    }
    
    public boolean collideWith(Location loc)
    {
      if ((getX() == loc.getX()) && (getY() == loc.getY())) {
        return true;
      }
      return false;
    }
  }
  
  public boolean collideWithPixelType(Location loc, EnumPixelType pixel)
  {
    for (Location terrain : getTerrain()) {
      if ((terrain.collideWith(loc)) && (type == pixel)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean collideWithBlock(Location loc)
  {
    for (Location terrain : getTerrain()) {
      if ((terrain.collideWith(loc)) && (
        (type == EnumPixelType.BLOCK) || (type == EnumPixelType.TUBE) || (type == EnumPixelType.BONUS) || (type == EnumPixelType.CLOUDBLOCK))) {
        return true;
      }
    }
    return false;
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
    if (thread == null) {
      create();
    }
    super.b();
  }
  
  private void create()
  {
    gameOver = false;
    buildTerrain();
    spawnPlayer();
    start();
  }
  
  private void spawnPlayer()
  {
    playerLocation = new Location(5, 2, EnumPixelType.MARIO);
  }
  
  public void moveTerrain(int x)
  {
    for (Location loc : getTerrain()) {
      loc.add(x, 0);
    }
    getPlayerLocation().add(x, 0);
  }
  
  private void buildTerrain()
  {
    for (int m = 0; m <= 50; m++) {
      terrain.add(new Location(-1, m, EnumPixelType.BLOCK));
    }
    int x = 0;
    int y = 14;
    for (int i = 0; i <= 400; i++)
    {
      if (i == 0) {
        for (int tt = 0; tt <= 20; tt++)
        {
          for (int m = 0; m <= 50; m++) {
            terrain.add(new Location(0 + x, y + m, EnumPixelType.BLOCK));
          }
          x++;
        }
      }
      for (int m = 0; m <= 50; m++) {
        terrain.add(new Location(0 + x, y + m, EnumPixelType.BLOCK));
      }
      if (LabyMod.random.nextInt(20) == 0) {
        terrain.add(new Location(0 + x, y - 1, EnumPixelType.BUSH));
      }
      x++;
      if (LabyMod.random.nextInt(10) == 0) {
        for (int t = 0; t <= 3; t++) {
          if (LabyMod.random.nextBoolean())
          {
            x++;
            if (LabyMod.random.nextBoolean())
            {
              if (y < 30) {
                y++;
              }
            }
            else if (y > 0) {
              y--;
            }
          }
        }
      }
      if (LabyMod.random.nextInt(5) == 0)
      {
        int mt = 0;
        terrain.add(new Location(0 + x, y - mt - 1, EnumPixelType.TUBE));
        mt++;
        for (int t = 0; t <= 1; t++) {
          if (LabyMod.random.nextBoolean())
          {
            terrain.add(new Location(0 + x, y - mt - 1, EnumPixelType.TUBE));
            mt++;
          }
        }
      }
      if (LabyMod.random.nextInt(3) == 0)
      {
        int mt = 0;
        if (y - 5 > 0)
        {
          int yy = LabyMod.random.nextInt(y - 5);
          for (int t = 0; t <= 4; t++) {
            if (LabyMod.random.nextBoolean())
            {
              terrain.add(new Location(0 + x + mt, yy, EnumPixelType.CLOUD));
              mt++;
            }
          }
        }
      }
    }
  }
  
  public Location getPlayerLocation()
  {
    return playerLocation;
  }
  
  public Location getPlayerHeadLocation()
  {
    if (getPlayerLocation() != null)
    {
      Location loc = getPlayerLocation().clone().add(0, -1);
      return loc;
    }
    return null;
  }
  
  public boolean isPlayer()
  {
    return getPlayerLocation() != null;
  }
  
  public ArrayList<Location> getTerrain()
  {
    return terrain;
  }
  
  public boolean isOnGround()
  {
    return fallDistance == 0.0D;
  }
  
  public int getFallDistance()
  {
    return (int)fallDistance;
  }
  
  private void start()
  {
    thread = new Thread(new Runnable()
    {
      public void run()
      {
        for (;;)
        {
          if ((gameOver) || (j.m != Mario.this)) {
            return;
          }
          Mario.this.tick();
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
      if (StatsLoader.stats.containsKey("mario")) {
        list = (ArrayList)StatsLoader.stats.get("mario");
      }
      if (StatsLoader.isHighScore(score, list)) {
        list.add(0, "" + score);
      }
      if (list.size() > 15) {
        list.remove(15);
      }
      StatsLoader.stats.put("mario", list);
      StatsLoader.savestats();
    }
    gameOver = true;
    b();
  }
  
  int tick = 0;
  
  private void tick()
  {
    fallDistance += 1.0D;
    if (collideWithBlock(playerLocation.clone().add(0, 1))) {
      fallDistance = 0.0D;
    }
    if (isPlayer())
    {
      if ((!isOnGround()) && (LabyMod.random.nextInt(getFallDistance()) != 0) && (jumpVelocity == 0) && 
        (!collideWithBlock(playerLocation.clone().add(0, 1)))) {
        playerLocation.add(0, 1);
      }
      if ((jumpVelocity > 0) && 
        (!collideWithBlock(playerLocation.clone().add(0, -1))))
      {
        playerLocation.add(0, -1);
        jumpVelocity -= 1;
      }
      if (collideWithPixelType(getPlayerLocation(), EnumPixelType.LAVA)) {
        gameOver();
      }
      if (getPlayerLocation().getX() > 30) {
        moveTerrain(-1);
      }
      if (getPlayerLocation().getY() > 30) {
        gameOver();
      }
    }
    handleKeyBoardInput();
    
    tick += 1;
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
      j.a(new Mario());
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
    super.a(typedChar, keyCode);
  }
  
  protected void handleKeyBoardInput()
  {
    if (!gameOver)
    {
      if (((Keyboard.isKeyDown(205)) || (Keyboard.isKeyDown(32))) && 
        (!collideWithBlock(getPlayerLocation().clone().add(1, 0))) && (!collideWithBlock(getPlayerHeadLocation().clone().add(1, 0))))
      {
        getPlayerLocation().add(1, 0);
        score += 1;
      }
      if (((Keyboard.isKeyDown(203)) || (Keyboard.isKeyDown(30))) && 
        (!collideWithBlock(getPlayerLocation().clone().add(-1, 0))) && (!collideWithBlock(getPlayerHeadLocation().clone().add(-1, 0))))
      {
        getPlayerLocation().add(-1, 0);
        score -= 1;
      }
      if ((Keyboard.isKeyDown(57)) && 
        (isOnGround())) {
        jumpVelocity = 3;
      }
    }
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
    DrawUtils.a(0, 0, l, m, new java.awt.Color(107, 140, 255).getRGB());
    for (Iterator localIterator1 = getTerrain().iterator(); localIterator1.hasNext();)
    {
      terrain = (Location)localIterator1.next();
      if (type == EnumPixelType.CLOUD) {
        drawPixel(terrain.getX(), terrain.getY(), java.awt.Color.WHITE.getRGB());
      }
    }
    Location loc = getPlayerLocation();
    if (loc != null)
    {
      drawPixel(loc.getX(), loc.getY(), java.awt.Color.BLUE.getRGB());
      loc = getPlayerHeadLocation();
      drawPixel(loc.getX(), loc.getY(), java.awt.Color.BLUE.getRGB());
    }
    for (Location terrain = getTerrain().iterator(); terrain.hasNext();)
    {
      terrain = (Location)terrain.next();
      if (type == EnumPixelType.LAVA) {
        drawPixel(terrain.getX(), terrain.getY(), java.awt.Color.ORANGE.getRGB());
      }
      if (type == EnumPixelType.BLOCK) {
        drawPixel(terrain.getX(), terrain.getY(), new java.awt.Color(231, 99, 24).getRGB());
      }
      if (type == EnumPixelType.TUBE) {
        drawPixel(terrain.getX(), terrain.getY(), new java.awt.Color(0, 173, 0).getRGB());
      }
      if (type == EnumPixelType.BUSH) {
        drawPixel(terrain.getX(), terrain.getY(), new java.awt.Color(189, 247, 24).getRGB());
      }
      if (type == EnumPixelType.CLOUDBLOCK) {
        drawPixel(terrain.getX(), terrain.getY(), new java.awt.Color(239, 239, 239).getRGB());
      }
      if (type == EnumPixelType.BONUS) {
        drawPixel(terrain.getX(), terrain.getY(), new java.awt.Color(255, 165, 66).getRGB());
      }
    }
    Location terrain;
    ArrayList<Location> toRem = new ArrayList();
    for (Location lm : getTerrain()) {
      if (loc.getX() < 0) {
        toRem.add(loc);
      }
    }
    for (Location ll : toRem) {
      getTerrain().remove(ll);
    }
    if (gameOver)
    {
      GL11.glPushMatrix();
      int k = 3;
      GL11.glScaled(k, k, k);
      draw.drawCenteredString(de.labystudio.utils.Color.cl("c") + "Game Over", l / 2 / k, (m / 4 - 5) / k);
      GL11.glPopMatrix();
      int i;
      if (StatsLoader.stats.containsKey("mario"))
      {
        ArrayList<String> list = (ArrayList)StatsLoader.stats.get("mario");
        i = 1;
        for (String sc : list)
        {
          draw.drawString(i + ". Place - " + de.labystudio.utils.Color.cl("b") + sc + "m", l / 2 - 43, m / 4 - 5 + i * 10 + 20);
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
    
    int s = score;
    if (s < 0) {
      s = 0;
    }
    draw.drawString("Score: " + s + "m", 5.0D, m - 24);
    
    super.a(mouseX, mouseY, partialTicks);
  }
  
  public void drawPixel(int x, int y, int color)
  {
    DrawUtils.a(x * 10, y * 10, (x + 1) * 10, (y + 1) * 10, color);
  }
}
