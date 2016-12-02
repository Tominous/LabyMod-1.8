import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;

public class u
  extends i
{
  public String c()
  {
    return "clone";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.clone.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 9) {
      throw new cf("commands.clone.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    cj ☃ = a(☃, ☃, 3, false);
    cj ☃ = a(☃, ☃, 6, false);
    
    aqe ☃ = new aqe(☃, ☃);
    aqe ☃ = new aqe(☃, ☃.a(☃.b()));
    
    int ☃ = ☃.c() * ☃.d() * ☃.e();
    if (☃ > 32768) {
      throw new bz("commands.clone.tooManyBlocks", new Object[] { Integer.valueOf(☃), Integer.valueOf(32768) });
    }
    boolean ☃ = false;
    afh ☃ = null;
    int ☃ = -1;
    if (((☃.length < 11) || ((!☃[10].equals("force")) && (!☃[10].equals("move")))) && (☃.a(☃))) {
      throw new bz("commands.clone.noOverlap", new Object[0]);
    }
    if ((☃.length >= 11) && (☃[10].equals("move"))) {
      ☃ = true;
    }
    if ((b < 0) || (e >= 256) || (b < 0) || (e >= 256)) {
      throw new bz("commands.clone.outOfWorld", new Object[0]);
    }
    adm ☃ = ☃.e();
    if ((!☃.a(☃)) || (!☃.a(☃))) {
      throw new bz("commands.clone.outOfWorld", new Object[0]);
    }
    boolean ☃ = false;
    if (☃.length >= 10) {
      if (☃[9].equals("masked"))
      {
        ☃ = true;
      }
      else if (☃[9].equals("filtered"))
      {
        if (☃.length >= 12) {
          ☃ = g(☃, ☃[11]);
        } else {
          throw new cf("commands.clone.usage", new Object[0]);
        }
        if (☃.length >= 13) {
          ☃ = a(☃[12], 0, 15);
        }
      }
    }
    List<u.a> ☃ = Lists.newArrayList();
    List<u.a> ☃ = Lists.newArrayList();
    List<u.a> ☃ = Lists.newArrayList();
    LinkedList<cj> ☃ = Lists.newLinkedList();
    
    cj ☃ = new cj(a - a, b - b, c - c);
    for (int ☃ = c; ☃ <= f; ☃++) {
      for (int ☃ = b; ☃ <= e; ☃++) {
        for (int ☃ = a; ☃ <= d; ☃++)
        {
          cj ☃ = new cj(☃, ☃, ☃);
          cj ☃ = ☃.a(☃);
          
          alz ☃ = ☃.p(☃);
          if ((!☃) || (☃.c() != afi.a)) {
            if (☃ != null)
            {
              if (☃.c() == ☃) {
                if ((☃ >= 0) && (☃.c().c(☃) != ☃)) {}
              }
            }
            else
            {
              akw ☃ = ☃.s(☃);
              if (☃ != null)
              {
                dn ☃ = new dn();
                ☃.b(☃);
                ☃.add(new u.a(☃, ☃, ☃));
                ☃.addLast(☃);
              }
              else if ((☃.c().o()) || (☃.c().d()))
              {
                ☃.add(new u.a(☃, ☃, null));
                ☃.addLast(☃);
              }
              else
              {
                ☃.add(new u.a(☃, ☃, null));
                ☃.addFirst(☃);
              }
            }
          }
        }
      }
    }
    if (☃)
    {
      for (cj ☃ : ☃)
      {
        akw ☃ = ☃.s(☃);
        if ((☃ instanceof og)) {
          ((og)☃).l();
        }
        ☃.a(☃, afi.cv.Q(), 2);
      }
      for (cj ☃ : ☃) {
        ☃.a(☃, afi.a.Q(), 3);
      }
    }
    List<u.a> ☃ = Lists.newArrayList();
    ☃.addAll(☃);
    ☃.addAll(☃);
    ☃.addAll(☃);
    
    List<u.a> ☃ = Lists.reverse(☃);
    for (u.a ☃ : ☃)
    {
      akw ☃ = ☃.s(a);
      if ((☃ instanceof og)) {
        ((og)☃).l();
      }
      ☃.a(a, afi.cv.Q(), 2);
    }
    ☃ = 0;
    for (u.a ☃ : ☃) {
      if (☃.a(a, b, 2)) {
        ☃++;
      }
    }
    for (u.a ☃ : ☃)
    {
      akw ☃ = ☃.s(a);
      if ((c != null) && (☃ != null))
      {
        c.a("x", a.n());
        c.a("y", a.o());
        c.a("z", a.p());
        ☃.a(c);
        ☃.p_();
      }
      ☃.a(a, b, 2);
    }
    for (u.a ☃ : ☃) {
      ☃.b(a, b.c());
    }
    List<adw> ☃ = ☃.a(☃, false);
    if (☃ != null) {
      for (adw ☃ : ☃) {
        if (☃.b(a))
        {
          cj ☃ = a.a(☃);
          ☃.b(☃, ☃.a(), (int)(b - ☃.P().f()), c);
        }
      }
    }
    if (☃ <= 0) {
      throw new bz("commands.clone.failed", new Object[0]);
    }
    ☃.a(n.a.b, ☃);
    a(☃, this, "commands.clone.success", new Object[] { Integer.valueOf(☃) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    if ((☃.length > 3) && (☃.length <= 6)) {
      return a(☃, 3, ☃);
    }
    if ((☃.length > 6) && (☃.length <= 9)) {
      return a(☃, 6, ☃);
    }
    if (☃.length == 10) {
      return a(☃, new String[] { "replace", "masked", "filtered" });
    }
    if (☃.length == 11) {
      return a(☃, new String[] { "normal", "force", "move" });
    }
    if ((☃.length == 12) && ("filtered".equals(☃[9]))) {
      return a(☃, afh.c.c());
    }
    return null;
  }
  
  static class a
  {
    public final cj a;
    public final alz b;
    public final dn c;
    
    public a(cj ☃, alz ☃, dn ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
    }
  }
}
