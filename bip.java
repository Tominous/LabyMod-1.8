public class bip
  extends biv<pk>
{
  public bip(biu renderManagerIn)
  {
    super(renderManagerIn);
  }
  
  public void a(pk entity, double x, double y, double z, float entityYaw, float partialTicks)
  {
    bfl.E();
    a(entity.aR(), x - entity.P, y - entity.Q, z - entity.R);
    bfl.F();
    super.a(entity, x, y, z, entityYaw, partialTicks);
  }
  
  protected jy a(pk entity)
  {
    return null;
  }
}
