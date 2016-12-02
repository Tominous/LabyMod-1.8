import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import org.lwjgl.util.glu.Project;

public class ayy
  extends ayl
{
  private static final jy C = new jy("textures/gui/container/enchanting_table.png");
  private static final jy D = new jy("textures/entity/enchanting_table_book.png");
  private static final bay E = new bay();
  private final wm F;
  private Random G = new Random();
  private xs H;
  public int u;
  public float v;
  public float w;
  public float x;
  public float y;
  public float z;
  public float A;
  zx B;
  private final op I;
  
  public ayy(wm ☃, adm ☃, op ☃)
  {
    super(new xs(☃, ☃));
    this.F = ☃;
    this.H = ((xs)this.h);
    this.I = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    this.q.a(this.I.f_().c(), 12, 5, 4210752);
    this.q.a(this.F.f_().c(), 8, this.g - 96 + 2, 4210752);
  }
  
  public void e()
  {
    super.e();
    a();
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = ☃ - (☃ + 60);
      int ☃ = ☃ - (☃ + 14 + 19 * ☃);
      if ((☃ >= 0) && (☃ >= 0) && (☃ < 108) && (☃ < 19) && 
        (this.H.a(this.j.h, ☃))) {
        this.j.c.a(this.H.d, ☃);
      }
    }
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(C);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    
    bfl.E();
    bfl.n(5889);
    bfl.E();
    bfl.D();
    avr ☃ = new avr(this.j);
    
    bfl.b((☃.a() - 320) / 2 * ☃.e(), (☃.b() - 240) / 2 * ☃.e(), 320 * ☃.e(), 240 * ☃.e());
    bfl.b(-0.34F, 0.23F, 0.0F);
    
    Project.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
    
    float ☃ = 1.0F;
    bfl.n(5888);
    bfl.D();
    avc.b();
    bfl.b(0.0F, 3.3F, -16.0F);
    bfl.a(☃, ☃, ☃);
    float ☃ = 5.0F;
    bfl.a(☃, ☃, ☃);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    
    this.j.P().a(D);
    bfl.b(20.0F, 1.0F, 0.0F, 0.0F);
    float ☃ = this.A + (this.z - this.A) * ☃;
    bfl.b((1.0F - ☃) * 0.2F, (1.0F - ☃) * 0.1F, (1.0F - ☃) * 0.25F);
    bfl.b(-(1.0F - ☃) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
    
    float ☃ = this.w + (this.v - this.w) * ☃ + 0.25F;
    float ☃ = this.w + (this.v - this.w) * ☃ + 0.75F;
    ☃ = (☃ - ns.b(☃)) * 1.6F - 0.3F;
    ☃ = (☃ - ns.b(☃)) * 1.6F - 0.3F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    bfl.B();
    
    E.a(null, 0.0F, ☃, ☃, ☃, 0.0F, 0.0625F);
    
    bfl.C();
    avc.a();
    bfl.n(5889);
    bfl.b(0, 0, this.j.d, this.j.e);
    bfl.F();
    bfl.n(5888);
    bfl.F();
    
    avc.a();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    ayx.a().a(this.H.f);
    
    int ☃ = this.H.e();
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = ☃ + 60;
      int ☃ = ☃ + 20;
      int ☃ = 86;
      
      String ☃ = ayx.a().b();
      this.e = 0.0F;
      this.j.P().a(C);
      int ☃ = this.H.g[☃];
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      if (☃ == 0)
      {
        b(☃, ☃ + 14 + 19 * ☃, 0, 185, 108, 19);
      }
      else
      {
        String ☃ = "" + ☃;
        avn ☃ = this.j.l;
        int ☃ = 6839882;
        if (((☃ < ☃ + 1) || (this.j.h.bB < ☃)) && (!this.j.h.bA.d))
        {
          b(☃, ☃ + 14 + 19 * ☃, 0, 185, 108, 19);
          b(☃ + 1, ☃ + 15 + 19 * ☃, 16 * ☃, 239, 16, 16);
          ☃.a(☃, ☃, ☃ + 16 + 19 * ☃, ☃, (☃ & 0xFEFEFE) >> 1);
          ☃ = 4226832;
        }
        else
        {
          int ☃ = ☃ - (☃ + 60);
          int ☃ = ☃ - (☃ + 14 + 19 * ☃);
          if ((☃ >= 0) && (☃ >= 0) && (☃ < 108) && (☃ < 19))
          {
            b(☃, ☃ + 14 + 19 * ☃, 0, 204, 108, 19);
            ☃ = 16777088;
          }
          else
          {
            b(☃, ☃ + 14 + 19 * ☃, 0, 166, 108, 19);
          }
          b(☃ + 1, ☃ + 15 + 19 * ☃, 16 * ☃, 223, 16, 16);
          ☃.a(☃, ☃, ☃ + 16 + 19 * ☃, ☃, ☃);
          ☃ = 8453920;
        }
        ☃ = this.j.k;
        ☃.a(☃, ☃ + 86 - ☃.a(☃), ☃ + 16 + 19 * ☃ + 7, ☃);
      }
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    boolean ☃ = this.j.h.bA.d;
    int ☃ = this.H.e();
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = this.H.g[☃];
      int ☃ = this.H.h[☃];
      int ☃ = ☃ + 1;
      if ((c(60, 14 + 19 * ☃, 108, 17, ☃, ☃)) && (☃ > 0) && (☃ >= 0))
      {
        List<String> ☃ = Lists.newArrayList();
        if ((☃ >= 0) && (aci.c(☃ & 0xFF) != null))
        {
          String ☃ = aci.c(☃ & 0xFF).d((☃ & 0xFF00) >> 8);
          
          ☃.add(a.p.toString() + a.u.toString() + bnq.a("container.enchant.clue", new Object[] { ☃ }));
        }
        if (!☃)
        {
          if (☃ >= 0) {
            ☃.add("");
          }
          if (this.j.h.bB < ☃)
          {
            ☃.add(a.m.toString() + "Level Requirement: " + this.H.g[☃]);
          }
          else
          {
            String ☃ = "";
            if (☃ == 1) {
              ☃ = bnq.a("container.enchant.lapis.one", new Object[0]);
            } else {
              ☃ = bnq.a("container.enchant.lapis.many", new Object[] { Integer.valueOf(☃) });
            }
            if (☃ >= ☃) {
              ☃.add(a.h.toString() + "" + ☃);
            } else {
              ☃.add(a.m.toString() + "" + ☃);
            }
            if (☃ == 1) {
              ☃ = bnq.a("container.enchant.level.one", new Object[0]);
            } else {
              ☃ = bnq.a("container.enchant.level.many", new Object[] { Integer.valueOf(☃) });
            }
            ☃.add(a.h.toString() + "" + ☃);
          }
        }
        a(☃, ☃, ☃);
        break;
      }
    }
  }
  
  public void a()
  {
    zx ☃ = this.h.a(0).d();
    if (!zx.b(☃, this.B))
    {
      this.B = ☃;
      do
      {
        this.x += this.G.nextInt(4) - this.G.nextInt(4);
      } while ((this.v <= this.x + 1.0F) && (this.v >= this.x - 1.0F));
    }
    this.u += 1;
    this.w = this.v;
    this.A = this.z;
    
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if (this.H.g[☃] != 0) {
        ☃ = true;
      }
    }
    if (☃) {
      this.z += 0.2F;
    } else {
      this.z -= 0.2F;
    }
    this.z = ns.a(this.z, 0.0F, 1.0F);
    
    float ☃ = (this.x - this.v) * 0.4F;
    float ☃ = 0.2F;
    ☃ = ns.a(☃, -☃, ☃);
    this.y += (☃ - this.y) * 0.9F;
    
    this.v += this.y;
  }
}
