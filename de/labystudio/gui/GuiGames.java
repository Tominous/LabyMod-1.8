package de.labystudio.gui;

import ave;
import avs;
import bfl;
import de.labystudio.games.EnumGame;
import de.labystudio.games.Mario;
import de.labystudio.games.Snake;
import de.labystudio.labymod.LabyMod;
import de.labystudio.language.L;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiGames
  extends GuiMenuScreen
{
  DrawUtils draw;
  
  public GuiGames()
  {
    super(null);
    childScreen = this;
    draw = getInstancedraw;
    id = "Games";
  }
  
  EnumGame selectedGame = EnumGame.None;
  private avs btnPlay;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(btnPlay = new avs(0, l / 2 - 100, m - 70, 200, 20, "Play"));
    
    int bx = 0;
    for (EnumGame g : EnumGame.values()) {
      if (g != EnumGame.None)
      {
        avs b = new avs(-1, 5 + bx, m - 26, 80, 20, g.name());
        l = (g != selectedGame);
        n.add(b);
        bx += 82;
      }
    }
    super.b();
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(avs button)
    throws IOException
  {
    if (k == -1) {
      for (EnumGame g : EnumGame.values()) {
        if (g.name().equals(j))
        {
          selectedGame = g;
          b();
        }
      }
    }
    if (k == 0)
    {
      if (selectedGame == EnumGame.Snake)
      {
        j.a(new Snake());
        return;
      }
      if (selectedGame == EnumGame.Mario)
      {
        j.a(new Mario());
        return;
      }
    }
    super.actionPermformed(button);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
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
    bfl.k();
    draw.overlayBackground(0, 32);
    draw.overlayBackground(m - 33, m);
    if (selectedGame == EnumGame.None) {
      draw.drawCenteredString(Color.cl("c") + L.f("gui_games_nogames", new Object[0]), l / 2, m / 2);
    }
    if (selectedGame == EnumGame.Snake)
    {
      GL11.glPushMatrix();
      int k = 2;
      GL11.glScaled(k, k, k);
      draw.drawCenteredString(Color.cl("a") + "Snake", l / 2 / k, (m / 2 - 82) / k);
      GL11.glPopMatrix();
      int i = 60;
      draw.drawCenteredString("The purpose of this game is to gain as much", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("score as possible by collecting the dots that are randomly spawning", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("There are several types of dots which are differentiate by their color", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("The " + Color.cl("4") + "red" + Color.cl("f") + " dot is the normal one, which increases your score by 10,", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("all the other dots increase your score by 20", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("The " + Color.cl("9") + "blue" + Color.cl("f") + " dot makes you slower, while the " + Color.cl("b") + "cyan" + Color.cl("f") + " dot makes you faster.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("The last one, the " + Color.cl("6") + "golden" + Color.cl("f") + " dot, increases the spawning", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("rate of the dots by one for each golden dot you collect.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("But collecting these dots also lets you become longer, and once you hit", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("yourself with your head, the game is over. You can also increase your", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("speed by manually keeping the W, A, S, D or the arrow keys pressed.", l / 2, m / 2 - i);
    }
    else if (selectedGame == EnumGame.Mario)
    {
      GL11.glPushMatrix();
      int k = 2;
      GL11.glScaled(k, k, k);
      draw.drawCenteredString(Color.cl("a") + "Mario", l / 2 / k, (m / 2 - 82) / k);
      GL11.glPopMatrix();
      int i = 60;
      draw.drawCenteredString("This game is similar to the popular game SuperMario.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("You are a blue pixel and have to run through a random generated world.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("The purpose is to get the highest distance from the spawn.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString("You jump by pressing space, and by pressing A and D you move left/right.", l / 2, m / 2 - i);
      i -= 10;
      draw.drawCenteredString(" That's it - have fun!", l / 2, m / 2 - i);
    }
    btnPlay.m = (selectedGame != EnumGame.None);
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
