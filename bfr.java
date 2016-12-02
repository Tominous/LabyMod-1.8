import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class bfr
  implements ado, bnj
{
  private static final Logger b = ;
  private static final jy c = new jy("textures/environment/moon_phases.png");
  private static final jy d = new jy("textures/environment/sun.png");
  private static final jy e = new jy("textures/environment/clouds.png");
  private static final jy f = new jy("textures/environment/end_sky.png");
  private static final jy g = new jy("textures/misc/forcefield.png");
  private final ave h;
  private final bmj i;
  private final biu j;
  private bdb k;
  private Set<bht> l = Sets.newLinkedHashSet();
  private List<bfr.a> m = Lists.newArrayListWithCapacity(69696);
  private final Set<akw> n = Sets.newHashSet();
  private bga o;
  private int p = -1;
  private int q = -1;
  private int r = -1;
  private bmu s;
  private bmt t;
  private bmt u;
  private bmt v;
  private int w;
  private final Map<Integer, kw> x = Maps.newHashMap();
  private final Map<cj, bpj> y = Maps.newHashMap();
  private final bmi[] z = new bmi[10];
  private bfw A;
  private blr B;
  private double C = Double.MIN_VALUE;
  private double D = Double.MIN_VALUE;
  private double E = Double.MIN_VALUE;
  private int F = Integer.MIN_VALUE;
  private int G = Integer.MIN_VALUE;
  private int H = Integer.MIN_VALUE;
  private double I = Double.MIN_VALUE;
  private double J = Double.MIN_VALUE;
  private double K = Double.MIN_VALUE;
  private double L = Double.MIN_VALUE;
  private double M = Double.MIN_VALUE;
  private final bho N = new bho();
  private bfh O;
  private int P = -1;
  private int Q = 2;
  private int R;
  private int S;
  private int T;
  private boolean U = false;
  private bid V;
  private final Vector4f[] W = new Vector4f[8];
  private final bqr X = new bqr();
  private boolean Y = false;
  bhu a;
  private double Z;
  private double aa;
  private double ab;
  private boolean ac = true;
  
  public bfr(ave ☃)
  {
    this.h = ☃;
    this.j = ☃.af();
    
    this.i = ☃.P();
    
    this.i.a(g);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    bfl.i(0);
    
    n();
    
    this.Y = bqs.f();
    if (this.Y)
    {
      this.O = new bfy();
      this.a = new bhv();
    }
    else
    {
      this.O = new bft();
      this.a = new bhr();
    }
    this.s = new bmu();
    this.s.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    
    q();
    p();
    o();
  }
  
  public void a(bni ☃)
  {
    n();
  }
  
  private void n()
  {
    bmh ☃ = this.h.T();
    for (int ☃ = 0; ☃ < this.z.length; ☃++) {
      this.z[☃] = ☃.a("minecraft:blocks/destroy_stage_" + ☃);
    }
  }
  
  public void b()
  {
    if (bqs.O)
    {
      if (blu.b() == null) {
        blu.a();
      }
      jy ☃ = new jy("shaders/post/entity_outline.json");
      try
      {
        this.B = new blr(this.h.P(), this.h.Q(), this.h.b(), ☃);
        this.B.a(this.h.d, this.h.e);
        this.A = this.B.a("final");
      }
      catch (IOException ☃)
      {
        b.warn("Failed to load shader: " + ☃, ☃);
        this.B = null;
        this.A = null;
      }
      catch (JsonSyntaxException ☃)
      {
        b.warn("Failed to load shader: " + ☃, ☃);
        this.B = null;
        this.A = null;
      }
    }
    else
    {
      this.B = null;
      this.A = null;
    }
  }
  
  public void c()
  {
    if (d())
    {
      bfl.l();
      bfl.a(770, 771, 0, 1);
      this.A.a(this.h.d, this.h.e, false);
      bfl.k();
    }
  }
  
  protected boolean d()
  {
    return (this.A != null) && (this.B != null) && (this.h.h != null) && (this.h.h.v()) && (this.h.t.aq.d());
  }
  
  private void o()
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    if (this.v != null) {
      this.v.c();
    }
    if (this.r >= 0)
    {
      avd.b(this.r);
      this.r = -1;
    }
    if (this.Y)
    {
      this.v = new bmt(this.s);
      a(☃, -16.0F, true);
      ☃.e();
      ☃.b();
      this.v.a(☃.f());
    }
    else
    {
      this.r = avd.a(1);
      GL11.glNewList(this.r, 4864);
      a(☃, -16.0F, true);
      ☃.b();
      GL11.glEndList();
    }
  }
  
  private void p()
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    if (this.u != null) {
      this.u.c();
    }
    if (this.q >= 0)
    {
      avd.b(this.q);
      this.q = -1;
    }
    if (this.Y)
    {
      this.u = new bmt(this.s);
      a(☃, 16.0F, false);
      ☃.e();
      ☃.b();
      this.u.a(☃.f());
    }
    else
    {
      this.q = avd.a(1);
      GL11.glNewList(this.q, 4864);
      a(☃, 16.0F, false);
      ☃.b();
      GL11.glEndList();
    }
  }
  
  private void a(bfd ☃, float ☃, boolean ☃)
  {
    int ☃ = 64;
    int ☃ = 6;
    ☃.a(7, bms.e);
    for (int ☃ = 65152; ☃ <= 384; ☃ += 64) {
      for (int ☃ = 65152; ☃ <= 384; ☃ += 64)
      {
        float ☃ = ☃;
        float ☃ = ☃ + 64;
        if (☃)
        {
          ☃ = ☃;
          ☃ = ☃ + 64;
        }
        ☃.b(☃, ☃, ☃).d();
        ☃.b(☃, ☃, ☃).d();
        ☃.b(☃, ☃, ☃ + 64).d();
        ☃.b(☃, ☃, ☃ + 64).d();
      }
    }
  }
  
  private void q()
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    if (this.t != null) {
      this.t.c();
    }
    if (this.p >= 0)
    {
      avd.b(this.p);
      this.p = -1;
    }
    if (this.Y)
    {
      this.t = new bmt(this.s);
      a(☃);
      ☃.e();
      ☃.b();
      this.t.a(☃.f());
    }
    else
    {
      this.p = avd.a(1);
      
      bfl.E();
      GL11.glNewList(this.p, 4864);
      
      a(☃);
      ☃.b();
      
      GL11.glEndList();
      bfl.F();
    }
  }
  
  private void a(bfd ☃)
  {
    Random ☃ = new Random(10842L);
    
    ☃.a(7, bms.e);
    for (int ☃ = 0; ☃ < 1500; ☃++)
    {
      double ☃ = ☃.nextFloat() * 2.0F - 1.0F;
      double ☃ = ☃.nextFloat() * 2.0F - 1.0F;
      double ☃ = ☃.nextFloat() * 2.0F - 1.0F;
      double ☃ = 0.15F + ☃.nextFloat() * 0.1F;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((☃ < 1.0D) && (☃ > 0.01D))
      {
        ☃ = 1.0D / Math.sqrt(☃);
        ☃ *= ☃;
        ☃ *= ☃;
        ☃ *= ☃;
        double ☃ = ☃ * 100.0D;
        double ☃ = ☃ * 100.0D;
        double ☃ = ☃ * 100.0D;
        
        double ☃ = Math.atan2(☃, ☃);
        double ☃ = Math.sin(☃);
        double ☃ = Math.cos(☃);
        
        double ☃ = Math.atan2(Math.sqrt(☃ * ☃ + ☃ * ☃), ☃);
        double ☃ = Math.sin(☃);
        double ☃ = Math.cos(☃);
        
        double ☃ = ☃.nextDouble() * 3.141592653589793D * 2.0D;
        double ☃ = Math.sin(☃);
        double ☃ = Math.cos(☃);
        for (int ☃ = 0; ☃ < 4; ☃++)
        {
          double ☃ = 0.0D;
          double ☃ = ((☃ & 0x2) - 1) * ☃;
          double ☃ = ((☃ + 1 & 0x2) - 1) * ☃;
          
          double ☃ = 0.0D;
          double ☃ = ☃ * ☃ - ☃ * ☃;
          double ☃ = ☃ * ☃ + ☃ * ☃;
          
          double ☃ = ☃;
          double ☃ = ☃ * ☃ + 0.0D * ☃;
          double ☃ = 0.0D * ☃ - ☃ * ☃;
          
          double ☃ = ☃ * ☃ - ☃ * ☃;
          double ☃ = ☃;
          double ☃ = ☃ * ☃ + ☃ * ☃;
          
          ☃.b(☃ + ☃, ☃ + ☃, ☃ + ☃).d();
        }
      }
    }
  }
  
  public void a(bdb ☃)
  {
    if (this.k != null) {
      this.k.b(this);
    }
    this.C = Double.MIN_VALUE;
    this.D = Double.MIN_VALUE;
    this.E = Double.MIN_VALUE;
    this.F = Integer.MIN_VALUE;
    this.G = Integer.MIN_VALUE;
    this.H = Integer.MIN_VALUE;
    
    this.j.a(☃);
    this.k = ☃;
    if (☃ != null)
    {
      ☃.a(this);
      a();
    }
  }
  
  public void a()
  {
    if (this.k == null) {
      return;
    }
    this.ac = true;
    
    afi.t.b(this.h.t.i);
    afi.u.b(this.h.t.i);
    
    this.P = this.h.t.c;
    
    boolean ☃ = this.Y;
    this.Y = bqs.f();
    if ((☃) && (!this.Y))
    {
      this.O = new bft();
      this.a = new bhr();
    }
    else if ((!☃) && (this.Y))
    {
      this.O = new bfy();
      this.a = new bhv();
    }
    if (☃ != this.Y)
    {
      q();
      p();
      o();
    }
    if (this.o != null) {
      this.o.a();
    }
    e();
    synchronized (this.n)
    {
      this.n.clear();
    }
    this.o = new bga(this.k, this.h.t.c, this, this.a);
    if (this.k != null)
    {
      pk ☃ = this.h.ac();
      if (☃ != null) {
        this.o.a(☃.s, ☃.u);
      }
    }
    this.Q = 2;
  }
  
  protected void e()
  {
    this.l.clear();
    this.N.b();
  }
  
  public void a(int ☃, int ☃)
  {
    if (!bqs.O) {
      return;
    }
    if (this.B != null) {
      this.B.a(☃, ☃);
    }
  }
  
  public void a(pk ☃, bia ☃, float ☃)
  {
    if (this.Q > 0)
    {
      this.Q -= 1;
      return;
    }
    double ☃ = ☃.p + (☃.s - ☃.p) * ☃;
    double ☃ = ☃.q + (☃.t - ☃.q) * ☃;
    double ☃ = ☃.r + (☃.u - ☃.r) * ☃;
    
    this.k.B.a("prepare");
    bhc.a.a(this.k, this.h.P(), this.h.k, this.h.ac(), ☃);
    this.j.a(this.k, this.h.k, this.h.ac(), this.h.i, this.h.t, ☃);
    
    this.R = 0;
    this.S = 0;
    this.T = 0;
    
    pk ☃ = this.h.ac();
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    bhc.b = ☃;
    bhc.c = ☃;
    bhc.d = ☃;
    
    this.j.a(☃, ☃, ☃);
    
    this.h.o.i();
    
    this.k.B.c("global");
    List<pk> ☃ = this.k.E();
    this.R = ☃.size();
    for (int ☃ = 0; ☃ < this.k.k.size(); ☃++)
    {
      pk ☃ = (pk)this.k.k.get(☃);
      this.S += 1;
      if (☃.h(☃, ☃, ☃)) {
        this.j.a(☃, ☃);
      }
    }
    if (d())
    {
      bfl.c(519);
      bfl.n();
      this.A.f();
      this.A.a(false);
      this.k.B.c("entityOutlines");
      avc.a();
      this.j.c(true);
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        boolean ☃ = ((this.h.ac() instanceof pr)) && (((pr)this.h.ac()).bJ());
        boolean ☃ = (☃.h(☃, ☃, ☃)) && ((☃.ah) || (☃.a(☃.aR())) || (☃.l == this.h.h)) && ((☃ instanceof wn));
        if ((☃ != this.h.ac()) || (this.h.t.aA != 0) || (☃)) {
          if (☃) {
            this.j.a(☃, ☃);
          }
        }
      }
      this.j.c(false);
      avc.b();
      bfl.a(false);
      this.B.a(☃);
      bfl.e();
      bfl.a(true);
      this.h.b().a(false);
      bfl.m();
      bfl.l();
      bfl.g();
      bfl.c(515);
      bfl.j();
      bfl.d();
    }
    this.k.B.c("entities");
    for (bfr.a ☃ : this.m)
    {
      amy ☃ = this.k.f(☃.a.j());
      ne<pk> ☃ = ☃.s()[(☃.a.j().o() / 16)];
      if (!☃.isEmpty()) {
        for (pk ☃ : ☃)
        {
          boolean ☃ = (this.j.a(☃, ☃, ☃, ☃, ☃)) || (☃.l == this.h.h);
          if (☃)
          {
            boolean ☃ = (this.h.ac() instanceof pr) ? ((pr)this.h.ac()).bJ() : false;
            if (((☃ != this.h.ac()) || (this.h.t.aA != 0) || (☃)) && (
            
              (☃.t < 0.0D) || (☃.t >= 256.0D) || (this.k.e(new cj(☃)))))
            {
              this.S += 1;
              this.j.a(☃, ☃);
            }
          }
          else if ((!☃) && ((☃ instanceof xd)))
          {
            this.h.af().b(☃, ☃);
          }
        }
      }
    }
    this.k.B.c("blockentities");
    avc.b();
    for (bfr.a ☃ : this.m)
    {
      List<akw> ☃ = ☃.a.g().b();
      if (!☃.isEmpty()) {
        for (akw ☃ : ☃) {
          bhc.a.a(☃, ☃, -1);
        }
      }
    }
    synchronized (this.n)
    {
      for (akw ☃ : this.n) {
        bhc.a.a(☃, ☃, -1);
      }
    }
    s();
    Iterator<kw> ☃ = this.x.values().iterator();
    while (☃.hasNext())
    {
      kw ☃ = (kw)☃.next();
      cj ☃ = ☃.b();
      akw ☃ = this.k.s(☃);
      if ((☃ instanceof aky))
      {
        aky ☃ = (aky)☃;
        if (☃.h != null)
        {
          ☃ = ☃.a(cq.e);
          ☃ = this.k.s(☃);
        }
        else if (☃.f != null)
        {
          ☃ = ☃.a(cq.c);
          ☃ = this.k.s(☃);
        }
      }
      afh ☃ = this.k.p(☃).c();
      if ((☃ != null) && (((☃ instanceof afs)) || ((☃ instanceof agp)) || ((☃ instanceof ajl)) || ((☃ instanceof ajm)))) {
        bhc.a.a(☃, ☃, ☃.c());
      }
    }
    t();
    
    this.h.o.h();
    
    this.h.A.b();
  }
  
  public String f()
  {
    int ☃ = this.o.f.length;
    int ☃ = 0;
    for (bfr.a ☃ : this.m)
    {
      bhq ☃ = ☃.a.b;
      if ((☃ != bhq.a) && (!☃.a())) {
        ☃++;
      }
    }
    return String.format("C: %d/%d %sD: %d, %s", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), this.h.G ? "(s) " : "", Integer.valueOf(this.P), this.N.a() });
  }
  
  public String g()
  {
    return "E: " + this.S + "/" + this.R + ", B: " + this.T + ", I: " + (this.R - this.T - this.S);
  }
  
  public void a(pk ☃, double ☃, bia ☃, int ☃, boolean ☃)
  {
    if (this.h.t.c != this.P) {
      a();
    }
    this.k.B.a("camera");
    double ☃ = ☃.s - this.C;
    double ☃ = ☃.t - this.D;
    double ☃ = ☃.u - this.E;
    if ((this.F != ☃.ae) || (this.G != ☃.af) || (this.H != ☃.ag) || (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 16.0D))
    {
      this.C = ☃.s;
      this.D = ☃.t;
      this.E = ☃.u;
      this.F = ☃.ae;
      this.G = ☃.af;
      this.H = ☃.ag;
      
      this.o.a(☃.s, ☃.u);
    }
    this.k.B.c("renderlistcamera");
    
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    this.O.a(☃, ☃, ☃);
    
    this.k.B.c("cull");
    if (this.V != null)
    {
      bic ☃ = new bic(this.V);
      ☃.a(this.X.a, this.X.b, this.X.c);
      ☃ = ☃;
    }
    this.h.A.c("culling");
    
    cj ☃ = new cj(☃, ☃ + ☃.aS(), ☃);
    bht ☃ = this.o.a(☃);
    cj ☃ = new cj(ns.c(☃ / 16.0D) * 16, ns.c(☃ / 16.0D) * 16, ns.c(☃ / 16.0D) * 16);
    
    this.ac = ((this.ac) || (!this.l.isEmpty()) || (☃.s != this.I) || (☃.t != this.J) || (☃.u != this.K) || (☃.z != this.L) || (☃.y != this.M));
    
    this.I = ☃.s;
    this.J = ☃.t;
    this.K = ☃.u;
    this.L = ☃.z;
    this.M = ☃.y;
    
    boolean ☃ = this.V != null;
    if ((!☃) && (this.ac))
    {
      this.ac = false;
      this.m = Lists.newArrayList();
      
      Queue<bfr.a> ☃ = Lists.newLinkedList();
      
      boolean ☃ = this.h.G;
      if (☃ == null)
      {
        int ☃ = ☃.o() > 0 ? 248 : 8;
        for (int ☃ = -this.P; ☃ <= this.P; ☃++) {
          for (int ☃ = -this.P; ☃ <= this.P; ☃++)
          {
            bht ☃ = this.o.a(new cj((☃ << 4) + 8, ☃, (☃ << 4) + 8));
            if ((☃ != null) && (☃.a(☃.c)))
            {
              ☃.a(☃);
              ☃.add(new bfr.a(☃, null, 0, null));
            }
          }
        }
      }
      else
      {
        boolean ☃ = false;
        bfr.a ☃ = new bfr.a(☃, null, 0, null);
        
        Set<cq> ☃ = c(☃);
        if (☃.size() == 1)
        {
          Vector3f ☃ = a(☃, ☃);
          cq ☃ = cq.a(☃.x, ☃.y, ☃.z).d();
          ☃.remove(☃);
        }
        if (☃.isEmpty()) {
          ☃ = true;
        }
        if ((!☃) || (☃))
        {
          if ((☃) && (this.k.p(☃).c().c())) {
            ☃ = false;
          }
          ☃.a(☃);
          ☃.add(☃);
        }
        else
        {
          this.m.add(☃);
        }
      }
      while (!☃.isEmpty())
      {
        bfr.a ☃ = (bfr.a)☃.poll();
        bht ☃ = ☃.a;
        cq ☃ = ☃.b;
        cj ☃ = ☃.j();
        
        this.m.add(☃);
        for (cq ☃ : cq.values())
        {
          bht ☃ = a(☃, ☃, ☃);
          if ((!☃) || (!☃.c.contains(☃.d()))) {
            if ((!☃) || (☃ == null) || (☃.g().a(☃.d(), ☃))) {
              if (☃ != null) {
                if (☃.a(☃)) {
                  if (☃.a(☃.c))
                  {
                    bfr.a ☃ = new bfr.a(☃, ☃, ☃.d + 1, null);
                    ☃.c.addAll(☃.c);
                    ☃.c.add(☃);
                    
                    ☃.add(☃);
                  }
                }
              }
            }
          }
        }
      }
    }
    if (this.U)
    {
      a(☃, ☃, ☃);
      
      this.U = false;
    }
    this.N.e();
    Set<bht> ☃ = this.l;
    this.l = Sets.newLinkedHashSet();
    for (bfr.a ☃ : this.m)
    {
      bht ☃ = ☃.a;
      if ((☃.l()) || (☃.contains(☃)))
      {
        this.ac = true;
        if (a(☃, ☃.a))
        {
          this.h.A.a("build near");
          this.N.b(☃);
          ☃.a(false);
          this.h.A.b();
        }
        else
        {
          this.l.add(☃);
        }
      }
    }
    this.l.addAll(☃);
    
    this.h.A.b();
  }
  
  private boolean a(cj ☃, bht ☃)
  {
    cj ☃ = ☃.j();
    if (ns.a(☃.n() - ☃.n()) > 16) {
      return false;
    }
    if (ns.a(☃.o() - ☃.o()) > 16) {
      return false;
    }
    if (ns.a(☃.p() - ☃.p()) > 16) {
      return false;
    }
    return true;
  }
  
  private Set<cq> c(cj ☃)
  {
    bhw ☃ = new bhw();
    cj ☃ = new cj(☃.n() >> 4 << 4, ☃.o() >> 4 << 4, ☃.p() >> 4 << 4);
    
    amy ☃ = this.k.f(☃);
    for (cj.a ☃ : cj.b(☃, ☃.a(15, 15, 15))) {
      if (☃.a(☃).c()) {
        ☃.a(☃);
      }
    }
    return ☃.b(☃);
  }
  
  private bht a(cj ☃, bht ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃);
    if (ns.a(☃.n() - ☃.n()) > this.P * 16) {
      return null;
    }
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return null;
    }
    if (ns.a(☃.p() - ☃.p()) > this.P * 16) {
      return null;
    }
    return this.o.a(☃);
  }
  
  private void a(double ☃, double ☃, double ☃)
  {
    this.V = new bib();
    ((bib)this.V).b();
    bqq ☃ = new bqq(this.V.c);
    ☃.transpose();
    
    bqq ☃ = new bqq(this.V.b);
    ☃.transpose();
    
    bqq ☃ = new bqq();
    bqq.mul(☃, ☃, ☃);
    ☃.invert();
    
    this.X.a = ☃;
    this.X.b = ☃;
    this.X.c = ☃;
    
    this.W[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
    this.W[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
    this.W[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
    this.W[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
    
    this.W[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
    this.W[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
    this.W[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.W[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      bqq.transform(☃, this.W[☃], this.W[☃]);
      this.W[☃].x /= this.W[☃].w;
      this.W[☃].y /= this.W[☃].w;
      this.W[☃].z /= this.W[☃].w;
      this.W[☃].w = 1.0F;
    }
  }
  
  protected Vector3f a(pk ☃, double ☃)
  {
    float ☃ = (float)(☃.B + (☃.z - ☃.B) * ☃);
    float ☃ = (float)(☃.A + (☃.y - ☃.A) * ☃);
    if (ave.A().t.aA == 2) {
      ☃ += 180.0F;
    }
    float ☃ = ns.b(-☃ * 0.017453292F - 3.1415927F);
    float ☃ = ns.a(-☃ * 0.017453292F - 3.1415927F);
    float ☃ = -ns.b(-☃ * 0.017453292F);
    float ☃ = ns.a(-☃ * 0.017453292F);
    
    return new Vector3f(☃ * ☃, ☃, ☃ * ☃);
  }
  
  public int a(adf ☃, double ☃, int ☃, pk ☃)
  {
    
    if (☃ == adf.d)
    {
      this.h.A.a("translucent_sort");
      
      double ☃ = ☃.s - this.Z;
      double ☃ = ☃.t - this.aa;
      double ☃ = ☃.u - this.ab;
      int ☃;
      if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 1.0D)
      {
        this.Z = ☃.s;
        this.aa = ☃.t;
        this.ab = ☃.u;
        
        ☃ = 0;
        for (bfr.a ☃ : this.m) {
          if ((☃.a.b.d(☃)) && (☃++ < 15)) {
            this.N.c(☃.a);
          }
        }
      }
      this.h.A.b();
    }
    this.h.A.a("filterempty");
    
    int ☃ = 0;
    
    boolean ☃ = ☃ == adf.d;
    int ☃ = ☃ ? this.m.size() - 1 : 0;
    int ☃ = ☃ ? -1 : this.m.size();
    int ☃ = ☃ ? -1 : 1;
    for (int ☃ = ☃; ☃ != ☃; ☃ += ☃)
    {
      bht ☃ = ((bfr.a)this.m.get(☃)).a;
      if (!☃.g().b(☃))
      {
        ☃++;
        
        this.O.a(☃, ☃);
      }
    }
    this.h.A.c("render_" + ☃);
    a(☃);
    
    this.h.A.b();
    return ☃;
  }
  
  private void a(adf ☃)
  {
    this.h.o.i();
    if (bqs.f())
    {
      GL11.glEnableClientState(32884);
      bqs.l(bqs.q);
      GL11.glEnableClientState(32888);
      bqs.l(bqs.r);
      GL11.glEnableClientState(32888);
      bqs.l(bqs.q);
      GL11.glEnableClientState(32886);
    }
    this.O.a(☃);
    if (bqs.f())
    {
      List<bmv> ☃ = bms.a.h();
      for (bmv ☃ : ☃)
      {
        bmv.b ☃ = ☃.b();
        int ☃ = ☃.d();
        switch (bfr.2.a[☃.ordinal()])
        {
        case 1: 
          GL11.glDisableClientState(32884);
          break;
        case 2: 
          bqs.l(bqs.q + ☃);
          GL11.glDisableClientState(32888);
          bqs.l(bqs.q);
          break;
        case 3: 
          GL11.glDisableClientState(32886);
          bfl.G();
        }
      }
    }
    this.h.o.h();
  }
  
  private void a(Iterator<kw> ☃)
  {
    while (☃.hasNext())
    {
      kw ☃ = (kw)☃.next();
      
      int ☃ = ☃.d();
      if (this.w - ☃ > 400) {
        ☃.remove();
      }
    }
  }
  
  public void j()
  {
    this.w += 1;
    if (this.w % 20 == 0) {
      a(this.x.values().iterator());
    }
  }
  
  private void r()
  {
    bfl.n();
    bfl.c();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    avc.a();
    
    bfl.a(false);
    this.i.a(f);
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    for (int ☃ = 0; ☃ < 6; ☃++)
    {
      bfl.E();
      if (☃ == 1) {
        bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
      }
      if (☃ == 2) {
        bfl.b(-90.0F, 1.0F, 0.0F, 0.0F);
      }
      if (☃ == 3) {
        bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
      }
      if (☃ == 4) {
        bfl.b(90.0F, 0.0F, 0.0F, 1.0F);
      }
      if (☃ == 5) {
        bfl.b(-90.0F, 0.0F, 0.0F, 1.0F);
      }
      ☃.a(7, bms.i);
      ☃.b(-100.0D, -100.0D, -100.0D).a(0.0D, 0.0D).b(40, 40, 40, 255).d();
      ☃.b(-100.0D, -100.0D, 100.0D).a(0.0D, 16.0D).b(40, 40, 40, 255).d();
      ☃.b(100.0D, -100.0D, 100.0D).a(16.0D, 16.0D).b(40, 40, 40, 255).d();
      ☃.b(100.0D, -100.0D, -100.0D).a(16.0D, 0.0D).b(40, 40, 40, 255).d();
      ☃.b();
      
      bfl.F();
    }
    bfl.a(true);
    bfl.w();
    bfl.d();
  }
  
  public void a(float ☃, int ☃)
  {
    if (this.h.f.t.q() == 1)
    {
      r();
      return;
    }
    if (!this.h.f.t.d()) {
      return;
    }
    bfl.x();
    
    aui ☃ = this.k.a(this.h.ac(), ☃);
    float ☃ = (float)☃.a;
    float ☃ = (float)☃.b;
    float ☃ = (float)☃.c;
    if (☃ != 2)
    {
      float ☃ = (☃ * 30.0F + ☃ * 59.0F + ☃ * 11.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    bfl.c(☃, ☃, ☃);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    bfl.a(false);
    
    bfl.m();
    bfl.c(☃, ☃, ☃);
    if (this.Y)
    {
      this.u.a();
      GL11.glEnableClientState(32884);
      GL11.glVertexPointer(3, 5126, 12, 0L);
      this.u.a(7);
      this.u.b();
      GL11.glDisableClientState(32884);
    }
    else
    {
      bfl.o(this.q);
    }
    bfl.n();
    bfl.c();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    avc.a();
    
    float[] ☃ = this.k.t.a(this.k.c(☃), ☃);
    if (☃ != null)
    {
      bfl.x();
      bfl.j(7425);
      
      bfl.E();
      
      bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(ns.a(this.k.d(☃)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(90.0F, 0.0F, 0.0F, 1.0F);
      
      float ☃ = ☃[0];
      float ☃ = ☃[1];
      float ☃ = ☃[2];
      if (☃ != 2)
      {
        float ☃ = (☃ * 30.0F + ☃ * 59.0F + ☃ * 11.0F) / 100.0F;
        float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
        float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
        
        ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
      }
      ☃.a(6, bms.f);
      ☃.b(0.0D, 100.0D, 0.0D).a(☃, ☃, ☃, ☃[3]).d();
      int ☃ = 16;
      for (int ☃ = 0; ☃ <= 16; ☃++)
      {
        float ☃ = ☃ * 3.1415927F * 2.0F / 16.0F;
        float ☃ = ns.a(☃);
        float ☃ = ns.b(☃);
        ☃.b(☃ * 120.0F, ☃ * 120.0F, -☃ * 40.0F * ☃[3]).a(☃[0], ☃[1], ☃[2], 0.0F).d();
      }
      ☃.b();
      
      bfl.F();
      bfl.j(7424);
    }
    bfl.w();
    bfl.a(770, 1, 1, 0);
    bfl.E();
    
    float ☃ = 1.0F - this.k.j(☃);
    bfl.c(1.0F, 1.0F, 1.0F, ☃);
    bfl.b(-90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(this.k.c(☃) * 360.0F, 1.0F, 0.0F, 0.0F);
    
    float ☃ = 30.0F;
    this.i.a(d);
    ☃.a(7, bms.g);
    ☃.b(-☃, 100.0D, -☃).a(0.0D, 0.0D).d();
    ☃.b(☃, 100.0D, -☃).a(1.0D, 0.0D).d();
    ☃.b(☃, 100.0D, ☃).a(1.0D, 1.0D).d();
    ☃.b(-☃, 100.0D, ☃).a(0.0D, 1.0D).d();
    ☃.b();
    
    ☃ = 20.0F;
    this.i.a(c);
    int ☃ = this.k.x();
    int ☃ = ☃ % 4;
    int ☃ = ☃ / 4 % 2;
    float ☃ = (☃ + 0) / 4.0F;
    float ☃ = (☃ + 0) / 2.0F;
    float ☃ = (☃ + 1) / 4.0F;
    float ☃ = (☃ + 1) / 2.0F;
    ☃.a(7, bms.g);
    ☃.b(-☃, -100.0D, ☃).a(☃, ☃).d();
    ☃.b(☃, -100.0D, ☃).a(☃, ☃).d();
    ☃.b(☃, -100.0D, -☃).a(☃, ☃).d();
    ☃.b(-☃, -100.0D, -☃).a(☃, ☃).d();
    ☃.b();
    
    bfl.x();
    float ☃ = this.k.g(☃) * ☃;
    if (☃ > 0.0F)
    {
      bfl.c(☃, ☃, ☃, ☃);
      if (this.Y)
      {
        this.t.a();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(3, 5126, 12, 0L);
        this.t.a(7);
        this.t.b();
        GL11.glDisableClientState(32884);
      }
      else
      {
        bfl.o(this.p);
      }
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    bfl.k();
    bfl.d();
    bfl.m();
    
    bfl.F();
    bfl.x();
    bfl.c(0.0F, 0.0F, 0.0F);
    
    double ☃ = this.h.h.e(☃).b - this.k.X();
    if (☃ < 0.0D)
    {
      bfl.E();
      bfl.b(0.0F, 12.0F, 0.0F);
      if (this.Y)
      {
        this.v.a();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(3, 5126, 12, 0L);
        this.v.a(7);
        this.v.b();
        GL11.glDisableClientState(32884);
      }
      else
      {
        bfl.o(this.r);
      }
      bfl.F();
      
      float ☃ = 1.0F;
      float ☃ = -(float)(☃ + 65.0D);
      float ☃ = -1.0F;
      float ☃ = ☃;
      
      ☃.a(7, bms.f);
      ☃.b(-1.0D, ☃, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, ☃, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      
      ☃.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, ☃, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, ☃, -1.0D).b(0, 0, 0, 255).d();
      
      ☃.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, ☃, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, ☃, -1.0D).b(0, 0, 0, 255).d();
      
      ☃.b(-1.0D, ☃, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, ☃, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      
      ☃.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      ☃.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
      ☃.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
      ☃.b();
    }
    if (this.k.t.g()) {
      bfl.c(☃ * 0.2F + 0.04F, ☃ * 0.2F + 0.04F, ☃ * 0.6F + 0.1F);
    } else {
      bfl.c(☃, ☃, ☃);
    }
    bfl.E();
    bfl.b(0.0F, -(float)(☃ - 16.0D), 0.0F);
    bfl.o(this.r);
    bfl.F();
    bfl.w();
    
    bfl.a(true);
  }
  
  public void b(float ☃, int ☃)
  {
    if (!this.h.f.t.d()) {
      return;
    }
    if (this.h.t.e() == 2)
    {
      c(☃, ☃);
      return;
    }
    bfl.p();
    float ☃ = (float)(this.h.ac().Q + (this.h.ac().t - this.h.ac().Q) * ☃);
    int ☃ = 32;
    int ☃ = 8;
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    this.i.a(e);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    
    aui ☃ = this.k.e(☃);
    float ☃ = (float)☃.a;
    float ☃ = (float)☃.b;
    float ☃ = (float)☃.c;
    if (☃ != 2)
    {
      float ☃ = (☃ * 30.0F + ☃ * 59.0F + ☃ * 11.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    float ☃ = 4.8828125E-4F;
    
    double ☃ = this.w + ☃;
    double ☃ = this.h.ac().p + (this.h.ac().s - this.h.ac().p) * ☃ + ☃ * 0.029999999329447746D;
    double ☃ = this.h.ac().r + (this.h.ac().u - this.h.ac().r) * ☃;
    int ☃ = ns.c(☃ / 2048.0D);
    int ☃ = ns.c(☃ / 2048.0D);
    ☃ -= ☃ * 2048;
    ☃ -= ☃ * 2048;
    
    float ☃ = this.k.t.f() - ☃ + 0.33F;
    float ☃ = (float)(☃ * 4.8828125E-4D);
    float ☃ = (float)(☃ * 4.8828125E-4D);
    
    ☃.a(7, bms.i);
    for (int ☃ = 65280; ☃ < 256; ☃ += 32) {
      for (int ☃ = 65280; ☃ < 256; ☃ += 32)
      {
        ☃.b(☃ + 0, ☃, ☃ + 32).a((☃ + 0) * 4.8828125E-4F + ☃, (☃ + 32) * 4.8828125E-4F + ☃).a(☃, ☃, ☃, 0.8F).d();
        ☃.b(☃ + 32, ☃, ☃ + 32).a((☃ + 32) * 4.8828125E-4F + ☃, (☃ + 32) * 4.8828125E-4F + ☃).a(☃, ☃, ☃, 0.8F).d();
        ☃.b(☃ + 32, ☃, ☃ + 0).a((☃ + 32) * 4.8828125E-4F + ☃, (☃ + 0) * 4.8828125E-4F + ☃).a(☃, ☃, ☃, 0.8F).d();
        ☃.b(☃ + 0, ☃, ☃ + 0).a((☃ + 0) * 4.8828125E-4F + ☃, (☃ + 0) * 4.8828125E-4F + ☃).a(☃, ☃, ☃, 0.8F).d();
      }
    }
    ☃.b();
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.o();
  }
  
  public boolean a(double ☃, double ☃, double ☃, float ☃)
  {
    return false;
  }
  
  private void c(float ☃, int ☃)
  {
    bfl.p();
    float ☃ = (float)(this.h.ac().Q + (this.h.ac().t - this.h.ac().Q) * ☃);
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    float ☃ = 12.0F;
    float ☃ = 4.0F;
    
    double ☃ = this.w + ☃;
    double ☃ = (this.h.ac().p + (this.h.ac().s - this.h.ac().p) * ☃ + ☃ * 0.029999999329447746D) / 12.0D;
    double ☃ = (this.h.ac().r + (this.h.ac().u - this.h.ac().r) * ☃) / 12.0D + 0.33000001311302185D;
    float ☃ = this.k.t.f() - ☃ + 0.33F;
    int ☃ = ns.c(☃ / 2048.0D);
    int ☃ = ns.c(☃ / 2048.0D);
    ☃ -= ☃ * 2048;
    ☃ -= ☃ * 2048;
    
    this.i.a(e);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    
    aui ☃ = this.k.e(☃);
    float ☃ = (float)☃.a;
    float ☃ = (float)☃.b;
    float ☃ = (float)☃.c;
    if (☃ != 2)
    {
      float ☃ = (☃ * 30.0F + ☃ * 59.0F + ☃ * 11.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      float ☃ = (☃ * 30.0F + ☃ * 70.0F) / 100.0F;
      
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    float ☃ = ☃ * 0.9F;
    float ☃ = ☃ * 0.9F;
    float ☃ = ☃ * 0.9F;
    
    float ☃ = ☃ * 0.7F;
    float ☃ = ☃ * 0.7F;
    float ☃ = ☃ * 0.7F;
    
    float ☃ = ☃ * 0.8F;
    float ☃ = ☃ * 0.8F;
    float ☃ = ☃ * 0.8F;
    
    float ☃ = 0.00390625F;
    
    float ☃ = ns.c(☃) * 0.00390625F;
    float ☃ = ns.c(☃) * 0.00390625F;
    float ☃ = (float)(☃ - ns.c(☃));
    float ☃ = (float)(☃ - ns.c(☃));
    
    int ☃ = 8;
    
    int ☃ = 4;
    float ☃ = 9.765625E-4F;
    
    bfl.a(12.0F, 1.0F, 12.0F);
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      if (☃ == 0) {
        bfl.a(false, false, false, false);
      } else {
        switch (☃)
        {
        case 0: 
          bfl.a(false, true, true, true);
          break;
        case 1: 
          bfl.a(true, false, false, true);
          break;
        case 2: 
          bfl.a(true, true, true, true);
        }
      }
      for (int ☃ = -3; ☃ <= 4; ☃++) {
        for (int ☃ = -3; ☃ <= 4; ☃++)
        {
          ☃.a(7, bms.l);
          
          float ☃ = ☃ * 8;
          float ☃ = ☃ * 8;
          float ☃ = ☃ - ☃;
          float ☃ = ☃ - ☃;
          if (☃ > -5.0F)
          {
            ☃.b(☃ + 0.0F, ☃ + 0.0F, ☃ + 8.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            ☃.b(☃ + 8.0F, ☃ + 0.0F, ☃ + 8.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            ☃.b(☃ + 8.0F, ☃ + 0.0F, ☃ + 0.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            ☃.b(☃ + 0.0F, ☃ + 0.0F, ☃ + 0.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, -1.0F, 0.0F).d();
          }
          if (☃ <= 5.0F)
          {
            ☃.b(☃ + 0.0F, ☃ + 4.0F - 9.765625E-4F, ☃ + 8.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            ☃.b(☃ + 8.0F, ☃ + 4.0F - 9.765625E-4F, ☃ + 8.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            ☃.b(☃ + 8.0F, ☃ + 4.0F - 9.765625E-4F, ☃ + 0.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            ☃.b(☃ + 0.0F, ☃ + 4.0F - 9.765625E-4F, ☃ + 0.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 1.0F, 0.0F).d();
          }
          if (☃ > -1) {
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              ☃.b(☃ + ☃ + 0.0F, ☃ + 0.0F, ☃ + 8.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 0.0F, ☃ + 4.0F, ☃ + 8.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 0.0F, ☃ + 4.0F, ☃ + 0.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 0.0F, ☃ + 0.0F, ☃ + 0.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
            }
          }
          if (☃ <= 1) {
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              ☃.b(☃ + ☃ + 1.0F - 9.765625E-4F, ☃ + 0.0F, ☃ + 8.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 1.0F - 9.765625E-4F, ☃ + 4.0F, ☃ + 8.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 8.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 1.0F - 9.765625E-4F, ☃ + 4.0F, ☃ + 0.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              ☃.b(☃ + ☃ + 1.0F - 9.765625E-4F, ☃ + 0.0F, ☃ + 0.0F).a((☃ + ☃ + 0.5F) * 0.00390625F + ☃, (☃ + 0.0F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(1.0F, 0.0F, 0.0F).d();
            }
          }
          if (☃ > -1) {
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              ☃.b(☃ + 0.0F, ☃ + 4.0F, ☃ + ☃ + 0.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              ☃.b(☃ + 8.0F, ☃ + 4.0F, ☃ + ☃ + 0.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              ☃.b(☃ + 8.0F, ☃ + 0.0F, ☃ + ☃ + 0.0F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              ☃.b(☃ + 0.0F, ☃ + 0.0F, ☃ + ☃ + 0.0F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, -1.0F).d();
            }
          }
          if (☃ <= 1) {
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              ☃.b(☃ + 0.0F, ☃ + 4.0F, ☃ + ☃ + 1.0F - 9.765625E-4F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              ☃.b(☃ + 8.0F, ☃ + 4.0F, ☃ + ☃ + 1.0F - 9.765625E-4F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              ☃.b(☃ + 8.0F, ☃ + 0.0F, ☃ + ☃ + 1.0F - 9.765625E-4F).a((☃ + 8.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              ☃.b(☃ + 0.0F, ☃ + 0.0F, ☃ + ☃ + 1.0F - 9.765625E-4F).a((☃ + 0.0F) * 0.00390625F + ☃, (☃ + ☃ + 0.5F) * 0.00390625F + ☃).a(☃, ☃, ☃, 0.8F).c(0.0F, 0.0F, 1.0F).d();
            }
          }
          ☃.b();
        }
      }
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.o();
  }
  
  public void a(long ☃)
  {
    this.ac |= this.N.a(☃);
    if (!this.l.isEmpty())
    {
      Iterator<bht> ☃ = this.l.iterator();
      while (☃.hasNext())
      {
        bht ☃ = (bht)☃.next();
        if (!this.N.a(☃)) {
          break;
        }
        ☃.a(false);
        ☃.remove();
        
        long ☃ = ☃ - System.nanoTime();
        if (☃ < 0L) {
          break;
        }
      }
    }
  }
  
  public void a(pk ☃, float ☃)
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    ams ☃ = this.k.af();
    
    double ☃ = this.h.t.c * 16;
    if ((☃.s < ☃.d() - ☃) && (☃.s > ☃.b() + ☃) && (☃.u < ☃.e() - ☃) && (☃.u > ☃.c() + ☃)) {
      return;
    }
    double ☃ = 1.0D - ☃.a(☃) / ☃;
    ☃ = Math.pow(☃, 4.0D);
    
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    
    bfl.l();
    bfl.a(770, 1, 1, 0);
    this.i.a(g);
    
    bfl.a(false);
    bfl.E();
    
    int ☃ = ☃.a().a();
    float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
    float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
    float ☃ = (☃ & 0xFF) / 255.0F;
    bfl.c(☃, ☃, ☃, (float)☃);
    bfl.a(-3.0F, -3.0F);
    bfl.q();
    bfl.a(516, 0.1F);
    bfl.d();
    bfl.p();
    
    float ☃ = (float)(ave.J() % 3000L) / 3000.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 128.0F;
    ☃.a(7, bms.g);
    ☃.c(-☃, -☃, -☃);
    
    double ☃ = Math.max(ns.c(☃ - ☃), ☃.c());
    double ☃ = Math.min(ns.f(☃ + ☃), ☃.e());
    if (☃ > ☃.d() - ☃)
    {
      float ☃ = 0.0F;
      for (double ☃ = ☃; ☃ < ☃; ☃ += 0.5F)
      {
        double ☃ = Math.min(1.0D, ☃ - ☃);
        float ☃ = (float)☃ * 0.5F;
        ☃.b(☃.d(), 256.0D, ☃).a(☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃.d(), 256.0D, ☃ + ☃).a(☃ + ☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃.d(), 0.0D, ☃ + ☃).a(☃ + ☃ + ☃, ☃ + 128.0F).d();
        ☃.b(☃.d(), 0.0D, ☃).a(☃ + ☃, ☃ + 128.0F).d();☃ += 1.0D;
      }
    }
    if (☃ < ☃.b() + ☃)
    {
      float ☃ = 0.0F;
      for (double ☃ = ☃; ☃ < ☃; ☃ += 0.5F)
      {
        double ☃ = Math.min(1.0D, ☃ - ☃);
        float ☃ = (float)☃ * 0.5F;
        ☃.b(☃.b(), 256.0D, ☃).a(☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃.b(), 256.0D, ☃ + ☃).a(☃ + ☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃.b(), 0.0D, ☃ + ☃).a(☃ + ☃ + ☃, ☃ + 128.0F).d();
        ☃.b(☃.b(), 0.0D, ☃).a(☃ + ☃, ☃ + 128.0F).d();☃ += 1.0D;
      }
    }
    ☃ = Math.max(ns.c(☃ - ☃), ☃.b());
    ☃ = Math.min(ns.f(☃ + ☃), ☃.d());
    if (☃ > ☃.e() - ☃)
    {
      float ☃ = 0.0F;
      for (double ☃ = ☃; ☃ < ☃; ☃ += 0.5F)
      {
        double ☃ = Math.min(1.0D, ☃ - ☃);
        float ☃ = (float)☃ * 0.5F;
        ☃.b(☃, 256.0D, ☃.e()).a(☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃ + ☃, 256.0D, ☃.e()).a(☃ + ☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃ + ☃, 0.0D, ☃.e()).a(☃ + ☃ + ☃, ☃ + 128.0F).d();
        ☃.b(☃, 0.0D, ☃.e()).a(☃ + ☃, ☃ + 128.0F).d();☃ += 1.0D;
      }
    }
    if (☃ < ☃.c() + ☃)
    {
      float ☃ = 0.0F;
      for (double ☃ = ☃; ☃ < ☃; ☃ += 0.5F)
      {
        double ☃ = Math.min(1.0D, ☃ - ☃);
        float ☃ = (float)☃ * 0.5F;
        ☃.b(☃, 256.0D, ☃.c()).a(☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃ + ☃, 256.0D, ☃.c()).a(☃ + ☃ + ☃, ☃ + 0.0F).d();
        ☃.b(☃ + ☃, 0.0D, ☃.c()).a(☃ + ☃ + ☃, ☃ + 128.0F).d();
        ☃.b(☃, 0.0D, ☃.c()).a(☃ + ☃, ☃ + 128.0F).d();☃ += 1.0D;
      }
    }
    ☃.b();
    ☃.c(0.0D, 0.0D, 0.0D);
    
    bfl.o();
    bfl.c();
    bfl.a(0.0F, 0.0F);
    bfl.r();
    bfl.d();
    bfl.k();
    
    bfl.F();
    bfl.a(true);
  }
  
  private void s()
  {
    bfl.a(774, 768, 1, 0);
    bfl.l();
    
    bfl.c(1.0F, 1.0F, 1.0F, 0.5F);
    bfl.a(-3.0F, -3.0F);
    bfl.q();
    bfl.a(516, 0.1F);
    bfl.d();
    
    bfl.E();
  }
  
  private void t()
  {
    bfl.c();
    bfl.a(0.0F, 0.0F);
    bfl.r();
    bfl.d();
    
    bfl.a(true);
    bfl.F();
  }
  
  public void a(bfx ☃, bfd ☃, pk ☃, float ☃)
  {
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    if (!this.x.isEmpty())
    {
      this.i.a(bmh.g);
      s();
      
      ☃.a(7, bms.a);
      ☃.c(-☃, -☃, -☃);
      ☃.c();
      
      Iterator<kw> ☃ = this.x.values().iterator();
      while (☃.hasNext())
      {
        kw ☃ = (kw)☃.next();
        cj ☃ = ☃.b();
        double ☃ = ☃.n() - ☃;
        double ☃ = ☃.o() - ☃;
        double ☃ = ☃.p() - ☃;
        afh ☃ = this.k.p(☃).c();
        if ((!(☃ instanceof afs)) && (!(☃ instanceof agp)) && (!(☃ instanceof ajl)) && (!(☃ instanceof ajm))) {
          if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 1024.0D)
          {
            ☃.remove();
          }
          else
          {
            alz ☃ = this.k.p(☃);
            if (☃.c().t() != arm.a)
            {
              int ☃ = ☃.c();
              bmi ☃ = this.z[☃];
              bgd ☃ = this.h.ae();
              ☃.a(☃, ☃, ☃, this.k);
            }
          }
        }
      }
      ☃.b();
      ☃.c(0.0D, 0.0D, 0.0D);
      t();
    }
  }
  
  public void a(wn ☃, auh ☃, int ☃, float ☃)
  {
    if ((☃ == 0) && (☃.a == auh.a.b))
    {
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.c(0.0F, 0.0F, 0.0F, 0.4F);
      GL11.glLineWidth(2.0F);
      bfl.x();
      bfl.a(false);
      float ☃ = 0.002F;
      
      cj ☃ = ☃.a();
      afh ☃ = this.k.p(☃).c();
      if ((☃.t() != arm.a) && (this.k.af().a(☃)))
      {
        ☃.a(this.k, ☃);
        double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
        double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
        double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
        a(☃.b(this.k, ☃).b(0.0020000000949949026D, 0.0020000000949949026D, 0.0020000000949949026D).c(-☃, -☃, -☃));
      }
      bfl.a(true);
      bfl.w();
      bfl.k();
    }
  }
  
  public static void a(aug ☃)
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    ☃.a(3, bms.e);
    ☃.b(☃.a, ☃.b, ☃.c).d();
    ☃.b(☃.d, ☃.b, ☃.c).d();
    ☃.b(☃.d, ☃.b, ☃.f).d();
    ☃.b(☃.a, ☃.b, ☃.f).d();
    ☃.b(☃.a, ☃.b, ☃.c).d();
    ☃.b();
    
    ☃.a(3, bms.e);
    ☃.b(☃.a, ☃.e, ☃.c).d();
    ☃.b(☃.d, ☃.e, ☃.c).d();
    ☃.b(☃.d, ☃.e, ☃.f).d();
    ☃.b(☃.a, ☃.e, ☃.f).d();
    ☃.b(☃.a, ☃.e, ☃.c).d();
    ☃.b();
    
    ☃.a(1, bms.e);
    ☃.b(☃.a, ☃.b, ☃.c).d();
    ☃.b(☃.a, ☃.e, ☃.c).d();
    ☃.b(☃.d, ☃.b, ☃.c).d();
    ☃.b(☃.d, ☃.e, ☃.c).d();
    ☃.b(☃.d, ☃.b, ☃.f).d();
    ☃.b(☃.d, ☃.e, ☃.f).d();
    ☃.b(☃.a, ☃.b, ☃.f).d();
    ☃.b(☃.a, ☃.e, ☃.f).d();
    ☃.b();
  }
  
  public static void a(aug ☃, int ☃, int ☃, int ☃, int ☃)
  {
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    ☃.a(3, bms.f);
    ☃.b(☃.a, ☃.b, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.b, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.b, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.b, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.b, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b();
    
    ☃.a(3, bms.f);
    ☃.b(☃.a, ☃.e, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.e, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.e, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.e, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.e, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b();
    
    ☃.a(1, bms.f);
    ☃.b(☃.a, ☃.b, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.e, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.b, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.e, ☃.c).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.b, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.d, ☃.e, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.b, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃.a, ☃.e, ☃.f).b(☃, ☃, ☃, ☃).d();
    ☃.b();
  }
  
  private void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.o.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(cj ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    b(☃ - 1, ☃ - 1, ☃ - 1, ☃ + 1, ☃ + 1, ☃ + 1);
  }
  
  public void b(cj ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    b(☃ - 1, ☃ - 1, ☃ - 1, ☃ + 1, ☃ + 1, ☃ + 1);
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    b(☃ - 1, ☃ - 1, ☃ - 1, ☃ + 1, ☃ + 1, ☃ + 1);
  }
  
  public void a(String ☃, cj ☃)
  {
    bpj ☃ = (bpj)this.y.get(☃);
    if (☃ != null)
    {
      this.h.W().b(☃);
      this.y.remove(☃);
    }
    if (☃ != null)
    {
      aak ☃ = aak.b(☃);
      if (☃ != null) {
        this.h.q.a(☃.g());
      }
      ☃ = bpf.a(new jy(☃), ☃.n(), ☃.o(), ☃.p());
      this.y.put(☃, ☃);
      this.h.W().a(☃);
    }
  }
  
  public void a(String ☃, double ☃, double ☃, double ☃, float ☃, float ☃) {}
  
  public void a(wn ☃, String ☃, double ☃, double ☃, double ☃, float ☃, float ☃) {}
  
  public void a(int ☃, boolean ☃, final double ☃, double ☃, final double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    try
    {
      b(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Exception while adding particle");
      c ☃ = ☃.a("Particle being added");
      
      ☃.a("ID", Integer.valueOf(☃));
      if (☃ != null) {
        ☃.a("Parameters", ☃);
      }
      ☃.a("Position", new Callable()
      {
        public String a()
          throws Exception
        {
          return c.a(☃, ☃, this.c);
        }
      });
      throw new e(☃);
    }
  }
  
  private void a(cy ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    a(☃.c(), ☃.e(), ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private beb b(int ☃, boolean ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    if ((this.h == null) || (this.h.ac() == null) || (this.h.j == null)) {
      return null;
    }
    int ☃ = this.h.t.aL;
    if (☃ == 1) {
      if (this.k.s.nextInt(3) == 0) {
        ☃ = 2;
      }
    }
    double ☃ = this.h.ac().s - ☃;
    double ☃ = this.h.ac().t - ☃;
    double ☃ = this.h.ac().u - ☃;
    if (☃) {
      return this.h.j.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    double ☃ = 16.0D;
    if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 256.0D) {
      return null;
    }
    if (☃ > 1) {
      return null;
    }
    return this.h.j.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(pk ☃) {}
  
  public void b(pk ☃) {}
  
  public void k() {}
  
  public void a(int ☃, cj ☃, int ☃)
  {
    switch (☃)
    {
    case 1013: 
    case 1018: 
      if (this.h.ac() != null)
      {
        double ☃ = ☃.n() - this.h.ac().s;
        double ☃ = ☃.o() - this.h.ac().t;
        double ☃ = ☃.p() - this.h.ac().u;
        
        double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
        double ☃ = this.h.ac().s;
        double ☃ = this.h.ac().t;
        double ☃ = this.h.ac().u;
        if (☃ > 0.0D)
        {
          ☃ += ☃ / ☃ * 2.0D;
          ☃ += ☃ / ☃ * 2.0D;
          ☃ += ☃ / ☃ * 2.0D;
        }
        if (☃ == 1013) {
          this.k.a(☃, ☃, ☃, "mob.wither.spawn", 1.0F, 1.0F, false);
        } else {
          this.k.a(☃, ☃, ☃, "mob.enderdragon.end", 5.0F, 1.0F, false);
        }
      }
      break;
    }
  }
  
  public void a(wn ☃, int ☃, cj ☃, int ☃)
  {
    Random ☃ = this.k.s;
    switch (☃)
    {
    case 1001: 
      this.k.a(☃, "random.click", 1.0F, 1.2F, false);
      break;
    case 1000: 
      this.k.a(☃, "random.click", 1.0F, 1.0F, false);
      break;
    case 1002: 
      this.k.a(☃, "random.bow", 1.0F, 1.2F, false);
      break;
    case 2000: 
      int ☃ = ☃ % 3 - 1;
      int ☃ = ☃ / 3 % 3 - 1;
      double ☃ = ☃.n() + ☃ * 0.6D + 0.5D;
      double ☃ = ☃.o() + 0.5D;
      double ☃ = ☃.p() + ☃ * 0.6D + 0.5D;
      for (int ☃ = 0; ☃ < 10; ☃++)
      {
        double ☃ = ☃.nextDouble() * 0.2D + 0.01D;
        double ☃ = ☃ + ☃ * 0.01D + (☃.nextDouble() - 0.5D) * ☃ * 0.5D;
        double ☃ = ☃ + (☃.nextDouble() - 0.5D) * 0.5D;
        double ☃ = ☃ + ☃ * 0.01D + (☃.nextDouble() - 0.5D) * ☃ * 0.5D;
        double ☃ = ☃ * ☃ + ☃.nextGaussian() * 0.01D;
        double ☃ = -0.03D + ☃.nextGaussian() * 0.01D;
        double ☃ = ☃ * ☃ + ☃.nextGaussian() * 0.01D;
        a(cy.l, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
      }
      break;
    case 2003: 
      double ☃ = ☃.n() + 0.5D;
      double ☃ = ☃.o();
      double ☃ = ☃.p() + 0.5D;
      for (int ☃ = 0; ☃ < 8; ☃++) {
        a(cy.K, ☃, ☃, ☃, ☃.nextGaussian() * 0.15D, ☃.nextDouble() * 0.2D, ☃.nextGaussian() * 0.15D, new int[] { zw.b(zy.bH) });
      }
      for (double ☃ = 0.0D; ☃ < 6.283185307179586D; ☃ += 0.15707963267948966D)
      {
        a(cy.y, ☃ + Math.cos(☃) * 5.0D, ☃ - 0.4D, ☃ + Math.sin(☃) * 5.0D, Math.cos(☃) * -5.0D, 0.0D, Math.sin(☃) * -5.0D, new int[0]);
        a(cy.y, ☃ + Math.cos(☃) * 5.0D, ☃ - 0.4D, ☃ + Math.sin(☃) * 5.0D, Math.cos(☃) * -7.0D, 0.0D, Math.sin(☃) * -7.0D, new int[0]);
      }
      break;
    case 2002: 
      double ☃ = ☃.n();
      double ☃ = ☃.o();
      double ☃ = ☃.p();
      for (int ☃ = 0; ☃ < 8; ☃++) {
        a(cy.K, ☃, ☃, ☃, ☃.nextGaussian() * 0.15D, ☃.nextDouble() * 0.2D, ☃.nextGaussian() * 0.15D, new int[] { zw.b(zy.bz), ☃ });
      }
      int ☃ = zy.bz.g(☃);
      
      float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
      float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
      float ☃ = (☃ >> 0 & 0xFF) / 255.0F;
      
      cy ☃ = cy.n;
      if (zy.bz.h(☃)) {
        ☃ = cy.o;
      }
      for (int ☃ = 0; ☃ < 100; ☃++)
      {
        double ☃ = ☃.nextDouble() * 4.0D;
        double ☃ = ☃.nextDouble() * 3.141592653589793D * 2.0D;
        double ☃ = Math.cos(☃) * ☃;
        double ☃ = 0.01D + ☃.nextDouble() * 0.5D;
        double ☃ = Math.sin(☃) * ☃;
        
        beb ☃ = b(☃.c(), ☃.e(), ☃ + ☃ * 0.1D, ☃ + 0.3D, ☃ + ☃ * 0.1D, ☃, ☃, ☃, new int[0]);
        if (☃ != null)
        {
          float ☃ = 0.75F + ☃.nextFloat() * 0.25F;
          ☃.b(☃ * ☃, ☃ * ☃, ☃ * ☃);
          ☃.a((float)☃);
        }
      }
      this.k.a(☃, "game.potion.smash", 1.0F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 2001: 
      afh ☃ = afh.c(☃ & 0xFFF);
      if (☃.t() != arm.a) {
        this.h.W().a(new bpf(new jy(☃.H.a()), (☃.H.d() + 1.0F) / 2.0F, ☃.H.e() * 0.8F, ☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F));
      }
      this.h.j.a(☃, ☃.a(☃ >> 12 & 0xFF));
      break;
    case 2004: 
      for (int ☃ = 0; ☃ < 20; ☃++)
      {
        double ☃ = ☃.n() + 0.5D + (this.k.s.nextFloat() - 0.5D) * 2.0D;
        double ☃ = ☃.o() + 0.5D + (this.k.s.nextFloat() - 0.5D) * 2.0D;
        double ☃ = ☃.p() + 0.5D + (this.k.s.nextFloat() - 0.5D) * 2.0D;
        
        this.k.a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        this.k.a(cy.A, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      break;
    case 2005: 
      ze.a(this.k, ☃, ☃);
      break;
    case 1006: 
      this.k.a(☃, "random.door_close", 1.0F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1003: 
      this.k.a(☃, "random.door_open", 1.0F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1004: 
      this.k.a(☃, "random.fizz", 0.5F, 2.6F + (☃.nextFloat() - ☃.nextFloat()) * 0.8F, false);
      break;
    case 1020: 
      this.k.a(☃, "random.anvil_break", 1.0F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1021: 
      this.k.a(☃, "random.anvil_use", 1.0F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1022: 
      this.k.a(☃, "random.anvil_land", 0.3F, this.k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1005: 
      if ((zw.b(☃) instanceof aak)) {
        this.k.a(☃, "records." + ((aak)zw.b(☃)).a);
      } else {
        this.k.a(☃, null);
      }
      break;
    case 1007: 
      this.k.a(☃, "mob.ghast.charge", 10.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1008: 
      this.k.a(☃, "mob.ghast.fireball", 10.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1010: 
      this.k.a(☃, "mob.zombie.wood", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1012: 
      this.k.a(☃, "mob.zombie.woodbreak", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1011: 
      this.k.a(☃, "mob.zombie.metal", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1009: 
      this.k.a(☃, "mob.ghast.fireball", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1014: 
      this.k.a(☃, "mob.wither.shoot", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1016: 
      this.k.a(☃, "mob.zombie.infect", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1017: 
      this.k.a(☃, "mob.zombie.unfect", 2.0F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1015: 
      this.k.a(☃, "mob.bat.takeoff", 0.05F, (☃.nextFloat() - ☃.nextFloat()) * 0.2F + 1.0F, false);
    }
  }
  
  public void b(int ☃, cj ☃, int ☃)
  {
    if ((☃ < 0) || (☃ >= 10))
    {
      this.x.remove(Integer.valueOf(☃));
    }
    else
    {
      kw ☃ = (kw)this.x.get(Integer.valueOf(☃));
      if ((☃ == null) || (☃.b().n() != ☃.n()) || (☃.b().o() != ☃.o()) || (☃.b().p() != ☃.p()))
      {
        ☃ = new kw(☃, ☃);
        this.x.put(Integer.valueOf(☃), ☃);
      }
      ☃.a(☃);
      ☃.b(this.w);
    }
  }
  
  class a
  {
    final bht a;
    final cq b;
    final Set<cq> c = EnumSet.noneOf(cq.class);
    final int d;
    
    private a(bht ☃, cq ☃, int ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.d = ☃;
    }
  }
  
  public void m()
  {
    this.ac = true;
  }
  
  public void a(Collection<akw> ☃, Collection<akw> ☃)
  {
    synchronized (this.n)
    {
      this.n.removeAll(☃);
      this.n.addAll(☃);
    }
  }
}
