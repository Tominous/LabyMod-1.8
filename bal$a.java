import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Random;

class bal$a
  implements bah
{
  private final aul b;
  private final jy c;
  private final List<bdc> d;
  
  public bal$a(bal arg1, aul ☃)
  {
    b = ☃;
    
    d = Lists.newArrayList();
    for (String ☃ : ☃.d())
    {
      bdc ☃ = ave.A().u().a(☃);
      if (☃ != null) {
        d.add(☃);
      }
    }
    if (!d.isEmpty())
    {
      String ☃ = ((bdc)d.get(new Random().nextInt(d.size()))).a().getName();
      c = bet.c(☃);
      bet.a(c, ☃);
    }
    else
    {
      c = bmz.a();
    }
  }
  
  public void a(baf ☃)
  {
    ☃.a(new bak(d));
  }
  
  public eu A_()
  {
    return new fa(b.c());
  }
  
  public void a(float ☃, int ☃)
  {
    int ☃ = -1;
    String ☃ = avn.b(b.e());
    if (☃.length() >= 2) {
      ☃ = Ak.b(☃.charAt(1));
    }
    if (☃ >= 0)
    {
      float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
      float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
      float ☃ = (☃ & 0xFF) / 255.0F;
      avp.a(1, 1, 15, 15, ns.b(☃ * ☃, ☃ * ☃, ☃ * ☃) | ☃ << 24);
    }
    ave.A().P().a(c);
    bfl.c(☃, ☃, ☃, ☃ / 255.0F);
    avp.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
    avp.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
  }
  
  public boolean B_()
  {
    return !d.isEmpty();
  }
}
