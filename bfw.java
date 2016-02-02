import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class bfw
{
  public int a;
  public int b;
  public int c;
  public int d;
  public boolean e;
  public int f;
  public int g;
  public int h;
  public float[] i;
  public int j;
  
  public bfw(int ☃, int ☃, boolean ☃)
  {
    this.e = ☃;
    
    this.f = -1;
    this.g = -1;
    this.h = -1;
    
    this.i = new float[4];
    this.i[0] = 1.0F;
    this.i[1] = 1.0F;
    this.i[2] = 1.0F;
    this.i[3] = 0.0F;
    
    a(☃, ☃);
  }
  
  public void a(int ☃, int ☃)
  {
    if (!bqs.i())
    {
      this.c = ☃;
      this.d = ☃;
      return;
    }
    bfl.j();
    if (this.f >= 0) {
      a();
    }
    b(☃, ☃);
    b();
    
    bqs.h(bqs.c, 0);
  }
  
  public void a()
  {
    if (!bqs.i()) {
      return;
    }
    d();
    e();
    if (this.h > -1)
    {
      bqs.h(this.h);
      this.h = -1;
    }
    if (this.g > -1)
    {
      bml.a(this.g);
      this.g = -1;
    }
    if (this.f > -1)
    {
      bqs.h(bqs.c, 0);
      bqs.i(this.f);
      this.f = -1;
    }
  }
  
  public void b(int ☃, int ☃)
  {
    this.c = ☃;
    this.d = ☃;
    
    this.a = ☃;
    this.b = ☃;
    if (!bqs.i())
    {
      f();
      return;
    }
    this.f = bqs.g();
    this.g = bml.a();
    if (this.e) {
      this.h = bqs.h();
    }
    a(9728);
    bfl.i(this.g);
    GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, (ByteBuffer)null);
    
    bqs.h(bqs.c, this.f);
    bqs.a(bqs.c, bqs.e, 3553, this.g, 0);
    if (this.e)
    {
      bqs.i(bqs.d, this.h);
      
      bqs.a(bqs.d, 33190, this.a, this.b);
      
      bqs.b(bqs.c, bqs.f, bqs.d, this.h);
    }
    f();
    d();
  }
  
  public void a(int ☃)
  {
    if (bqs.i())
    {
      this.j = ☃;
      bfl.i(this.g);
      GL11.glTexParameterf(3553, 10241, ☃);
      GL11.glTexParameterf(3553, 10240, ☃);
      GL11.glTexParameterf(3553, 10242, 10496.0F);
      GL11.glTexParameterf(3553, 10243, 10496.0F);
      bfl.i(0);
    }
  }
  
  public void b()
  {
    int ☃ = bqs.j(bqs.c);
    if (☃ == bqs.g) {
      return;
    }
    if (☃ == bqs.h) {
      throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
    }
    if (☃ == bqs.i) {
      throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
    }
    if (☃ == bqs.j) {
      throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
    }
    if (☃ == bqs.k) {
      throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
    }
    throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + ☃);
  }
  
  public void c()
  {
    if (bqs.i()) {
      bfl.i(this.g);
    }
  }
  
  public void d()
  {
    if (bqs.i()) {
      bfl.i(0);
    }
  }
  
  public void a(boolean ☃)
  {
    if (bqs.i())
    {
      bqs.h(bqs.c, this.f);
      if (☃) {
        bfl.b(0, 0, this.c, this.d);
      }
    }
  }
  
  public void e()
  {
    if (bqs.i()) {
      bqs.h(bqs.c, 0);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃)
  {
    this.i[0] = ☃;
    this.i[1] = ☃;
    this.i[2] = ☃;
    this.i[3] = ☃;
  }
  
  public void c(int ☃, int ☃)
  {
    a(☃, ☃, true);
  }
  
  public void a(int ☃, int ☃, boolean ☃)
  {
    if (!bqs.i()) {
      return;
    }
    bfl.a(true, true, true, false);
    bfl.i();
    bfl.a(false);
    
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, ☃, ☃, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
    
    bfl.b(0, 0, ☃, ☃);
    
    bfl.w();
    bfl.f();
    bfl.c();
    if (☃)
    {
      bfl.k();
      bfl.g();
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    c();
    
    float ☃ = ☃;
    float ☃ = ☃;
    float ☃ = this.c / this.a;
    float ☃ = this.d / this.b;
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.i);
    ☃.b(0.0D, ☃, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    ☃.b(☃, ☃, 0.0D).a(☃, 0.0D).b(255, 255, 255, 255).d();
    ☃.b(☃, 0.0D, 0.0D).a(☃, ☃).b(255, 255, 255, 255).d();
    ☃.b(0.0D, 0.0D, 0.0D).a(0.0D, ☃).b(255, 255, 255, 255).d();
    ☃.b();
    
    d();
    
    bfl.a(true);
    bfl.a(true, true, true, true);
  }
  
  public void f()
  {
    a(true);
    bfl.a(this.i[0], this.i[1], this.i[2], this.i[3]);
    int ☃ = 16384;
    if (this.e)
    {
      bfl.a(1.0D);
      ☃ |= 0x100;
    }
    bfl.m(☃);
    e();
  }
}
