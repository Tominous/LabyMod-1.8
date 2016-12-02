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
    F = ☃;
    H = ((xs)h);
    I = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    q.a(I.f_().c(), 12, 5, 4210752);
    q.a(F.f_().c(), 8, g - 96 + 2, 4210752);
  }
  
  public void e()
  {
    super.e();
    a();
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = ☃ - (☃ + 60);
      int ☃ = ☃ - (☃ + 14 + 19 * ☃);
      if ((☃ >= 0) && (☃ >= 0) && (☃ < 108) && (☃ < 19) && 
        (H.a(j.h, ☃))) {
        j.c.a(H.d, ☃);
      }
    }
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(C);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
    
    bfl.E();
    bfl.n(5889);
    bfl.E();
    bfl.D();
    avr ☃ = new avr(j);
    
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
    
    j.P().a(D);
    bfl.b(20.0F, 1.0F, 0.0F, 0.0F);
    float ☃ = A + (z - A) * ☃;
    bfl.b((1.0F - ☃) * 0.2F, (1.0F - ☃) * 0.1F, (1.0F - ☃) * 0.25F);
    bfl.b(-(1.0F - ☃) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
    
    float ☃ = w + (v - w) * ☃ + 0.25F;
    float ☃ = w + (v - w) * ☃ + 0.75F;
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
    bfl.b(0, 0, j.d, j.e);
    bfl.F();
    bfl.n(5888);
    bfl.F();
    
    avc.a();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    ayx.a().a(H.f);
    
    int ☃ = H.e();
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = ☃ + 60;
      int ☃ = ☃ + 20;
      int ☃ = 86;
      
      String ☃ = ayx.a().b();
      e = 0.0F;
      j.P().a(C);
      int ☃ = H.g[☃];
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      if (☃ == 0)
      {
        b(☃, ☃ + 14 + 19 * ☃, 0, 185, 108, 19);
      }
      else
      {
        String ☃ = "" + ☃;
        avn ☃ = j.l;
        int ☃ = 6839882;
        if (((☃ < ☃ + 1) || (j.h.bB < ☃)) && (!j.h.bA.d))
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
        ☃ = j.k;
        ☃.a(☃, ☃ + 86 - ☃.a(☃), ☃ + 16 + 19 * ☃ + 7, ☃);
      }
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    
    boolean ☃ = j.h.bA.d;
    int ☃ = H.e();
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = H.g[☃];
      int ☃ = H.h[☃];
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
          if (j.h.bB < ☃)
          {
            ☃.add(a.m.toString() + "Level Requirement: " + H.g[☃]);
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
    zx ☃ = h.a(0).d();
    if (!zx.b(☃, B))
    {
      B = ☃;
      do
      {
        x += G.nextInt(4) - G.nextInt(4);
      } while ((v <= x + 1.0F) && (v >= x - 1.0F));
    }
    u += 1;
    w = v;
    A = z;
    
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if (H.g[☃] != 0) {
        ☃ = true;
      }
    }
    if (☃) {
      z += 0.2F;
    } else {
      z -= 0.2F;
    }
    z = ns.a(z, 0.0F, 1.0F);
    
    float ☃ = (x - v) * 0.4F;
    float ☃ = 0.2F;
    ☃ = ns.a(☃, -☃, ☃);
    y += (☃ - y) * 0.9F;
    
    v += y;
  }
}
