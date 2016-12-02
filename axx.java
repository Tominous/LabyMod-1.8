import de.labystudio.capes.CapeManager;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.downloader.ModInfoDownloader;
import de.labystudio.downloader.UserCapesDownloader;
import de.labystudio.downloader.UserCosmeticsDownloader;
import de.labystudio.gui.GuiCosmetics;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.SkinChanger;
import de.labystudio.utils.SkinChanger.MessageCallBack;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class axx
  extends axu
{
  public static long REFRESH_COOLDOWN = 0L;
  boolean advanced = false;
  avs a;
  avs b;
  avs c;
  avs d;
  avs e;
  avs f;
  avs g;
  avs h;
  private avs buttonRefresh;
  boolean steveModel = true;
  String output = "";
  private float previewMouseClickX = 0.0F;
  private float previewMouseClickY = 0.0F;
  private float previewMouseDragX = 0.0F;
  private float previewMouseDragY = 0.0F;
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
    this.n.add(this.e = new avs(10, 2, 2, 95, 20, ""));
    
    this.n.add(this.f = new avs(11, 2, 2, 95, 20, ""));
    
    this.n.add(this.g = new avs(12, this.l / 2 + 40, this.m / 2 + 42, 80, 20, ""));
    
    this.n.add(this.h = new avs(13, this.l / 2 + 125, this.m / 2 + 42, 35, 20, ""));
    
    this.n.add(this.buttonRefresh = new avs(5, 5, 3, 60, 20, REFRESH_COOLDOWN < System.currentTimeMillis() ? "Refresh" : "Cooldown.."));
    
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
        this.d.h = (this.l / 2 + 51);
      }
    }
    if (this.e != null)
    {
      this.e.j = "Cape Settings";
      if (this.advanced)
      {
        this.e.i = (this.m / 2 + 55);
        this.e.h = (this.l / 2 - 141);
      }
      else
      {
        this.e.i = (this.m / 2 + 75);
        this.e.h = (this.l / 2 + 5);
      }
    }
    if (this.f != null)
    {
      this.f.j = "Cosmetics";
      if (this.advanced)
      {
        this.f.i = (this.m / 2 + 55);
        this.f.h = (this.l / 2 - 45);
      }
      else
      {
        this.f.i = (this.m / 2 + 75);
        this.f.h = (this.l / 2 - 100);
      }
    }
    if (this.g != null)
    {
      this.g.j = "Change skin";
      this.g.m = (!this.advanced);
    }
    if (this.h != null)
    {
      this.h.j = (this.steveModel ? "Steve" : "Alex");
      this.h.m = (!this.advanced);
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
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 2 + 97, bnq.a("gui.done", new Object[0])));
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
      if (button.k == 5)
      {
        LabyMod.getInstance().getCapeManager().refresh();
        LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().clear();
        new ModInfoDownloader();
        new UserCosmeticsDownloader();
        new UserCapesDownloader();
        REFRESH_COOLDOWN = System.currentTimeMillis() + 10000L;
        button.l = false;
        button.j = "Done!";
      }
      if (button.k == 40)
      {
        this.advanced = (!this.advanced);
        b();
      }
      if (button.k == 10) {
        LabyMod.getInstance().openWebpage("https://www.labymod.net/#login", true);
      }
      if (button.k == 11)
      {
        this.j.t.b();
        this.j.a(new GuiCosmetics(this));
      }
      if (button.k == 12)
      {
        this.g.l = false;
        new SkinChanger(ave.A().L(), this.steveModel, new SkinChanger.MessageCallBack()
        {
          public void ok(String message)
          {
            axx.this.g.l = true;
            if (message.isEmpty()) {
              axx.this.output = (Color.cl("a") + "Your skin has been changed, reconnect in order to see it!");
            } else if (message.contains("Current IP not secured")) {
              axx.this.output = (Color.cl("c") + "Your IP has been changed since your last login into the Minecraft website!");
            } else if (message.contains("The request requires user authentication")) {
              axx.this.output = (Color.cl("c") + "Invalid session id. (Try restarting your game)");
            } else {
              axx.this.output = message;
            }
          }
        })
        
          .start();
      }
      if (button.k == 13)
      {
        this.steveModel = (!this.steveModel);
        refreshButton();
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
      if (this.advanced)
      {
        DrawUtils.drawEntityOnScreen(40, this.m - 10, 30, 40.0F - mouseX, this.m - 10 - 120 + 75 - 50 - mouseY, 0, 0, this.j.h);
      }
      else
      {
        boolean useMouseFocus = (this.previewMouseDragX == 0.0F) && (this.previewMouseClickX == 0.0F) && (this.previewMouseDragY == 0.0F) && (this.previewMouseClickY == 0.0F);
        float mouseFocusX = useMouseFocus ? this.l / 2 - 20 - mouseX : 0.0F;
        float mouseFocusY = useMouseFocus ? this.m / 2 - 40 - mouseY : 0.0F;
        DrawUtils.drawEntityOnScreen(this.l / 2 - 20, this.m / 2 + 60 - (this.previewMouseDragY == 0.0F ? 0 : 60), 30, mouseFocusX, mouseFocusY, (int)-this.previewMouseDragX, (int)-this.previewMouseDragY, this.j.h);
      }
      if (this.j.F()) {
        LabyMod.getInstance().draw.drawString(Color.cl("c") + "Live preview only in multiplayer!", 3.0D, this.m - 10);
      }
    }
    else if (!this.advanced)
    {
      DrawUtils.a(this.l / 2 - 110, this.m / 2 - 50, this.l / 2 + 30, this.m / 2 + 45, 1129010000);
      LabyMod.getInstance().draw.drawCenteredString("Preview not available.", this.l / 2 - 40, this.m / 2 - 15);
      LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "You are not ingame!", this.l / 2 - 40, this.m / 2 - 5);
    }
    if (!LabyMod.getInstance().isInGame())
    {
      this.e.l = false;
      this.f.l = false;
    }
    LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + this.output, this.l / 2, 5);
    
    boolean enabled = this.buttonRefresh.l;
    this.buttonRefresh.l = (REFRESH_COOLDOWN < System.currentTimeMillis());
    if ((!enabled) && (this.buttonRefresh.l)) {
      this.buttonRefresh.j = "Refresh";
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if ((mouseX > this.l / 2 - 100) && (mouseX < this.l / 2 + 30) && (mouseY > this.m / 2 - 100) && (mouseY < this.m / 2 + 70))
    {
      this.previewMouseClickX = (this.previewMouseDragX + mouseX);
      this.previewMouseClickY = (this.previewMouseDragY + mouseY);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick)
  {
    if (this.previewMouseClickX != 0.0F) {
      this.previewMouseDragX = (this.previewMouseClickX - mouseX);
    }
    if (this.previewMouseClickY != 0.0F) {
      this.previewMouseDragY = (this.previewMouseClickY - mouseY);
    }
    super.a(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    this.previewMouseClickX = 0.0F;
    this.previewMouseClickY = 0.0F;
    this.previewMouseDragX %= 360.0F;
    this.previewMouseDragY %= 360.0F;
    super.b(mouseX, mouseY, state);
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
