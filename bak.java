import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class bak
  implements bag, bah
{
  private static final Ordering<bdc> a = Ordering.from(new Comparator()
  {
    public int a(bdc ☃, bdc ☃)
    {
      return ComparisonChain.start().compare(☃.a().getId(), ☃.a().getId()).result();
    }
  });
  private final List<bah> b = Lists.newArrayList();
  
  public bak()
  {
    this(a.sortedCopy(ave.A().u().d()));
  }
  
  public bak(Collection<bdc> ☃)
  {
    for (bdc ☃ : a.sortedCopy(☃)) {
      if (☃.b() != adp.a.e) {
        this.b.add(new bad(☃.a()));
      }
    }
  }
  
  public List<bah> a()
  {
    return this.b;
  }
  
  public eu b()
  {
    return new fa("Select a player to teleport to");
  }
  
  public void a(baf ☃)
  {
    ☃.a(this);
  }
  
  public eu A_()
  {
    return new fa("Teleport to player");
  }
  
  public void a(float ☃, int ☃)
  {
    ave.A().P().a(awm.a);
    avp.a(0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
  }
  
  public boolean B_()
  {
    return !this.b.isEmpty();
  }
}
