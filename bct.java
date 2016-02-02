import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bct
{
  public float a;
  public float b;
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
  public boolean j;
  public boolean k;
  public List l;
  public List m;
  public final String n;
  private bbo v;
  public float o;
  public float p;
  public float q;
  private static final String __OBFID = "CL_00000874";
  public List spriteList = new ArrayList();
  public boolean mirrorV = false;
  float savedScale;
  
  public bct(bbo p_i1172_1_, String p_i1172_2_)
  {
    this.a = 64.0F;
    this.b = 32.0F;
    this.j = true;
    this.l = Lists.newArrayList();
    this.v = p_i1172_1_;
    p_i1172_1_.s.add(this);
    this.n = p_i1172_2_;
    b(p_i1172_1_.t, p_i1172_1_.u);
  }
  
  public bct(bbo p_i1173_1_)
  {
    this(p_i1173_1_, (String)null);
  }
  
  public bct(bbo p_i46358_1_, int p_i46358_2_, int p_i46358_3_)
  {
    this(p_i46358_1_);
    a(p_i46358_2_, p_i46358_3_);
  }
  
  public void a(bct p_78792_1_)
  {
    if (this.m == null) {
      this.m = Lists.newArrayList();
    }
    this.m.add(p_78792_1_);
  }
  
  public bct a(int p_78784_1_, int p_78784_2_)
  {
    this.r = p_78784_1_;
    this.s = p_78784_2_;
    return this;
  }
  
  public bct a(String p_78786_1_, float p_78786_2_, float p_78786_3_, float p_78786_4_, int p_78786_5_, int p_78786_6_, int p_78786_7_)
  {
    p_78786_1_ = this.n + "." + p_78786_1_;
    bcu var8 = this.v.a(p_78786_1_);
    a(var8.a, var8.b);
    this.l.add(new bcr(this, this.r, this.s, p_78786_2_, p_78786_3_, p_78786_4_, p_78786_5_, p_78786_6_, p_78786_7_, 0.0F).a(p_78786_1_));
    return this;
  }
  
  public bct a(float p_78789_1_, float p_78789_2_, float p_78789_3_, int p_78789_4_, int p_78789_5_, int p_78789_6_)
  {
    this.l.add(new bcr(this, this.r, this.s, p_78789_1_, p_78789_2_, p_78789_3_, p_78789_4_, p_78789_5_, p_78789_6_, 0.0F));
    return this;
  }
  
  public bct a(float p_178769_1_, float p_178769_2_, float p_178769_3_, int p_178769_4_, int p_178769_5_, int p_178769_6_, boolean p_178769_7_)
  {
    this.l.add(new bcr(this, this.r, this.s, p_178769_1_, p_178769_2_, p_178769_3_, p_178769_4_, p_178769_5_, p_178769_6_, 0.0F, p_178769_7_));
    return this;
  }
  
  public void a(float p_78790_1_, float p_78790_2_, float p_78790_3_, int p_78790_4_, int p_78790_5_, int p_78790_6_, float p_78790_7_)
  {
    this.l.add(new bcr(this, this.r, this.s, p_78790_1_, p_78790_2_, p_78790_3_, p_78790_4_, p_78790_5_, p_78790_6_, p_78790_7_));
  }
  
  public void a(float p_78793_1_, float p_78793_2_, float p_78793_3_)
  {
    this.c = p_78793_1_;
    this.d = p_78793_2_;
    this.e = p_78793_3_;
  }
  
  public void a(float p_78785_1_)
  {
    if (!this.k) {
      if (this.j)
      {
        if (!this.t) {
          d(p_78785_1_);
        }
        bfl.b(this.o, this.p, this.q);
        int var2;
        if ((this.f == 0.0F) && (this.g == 0.0F) && (this.h == 0.0F)) {
          if ((this.c == 0.0F) && (this.d == 0.0F) && (this.e == 0.0F))
          {
            bfl.o(this.u);
            if (this.m == null) {
              break label392;
            }
            for (var2 = 0; var2 < this.m.size();)
            {
              ((bct)this.m.get(var2)).a(p_78785_1_);var2++; continue;
              
              bfl.b(this.c * p_78785_1_, this.d * p_78785_1_, this.e * p_78785_1_);
              bfl.o(this.u);
              if (this.m != null) {
                for (int var2 = 0; var2 < this.m.size(); var2++) {
                  ((bct)this.m.get(var2)).a(p_78785_1_);
                }
              }
              bfl.b(-this.c * p_78785_1_, -this.d * p_78785_1_, -this.e * p_78785_1_); break;
              
              bfl.E();
              bfl.b(this.c * p_78785_1_, this.d * p_78785_1_, this.e * p_78785_1_);
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
                for (int var2 = 0; var2 < this.m.size(); var2++) {
                  ((bct)this.m.get(var2)).a(p_78785_1_);
                }
              }
              bfl.F();
            }
          }
        }
        label392:
        bfl.b(-this.o, -this.p, -this.q);
      }
    }
  }
  
  public void b(float p_78791_1_)
  {
    if (!this.k) {
      if (this.j)
      {
        if (!this.t) {
          d(p_78791_1_);
        }
        bfl.E();
        bfl.b(this.c * p_78791_1_, this.d * p_78791_1_, this.e * p_78791_1_);
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
    }
  }
  
  public void c(float p_78794_1_)
  {
    if (!this.k) {
      if (this.j)
      {
        if (!this.t) {
          d(p_78794_1_);
        }
        if ((this.f == 0.0F) && (this.g == 0.0F) && (this.h == 0.0F))
        {
          if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F)) {
            bfl.b(this.c * p_78794_1_, this.d * p_78794_1_, this.e * p_78794_1_);
          }
        }
        else
        {
          bfl.b(this.c * p_78794_1_, this.d * p_78794_1_, this.e * p_78794_1_);
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
      }
    }
  }
  
  private void d(float p_78788_1_)
  {
    if (this.u == 0)
    {
      this.savedScale = p_78788_1_;
      
      this.u = avd.a(1);
    }
    GL11.glNewList(this.u, 4864);
    bfd var2 = bfx.a().c();
    for (int var3 = 0; var3 < this.l.size(); var3++) {
      ((bcr)this.l.get(var3)).a(var2, p_78788_1_);
    }
    for (int i = 0; i < this.spriteList.size(); i++)
    {
      ModelSprite sprite = (ModelSprite)this.spriteList.get(i);
      sprite.render(bfx.a(), p_78788_1_);
    }
    GL11.glEndList();
    this.t = true;
  }
  
  public bct b(int p_78787_1_, int p_78787_2_)
  {
    this.a = p_78787_1_;
    this.b = p_78787_2_;
    return this;
  }
  
  public void addSprite(float posX, float posY, float posZ, int sizeX, int sizeY, int sizeZ, float sizeAdd)
  {
    this.spriteList.add(new ModelSprite(this, this.r, this.s, posX, posY, posZ, sizeX, sizeY, sizeZ, sizeAdd));
  }
  
  public boolean getCompiled()
  {
    return this.t;
  }
  
  public int getDisplayList()
  {
    return this.u;
  }
  
  public void resetDisplayList()
  {
    if (this.t)
    {
      this.t = false;
      d(this.savedScale);
    }
  }
}
