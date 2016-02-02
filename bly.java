import org.lwjgl.opengl.GL11;
import shadersmod.client.MultiTexID;
import shadersmod.client.ShadersTex;

public abstract class bly
  implements bmk
{
  protected int a = -1;
  protected boolean b;
  protected boolean c;
  protected boolean d;
  protected boolean e;
  private static final String __OBFID = "CL_00001047";
  public MultiTexID multiTex;
  
  public void a(boolean p_174937_1_, boolean p_174937_2_)
  {
    this.b = p_174937_1_;
    this.c = p_174937_2_;
    boolean var3 = true;
    boolean var4 = true;
    short var6;
    int var5;
    short var6;
    if (p_174937_1_)
    {
      int var5 = p_174937_2_ ? 9987 : 9729;
      var6 = 9729;
    }
    else
    {
      var5 = p_174937_2_ ? 9986 : 9728;
      var6 = 9728;
    }
    bfl.i(b());
    
    GL11.glTexParameteri(3553, 10241, var5);
    GL11.glTexParameteri(3553, 10240, var6);
  }
  
  public void b(boolean p_174936_1_, boolean p_174936_2_)
  {
    this.d = this.b;
    this.e = this.c;
    a(p_174936_1_, p_174936_2_);
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
    ShadersTex.deleteTextures(this, this.a);
    if (this.a != -1)
    {
      bml.a(this.a);
      this.a = -1;
    }
  }
  
  public MultiTexID getMultiTexID()
  {
    return ShadersTex.getMultiTexID(this);
  }
}
