import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import org.lwjgl.input.Mouse;

public abstract class awi
{
  protected final ave a;
  protected int b;
  protected int c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  protected final int h;
  private int u;
  private int v;
  protected int i;
  protected int j;
  protected boolean k = true;
  protected int l = -2;
  protected float m;
  protected float n;
  protected int o = -1;
  protected long p;
  protected boolean q = true;
  protected boolean r = true;
  protected boolean s;
  protected int t;
  private boolean w = true;
  
  public awi(ave mcIn, int width, int height, int topIn, int bottomIn, int slotHeightIn)
  {
    a = mcIn;
    b = width;
    c = height;
    d = topIn;
    e = bottomIn;
    h = slotHeightIn;
    g = 0;
    f = width;
  }
  
  public void a(int widthIn, int heightIn, int topIn, int bottomIn)
  {
    b = widthIn;
    c = heightIn;
    d = topIn;
    e = bottomIn;
    g = 0;
    f = widthIn;
  }
  
  public void b(boolean showSelectionBoxIn)
  {
    r = showSelectionBoxIn;
  }
  
  protected void a(boolean hasListHeaderIn, int headerPaddingIn)
  {
    s = hasListHeaderIn;
    t = headerPaddingIn;
    if (!hasListHeaderIn) {
      t = 0;
    }
  }
  
  protected abstract int b();
  
  protected abstract void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
  
  protected abstract boolean a(int paramInt);
  
  protected int k()
  {
    return b() * h + t;
  }
  
  protected abstract void a();
  
  protected void a(int p_178040_1_, int p_178040_2_, int p_178040_3_) {}
  
  protected abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  protected void a(int p_148129_1_, int p_148129_2_, bfx p_148129_3_) {}
  
  protected void a(int p_148132_1_, int p_148132_2_) {}
  
  protected void b(int p_148142_1_, int p_148142_2_) {}
  
  public int c(int p_148124_1_, int p_148124_2_)
  {
    int i = g + b / 2 - c() / 2;
    int j = g + b / 2 + c() / 2;
    int k = p_148124_2_ - d - t + (int)n - 4;
    int l = k / h;
    return (p_148124_1_ < d()) && (p_148124_1_ >= i) && (p_148124_1_ <= j) && (l >= 0) && (k >= 0) && (l < b()) ? l : -1;
  }
  
  public void d(int scrollUpButtonIDIn, int scrollDownButtonIDIn)
  {
    u = scrollUpButtonIDIn;
    v = scrollDownButtonIDIn;
  }
  
  protected void l()
  {
    n = ns.a(n, 0.0F, m());
  }
  
  public int m()
  {
    return Math.max(0, k() - (e - d - 4));
  }
  
  public int n()
  {
    return (int)n;
  }
  
  public boolean g(int p_148141_1_)
  {
    return (p_148141_1_ >= d) && (p_148141_1_ <= e) && (i >= g) && (i <= f);
  }
  
  public void h(int amount)
  {
    n += amount;
    l();
    l = -2;
  }
  
  public void a(avs button)
  {
    if (l) {
      if (k == u)
      {
        n -= h * 2 / 3;
        l = -2;
        l();
      }
      else if (k == v)
      {
        n += h * 2 / 3;
        l = -2;
        l();
      }
    }
  }
  
