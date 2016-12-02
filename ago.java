import java.util.List;
import java.util.Random;

public class ago
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amk b = amk.a("eye");
  
  public ago()
  {
    super(arm.e, arn.C);
    j(M.b().a(a, cq.c).a(b, Boolean.valueOf(false)));
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    if (((Boolean)☃.p(☃).b(b)).booleanValue())
    {
      a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    j();
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, ☃.aP().d()).a(b, Boolean.valueOf(false));
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    if (((Boolean)☃.p(☃).b(b)).booleanValue()) {
      return 15;
    }
    return 0;
  }
  
  public alz a(int ☃)
  {
    return Q().a(b, Boolean.valueOf((☃ & 0x4) != 0)).a(a, cq.b(☃ & 0x3));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).b();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x4;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
