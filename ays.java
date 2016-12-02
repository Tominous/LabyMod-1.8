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
    this.q.a(bnq.a("container.crafting", new Object[0]), 28, 6, 4210752);
    this.q.a(bnq.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(u);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
  }
}
