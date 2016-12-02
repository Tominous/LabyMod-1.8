import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bct
{
  public float a = 64.0F;
  public float b = 32.0F;
  private int r;
  private int s;
  public float c;
  public float d;
  public float e;
  public float f;
  public float g;
  public float h;
  private boolean t;
  private int u;
  public boolean i;
  public boolean j = true;
  public boolean k;
  public List<bcr> l = Lists.newArrayList();
  public List<bct> m;
  public final String n;
  private bbo v;
  public float o;
  public float p;
  public float q;
  
  public bct(bbo ☃, String ☃)
  {
    this.v = ☃;
    ☃.s.add(this);
    this.n = ☃;
    b(☃.t, ☃.u);
  }
  
  public bct(bbo ☃)
  {
    this(☃, null);
  }
  
  public bct(bbo ☃, int ☃, int ☃)
  {
    this(☃);
    a(☃, ☃);
  }
  
  public void a(bct ☃)
  {
    if (this.m == null) {
      this.m = Lists.newArrayList();
    }
    this.m.add(☃);
  }
  
  public bct a(int ☃, int ☃)
  {
    this.r = ☃;
    this.s = ☃;
    return this;
  }
  
  public bct a(String ☃, float ☃, float ☃, float ☃, int ☃, int ☃, int ☃)
  {
    ☃ = this.n + "." + ☃;
    bcu ☃ = this.v.a(☃);
    a(☃.a, ☃.b);
    this.l.add(new bcr(this, this.r, this.s, ☃, ☃, ☃, ☃, ☃, ☃, 0.0F).a(☃));
    return this;
  }
  
  public bct a(float ☃, float ☃, float ☃, int ☃, int ☃, int ☃)
  {
    this.l.add(new bcr(this, this.r, this.s, ☃, ☃, ☃, ☃, ☃, ☃, 0.0F));
    return this;
  }
  
  public bct a(float ☃, float ☃, float ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    this.l.add(new bcr(this, this.r, this.s, ☃, ☃, ☃, ☃, ☃, ☃, 0.0F, ☃));
    return this;
  }
  
  public void a(float ☃, float ☃, float ☃, int ☃, int ☃, int ☃, float ☃)
  {
    this.l.add(new bcr(this, this.r, this.s, ☃, ☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(float ☃, float ☃, float ☃)
  {
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
  }
  
  public void a(float ☃)
  {
    if (this.k) {
      return;
    }
    if (!this.j) {
      return;
    }
    if (!this.t) {
      d(☃);
    }
    bfl.b(this.o, this.p, this.q);
    if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F))
    {
      bfl.E();
      bfl.b(this.c * ☃, this.d * ☃, this.e * ☃);
      if (this.h != 0.0F) {
        bfl.b(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
      }
      if (this.g != 0.0F) {
        bfl.b(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
      }
      if (this.f != 0.0F) {
        bfl.b(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
      }
      bfl.o(this.u);
      if (this.m != null) {
        for (int ☃ = 0; ☃ < this.m.size(); ☃++) {
          ((bct)this.m.get(☃)).a(☃);
        }
      }
      bfl.F();
    }
    else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F))
    {
      bfl.b(this.c * ☃, this.d * ☃, this.e * ☃);
      bfl.o(this.u);
      if (this.m != null) {
        for (int ☃ = 0; ☃ < this.m.size(); ☃++) {
          ((bct)this.m.get(☃)).a(☃);
        }
      }
      bfl.b(-this.c * ☃, -this.d * ☃, -this.e * ☃);
    }
    else
    {
      bfl.o(this.u);
      if (this.m != null) {
        for (int ☃ = 0; ☃ < this.m.size(); ☃++) {
          ((bct)this.m.get(☃)).a(☃);
        }
      }
    }
    bfl.b(-this.o, -this.p, -this.q);
  }
  
  public void b(float ☃)
  {
    if (this.k) {
      return;
    }
    if (!this.j) {
      return;
    }
    if (!this.t) {
      d(☃);
    }
    bfl.E();
    bfl.b(this.c * ☃, this.d * ☃, this.e * ☃);
    if (this.g != 0.0F) {
      bfl.b(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
    }
    if (this.f != 0.0F) {
      bfl.b(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
    }
    if (this.h != 0.0F) {
      bfl.b(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
    }
    bfl.o(this.u);
    bfl.F();
  }
  
  public void c(float ☃)
  {
    if (this.k) {
      return;
    }
    if (!this.j) {
      return;
    }
    if (!this.t) {
      d(☃);
    }
    if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F))
    {
      bfl.b(this.c * ☃, this.d * ☃, this.e * ☃);
      if (this.h != 0.0F) {
        bfl.b(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
      }
      if (this.g != 0.0F) {
        bfl.b(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
      }
      if (this.f != 0.0F) {
        bfl.b(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
      }
    }
    else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F))
    {
      bfl.b(this.c * ☃, this.d * ☃, this.e * ☃);
    }
  }
  
  private void d(float ☃)
  {
    this.u = avd.a(1);
    
    GL11.glNewList(this.u, 4864);
    bfd ☃ = bfx.a().c();
    for (int ☃ = 0; ☃ < this.l.size(); ☃++) {
      ((bcr)this.l.get(☃)).a(☃, ☃);
    }
    GL11.glEndList();
    
    this.t = true;
  }
  
  public bct b(int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    return this;
  }
}
