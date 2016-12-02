public class ays
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/crafting_table.png");
  
  public ays(wm ☃, adm ☃)
  {
    this(☃, ☃, cj.a);
  }
  
  public ays(wm ☃, adm ☃, cj ☃)
  {
    super(new xq(☃, ☃, ☃));
  }
  
  protected void b(int ☃, int ☃)
  {
    q.a(bnq.a("container.crafting", new Object[0]), 28, 6, 4210752);
    q.a(bnq.a("container.inventory", new Object[0]), 8, g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(u);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
  }
}
