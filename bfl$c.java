import org.lwjgl.opengl.GL11;

class bfl$c
{
  private final int a;
  private boolean b = false;
  private static final String __OBFID = "CL_00002554";
  
  public bfl$c(int p_i46267_1_)
  {
    this.a = p_i46267_1_;
  }
  
  public void a()
  {
    a(false);
  }
  
  public void b()
  {
    a(true);
  }
  
  public void a(boolean p_179199_1_)
  {
    if (p_179199_1_ != this.b)
    {
      this.b = p_179199_1_;
      if (p_179199_1_) {
        GL11.glEnable(this.a);
      } else {
        GL11.glDisable(this.a);
      }
    }
  }
}
