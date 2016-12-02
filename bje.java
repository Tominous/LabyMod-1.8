public class bje<T extends ps>
  extends bjo<T>
{
  private static final jy j = new jy("textures/entity/steve.png");
  protected bbj a;
  protected float e;
  
  public bje(biu ☃, bbj ☃, float ☃)
  {
    this(☃, ☃, ☃, 1.0F);
    
    a(new bky(this));
  }
  
  public bje(biu ☃, bbj ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃);
    a = ☃;
    e = ☃;
    
    a(new bks(e));
  }
  
  protected jy a(T ☃)
  {
    return j;
  }
  
  public void C_()
  {
    bfl.b(0.0F, 0.1875F, 0.0F);
  }
}
