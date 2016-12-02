import org.lwjgl.opengl.GL11;

class bfl$c
{
  private final int a;
  private boolean b = false;
  
  public bfl$c(int ☃)
  {
    this.a = ☃;
  }
  
  public void a()
  {
    a(false);
  }
  
  public void b()
  {
    a(true);
  }
  
  public void a(boolean ☃)
  {
    if (☃ != this.b)
    {
      this.b = ☃;
      if (☃) {
        GL11.glEnable(this.a);
      } else {
        GL11.glDisable(this.a);
      }
    }
  }
}
