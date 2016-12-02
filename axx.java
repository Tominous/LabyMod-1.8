import de.labystudio.gui.GuiCapeSettings;
import de.labystudio.gui.GuiCosmetics;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.SkinChanger;
import de.labystudio.utils.SkinChanger.MessageCallBack;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class axx
  extends axu
{
  boolean advanced = false;
  avs a;
  avs b;
  avs c;
  avs d;
  avs e;
  avs f;
  avs g;
  avs h;
  boolean steveModel = true;
  String output = "";
  private final axu field_175361_a;
  private String field_175360_f;
  private static final String __OBFID = "CL_00001932";
  
  public void LabyMod()
  {
    n.clear();
    if (advanced)
    {
      int var1 = 0;
      wo[] var2 = wo.values();
      int var3 = var2.length;
      wo var5 = var2[6];
      n.add(new axx.a(var5.b(), l / 2 - 40 + var1 % 2 * 160, m / 6 - 24 + 25, 80, 20, var5, null));
      
      var5 = var2[1];
      n.add(new axx.a(var5.b(), l / 2 - 40 + var1 % 2 * 160, m / 6 + 24 + 20, 80, 20, var5, null));
      
      var5 = var2[3];
      n.add(new axx.a(var5.b(), l / 2 - 40 + var1 % 2 * 160 + 90, m / 6 + 24 + 0, 100, 20, var5, null));
      
      var5 = var2[2];
      n.add(new axx.a(var5.b(), l / 2 - 40 + var1 % 2 * 160 - 110, m / 6 + 24 + 0, 100, 20, var5, null));
      
      var5 = var2[4];
      n.add(new axx.a(var5.b(), l / 2 - 55 + var1 % 2 * 160 - 120, m / 6 + 24 + 50, 130, 20, var5, null));
      
      var5 = var2[5];
      n.add(new axx.a(var5.b(), l / 2 - 35 + var1 % 2 * 160 + 80, m / 6 + 24 + 50, 130, 20, var5, null));
      
      var5 = var2[0];
      n.add(new axx.a(var5.b(), l / 2 - 40 + var1 % 2 * 160, m / 6 + 24 + 80, 80, 20, var5, null));
      for (int i = 0; i <= n.size() - 1; i++)
      {
        avs button = (avs)n.get(i);
        
        j = j.replace("ON", Color.c + "aON").replace("OFF", Color.c + "cOFF").replace("An", Color.c + "aAn").replace("Aus", Color.c + "cAus");
      }
    }
    else
    {
      n.add(a = new avs(1, l / 2 + 40, m / 2 - 58, 80, 20, ""));
      n.add(b = new avs(2, l / 2 + 40, m / 2 - 33, 80, 20, ""));
      n.add(c = new avs(3, l / 2 + 40, m / 2 - 8, 80, 20, ""));
    }
    n.add(d = new avs(40, l / 2 + 40, m / 2 + 17, 80, 20, ""));
    n.add(e = new avs(10, 2, 2, 95, 20, ""));
    
    n.add(f = new avs(11, 2, 2, 95, 20, ""));
    
    n.add(g = new avs(12, l / 2 + 40, m / 2 + 42, 80, 20, ""));
    
    n.add(h = new avs(13, l / 2 + 125, m / 2 + 42, 35, 20, ""));
    
    refreshButton();
  }
  
  public void refreshButton()
  {
    if (a != null)
    {
      a.j = getStatus("Hat", wo.g);
      b.j = getStatus("Jacket", wo.b);
      c.j = getStatus("Pants", wo.f);
    }
    if (d != null) {
      if (!advanced)
      {
        d.j = "Advanced..";
      }
      else
      {
        d.j = "Simple..";
        d.i = (m / 2 + 55);
        d.h = (l / 2 + 51);
      }
    }
    if (e != null)
    {
      e.j = "Cape Settings";
      if (advanced)
      {
        e.i = (m / 2 + 55);
        e.h = (l / 2 - 141);
      }
      else
      {
        e.i = (m / 2 + 75);
        e.h = (l / 2 + 5);
      }
    }
    if (f != null)
    {
      f.j = "Cosmetics";
      if (advanced)
      {
        f.i = (m / 2 + 55);
        f.h = (l / 2 - 45);
      }
      else
      {
        f.i = (m / 2 + 75);
        f.h = (l / 2 - 100);
      }
    }
    if (g != null)
    {
      g.j = "Change skin";
      g.m = (!advanced);
    }
    if (h != null)
    {
      h.j = (steveModel ? "Steve" : "Alex");
      h.m = (!advanced);
    }
  }
  
  public String getStatus(String name, wo part)
  {
    String var2;
    String var2;
    if (j.t.d().contains(part)) {
      var2 = Color.cl("a") + "ON";
    } else {
      var2 = Color.cl("C") + "OFF";
    }
    return name + ": " + var2 + Color.cl("f") + "";
  }
  
  public axx(axu p_i45516_1_)
  {
    field_175361_a = p_i45516_1_;
  }
  
  public void b()
  {
    int var1 = 0;
    field_175360_f = bnq.a("options.skinCustomisation.title", new Object[0]);
    LabyMod();
    if (var1 % 2 == 1) {
      var1++;
    }
    n.add(new avs(200, l / 2 - 100, m / 2 + 97, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l)
    {
      if (!advanced) {
        if (k == 1)
        {
          j.t.a(wo.g);
          refreshButton();
        }
        else if (k == 2)
        {
          j.t.a(wo.b);
          j.t.a(wo.d);
          j.t.a(wo.c);
          refreshButton();
        }
        else if (k == 3)
        {
          j.t.a(wo.e);
          j.t.a(wo.f);
          refreshButton();
        }
      }
      if (k == 40)
      {
        advanced = (!advanced);
        b();
      }
      if (k == 10)
      {
        j.t.b();
        j.a(new GuiCapeSettings(this));
      }
      if (k == 11)
      {
        j.t.b();
        j.a(new GuiCosmetics(this));
      }
      if (k == 12)
      {
        g.l = false;
        new SkinChanger(ave.A().L(), steveModel, new SkinChanger.MessageCallBack()
        {
          public void ok(String message)
          {
            g.l = true;
            if (message.isEmpty()) {
              output = (Color.cl("a") + "Your skin has been changed, reconnect in order to see it!");
            } else if (message.contains("Current IP not secured")) {
              output = (Color.cl("c") + "Your IP has been changed since your last login into the Minecraft website!");
            } else if (message.contains("The request requires user authentication")) {
              output = (Color.cl("c") + "Invalid session id. (Try restarting your game)");
            } else {
              output = message;
            }
          }
        })
        
          .start();
      }
      if (k == 13)
      {
        steveModel = (!steveModel);
        refreshButton();
      }
      else if (k == 200)
      {
        j.t.b();
        j.a(field_175361_a);
      }
      else if ((button instanceof axx.a))
      {
        wo var2 = field_175234_p;
        j.t.a(var2);
        j = a(var2);
        
        j = j.replace("ON", Color.c + "aON").replace("OFF", Color.c + "cOFF").replace("An", Color.c + "aAn").replace("Aus", Color.c + "cAus");
        j.t.b();
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, field_175360_f, l / 2, 20, 16777215);
    if (j.h != null)
    {
      if (advanced) {
        DrawUtils.drawEntityOnScreen(40, m - 10, 30, 40.0F - mouseX, m - 10 - 120 + 75 - 50 - mouseY, 0, j.h);
      } else {
        DrawUtils.drawEntityOnScreen(l / 2 - 20, m / 2 + 60, 30, l / 2 - 20 - mouseX, m / 2 - 40 - mouseY, 0, j.h);
      }
      if (j.F()) {
        getInstancedraw.drawString(Color.cl("c") + "Preview is not live!", 3.0D, m - 10);
      }
    }
    else if (!advanced)
    {
      DrawUtils.a(l / 2 - 110, m / 2 - 50, l / 2 + 30, m / 2 + 45, 1129010000);
      getInstancedraw.drawCenteredString("Preview not available.", l / 2 - 40, m / 2 - 15);
      getInstancedraw.drawCenteredString(Color.cl("c") + "You are not ingame!", l / 2 - 40, m / 2 - 5);
    }
    if (!LabyMod.getInstance().isInGame())
    {
      e.l = false;
      f.l = false;
    }
    getInstancedraw.drawCenteredString(Color.cl("c") + output, l / 2, 5);
    super.a(mouseX, mouseY, partialTicks);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      j.t.b();
      j.a(field_175361_a);
    }
  }
  
  private String a(wo p_175358_1_)
  {
    String var2;
    String var2;
    if (j.t.d().contains(p_175358_1_)) {
      var2 = bnq.a("options.on", new Object[0]);
    } else {
      var2 = bnq.a("options.off", new Object[0]);
    }
    return p_175358_1_.d().d() + ": " + var2;
  }
  
  class a
    extends avs
  {
    private final wo field_175234_p;
    private static final String __OBFID = "CL_00001930";
    
    private a(int p_i45514_2_, int p_i45514_3_, int p_i45514_4_, int p_i45514_5_, int p_i45514_6_, wo p_i45514_7_)
    {
      super(p_i45514_3_, p_i45514_4_, p_i45514_5_, p_i45514_6_, axx.a(axx.this, p_i45514_7_));
      field_175234_p = p_i45514_7_;
    }
    
    a(int p_i45515_2_, int p_i45515_3_, int p_i45515_4_, int p_i45515_5_, int p_i45515_6_, wo p_i45515_7_, Object p_i45515_8_)
    {
      this(p_i45515_2_, p_i45515_3_, p_i45515_4_, p_i45515_5_, p_i45515_6_, p_i45515_7_);
    }
  }
}
