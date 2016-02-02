public abstract class bhd<T extends akw>
{
  protected static final jy[] a = { new jy("textures/blocks/destroy_stage_0.png"), new jy("textures/blocks/destroy_stage_1.png"), new jy("textures/blocks/destroy_stage_2.png"), new jy("textures/blocks/destroy_stage_3.png"), new jy("textures/blocks/destroy_stage_4.png"), new jy("textures/blocks/destroy_stage_5.png"), new jy("textures/blocks/destroy_stage_6.png"), new jy("textures/blocks/destroy_stage_7.png"), new jy("textures/blocks/destroy_stage_8.png"), new jy("textures/blocks/destroy_stage_9.png") };
  protected bhc b;
  
  public abstract void a(T paramT, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt);
  
  protected void a(jy ☃)
  {
    bmj ☃ = this.b.e;
    if (☃ != null) {
      ☃.a(☃);
    }
  }
  
  protected adm b()
  {
    return this.b.f;
  }
  
  public void a(bhc ☃)
  {
    this.b = ☃;
  }
  
  public avn c()
  {
    return this.b.a();
  }
  
  public boolean a()
  {
    return false;
  }
}
