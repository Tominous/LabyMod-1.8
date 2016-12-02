public class big
  extends bjl<um>
{
  public static final jy a = new jy("textures/entity/armorstand/wood.png");
  
  public big(biu ☃)
  {
    super(☃, new bat(), 0.0F);
    bkx ☃ = new bkx(this)
    {
      protected void a()
      {
        this.c = new bas(0.5F);
        this.d = new bas(1.0F);
      }
    };
    a(☃);
    a(new bky(this));
    a(new bks(a().e));
  }
  
  protected jy a(um ☃)
  {
    return a;
  }
  
  public bat a()
  {
    return (bat)super.b();
  }
  
  protected void a(um ☃, float ☃, float ☃, float ☃)
  {
    bfl.b(180.0F - ☃, 0.0F, 1.0F, 0.0F);
  }
  
  protected boolean b(um ☃)
  {
    return ☃.aN();
  }
}
