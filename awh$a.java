import com.google.common.collect.ComparisonChain;
import com.mojang.authlib.GameProfile;
import java.util.Comparator;

class awh$a
  implements Comparator<bdc>
{
  public int a(bdc p_compare_1_, bdc p_compare_2_)
  {
    aul scoreplayerteam = p_compare_1_.i();
    aul scoreplayerteam1 = p_compare_2_.i();
    return ComparisonChain.start().compareTrueFirst(p_compare_1_.b() != adp.a.e, p_compare_2_.b() != adp.a.e).compare(scoreplayerteam != null ? scoreplayerteam.b() : "", scoreplayerteam1 != null ? scoreplayerteam1.b() : "").compare(p_compare_1_.a().getName(), p_compare_2_.a().getName()).result();
  }
}
