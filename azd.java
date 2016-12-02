import io.netty.buffer.Unpooled;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class azd
  extends ayl
{
  private static final Logger u = ;
  private static final jy v = new jy("textures/gui/container/villager.png");
  private acy w;
  private azd.a x;
  private azd.a y;
  private int z;
  private eu A;
  
  public azd(wm ☃, acy ☃, adm ☃)
  {
    super(new yb(☃, ☃, ☃));
    this.w = ☃;
    this.A = ☃.f_();
  }
  
  public void b()
  {
    super.b();
    
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    
    this.n.add(this.x = new azd.a(1, ☃ + 120 + 27, ☃ + 24 - 1, true));
    this.n.add(this.y = new azd.a(2, ☃ + 36 - 19, ☃ + 24 - 1, false));
    
    this.x.l = false;
    this.y.l = false;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = this.A.c();
    this.q.a(☃, this.f / 2 - this.q.a(☃) / 2, 6, 4210752);
    this.q.a(bnq.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
  }
  
  public void e()
  {
    super.e();
    
    ada ☃ = this.w.b_(this.j.h);
    if (☃ != null)
    {
      this.x.l = (this.z < ☃.size() - 1);
      this.y.l = (this.z > 0);
    }
  }
  
  protected void a(avs ☃)
  {
    boolean ☃ = false;
    if (☃ == this.x)
    {
      this.z += 1;
      ada ☃ = this.w.b_(this.j.h);
      if ((☃ != null) && (this.z >= ☃.size())) {
        this.z = (☃.size() - 1);
      }
      ☃ = true;
    }
    else if (☃ == this.y)
    {
      this.z -= 1;
      if (this.z < 0) {
        this.z = 0;
      }
      ☃ = true;
    }
    if (☃)
    {
      ((yb)this.h).d(this.z);
      
      em ☃ = new em(Unpooled.buffer());
      ☃.writeInt(this.z);
      this.j.u().a(new im("MC|TrSel", ☃));
    }
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(v);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    
    ada ☃ = this.w.b_(this.j.h);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      int ☃ = this.z;
      if ((☃ < 0) || (☃ >= ☃.size())) {
        return;
      }
      acz ☃ = (acz)☃.get(☃);
      if (☃.h())
      {
        this.j.P().a(v);
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.f();
        b(this.i + 83, this.r + 21, 212, 0, 28, 21);
        b(this.i + 83, this.r + 51, 212, 0, 28, 21);
      }
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    ada ☃ = this.w.b_(this.j.h);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      int ☃ = (this.l - this.f) / 2;
      int ☃ = (this.m - this.g) / 2;
      
      int ☃ = this.z;
      acz ☃ = (acz)☃.get(☃);
      
      zx ☃ = ☃.a();
      zx ☃ = ☃.b();
      zx ☃ = ☃.d();
      
      bfl.E();
      
      avc.c();
      bfl.f();
      bfl.B();
      bfl.g();
      bfl.e();
      
      this.k.a = 100.0F;
      this.k.b(☃, ☃ + 36, ☃ + 24);
      this.k.a(this.q, ☃, ☃ + 36, ☃ + 24);
      if (☃ != null)
      {
        this.k.b(☃, ☃ + 62, ☃ + 24);
        this.k.a(this.q, ☃, ☃ + 62, ☃ + 24);
      }
      this.k.b(☃, ☃ + 120, ☃ + 24);
      this.k.a(this.q, ☃, ☃ + 120, ☃ + 24);
      this.k.a = 0.0F;
      
      bfl.f();
      if ((c(36, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃ != null) && (c(62, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃ != null) && (c(120, 24, 16, 16, ☃, ☃)) && (☃ != null)) {
        a(☃, ☃, ☃);
      } else if ((☃.h()) && ((c(83, 21, 28, 21, ☃, ☃)) || (c(83, 51, 28, 21, ☃, ☃)))) {
        a(bnq.a("merchant.deprecated", new Object[0]), ☃, ☃);
      }
      bfl.F();
      
      bfl.e();
      bfl.j();
      avc.b();
    }
  }
  
  public acy a()
  {
    return this.w;
  }
  
  static class a
    extends avs
  {
    private final boolean o;
    
    public a(int ☃, int ☃, int ☃, boolean ☃)
    {
      super(☃, ☃, 12, 19, "");
      this.o = ☃;
    }
    
    public void a(ave ☃, int ☃, int ☃)
    {
      if (!this.m) {
        return;
      }
      ☃.P().a(azd.f());
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      
      boolean ☃ = (☃ >= this.h) && (☃ >= this.i) && (☃ < this.h + this.f) && (☃ < this.i + this.g);
      int ☃ = 0;
      int ☃ = 176;
      if (!this.l) {
        ☃ += this.f * 2;
      } else if (☃) {
        ☃ += this.f;
      }
      if (!this.o) {
        ☃ += this.g;
      }
      b(this.h, this.i, ☃, ☃, this.f, this.g);
    }
  }
}
