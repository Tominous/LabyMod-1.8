import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class avo
  extends avp
{
  private static final jy f = new jy("textures/misc/vignette.png");
  private static final jy g = new jy("textures/gui/widgets.png");
  private static final jy h = new jy("textures/misc/pumpkinblur.png");
  private final Random i = new Random();
  private final ave j;
  private final bjh k;
  private final avt l;
  private final awk m;
  private int n;
  private String o = "";
  private int p;
  private boolean q;
  public float a = 1.0F;
  private int r;
  private zx s;
  private final avv t;
  private final awm u;
  private final awh v;
  private int w;
  private String x = "";
  private String y = "";
  private int z;
  private int A;
  private int B;
  private int C = 0;
  private int D = 0;
  private long E = 0L;
  private long F = 0L;
  
  public avo(ave mcIn)
  {
    j = mcIn;
    k = mcIn.ag();
    t = new avv(mcIn);
    u = new awm(mcIn);
    l = new avt(mcIn);
    m = new awk(mcIn);
    v = new awh(mcIn, this);
    a();
  }
  
  public void a()
  {
    z = 10;
    A = 70;
    B = 20;
  }
  
  public void a(float partialTicks)
  {
    avr scaledresolution = new avr(this.j);
    int i = scaledresolution.a();
    int j = scaledresolution.b();
    jo.j();
    bfl.l();
    if (ave.w()) {
      a(jh.c(partialTicks), scaledresolution);
    } else {
      bfl.a(770, 771, 1, 0);
    }
    zx itemstack = jh.bi.e(3);
    if ((jt.aA == 0) && (itemstack != null) && (itemstack.b() == zw.a(afi.aU))) {
      e(scaledresolution);
    }
    if (!jh.a(pe.k))
    {
      float f = jh.bI + (jh.bH - jh.bI) * partialTicks;
      if (f > 0.0F) {
        b(f, scaledresolution);
      }
    }
    if (jc.a()) {
      u.a(scaledresolution, partialTicks);
    } else {
      a(scaledresolution, partialTicks);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(d);
    bfl.l();
    if (b())
    {
      bfl.a(775, 769, 1, 0);
      bfl.d();
      b(i / 2 - 7, j / 2 - 7, 0, 0, 16, 16);
    }
    bfl.a(770, 771, 1, 0);
    jA.a("bossHealth");
    j();
    jA.b();
    if (jc.b()) {
      d(scaledresolution);
    }
    bfl.k();
    if (jh.cg() > 0)
    {
      jA.a("sleep");
      bfl.i();
      bfl.c();
      int j1 = jh.cg();
      float f1 = j1 / 100.0F;
      if (f1 > 1.0F) {
        f1 = 1.0F - (j1 - 100) / 10.0F;
      }
      int k = (int)(220.0F * f1) << 24 | 0x101020;
      a(0, 0, i, j, k);
      bfl.d();
      bfl.j();
      jA.b();
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    int k1 = i / 2 - 91;
    if (jh.y()) {
      a(scaledresolution, k1);
    } else if (jc.f()) {
      b(scaledresolution, k1);
    }
    if ((jt.D) && (!jc.a())) {
      a(scaledresolution);
    } else if (jh.v()) {
      u.a(scaledresolution);
    }
    if (this.j.t()) {
      b(scaledresolution);
    }
    if (jt.aB) {
      t.a(scaledresolution);
    }
    if (p > 0)
    {
      jA.a("overlayMessage");
      float f2 = p - partialTicks;
      int l1 = (int)(f2 * 255.0F / 20.0F);
      if (l1 > 255) {
        l1 = 255;
      }
      if (l1 > 8)
      {
        bfl.E();
        bfl.b(i / 2, j - 68, 0.0F);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        int l = 16777215;
        if (q) {
          l = ns.c(f2 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
        }
        f().a(o, -f().a(o) / 2, -4, l + (l1 << 24 & 0xFF000000));
        bfl.k();
        bfl.F();
      }
      jA.b();
    }
    if (w > 0)
    {
      jA.a("titleAndSubtitle");
      float f3 = w - partialTicks;
      int i2 = 255;
      if (w > B + A)
      {
        float f4 = z + A + B - f3;
        i2 = (int)(f4 * 255.0F / z);
      }
      if (w <= B) {
        i2 = (int)(f3 * 255.0F / B);
      }
      i2 = ns.a(i2, 0, 255);
      if (i2 > 8)
      {
        bfl.E();
        bfl.b(i / 2, j / 2, 0.0F);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.E();
        bfl.a(4.0F, 4.0F, 4.0F);
        int j2 = i2 << 24 & 0xFF000000;
        f().a(x, -f().a(x) / 2, -10.0F, 0xFFFFFF | j2, true);
        bfl.F();
        bfl.E();
        bfl.a(2.0F, 2.0F, 2.0F);
        f().a(y, -f().a(y) / 2, 5.0F, 0xFFFFFF | j2, true);
        bfl.F();
        bfl.k();
        bfl.F();
      }
      jA.b();
    }
    auo scoreboard = jf.Z();
    auk scoreobjective = null;
    aul scoreplayerteam = scoreboard.h(jh.e_());
    if (scoreplayerteam != null)
    {
      int i1 = scoreplayerteam.l().b();
      if (i1 >= 0) {
        scoreobjective = scoreboard.a(3 + i1);
      }
    }
    auk scoreobjective1 = scoreobjective != null ? scoreobjective : scoreboard.a(1);
    if (scoreobjective1 != null) {
      a(scoreobjective1, scaledresolution);
    }
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.c();
    bfl.E();
    bfl.b(0.0F, j - 48, 0.0F);
    jA.a("chat");
    this.l.a(n);
    jA.b();
    bfl.F();
    scoreobjective1 = scoreboard.a(0);
    if ((!jt.ak.d()) || ((this.j.E()) && (jh.a.d().size() <= 1) && (scoreobjective1 == null)))
    {
      v.a(false);
    }
    else
    {
      v.a(true);
      v.a(i, scoreboard, scoreobjective1);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.f();
    bfl.d();
  }
  
  protected void a(avr sr, float partialTicks)
  {
    if ((this.j.ac() instanceof wn))
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.j.P().a(g);
      wn entityplayer = (wn)this.j.ac();
      int i = sr.a() / 2;
      float f = e;
      e = -90.0F;
      b(i - 91, sr.b() - 22, 0, 0, 182, 22);
      b(i - 91 - 1 + bi.c * 20, sr.b() - 22 - 1, 0, 22, 24, 22);
      e = f;
      bfl.B();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      avc.c();
      for (int j = 0; j < 9; j++)
      {
        int k = sr.a() / 2 - 90 + j * 20 + 2;
        int l = sr.b() - 16 - 3;
        a(j, k, l, partialTicks, entityplayer);
      }
      avc.a();
      bfl.C();
      bfl.k();
    }
  }
  
  public void a(avr p_175186_1_, int p_175186_2_)
  {
    jA.a("jumpBar");
    this.j.P().a(avp.d);
    float f = jh.z();
    int i = 182;
    int j = (int)(f * (i + 1));
    int k = p_175186_1_.b() - 32 + 3;
    b(p_175186_2_, k, 0, 84, i, 5);
    if (j > 0) {
      b(p_175186_2_, k, 0, 89, j, 5);
    }
    jA.b();
  }
  
  public void b(avr p_175176_1_, int p_175176_2_)
  {
    jA.a("expBar");
    this.j.P().a(avp.d);
    int i = jh.ck();
    if (i > 0)
    {
      int j = 182;
      int k = (int)(jh.bD * (j + 1));
      int l = p_175176_1_.b() - 32 + 3;
      b(p_175176_2_, l, 0, 64, j, 5);
      if (k > 0) {
        b(p_175176_2_, l, 0, 69, k, 5);
      }
    }
    jA.b();
    if (jh.bB > 0)
    {
      jA.a("expLevel");
      int k1 = 8453920;
      String s = "" + jh.bB;
      int l1 = (p_175176_1_.a() - f().a(s)) / 2;
      int i1 = p_175176_1_.b() - 31 - 4;
      int j1 = 0;
      f().a(s, l1 + 1, i1, 0);
      f().a(s, l1 - 1, i1, 0);
      f().a(s, l1, i1 + 1, 0);
      f().a(s, l1, i1 - 1, 0);
      f().a(s, l1, i1, k1);
      jA.b();
    }
  }
  
  public void a(avr p_181551_1_)
  {
    jA.a("selectedItemName");
    if ((r > 0) && (this.s != null))
    {
      String s = this.s.q();
      if (this.s.s()) {
        s = a.u + s;
      }
      int i = (p_181551_1_.a() - f().a(s)) / 2;
      int j = p_181551_1_.b() - 59;
      if (!jc.b()) {
        j += 14;
      }
      int k = (int)(r * 256.0F / 10.0F);
      if (k > 255) {
        k = 255;
      }
      if (k > 0)
      {
        bfl.E();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        f().a(s, i, j, 16777215 + (k << 24));
        bfl.k();
        bfl.F();
      }
    }
    jA.b();
  }
  
  public void b(avr p_175185_1_)
  {
    j.A.a("demo");
    String s = "";
    if (j.f.K() >= 120500L) {
      s = bnq.a("demo.demoExpired", new Object[0]);
    } else {
      s = bnq.a("demo.remainingTime", new Object[] { nx.a((int)(120500L - j.f.K())) });
    }
    int i = f().a(s);
    f().a(s, p_175185_1_.a() - i - 10, 5.0F, 16777215);
    j.A.b();
  }
  
  protected boolean b()
  {
    if ((j.t.aB) && (!j.h.cq()) && (!j.t.w)) {
      return false;
    }
    if (j.c.a())
    {
      if (j.i != null) {
        return true;
      }
      if ((j.s != null) && (j.s.a == auh.a.b))
      {
        cj blockpos = j.s.a();
        if ((j.f.s(blockpos) instanceof og)) {
          return true;
        }
      }
      return false;
    }
    return true;
  }
  
  public void c(avr p_180478_1_)
  {
    m.a(p_180478_1_.a() - 10, 10);
  }
  
  private void a(auk p_180475_1_, avr p_180475_2_)
  {
    auo scoreboard = p_180475_1_.a();
    Collection<aum> collection = scoreboard.i(p_180475_1_);
    List<aum> list = Lists.newArrayList(Iterables.filter(collection, new Predicate()
    {
      public boolean a(aum p_apply_1_)
      {
        return (p_apply_1_.e() != null) && (!p_apply_1_.e().startsWith("#"));
      }
    }));
    if (list.size() > 15) {
      collection = Lists.newArrayList(Iterables.skip(list, collection.size() - 15));
    } else {
      collection = list;
    }
    int i = f().a(p_180475_1_.d());
    for (aum score : collection)
    {
      aul scoreplayerteam = scoreboard.h(score.e());
      String s = aul.a(scoreplayerteam, score.e()) + ": " + a.m + score.c();
      i = Math.max(i, f().a(s));
    }
    int i1 = collection.size() * fa;
    int j1 = p_180475_2_.b() / 2 + i1 / 3;
    int k1 = 3;
    int l1 = p_180475_2_.a() - i - k1;
    int j = 0;
    for (aum score1 : collection)
    {
      j++;
      aul scoreplayerteam1 = scoreboard.h(score1.e());
      String s1 = aul.a(scoreplayerteam1, score1.e());
      String s2 = a.m + "" + score1.c();
      int k = j1 - j * fa;
      int l = p_180475_2_.a() - k1 + 2;
      a(l1 - 2, k, l, k + fa, 1342177280);
      f().a(s1, l1, k, 553648127);
      f().a(s2, l - f().a(s2), k, 553648127);
      if (j == collection.size())
      {
        String s3 = p_180475_1_.d();
        a(l1 - 2, k - fa - 1, l, k - 1, 1610612736);
        a(l1 - 2, k - 1, l, k, 1342177280);
        f().a(s3, l1 + i / 2 - f().a(s3) / 2, k - fa, 553648127);
      }
    }
  }
  
  private void d(avr p_180477_1_)
  {
    if ((this.j.ac() instanceof wn))
    {
      wn entityplayer = (wn)this.j.ac();
      int i = ns.f(entityplayer.bn());
      boolean flag = (F > n) && ((F - n) / 3L % 2L == 1L);
      if ((i < C) && (Z > 0))
      {
        E = ave.J();
        F = (n + 20);
      }
      else if ((i > C) && (Z > 0))
      {
        E = ave.J();
        F = (n + 10);
      }
      if (ave.J() - E > 1000L)
      {
        C = i;
        D = i;
        E = ave.J();
      }
      C = i;
      int j = D;
      this.i.setSeed(n * 312871);
      boolean flag1 = false;
      xg foodstats = entityplayer.cl();
      int k = foodstats.a();
      int l = foodstats.b();
      float saturation = foodstats.e();
      qc iattributeinstance = entityplayer.a(vy.a);
      int i1 = p_180477_1_.a() / 2 - 91;
      int j1 = p_180477_1_.a() / 2 + 91;
      int k1 = p_180477_1_.b() - 39;
      float f = (float)iattributeinstance.e();
      float f1 = entityplayer.bN();
      int l1 = ns.f((f + f1) / 2.0F / 10.0F);
      int i2 = Math.max(10 - (l1 - 2), 3);
      int j2 = k1 - (l1 - 1) * i2 - 10;
      float f2 = f1;
      int k2 = entityplayer.br();
      int l2 = -1;
      if (entityplayer.a(pe.l)) {
        l2 = n % ns.f(f + 5.0F);
      }
      jA.a("armor");
      for (int i3 = 0; i3 < 10; i3++) {
        if (k2 > 0)
        {
          int j3 = i1 + i3 * 8;
          if (i3 * 2 + 1 < k2) {
            b(j3, j2, 34, 9, 9, 9);
          }
          if (i3 * 2 + 1 == k2) {
            b(j3, j2, 25, 9, 9, 9);
          }
          if (i3 * 2 + 1 > k2) {
            b(j3, j2, 16, 9, 9, 9);
          }
        }
      }
      jA.c("health");
      for (int i6 = ns.f((f + f1) / 2.0F) - 1; i6 >= 0; i6--)
      {
        int j6 = 16;
        if (entityplayer.a(pe.u)) {
          j6 += 36;
        } else if (entityplayer.a(pe.v)) {
          j6 += 72;
        }
        int k3 = 0;
        if (flag) {
          k3 = 1;
        }
        int l3 = ns.f((i6 + 1) / 10.0F) - 1;
        int i4 = i1 + i6 % 10 * 8;
        int j4 = k1 - l3 * i2;
        if (i <= 4) {
          j4 += this.i.nextInt(2);
        }
        if (i6 == l2) {
          j4 -= 2;
        }
        int k4 = 0;
        if (o.P().t()) {
          k4 = 5;
        }
        b(i4, j4, 16 + k3 * 9, 9 * k4, 9, 9);
        if (((!settingsoldHearts) || (!Allowed.animations())) && 
          (flag))
        {
          if (i6 * 2 + 1 < j) {
            b(i4, j4, j6 + 54, 9 * k4, 9, 9);
          }
          if (i6 * 2 + 1 == j) {
            b(i4, j4, j6 + 63, 9 * k4, 9, 9);
          }
        }
        if (f2 > 0.0F)
        {
          if ((f2 == f1) && (f1 % 2.0F == 1.0F)) {
            b(i4, j4, j6 + 153, 9 * k4, 9, 9);
          } else {
            b(i4, j4, j6 + 144, 9 * k4, 9, 9);
          }
          f2 -= 2.0F;
        }
        else
        {
          if (i6 * 2 + 1 < i) {
            b(i4, j4, j6 + 36, 9 * k4, 9, 9);
          }
          if (i6 * 2 + 1 == i) {
            b(i4, j4, j6 + 45, 9 * k4, 9, 9);
          }
        }
      }
      pk entity = m;
      if (entity == null)
      {
        jA.c("food");
        for (int k6 = 0; k6 < 10; k6++)
        {
          int i7 = k1;
          int l7 = 16;
          int j8 = 0;
          if (entityplayer.a(pe.s))
          {
            l7 += 36;
            j8 = 13;
          }
          if ((entityplayer.cl().e() <= 0.0F) && (n % (k * 3 + 1) == 0)) {
            i7 = k1 + (this.i.nextInt(3) - 1);
          }
          if (flag1) {
            j8 = 1;
          }
          int i9 = j1 - k6 * 8 - 9;
          b(i9, i7, 16 + j8 * 9, 27, 9, 9);
          if (flag1)
          {
            if (k6 * 2 + 1 < l) {
              b(i9, i7, l7 + 54, 27, 9, 9);
            }
            if (k6 * 2 + 1 == l) {
              b(i9, i7, l7 + 63, 27, 9, 9);
            }
          }
          if (k6 * 2 + 1 < k) {
            b(i9, i7, l7 + 36, 27, 9, 9);
          }
          if (k6 * 2 + 1 == k) {
            b(i9, i7, l7 + 45, 27, 9, 9);
          }
        }
        if ((settingsfoodSaturation) && (Allowed.foodSaturation()) && (saturation != 0.0F)) {
          for (int k6 = 0; k6 < saturation / 2.0F; k6++)
          {
            int i7 = k1 - 10;
            int l7 = 16;
            int j8 = 0;
            if (entityplayer.a(pe.s))
            {
              l7 += 36;
              j8 = 13;
            }
            if ((saturation <= 0.0F) && (n % (saturation * 3.0F + 1.0F) == 0.0F)) {
              i7 = k1 + (this.i.nextInt(3) - 1);
            }
            if (flag1) {
              j8 = 1;
            }
            int i9 = j1 - k6 * 8 - 9;
            b(i9, i7, 16 + j8 * 9, 27, 9, 9);
            if (flag1)
            {
              if (k6 * 2 + 1 < l) {
                b(i9, i7, l7 + 54, 27, 9, 9);
              }
              if (k6 * 2 + 1 == l) {
                b(i9, i7, l7 + 63, 27, 9, 9);
              }
            }
            if (k6 * 2 + 1 < saturation) {
              b(i9, i7, l7 + 36, 27, 9, 9);
            }
            if (k6 * 2 + 1 == saturation) {
              b(i9, i7, l7 + 45, 27, 9, 9);
            }
          }
        }
      }
      else if ((entity instanceof pr))
      {
        jA.c("mountHealth");
        pr entitylivingbase = (pr)entity;
        int j7 = (int)Math.ceil(entitylivingbase.bn());
        float f3 = entitylivingbase.bu();
        int k8 = (int)(f3 + 0.5F) / 2;
        if (k8 > 30) {
          k8 = 30;
        }
        int j9 = k1;
        for (int k9 = 0; k8 > 0; k9 += 20)
        {
          int l4 = Math.min(k8, 10);
          k8 -= l4;
          for (int i5 = 0; i5 < l4; i5++)
          {
            int j5 = 52;
            int k5 = 0;
            if (flag1) {
              k5 = 1;
            }
            int l5 = j1 - i5 * 8 - 9;
            b(l5, j9, j5 + k5 * 9, 9, 9, 9);
            if (i5 * 2 + 1 + k9 < j7) {
              b(l5, j9, j5 + 36, 9, 9, 9);
            }
            if (i5 * 2 + 1 + k9 == j7) {
              b(l5, j9, j5 + 45, 9, 9, 9);
            }
          }
          j9 -= 10;
        }
      }
      jA.c("air");
      if (entityplayer.a(arm.h))
      {
        boolean up = (settingsfoodSaturation) && (Allowed.foodSaturation()) && (saturation != 0.0F);
        int l6 = jh.az();
        int k7 = ns.f((l6 - 2) * 10.0D / 300.0D);
        int i8 = ns.f(l6 * 10.0D / 300.0D) - k7;
        if (up) {
          j2 -= 10;
        }
        for (int l8 = 0; l8 < k7 + i8; l8++) {
          if (l8 < k7) {
            b(j1 - l8 * 8 - 9, j2, 16, 18, 9, 9);
          } else {
            b(j1 - l8 * 8 - 9, j2, 25, 18, 9, 9);
          }
        }
      }
      jA.b();
    }
  }
  
  private void j()
  {
    if ((bfc.c != null) && (bfc.b > 0))
    {
      bfc.b -= 1;
      avn fontrenderer = jk;
      avr scaledresolution = new avr(this.j);
      int i = scaledresolution.a();
      int j = 182;
      int k = i / 2 - j / 2;
      int l = (int)(bfc.a * (j + 1));
      int i1 = 12;
      if (settingsshowBossBar)
      {
        b(k, i1, 0, 74, j, 5);
        b(k, i1, 0, 74, j, 5);
        if (l > 0) {
          b(k, i1, 0, 79, l, 5);
        }
      }
      String s = bfc.c;
      f().a(s, i / 2 - f().a(s) / 2, i1 - 10, 16777215);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.j.P().a(d);
    }
  }
  
  private void e(avr p_180476_1_)
  {
    bfl.i();
    bfl.a(false);
    bfl.a(770, 771, 1, 0);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.c();
    j.P().a(h);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer.b(0.0D, p_180476_1_.b(), -90.0D).a(0.0D, 1.0D).d();
    worldrenderer.b(p_180476_1_.a(), p_180476_1_.b(), -90.0D).a(1.0D, 1.0D).d();
    worldrenderer.b(p_180476_1_.a(), 0.0D, -90.0D).a(1.0D, 0.0D).d();
    worldrenderer.b(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).d();
    tessellator.b();
    bfl.a(true);
    bfl.j();
    bfl.d();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void a(float p_180480_1_, avr p_180480_2_)
  {
    p_180480_1_ = 1.0F - p_180480_1_;
    p_180480_1_ = ns.a(p_180480_1_, 0.0F, 1.0F);
    ams worldborder = j.f.af();
    float f = (float)worldborder.a(j.h);
    double d0 = Math.min(worldborder.o() * worldborder.p() * 1000.0D, Math.abs(worldborder.j() - worldborder.h()));
    double d1 = Math.max(worldborder.q(), d0);
    if (f < d1) {
      f = 1.0F - (float)(f / d1);
    } else {
      f = 0.0F;
    }
    a = ((float)(a + (p_180480_1_ - a) * 0.01D));
    bfl.i();
    bfl.a(false);
    bfl.a(0, 769, 1, 0);
    if (f > 0.0F) {
      bfl.c(0.0F, f, f, 1.0F);
    } else {
      bfl.c(a, a, a, 1.0F);
    }
    j.P().a(f);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer.b(0.0D, p_180480_2_.b(), -90.0D).a(0.0D, 1.0D).d();
    worldrenderer.b(p_180480_2_.a(), p_180480_2_.b(), -90.0D).a(1.0D, 1.0D).d();
    worldrenderer.b(p_180480_2_.a(), 0.0D, -90.0D).a(1.0D, 0.0D).d();
    worldrenderer.b(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).d();
    tessellator.b();
    bfl.a(true);
    bfl.j();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.a(770, 771, 1, 0);
  }
  
  private void b(float p_180474_1_, avr p_180474_2_)
  {
    if (p_180474_1_ < 1.0F)
    {
      p_180474_1_ *= p_180474_1_;
      p_180474_1_ *= p_180474_1_;
      p_180474_1_ = p_180474_1_ * 0.8F + 0.2F;
    }
    bfl.c();
    bfl.i();
    bfl.a(false);
    bfl.a(770, 771, 1, 0);
    bfl.c(1.0F, 1.0F, 1.0F, p_180474_1_);
    j.P().a(bmh.g);
    bmi textureatlassprite = j.ae().a().a(afi.aY.Q());
    float f = textureatlassprite.e();
    float f1 = textureatlassprite.g();
    float f2 = textureatlassprite.f();
    float f3 = textureatlassprite.h();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer.b(0.0D, p_180474_2_.b(), -90.0D).a(f, f3).d();
    worldrenderer.b(p_180474_2_.a(), p_180474_2_.b(), -90.0D).a(f2, f3).d();
    worldrenderer.b(p_180474_2_.a(), 0.0D, -90.0D).a(f2, f1).d();
    worldrenderer.b(0.0D, 0.0D, -90.0D).a(f, f1).d();
    tessellator.b();
    bfl.a(true);
    bfl.j();
    bfl.d();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void a(int index, int xPos, int yPos, float partialTicks, wn p_175184_5_)
  {
    zx itemstack = bi.a[index];
    if (itemstack != null)
    {
      float f = c - partialTicks;
      if (f > 0.0F)
      {
        bfl.E();
        float f1 = 1.0F + f / 5.0F;
        bfl.b(xPos + 8, yPos + 12, 0.0F);
        bfl.a(1.0F / f1, (f1 + 1.0F) / 2.0F, 1.0F);
        bfl.b(-(xPos + 8), -(yPos + 12), 0.0F);
      }
      k.b(itemstack, xPos, yPos);
      if (f > 0.0F) {
        bfl.F();
      }
      k.a(j.k, itemstack, xPos, yPos);
    }
  }
  
  public void c()
  {
    if (p > 0) {
      p -= 1;
    }
    if (w > 0)
    {
      w -= 1;
      if (w <= 0)
      {
        x = "";
        y = "";
      }
    }
    n += 1;
    m.a();
    if (j.h != null)
    {
      zx itemstack = j.h.bi.h();
      if (itemstack == null) {
        r = 0;
      } else if ((s != null) && (itemstack.b() == s.b()) && (zx.a(itemstack, s)) && ((itemstack.e()) || (itemstack.i() == s.i())))
      {
        if (r > 0) {
          r -= 1;
        }
      }
      else {
        r = 40;
      }
      s = itemstack;
    }
  }
  
  public void a(String p_73833_1_)
  {
    a(bnq.a("record.nowPlaying", new Object[] { p_73833_1_ }), true);
  }
  
  public void a(String p_110326_1_, boolean p_110326_2_)
  {
    o = p_110326_1_;
    p = 60;
    q = p_110326_2_;
  }
  
  public void a(String p_175178_1_, String p_175178_2_, int p_175178_3_, int p_175178_4_, int p_175178_5_)
  {
    if ((p_175178_1_ == null) && (p_175178_2_ == null) && (p_175178_3_ < 0) && (p_175178_4_ < 0) && (p_175178_5_ < 0))
    {
      x = "";
      y = "";
      w = 0;
    }
    else if (p_175178_1_ != null)
    {
      x = p_175178_1_;
      w = (z + A + B);
    }
    else if (p_175178_2_ != null)
    {
      y = p_175178_2_;
    }
    else
    {
      if (p_175178_3_ >= 0) {
        z = p_175178_3_;
      }
      if (p_175178_4_ >= 0) {
        A = p_175178_4_;
      }
      if (p_175178_5_ >= 0) {
        B = p_175178_5_;
      }
      if (w > 0) {
        w = (z + A + B);
      }
    }
  }
  
  public void a(eu p_175188_1_, boolean p_175188_2_)
  {
    a(p_175188_1_.c(), p_175188_2_);
  }
  
  public avt d()
  {
    return l;
  }
  
  public int e()
  {
    return n;
  }
  
  public avn f()
  {
    return j.k;
  }
  
  public awm g()
  {
    return u;
  }
  
  public awh h()
  {
    return v;
  }
  
  public void i()
  {
    v.a();
  }
}
