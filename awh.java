import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import de.labystudio.gui.GuiNotePad;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.listener.GommeHD;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.FriendsLoader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class awh
  extends avp
{
  private static final Ordering<bdc> a = Ordering.from(new awh.a(null));
  private final ave f;
  private final avo g;
  private eu h;
  private eu i;
  private long j;
  private boolean k;
  
  public awh(ave mcIn, avo guiIngameIn)
  {
    f = mcIn;
    g = guiIngameIn;
  }
  
  public String a(bdc networkPlayerInfoIn)
  {
    if ((GommeHD.isGommeHD()) && (settingsgommeOldUserColor))
    {
      aul team = networkPlayerInfoIn.i();
      if (team != null)
      {
        String b = team.e();
        if ((b != null) && (b.equals(Color.cl("8")))) {
          team.b(Color.cl("a"));
        }
      }
    }
    if (networkPlayerInfoIn.k() != null) {
      return FriendsLoader.getNick(networkPlayerInfoIn.k().d(), networkPlayerInfoIn.a().getName());
    }
    return aul.a(networkPlayerInfoIn.i(), FriendsLoader.getNick(networkPlayerInfoIn.a().getName(), networkPlayerInfoIn.a().getName()));
  }
  
  public void a(boolean willBeRendered)
  {
    if ((willBeRendered) && (!k)) {
      j = ave.J();
    }
    k = willBeRendered;
  }
  
  public void a(int width, auo scoreboardIn, auk scoreObjectiveIn)
  {
    if ((settingsoldTablist) && (Allowed.animations())) {
      oldTabOverlay(width, scoreboardIn, scoreObjectiveIn);
    } else {
      newTabOverlay(width, scoreboardIn, scoreObjectiveIn);
    }
  }
  
  private void drawNoteBoard(int x)
  {
    if (!settingsnotePad) {
      return;
    }
    DrawUtils draw = getInstancedraw;
    
    int l = 0;
    for (String line : GuiNotePad.getNotes())
    {
      draw.drawString(line, x + 20, 10 + l);
      l += 10;
    }
  }
  
  public void newTabOverlay(int width, auo scoreboardIn, auk scoreObjectiveIn)
  {
    bcy nethandlerplayclient = f.h.a;
    List<bdc> var5 = a.sortedCopy(nethandlerplayclient.d());
    int var6 = 0;
    int var7 = 0;
    for (bdc networkplayerinfo : var5)
    {
      int k = f.k.a(a(networkplayerinfo));
      var6 = Math.max(var6, k);
      if ((scoreObjectiveIn != null) && (scoreObjectiveIn.e() != auu.a.b))
      {
        k = f.k.a(" " + scoreboardIn.c(networkplayerinfo.a().getName(), scoreObjectiveIn).c());
        var7 = Math.max(var7, k);
      }
    }
    var5 = var5.subList(0, Math.min(var5.size(), 80));
    int var28 = var5.size();
    int var29 = var28;
    for (int j4 = 1; var29 > 20; var29 = (var28 + j4 - 1) / j4) {
      j4++;
    }
    boolean var11 = (f.E()) || (f.u().a().f());
    int var12;
    int var12;
    if (scoreObjectiveIn != null)
    {
      int var12;
      if (scoreObjectiveIn.e() == auu.a.b) {
        var12 = 90;
      } else {
        var12 = var7;
      }
    }
    else
    {
      var12 = 0;
    }
    int var13 = Math.min(j4 * ((var11 ? 9 : 0) + var6 + var12 + 13), width - 50) / j4;
    int var14 = width / 2 - (var13 * j4 + (j4 - 1) * 5) / 2;
    int var15 = 10;
    int var16 = var13 * j4 + (j4 - 1) * 5;
    List<String> var17 = null;
    List<String> var18 = null;
    if (i != null)
    {
      var17 = f.k.c(i.d(), width - 50);
      for (String s : var17) {
        var16 = Math.max(var16, f.k.a(s));
      }
    }
    if (h != null)
    {
      var18 = f.k.c(h.d(), width - 50);
      for (??? = var18.iterator(); ???.hasNext();)
      {
        s2 = (String)???.next();
        
        var16 = Math.max(var16, f.k.a(s2));
      }
    }
    String s2;
    if (var17 != null)
    {
      a(width / 2 - var16 / 2 - 1, var15 - 1, width / 2 + var16 / 2 + 1, var15 + var17.size() * f.k.a, Integer.MIN_VALUE);
      for (String s3 : var17)
      {
        int i2 = f.k.a(s3);
        f.k.a(s3, width / 2 - i2 / 2, var15, -1);
        var15 += f.k.a;
      }
      var15++;
    }
    a(width / 2 - var16 / 2 - 1, var15 - 1, width / 2 + var16 / 2 + 1, var15 + var29 * 9, Integer.MIN_VALUE);
    for (int var30 = 0; var30 < var28; var30++)
    {
      int var31 = var30 / var29;
      int var21 = var30 % var29;
      int var22 = var14 + var31 * var13 + var31 * 5;
      int var23 = var15 + var21 * 9;
      a(var22, var23, var22 + var13, var23 + 8, 553648127);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.d();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      if (var30 < var5.size())
      {
        bdc networkplayerinfo1 = (bdc)var5.get(var30);
        String s1 = a(networkplayerinfo1);
        GameProfile gameprofile = networkplayerinfo1.a();
        if (var11)
        {
          wn entityplayer = f.f.b(gameprofile.getId());
          boolean flag1 = (entityplayer != null) && (entityplayer.a(wo.a)) && ((gameprofile.getName().equals("Dinnerbone")) || (gameprofile.getName().equals("Grumm")));
          f.P().a(networkplayerinfo1.g());
          int l2 = 8 + (flag1 ? 8 : 0);
          int i3 = 8 * (flag1 ? -1 : 1);
          avp.a(var22, var23, 8.0F, l2, 8, i3, 8, 8, 64.0F, 64.0F);
          if ((entityplayer != null) && (entityplayer.a(wo.g)))
          {
            int j3 = 8 + (flag1 ? 8 : 0);
            int k3 = 8 * (flag1 ? -1 : 1);
            avp.a(var22, var23, 40.0F, j3, 8, k3, 8, 8, 64.0F, 64.0F);
          }
          var22 += 9;
        }
        if (networkplayerinfo1.b() == adp.a.e)
        {
          s1 = a.u + s1;
          f.k.a(s1, var22, var23, -1862270977);
        }
        else
        {
          f.k.a(s1, var22, var23, -1);
        }
        if ((scoreObjectiveIn != null) && (networkplayerinfo1.b() != adp.a.e))
        {
          int var32 = var22 + var6 + 1;
          int var27 = var32 + var12;
          if (var27 - var32 > 5) {
            a(scoreObjectiveIn, var23, gameprofile.getName(), var32, var27, networkplayerinfo1);
          }
        }
        a(var13, var22 - (var11 ? 9 : 0), var23, networkplayerinfo1);
      }
    }
    if (var18 != null)
    {
      var15 = var15 + var29 * 9 + 1;
      a(width / 2 - var16 / 2 - 1, var15 - 1, width / 2 + var16 / 2 + 1, var15 + var18.size() * f.k.a, Integer.MIN_VALUE);
      for (String s4 : var18)
      {
        int j5 = f.k.a(s4);
        f.k.a(s4, width / 2 - j5 / 2, var15, -1);
        var15 += f.k.a;
      }
    }
    drawNoteBoard(width / 2 + var16 / 2 + 1);
  }
  
  public void oldTabOverlay(int width, auo scoreboardIn, auk scoreObjectiveIn)
  {
    try
    {
      bcy var4 = f.h.a;
      List var42 = a.sortedCopy(var4.d());
      int var15 = getInstancemc.h.a.a;
      int var16 = var15;
      avr var5 = new avr(getInstancemc);
      int var17 = 0;
      int var6 = var5.a();
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      for (var17 = 1; var16 > 20; var16 = (var15 + var17 - 1) / var17) {
        var17++;
      }
      int var46 = 300 / var17;
      if (var46 > 150) {
        var46 = 150;
      }
      int var19 = (var6 - var17 * var46) / 2;
      byte var47 = 10;
      a(var19 - 1, var47 - 1, var19 + var46 * var17, var47 + 9 * var16, Integer.MIN_VALUE);
      for (var21 = 0; var21 < var15; var21++)
      {
        var22 = var19 + var21 % var17 * var46;
        var23 = var47 + var21 / var17 * 9;
        a(var22, var23, var22 + var46 - 1, var23 + 8, 553648127);
        bfl.d();
        if (var21 < var42.size())
        {
          bdc var48 = (bdc)var42.get(var21);
          String name = var48.a().getName();
          aul var49 = getInstancemc.f.Z().h(name);
          String var50 = a(var48);
          getInstancedraw.drawString(var50, var22, var23);
          if (scoreObjectiveIn != null)
          {
            int var27 = var22 + getInstancedraw.getStringWidth(var50) + 5;
            int var28 = var22 + var46 - 12 - 5;
            if (var28 - var27 > 5)
            {
              aum var29 = scoreboardIn.c(name, scoreObjectiveIn);
              String var30 = a.o + "" + var29.c();
              getInstancedraw.drawString(var30, var28 - getInstancedraw.getStringWidth(var30), var23, 1.6777215E7D);
            }
          }
          a(50, var22 + var46 - 52, var23, var48);
        }
      }
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.f();
      bfl.d();
    }
    catch (Exception localException) {}
  }
  
  protected void a(int p_175245_1_, int p_175245_2_, int p_175245_3_, bdc networkPlayerInfoIn)
  {
    if ((!settingstabPing) || (!Allowed.unfairExtra()))
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      f.P().a(d);
      byte var5 = 0;
      boolean var6 = false;
      byte var7;
      byte var7;
      if (networkPlayerInfoIn.c() < 0)
      {
        var7 = 5;
      }
      else
      {
        byte var7;
        if (networkPlayerInfoIn.c() < 150)
        {
          var7 = 0;
        }
        else
        {
          byte var7;
          if (networkPlayerInfoIn.c() < 300)
          {
            var7 = 1;
          }
          else
          {
            byte var7;
            if (networkPlayerInfoIn.c() < 600)
            {
              var7 = 2;
            }
            else
            {
              byte var7;
              if (networkPlayerInfoIn.c() < 1000) {
                var7 = 3;
              } else {
                var7 = 4;
              }
            }
          }
        }
      }
      e += 100.0F;
      b(p_175245_2_ + p_175245_1_ - 11, p_175245_3_, 0 + var5 * 10, 176 + var7 * 8, 10, 8);
    }
    else
    {
      e += 100.0F;
    }
    DrawUtils draw = getInstancedraw;
    GL11.glPushMatrix();
    bfl.a(0.5D, 0.5D, 0.5D);
    int ping = networkPlayerInfoIn.c();
    if (ping >= 1000) {
      ping = 999;
    }
    if (ping < 0) {
      ping = 0;
    }
    if ((networkPlayerInfoIn.a() != null) && (networkPlayerInfoIn.a().getName() != null) && 
      (LabyMod.getInstance().isInGame()) && 
      (networkPlayerInfoIn.a().getName().equals(Ah.e_()))) {
      getInstanceplayerPing = ping;
    }
    String c = "a";
    if (ping > 150) {
      c = "2";
    }
    if (ping > 300) {
      c = "c";
    }
    if (ping > 600) {
      c = "4";
    }
    String showPing = "" + ping;
    if (ping == 0) {
      showPing = "?";
    }
    if (settingstabPing) {
      draw.drawCenteredString(Color.cl(c) + showPing + "", (p_175245_2_ + p_175245_1_) * 2 - 12, p_175245_3_ * 2 + 5);
    }
    GL11.glPopMatrix();
    e -= 100.0F;
  }
  
  private void a(auk p_175247_1_, int p_175247_2_, String p_175247_3_, int p_175247_4_, int p_175247_5_, bdc p_175247_6_)
  {
    int i = p_175247_1_.a().c(p_175247_3_, p_175247_1_).c();
    if (p_175247_1_.e() == auu.a.b)
    {
      this.f.P().a(d);
      if (this.j == p_175247_6_.p()) {
        if (i < p_175247_6_.l())
        {
          p_175247_6_.a(ave.J());
          p_175247_6_.b(g.e() + 20);
        }
        else if (i > p_175247_6_.l())
        {
          p_175247_6_.a(ave.J());
          p_175247_6_.b(g.e() + 10);
        }
      }
      if ((ave.J() - p_175247_6_.n() > 1000L) || (this.j != p_175247_6_.p()))
      {
        p_175247_6_.b(i);
        p_175247_6_.c(i);
        p_175247_6_.a(ave.J());
      }
      p_175247_6_.c(this.j);
      p_175247_6_.b(i);
      int j = ns.f(Math.max(i, p_175247_6_.m()) / 2.0F);
      int k = Math.max(ns.f(i / 2), Math.max(ns.f(p_175247_6_.m() / 2), 10));
      boolean flag = (p_175247_6_.o() > g.e()) && ((p_175247_6_.o() - g.e()) / 3L % 2L == 1L);
      if (j > 0)
      {
        float f = Math.min((p_175247_5_ - p_175247_4_ - 4) / k, 9.0F);
        if (f > 3.0F)
        {
          for (int l = j; l < k; l++) {
            a(p_175247_4_ + l * f, p_175247_2_, flag ? 25 : 16, 0, 9, 9);
          }
          for (int j1 = 0; j1 < j; j1++)
          {
            a(p_175247_4_ + j1 * f, p_175247_2_, flag ? 25 : 16, 0, 9, 9);
            if (flag)
            {
              if (j1 * 2 + 1 < p_175247_6_.m()) {
                a(p_175247_4_ + j1 * f, p_175247_2_, 70, 0, 9, 9);
              }
              if (j1 * 2 + 1 == p_175247_6_.m()) {
                a(p_175247_4_ + j1 * f, p_175247_2_, 79, 0, 9, 9);
              }
            }
            if (j1 * 2 + 1 < i) {
              a(p_175247_4_ + j1 * f, p_175247_2_, j1 >= 10 ? 160 : 52, 0, 9, 9);
            }
            if (j1 * 2 + 1 == i) {
              a(p_175247_4_ + j1 * f, p_175247_2_, j1 >= 10 ? 169 : 61, 0, 9, 9);
            }
          }
        }
        else
        {
          float f1 = ns.a(i / 20.0F, 0.0F, 1.0F);
          int i1 = (int)((1.0F - f1) * 255.0F) << 16 | (int)(f1 * 255.0F) << 8;
          String s = "" + i / 2.0F;
          if (p_175247_5_ - fk.a(s + "hp") >= p_175247_4_) {
            s = s + "hp";
          }
          fk.a(s, (p_175247_5_ + p_175247_4_) / 2 - fk.a(s) / 2, p_175247_2_, i1);
        }
      }
    }
    else
    {
      String s1 = a.o + "" + i;
      fk.a(s1, p_175247_5_ - fk.a(s1), p_175247_2_, 16777215);
    }
  }
  
  public void a(eu footerIn)
  {
    h = footerIn;
    getInstancefooter = h;
  }
  
  public void b(eu headerIn)
  {
    i = headerIn;
    getInstanceheader = i;
  }
  
  public void a()
  {
    i = null;
    h = null;
  }
  
  static class a
    implements Comparator<bdc>
  {
    public int a(bdc p_compare_1_, bdc p_compare_2_)
    {
      aul scoreplayerteam = p_compare_1_.i();
      aul scoreplayerteam1 = p_compare_2_.i();
      return ComparisonChain.start().compareTrueFirst(p_compare_1_.b() != adp.a.e, p_compare_2_.b() != adp.a.e).compare(scoreplayerteam != null ? scoreplayerteam.b() : "", scoreplayerteam1 != null ? scoreplayerteam1.b() : "").compare(p_compare_1_.a().getName(), p_compare_2_.a().getName()).result();
    }
  }
}
