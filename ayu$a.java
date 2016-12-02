import com.google.common.collect.Lists;
import java.util.List;

class ayu$a
  extends xi
{
  public List<zx> a = Lists.newArrayList();
  
  public ayu$a(wn ☃)
  {
    wm ☃ = ☃.bi;
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(ayu.g(), ☃ * 9 + ☃, 9 + ☃ * 18, 18 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 9 + ☃ * 18, 112));
    }
    a(0.0F);
  }
  
  public boolean a(wn ☃)
  {
    return true;
  }
  
  public void a(float ☃)
  {
    int ☃ = (this.a.size() + 9 - 1) / 9 - 5;
    
    int ☃ = (int)(☃ * ☃ + 0.5D);
    if (☃ < 0) {
      ☃ = 0;
    }
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++)
      {
        int ☃ = ☃ + (☃ + ☃) * 9;
        if ((☃ >= 0) && (☃ < this.a.size())) {
          ayu.g().a(☃ + ☃ * 9, (zx)this.a.get(☃));
        } else {
          ayu.g().a(☃ + ☃ * 9, null);
        }
      }
    }
  }
  
  public boolean e()
  {
    return this.a.size() > 45;
  }
  
  protected void a(int ☃, int ☃, boolean ☃, wn ☃) {}
  
  public zx b(wn ☃, int ☃)
  {
    if ((☃ >= this.c.size() - 9) && (☃ < this.c.size()))
    {
      yg ☃ = (yg)this.c.get(☃);
      if ((☃ != null) && (☃.e())) {
        ☃.d(null);
      }
    }
    return null;
  }
  
  public boolean a(zx ☃, yg ☃)
  {
    return ☃.g > 90;
  }
  
  public boolean b(yg ☃)
  {
    return ((☃.d instanceof wm)) || ((☃.g > 90) && (☃.f <= 162));
  }
}
