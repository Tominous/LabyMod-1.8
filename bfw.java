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
    e = ☃;
    
    f = -1;
    g = -1;
    h = -1;
    
    i = new float[4];
    i[0] = 1.0F;
    i[1] = 1.0F;
    i[2] = 1.0F;
    i[3] = 0.0F;
    
    a(☃, ☃);
  }
  
  public void a(int ☃, int ☃)
  {
    if (!bqs.i())
    {
      c = ☃;
      d = ☃;
      return;
    }
    bfl.j();
    if (f >= 0) {
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
    if (h > -1)
    {
      bqs.h(h);
      h = -1;
    }
    if (g > -1)
    {
      bml.a(g);
      g = -1;
    }
    if (f > -1)
    {
      bqs.h(bqs.c, 0);
      bqs.i(f);
      f = -1;
    }
  }
  
  public void b(int ☃, int ☃)
  {
    c = ☃;
    d = ☃;
    
    a = ☃;
    b = ☃;
    if (!bqs.i())
    {
      f();
      return;
    }
    f = bqs.g();
    g = bml.a();
    if (e) {
      h = bqs.h();
    }
    a(9728);
    bfl.i(g);
    GL11.glTexImage2D(3553, 0, 32856, a, b, 0, 6408, 5121, (ByteBuffer)null);
    
    bqs.h(bqs.c, f);
    bqs.a(bqs.c, bqs.e, 3553, g, 0);
    if (e)
    {
      bqs.i(bqs.d, h);
      
      bqs.a(bqs.d, 33190, a, b);
      
      bqs.b(bqs.c, bqs.f, bqs.d, h);
    }
    f();
    d();
  }
  
  public void a(int ☃)
  {
    if (bqs.i())
    {
      j = ☃;
      bfl.i(g);
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
      bfl.i(g);
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
      bqs.h(bqs.c, f);
      if (☃) {
        bfl.b(0, 0, c, d);
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
    i[0] = ☃;
    i[1] = ☃;
    i[2] = ☃;
    i[3] = ☃;
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
    float ☃ = c / a;
    float ☃ = d / b;
    
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
    bfl.a(i[0], i[1], i[2], i[3]);
    int ☃ = 16384;
    if (e)
    {
      bfl.a(1.0D);
      ☃ |= 0x100;
    }
    bfl.m(☃);
    e();
  }
}