  public void a(int mouseXIn, int mouseYIn, float p_148128_3_)
  {
    if (q)
    {
      this.i = mouseXIn;
      this.j = mouseYIn;
      a();
      int i = d();
      int j = i + 6;
      l();
      bfl.f();
      bfl.n();
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      a.P().a(avp.b);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      float f = 32.0F;
      worldrenderer.a(7, bms.i);
      worldrenderer.b(g, e, 0.0D).a(g / f, (e + (int)n) / f).b(32, 32, 32, 255).d();
      worldrenderer.b(this.f, e, 0.0D).a(this.f / f, (e + (int)n) / f).b(32, 32, 32, 255).d();
      worldrenderer.b(this.f, d, 0.0D).a(this.f / f, (d + (int)n) / f).b(32, 32, 32, 255).d();
      worldrenderer.b(g, d, 0.0D).a(g / f, (d + (int)n) / f).b(32, 32, 32, 255).d();
      tessellator.b();
      int k = g + b / 2 - c() / 2 + 2;
      int l = d + 4 - (int)n;
      if (s) {
        a(k, l, tessellator);
      }
      b(k, l, mouseXIn, mouseYIn);
      bfl.i();
      int i1 = 4;
      c(0, d, 255, 255);
      c(e, c, 255, 255);
      bfl.l();
      bfl.a(770, 771, 0, 1);
      bfl.c();
      bfl.j(7425);
      bfl.x();
      worldrenderer.a(7, bms.i);
      worldrenderer.b(g, d + i1, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(this.f, d + i1, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(this.f, d, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(g, d, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
      tessellator.b();
      worldrenderer.a(7, bms.i);
      worldrenderer.b(g, e, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(this.f, e, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
      worldrenderer.b(this.f, e - i1, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 0).d();
      worldrenderer.b(g, e - i1, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 0).d();
      tessellator.b();
      int j1 = m();
      if (j1 > 0)
      {
        int k1 = (e - d) * (e - d) / k();
        k1 = ns.a(k1, 32, e - d - 8);
        int l1 = (int)n * (e - d - k1) / j1 + d;
        if (l1 < d) {
          l1 = d;
        }
        worldrenderer.a(7, bms.i);
        worldrenderer.b(i, e, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(j, e, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(j, d, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(i, d, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
        tessellator.b();
        worldrenderer.a(7, bms.i);
        worldrenderer.b(i, l1 + k1, 0.0D).a(0.0D, 1.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(j, l1 + k1, 0.0D).a(1.0D, 1.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(j, l1, 0.0D).a(1.0D, 0.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(i, l1, 0.0D).a(0.0D, 0.0D).b(128, 128, 128, 255).d();
        tessellator.b();
        worldrenderer.a(7, bms.i);
        worldrenderer.b(i, l1 + k1 - 1, 0.0D).a(0.0D, 1.0D).b(192, 192, 192, 255).d();
        worldrenderer.b(j - 1, l1 + k1 - 1, 0.0D).a(1.0D, 1.0D).b(192, 192, 192, 255).d();
        worldrenderer.b(j - 1, l1, 0.0D).a(1.0D, 0.0D).b(192, 192, 192, 255).d();
        worldrenderer.b(i, l1, 0.0D).a(0.0D, 0.0D).b(192, 192, 192, 255).d();
        tessellator.b();
      }
      b(mouseXIn, mouseYIn);
      bfl.w();
      bfl.j(7424);
      bfl.d();
      bfl.k();
    }
  }
  
  public void p()
  {
    if (g(this.j))
    {
      if ((Mouse.getEventButton() == 0) && (Mouse.getEventButtonState()) && (this.j >= d) && (this.j <= e))
      {
        int i = (b - c()) / 2;
        int j = (b + c()) / 2;
        int k = this.j - d - t + (int)n - 4;
        int l = k / h;
        if ((l < b()) && (this.i >= i) && (this.i <= j) && (l >= 0) && (k >= 0))
        {
          a(l, false, this.i, this.j);
          o = l;
        }
        else if ((this.i >= i) && (this.i <= j) && (k < 0))
        {
          a(this.i - i, this.j - d + (int)n - 4);
        }
      }
      if ((Mouse.isButtonDown(0)) && (q()))
      {
        if (this.l == -1)
        {
          boolean flag1 = true;
          if ((this.j >= d) && (this.j <= e))
          {
            int j2 = (b - c()) / 2;
            int k2 = (b + c()) / 2;
            int l2 = this.j - d - t + (int)n - 4;
            int i1 = l2 / h;
            if ((i1 < b()) && (this.i >= j2) && (this.i <= k2) && (i1 >= 0) && (l2 >= 0))
            {
              boolean flag = (i1 == o) && (ave.J() - p < 250L);
              a(i1, flag, this.i, this.j);
              o = i1;
              p = ave.J();
            }
            else if ((this.i >= j2) && (this.i <= k2) && (l2 < 0))
            {
              a(this.i - j2, this.j - d + (int)n - 4);
              flag1 = false;
            }
            int i3 = d();
            int j1 = i3 + 6;
            if ((this.i >= i3) && (this.i <= j1))
            {
              m = -1.0F;
              int k1 = m();
              if (k1 < 1) {
                k1 = 1;
              }
              int l1 = (int)((e - d) * (e - d) / k());
              l1 = ns.a(l1, 32, e - d - 8);
              m /= (e - d - l1) / k1;
            }
            else
            {
              m = 1.0F;
            }
            if (flag1) {
              this.l = this.j;
            } else {
              this.l = -2;
            }
          }
          else
          {
            this.l = -2;
          }
        }
        else if (this.l >= 0)
        {
          n -= (this.j - this.l) * m;
          this.l = this.j;
        }
      }
      else {
        this.l = -1;
      }
      int i2 = Mouse.getEventDWheel();
      double scroll = 0.0D;
      if (i2 != 0)
      {
        if (i2 > 0)
        {
          i2 = -1;
          scroll = -0.5D;
        }
        else if (i2 < 0)
        {
          i2 = 1;
          scroll = 0.5D;
        }
        double use = i2;
        if (settingssmoothScroll) {
          use = scroll;
        }
        n += (float)(use * h / 2.0D);
      }
    }
  }
  
  public void d(boolean enabledIn)
  {
    w = enabledIn;
  }
  
  public boolean q()
  {
    return w;
  }
  
  public int c()
  {
    return 220;
  }
  
  protected void b(int p_148120_1_, int p_148120_2_, int mouseXIn, int mouseYIn)
  {
    int i = b();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    for (int j = 0; j < i; j++)
    {
      int k = p_148120_2_ + j * h + t;
      int l = h - 4;
      if ((k > e) || (k + l < d)) {
        a(j, p_148120_1_, k);
      }
      if ((r) && (a(j)))
      {
        int i1 = g + (b / 2 - c() / 2);
        int j1 = g + b / 2 + c() / 2;
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.x();
        worldrenderer.a(7, bms.i);
        worldrenderer.b(i1, k + l + 2, 0.0D).a(0.0D, 1.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(j1, k + l + 2, 0.0D).a(1.0D, 1.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(j1, k - 2, 0.0D).a(1.0D, 0.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(i1, k - 2, 0.0D).a(0.0D, 0.0D).b(128, 128, 128, 255).d();
        worldrenderer.b(i1 + 1, k + l + 1, 0.0D).a(0.0D, 1.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(j1 - 1, k + l + 1, 0.0D).a(1.0D, 1.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(j1 - 1, k - 1, 0.0D).a(1.0D, 0.0D).b(0, 0, 0, 255).d();
        worldrenderer.b(i1 + 1, k - 1, 0.0D).a(0.0D, 0.0D).b(0, 0, 0, 255).d();
        tessellator.b();
        bfl.w();
      }
      a(j, p_148120_1_, k, l, mouseXIn, mouseYIn);
    }
  }
  
  protected int d()
  {
    return b / 2 + 124;
  }
  
  protected void c(int startY, int endY, int startAlpha, int endAlpha)
  {
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    a.P().a(avp.b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(g, endY, 0.0D).a(0.0D, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(g + b, endY, 0.0D).a(b / 32.0F, endY / 32.0F).b(64, 64, 64, endAlpha).d();
    worldrenderer.b(g + b, startY, 0.0D).a(b / 32.0F, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    worldrenderer.b(g, startY, 0.0D).a(0.0D, startY / 32.0F).b(64, 64, 64, startAlpha).d();
    tessellator.b();
  }
  
  public void i(int leftIn)
  {
    g = leftIn;
    f = (leftIn + b);
  }
  
  public int r()
  {
    return h;
  }
}
