public class bii
  extends bjo<tk>
{
  private static final jy a = new jy("textures/entity/bat.png");
  
  public bii(biu ☃)
  {
    super(☃, new bav(), 0.25F);
  }
  
  protected jy a(tk ☃)
  {
    return a;
  }
  
  protected void a(tk ☃, float ☃)
  {
    bfl.a(0.35F, 0.35F, 0.35F);
  }
  
  protected void a(tk ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.n()) {
      bfl.b(0.0F, ns.b(☃ * 0.3F) * 0.1F, 0.0F);
    } else {
      bfl.b(0.0F, -0.1F, 0.0F);
    }
    super.a(☃, ☃, ☃, ☃);
  }
}
