import org.lwjgl.opengl.GL11;

public abstract class bly
  implements bmk
{
  protected int a = -1;
  protected boolean b;
  protected boolean c;
  protected boolean d;
  protected boolean e;
  
  public void a(boolean ☃, boolean ☃)
  {
    this.b = ☃;
    this.c = ☃;
    
    int ☃ = -1;
    int ☃ = -1;
    if (☃)
    {
      ☃ = ☃ ? 9987 : 9729;
      ☃ = 9729;
    }
    else
    {
      ☃ = ☃ ? 9986 : 9728;
      ☃ = 9728;
    }
    GL11.glTexParameteri(3553, 10241, ☃);
    GL11.glTexParameteri(3553, 10240, ☃);
  }
  
  public void b(boolean ☃, boolean ☃)
  {
    this.d = this.b;
    this.e = this.c;
    a(☃, ☃);
  }
  
  public void a()
  {
    a(this.d, this.e);
  }
  
  public int b()
  {
    if (this.a == -1) {
      this.a = bml.a();
    }
    return this.a;
  }
  
  public void c()
  {
    if (this.a != -1)
    {
      bml.a(this.a);
      this.a = -1;
    }
  }
}
