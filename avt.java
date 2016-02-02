import com.google.common.collect.Lists;
import de.labystudio.gui.GuiNewModChat;
import de.labystudio.gui.GuiSymbolSelector;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.listener.ChatListener;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.ChatReceivedEvent;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FilterLoader;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class avt
  extends avp
{
  private static final Logger a = ;
  private final ave f;
  private DrawUtils draw;
  private final List g = Lists.newArrayList();
  private final List h = Lists.newArrayList();
  private final List i = Lists.newArrayList();
  private int j;
  private boolean k;
  private static final String __OBFID = "CL_00000669";
  
  public avt(ave mcIn)
  {
    this.f = mcIn;
    this.draw = LabyMod.getInstance().draw;
  }
  
  int detectChange = 0;
  
  public void a(int p_146230_1_)
  {
    this.draw = LabyMod.getInstance().draw;
    if (this.detectChange != this.draw.getWidth()) {
      b();
    }
    this.detectChange = this.draw.getWidth();
    
    GuiNewModChat.drawChat(p_146230_1_);
    if (this.f.t.m != wn.b.c)
    {
      int var2 = i();
      boolean var3 = false;
      int var4 = 0;
      int var5 = this.i.size();
      float var6 = this.f.t.q * 0.9F + 0.1F;
      if (var5 > 0)
      {
        if (e()) {
          var3 = true;
        }
        float var7 = h();
        int var8 = ns.f(f() / var7);
        bfl.E();
        bfl.b(2.0F, 20.0F, 0.0F);
        bfl.a(var7, var7, 1.0F);
        
        int sort = 0;
        for (int var9 = 0; (var9 + this.j < this.i.size()) && (var9 < var2); var9++)
        {
          ava var10 = (ava)this.i.get(var9 + this.j);
          if (var10 != null)
          {
            int var11 = p_146230_1_ - var10.b();
            if ((var11 < 200) || (var3))
            {
              double var12 = var11 / 200.0D;
              var12 = 1.0D - var12;
              var12 *= 10.0D;
              var12 = ns.a(var12, 0.0D, 1.0D);
              var12 *= var12;
              int var14 = (int)(255.0D * var12);
              if (var3) {
                var14 = 255;
              }
              var14 = (int)(var14 * var6);
              var4++;
              if (var14 > 3)
              {
                byte var15 = 0;
                int var16 = -sort * 9;
                sort++;
                String var17 = var10.a().d();
                String p = " " + Color.cl("e") + "✎" + Color.cl("f");
                String o = var17;
                var17 = ChatListener.replaceMessage(var10.a().d(), var10.a().c());
                if (!var17.equals(o)) {
                  var17 = var17 + p;
                }
                if ((ChatListener.isMarked(var10.a().c())) && (FilterLoader.enabled)) {
                  a(var15, var16 - 9, var15 + var8 + 4, var16, 1574235432);
                } else {
                  a(var15, var16 - 9, var15 + var8 + 4, var16, var14 / 2 << 24);
                }
                bfl.l();
                this.f.k.a(var17, var15, var16 - 8, 16777215 + (var14 << 24));
                bfl.c();
                bfl.k();
              }
            }
          }
        }
        if (var3)
        {
          var9 = this.f.k.a;
          bfl.b(-3.0F, 0.0F, 0.0F);
          int var18 = var5 * var9 + var5;
          int var11 = var4 * var9 + var4;
          int var19 = this.j * var11 / var5;
          int var13 = var11 * var11 / var18;
          if (var18 != var11)
          {
            int var14 = var19 > 0 ? 170 : 96;
            int var20 = this.k ? 13382451 : 3355562;
            a(0, -var19, 2, -var19 - var13, var20 + (var14 << 24));
            a(2, -var19, 1, -var19 - var13, 13421772 + (var14 << 24));
          }
        }
        bfl.F();
      }
    }
  }
  
  public void a()
  {
    this.i.clear();
    this.h.clear();
    this.g.clear();
    GuiNewModChat.clearChatMessages();
  }
  
  public void a(eu p_146227_1_)
  {
    a(p_146227_1_, 0);
  }
  
  public void a(eu p_146234_1_, int p_146234_2_)
  {
    if (ChatListener.allowedToPrint(p_146234_1_.d(), p_146234_1_.c()))
    {
      a(p_146234_1_, p_146234_2_, this.f.q.e(), false);
      a.info("[CHAT] " + p_146234_1_.c());
    }
  }
  
  private void a(eu p_146237_1_, int p_146237_2_, int p_146237_3_, boolean p_146237_4_)
  {
    if ((p_146237_1_ != null) && (ModAPI.enabled())) {
      ModAPI.callEvent(new ChatReceivedEvent(p_146237_1_.c(), p_146237_1_.d()));
    }
    if (ChatListener.isServerMSG(p_146237_1_.c()))
    {
      GuiNewModChat.setChatLine(p_146237_1_, p_146237_2_, p_146237_3_, p_146237_4_);
      return;
    }
    if (p_146237_2_ != 0) {
      c(p_146237_2_);
    }
    int var5 = ns.d(f() / h());
    List var6 = avu.a(p_146237_1_, var5, this.f.k, false, false);
    boolean var7 = e();
    eu var9;
    for (Iterator var8 = var6.iterator(); var8.hasNext(); this.i.add(0, new ava(p_146237_3_, var9, p_146237_2_)))
    {
      var9 = (eu)var8.next();
      if ((var7) && (this.j > 0))
      {
        this.k = true;
        b(1);
      }
    }
    while (this.i.size() > 100) {
      this.i.remove(this.i.size() - 1);
    }
    if (!p_146237_4_)
    {
      this.h.add(0, new ava(p_146237_3_, p_146237_1_, p_146237_2_));
      while (this.h.size() > 100) {
        this.h.remove(this.h.size() - 1);
      }
    }
  }
  
  public void b()
  {
    ChatListener.init = ave.J();
    this.i.clear();
    d();
    for (int var1 = this.h.size() - 1; var1 >= 0; var1--)
    {
      ava var2 = (ava)this.h.get(var1);
      a(var2.a(), var2.c(), var2.b(), true);
    }
    GuiNewModChat.refreshChat();
  }
  
  public List c()
  {
    return this.g;
  }
  
  public void a(String p_146239_1_)
  {
    if ((this.g.isEmpty()) || (!((String)this.g.get(this.g.size() - 1)).equals(p_146239_1_))) {
      this.g.add(p_146239_1_);
    }
  }
  
  public void d()
  {
    this.j = 0;
    this.k = false;
  }
  
  public void b(int p_146229_1_)
  {
    GuiNewModChat.scroll(p_146229_1_);
    if ((DrawUtils.getMouseX() > f()) && ((ConfigManager.settings.extraChat.booleanValue()) || (ConfigManager.settings.chatFilter.booleanValue()))) {
      return;
    }
    this.j += p_146229_1_;
    int var2 = this.i.size();
    if (this.j > var2 - i()) {
      this.j = (var2 - i());
    }
    if (this.j <= 0)
    {
      this.j = 0;
      this.k = false;
    }
  }
  
  public eu a(int p_146236_1_, int p_146236_2_)
  {
    if (!e()) {
      return null;
    }
    avr var3 = new avr(this.f);
    int var4 = var3.e();
    float var5 = h();
    int var6 = p_146236_1_ / var4 - 3;
    int var7 = p_146236_2_ / var4 - 27;
    var6 = ns.d(var6 / var5);
    var7 = ns.d(var7 / var5);
    if ((var6 >= 0) && (var7 >= 0))
    {
      int var8 = Math.min(i(), this.i.size());
      if ((var6 <= ns.d(f() / h())) && (var7 < this.f.k.a * var8 + var8))
      {
        int var9 = var7 / this.f.k.a + this.j;
        if ((var9 >= 0) && (var9 < this.i.size()))
        {
          ava var10 = (ava)this.i.get(var9);
          int var11 = 0;
          Iterator var12 = var10.a().iterator();
          while (var12.hasNext())
          {
            eu var13 = (eu)var12.next();
            if ((var13 instanceof fa))
            {
              var11 += this.f.k.a(avu.a(((fa)var13).g(), false));
              if (var11 > var6) {
                return var13;
              }
            }
          }
        }
        return GuiNewModChat.getChatComponent(p_146236_1_, p_146236_2_);
      }
      return GuiNewModChat.getChatComponent(p_146236_1_, p_146236_2_);
    }
    return GuiNewModChat.getChatComponent(p_146236_1_, p_146236_2_);
  }
  
  public boolean e()
  {
    return ((this.f.m instanceof awv)) || ((this.f.m instanceof GuiSymbolSelector));
  }
  
  public void c(int p_146242_1_)
  {
    Iterator var2 = this.i.iterator();
    while (var2.hasNext())
    {
      ava var3 = (ava)var2.next();
      if (var3.c() == p_146242_1_) {
        var2.remove();
      }
    }
    var2 = this.h.iterator();
    while (var2.hasNext())
    {
      ava var3 = (ava)var2.next();
      if (var3.c() == p_146242_1_) {
        var2.remove();
      }
    }
  }
  
  public int f()
  {
    return a(this.f.t.F);
  }
  
  public int g()
  {
    return b(e() ? this.f.t.H : this.f.t.G);
  }
  
  public float h()
  {
    return this.f.t.E;
  }
  
  public static int a(float p_146233_0_)
  {
    short var1 = 320;
    byte var2 = 40;
    return ns.d(p_146233_0_ * (var1 - var2) + var2);
  }
  
  public static int b(float p_146243_0_)
  {
    short var1 = 180;
    byte var2 = 20;
    return ns.d(p_146243_0_ * (var1 - var2) + var2);
  }
  
  public int i()
  {
    return g() / 9;
  }
}
