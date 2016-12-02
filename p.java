import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class p
  extends i
{
  public String c()
  {
    return "achievement";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.achievement.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.achievement.usage", new Object[0]);
    }
    final mw ☃ = na.a(☃[1]);
    if ((☃ == null) && (!☃[1].equals("*"))) {
      throw new bz("commands.achievement.unknownAchievement", new Object[] { ☃[1] });
    }
    final lf ☃ = ☃.length >= 3 ? a(☃, ☃[2]) : b(☃);
    boolean ☃ = ☃[0].equalsIgnoreCase("give");
    boolean ☃ = ☃[0].equalsIgnoreCase("take");
    if ((!☃) && (!☃)) {
      return;
    }
    if (☃ == null)
    {
      if (☃)
      {
        for (mq ☃ : mr.e) {
          ☃.b(☃);
        }
        a(☃, this, "commands.achievement.give.success.all", new Object[] { ☃.e_() });
      }
      else if (☃)
      {
        for (mq ☃ : Lists.reverse(mr.e)) {
          ☃.a(☃);
        }
        a(☃, this, "commands.achievement.take.success.all", new Object[] { ☃.e_() });
      }
      return;
    }
    if ((☃ instanceof mq))
    {
      mq ☃ = (mq)☃;
      if (☃)
      {
        if (☃.A().a(☃)) {
          throw new bz("commands.achievement.alreadyHave", new Object[] { ☃.e_(), ☃.j() });
        }
        List<mq> ☃ = Lists.newArrayList();
        while ((c != null) && (!☃.A().a(c)))
        {
          ☃.add(c);
          ☃ = c;
        }
        for (mq ☃ : Lists.reverse(☃)) {
          ☃.b(☃);
        }
      }
      else if (☃)
      {
        if (!☃.A().a(☃)) {
          throw new bz("commands.achievement.dontHave", new Object[] { ☃.e_(), ☃.j() });
        }
        List<mq> ☃ = Lists.newArrayList(Iterators.filter(mr.e.iterator(), new Predicate()
        {
          public boolean a(mq ☃)
          {
            return (☃.A().a(☃)) && (☃ != ☃);
          }
        }));
        List<mq> ☃ = Lists.newArrayList(☃);
        for (mq ☃ : ☃)
        {
          mq ☃ = ☃;
          boolean ☃ = false;
          while (☃ != null)
          {
            if (☃ == ☃) {
              ☃ = true;
            }
            ☃ = c;
          }
          if (!☃)
          {
            ☃ = ☃;
            while (☃ != null)
            {
              ☃.remove(☃);
              ☃ = c;
            }
          }
        }
        for (mq ☃ : ☃) {
          ☃.a(☃);
        }
      }
    }
    if (☃)
    {
      ☃.b(☃);
      a(☃, this, "commands.achievement.give.success.one", new Object[] { ☃.e_(), ☃.j() });
    }
    else if (☃)
    {
      ☃.a(☃);
      a(☃, this, "commands.achievement.take.success.one", new Object[] { ☃.j(), ☃.e_() });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "give", "take" });
    }
    if (☃.length == 2)
    {
      List<String> ☃ = Lists.newArrayList();
      for (mw ☃ : na.b) {
        ☃.add(e);
      }
      return a(☃, ☃);
    }
    if (☃.length == 3) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 2;
  }
}
