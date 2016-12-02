import java.util.Random;

public class afw
  extends afc
{
  public static final amk a = amk.a("triggered");
  
  public afw()
  {
    super(arm.f, arn.q);
    j(M.b().a(a, Boolean.valueOf(false)));
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new akz();
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!D)
    {
      boolean ☃ = ☃.z(☃);
      boolean ☃ = ((Boolean)☃.b(a)).booleanValue();
      if ((☃) && (!☃))
      {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(true)), 4);
        ☃.a(☃, this, a(☃));
      }
      else if ((!☃) && (☃))
      {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(false)), 4);
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akz))
    {
      ((akz)☃).b().a(☃);
      
      ☃.e(☃, this);
    }
  }
  
  public int a(adm ☃)
  {
    return 1;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akz)) {
      return ((akz)☃).b().a(☃);
    }
    return false;
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akz)) {
      return ((akz)☃).b().j();
    }
    return 0;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    akw ☃ = ☃.s(☃);
    if (!(☃ instanceof akz)) {
      return;
    }
    adc ☃ = ((akz)☃).b();
    if (☃.s()) {
      ☃.b(☃.q());
    }
    if (!D) {
      ☃.a(☃.Q().b("sendCommandFeedback"));
    }
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public int b()
  {
    return 3;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf((☃ & 0x1) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    if (((Boolean)☃.b(a)).booleanValue()) {
      ☃ |= 0x1;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, Boolean.valueOf(false));
  }
}
