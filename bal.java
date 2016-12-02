import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Random;

public class bal
  implements bag, bah
{
  private final List<bah> a = Lists.newArrayList();
  
  public bal()
  {
    ave ☃ = ave.A();
    for (aul ☃ : ☃.f.Z().g()) {
      this.a.add(new bal.a(☃));
    }
  }
  
  public List<bah> a()
  {
    return this.a;
  }
  
  public eu b()
  {
    return new fa("Select a team to teleport to");
  }
  
  public void a(baf ☃)
  {
    ☃.a(this);
  }
  
  public eu A_()
  {
    return new fa("Teleport to team member");
  }
  
  public void a(float ☃, int ☃)
  {
    ave.A().P().a(awm.a);
    avp.a(0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
  }
  
  public boolean B_()
  {
    for (bah ☃ : this.a) {
      if (☃.B_()) {
        return true;
      }
    }
    return false;
  }
  
  class a
    implements bah
  {
    private final aul b;
    private final jy c;
    private final List<bdc> d;
    
    public a(aul ☃)
    {
      this.b = ☃;
      
      this.d = Lists.newArrayList();
      for (String ☃ : ☃.d())
      {
        bdc ☃ = ave.A().u().a(☃);
        if (☃ != null) {
          this.d.add(☃);
        }
      }
      if (!this.d.isEmpty())
      {
        String ☃ = ((bdc)this.d.get(new Random().nextInt(this.d.size()))).a().getName();
        this.c = bet.c(☃);
        bet.a(this.c, ☃);
      }
      else
      {
        this.c = bmz.a();
      }
    }
    
    public void a(baf ☃)
    {
      ☃.a(new bak(this.d));
    }
    
    public eu A_()
    {
      return new fa(this.b.c());
    }
    
    public void a(float ☃, int ☃)
    {
      int ☃ = -1;
      String ☃ = avn.b(this.b.e());
      if (☃.length() >= 2) {
        ☃ = ave.A().k.b(☃.charAt(1));
      }
      if (☃ >= 0)
      {
        float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
        float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
        float ☃ = (☃ & 0xFF) / 255.0F;
        avp.a(1, 1, 15, 15, ns.b(☃ * ☃, ☃ * ☃, ☃ * ☃) | ☃ << 24);
      }
      ave.A().P().a(this.c);
      bfl.c(☃, ☃, ☃, ☃ / 255.0F);
      avp.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
      avp.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
    }
    
    public boolean B_()
    {
      return !this.d.isEmpty();
    }
  }
}
