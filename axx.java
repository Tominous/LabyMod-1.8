import de.labystudio.gui.GuiCapeSettings;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
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
  private final axu field_175361_a;
  private String field_175360_f;
  private static final String __OBFID = "CL_00001932";
  
  public void LabyMod()
  {
    this.n.clear();
    if (this.advanced)
    {
      int var1 = 0;
      wo[] var2 = wo.values();
      int var3 = var2.length;
      wo var5 = var2[6];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 40 + var1 % 2 * 160, this.m / 6 - 24 + 25, 80, 20, var5, null));
      
      var5 = var2[1];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 40 + var1 % 2 * 160, this.m / 6 + 24 + 20, 80, 20, var5, null));
      
      var5 = var2[3];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 40 + var1 % 2 * 160 + 90, this.m / 6 + 24 + 0, 100, 20, var5, null));
      
      var5 = var2[2];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 40 + var1 % 2 * 160 - 110, this.m / 6 + 24 + 0, 100, 20, var5, null));
      
      var5 = var2[4];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 55 + var1 % 2 * 160 - 120, this.m / 6 + 24 + 50, 130, 20, var5, null));
      
      var5 = var2[5];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 35 + var1 % 2 * 160 + 80, this.m / 6 + 24 + 50, 130, 20, var5, null));
      
      var5 = var2[0];
      this.n.add(new axx.a(var5.b(), this.l / 2 - 40 + var1 % 2 * 160, this.m / 6 + 24 + 80, 80, 20, var5, null));
      for (int i = 0; i <= this.n.size() - 1; i++)
      {
        avs button = (avs)this.n.get(i);
        button.j = button.j.replace("ON", Color.c + "aON").replace("OFF", Color.c + "cOFF").replace("An", Color.c + "aAn").replace("Aus", Color.c + "cAus");
      }
    }
    else
    {
      this.n.add(this.a = new avs(1, this.l / 2 + 40, this.m / 2 - 58, 80, 20, ""));
      this.n.add(this.b = new avs(2, this.l / 2 + 40, this.m / 2 - 33, 80, 20, ""));
      this.n.add(this.c = new avs(3, this.l / 2 + 40, this.m / 2 - 8, 80, 20, ""));
    }
    this.n.add(this.d = new avs(40, this.l / 2 + 40, this.m / 2 + 17, 80, 20, ""));
    this.n.add(this.e = new avs(10, 2, 2, 80, 20, ""));
    
    refreshButton();
  }
  
  public void refreshButton()
  {
    if (this.a != null)
    {
      this.a.j = getStatus("Hat", wo.g);
      this.b.j = getStatus("Jacket", wo.b);
      this.c.j = getStatus("Pants", wo.f);
    }
    if (this.d != null) {
      if (!this.advanced)
      {
        this.d.j = "Advanced..";
      }
      else
      {
        this.d.j = "Simple..";
        this.d.i = (this.m / 2 + 55);
      }
    }
    if (this.e != null)
    {
      this.e.j = "Cape Settings";
      if (this.advanced)
      {
        this.e.i = (this.m / 2 + 55);
        this.e.h = (this.l / 2 - 120);
      }
      else
      {
        this.e.i = (this.m / 2 + 43);
        this.e.h = (this.l / 2 + 40);
      }
    }
  }
  
  public String getStatus(String name, wo part)
  {
    String var2;
    String var2;
    if (this.j.t.d().contains(part)) {
      var2 = Color.cl("a") + "ON";
    } else {
      var2 = Color.cl("C") + "OFF";
    }
    return name + ": " + var2 + Color.cl("f") + "";
  }
  
  public static void drawEntityOnScreen(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, pr p_147046_5_)
  {
    bfl.g();
    bfl.E();
    bfl.b(p_147046_0_, p_147046_1_, 50.0F);
    bfl.a(-p_147046_2_ - 30.0F, p_147046_2_ + 30.0F, p_147046_2_);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    float var6 = p_147046_5_.aI;
    float var7 = p_147046_5_.y;
    float var8 = p_147046_5_.z;
    float var9 = p_147046_5_.aL;
    float var10 = p_147046_5_.aK;
    bfl.b(135.0F, 0.0F, 1.0F, 0.0F);
    avc.b();
    bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(-(float)Math.atan(p_147046_4_ / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
    p_147046_5_.aI = ((float)Math.atan(p_147046_3_ / 40.0F) * 20.0F);
    p_147046_5_.y = ((float)Math.atan(p_147046_3_ / 40.0F) * 40.0F);
    p_147046_5_.z = (-(float)Math.atan(p_147046_4_ / 40.0F) * 20.0F);
    p_147046_5_.aK = p_147046_5_.y;
    p_147046_5_.aL = p_147046_5_.y;
    bfl.b(0.0F, 0.0F, 0.0F);
    biu var11 = ave.A().af();
    var11.a(180.0F);
    var11.a(false);
    var11.a(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    var11.a(true);
    p_147046_5_.aI = var6;
    p_147046_5_.y = var7;
    p_147046_5_.z = var8;
    p_147046_5_.aL = var9;
    p_147046_5_.aK = var10;
    bfl.F();
    avc.a();
    bfl.C();
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
  
  public axx(axu p_i45516_1_)
  {
    this.field_175361_a = p_i45516_1_;
  }
  
  public void b()
  {
    int var1 = 0;
    this.field_175360_f = bnq.a("options.skinCustomisation.title", new Object[0]);
    LabyMod();
    if (var1 % 2 == 1) {
      var1++;
    }
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 2 + 90, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l)
    {
      if (!this.advanced) {
        if (button.k == 1)
        {
          this.j.t.a(wo.g);
          refreshButton();
        }
        else if (button.k == 2)
        {
          this.j.t.a(wo.b);
          this.j.t.a(wo.d);
          this.j.t.a(wo.c);
          refreshButton();
        }
        else if (button.k == 3)
        {
          this.j.t.a(wo.e);
          this.j.t.a(wo.f);
          refreshButton();
        }
      }
      if (button.k == 40)
      {
        this.advanced = (!this.advanced);
        b();
      }
      if (button.k == 10)
      {
        this.j.t.b();
        this.j.a(new GuiCapeSettings(this));
      }
      else if (button.k == 200)
      {
        this.j.t.b();
        this.j.a(this.field_175361_a);
      }
      else if ((button instanceof axx.a))
      {
        wo var2 = ((axx.a)button).field_175234_p;
        this.j.t.a(var2);
        button.j = a(var2);
        button.j = button.j.replace("ON", Color.c + "aON").replace("OFF", Color.c + "cOFF").replace("An", Color.c + "aAn").replace("Aus", Color.c + "cAus");
        
        this.j.t.b();
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, this.field_175360_f, this.l / 2, 20, 16777215);
    if (this.j.h != null)
    {
      if (this.advanced) {
        drawEntityOnScreen(40, this.m - 10, 30, 40.0F - mouseX, this.m - 10 - 120 + 75 - 50 - mouseY, this.j.h);
      } else {
        drawEntityOnScreen(this.l / 2 - 20, this.m / 2 + 60, 30, this.l / 2 - 20 - mouseX, this.m / 2 - 40 - mouseY, this.j.h);
      }
      if (this.j.F()) {
        LabyMod.getInstance().draw.drawString(Color.cl("c") + "Preview is not live!", 3.0D, this.m - 10);
      }
    }
    else if (!this.advanced)
    {
      DrawUtils.a(this.l / 2 - 110, this.m / 2 - 50, this.l / 2 + 30, this.m / 2 + 45, 1129010000);
      LabyMod.getInstance().draw.drawCenteredString("Preview not available.", this.l / 2 - 40, this.m / 2 - 15);
      LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "You are not ingame!", this.l / 2 - 40, this.m / 2 - 5);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      this.j.t.b();
      this.j.a(this.field_175361_a);
    }
  }
  
  private String a(wo p_175358_1_)
  {
    String var2;
    String var2;
    if (this.j.t.d().contains(p_175358_1_)) {
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
      this.field_175234_p = p_i45514_7_;
    }
    
    a(int p_i45515_2_, int p_i45515_3_, int p_i45515_4_, int p_i45515_5_, int p_i45515_6_, wo p_i45515_7_, Object p_i45515_8_)
    {
      this(p_i45515_2_, p_i45515_3_, p_i45515_4_, p_i45515_5_, p_i45515_6_, p_i45515_7_);
    }
  }
}
