import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public abstract class i
  implements k
{
  private static h a;
  
  public int a()
  {
    return 4;
  }
  
  public List<String> b()
  {
    return Collections.emptyList();
  }
  
  public boolean a(m ☃)
  {
    return ☃.a(a(), c());
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    return null;
  }
  
  public static int a(String ☃)
    throws cb
  {
    try
    {
      return Integer.parseInt(☃);
    }
    catch (NumberFormatException ☃)
    {
      throw new cb("commands.generic.num.invalid", new Object[] { ☃ });
    }
  }
  
  public static int a(String ☃, int ☃)
    throws cb
  {
    return a(☃, ☃, Integer.MAX_VALUE);
  }
  
  public static int a(String ☃, int ☃, int ☃)
    throws cb
  {
    int ☃ = a(☃);
    if (☃ < ☃) {
      throw new cb("commands.generic.num.tooSmall", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃) });
    }
    if (☃ > ☃) {
      throw new cb("commands.generic.num.tooBig", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃) });
    }
    return ☃;
  }
  
  public static long b(String ☃)
    throws cb
  {
    try
    {
      return Long.parseLong(☃);
    }
    catch (NumberFormatException ☃)
    {
      throw new cb("commands.generic.num.invalid", new Object[] { ☃ });
    }
  }
  
  public static long a(String ☃, long ☃, long ☃)
    throws cb
  {
    long ☃ = b(☃);
    if (☃ < ☃) {
      throw new cb("commands.generic.num.tooSmall", new Object[] { Long.valueOf(☃), Long.valueOf(☃) });
    }
    if (☃ > ☃) {
      throw new cb("commands.generic.num.tooBig", new Object[] { Long.valueOf(☃), Long.valueOf(☃) });
    }
    return ☃;
  }
  
  public static cj a(m ☃, String[] ☃, int ☃, boolean ☃)
    throws cb
  {
    cj ☃ = ☃.c();
    return new cj(b(☃.n(), ☃[☃], -30000000, 30000000, ☃), b(☃.o(), ☃[(☃ + 1)], 0, 256, false), b(☃.p(), ☃[(☃ + 2)], -30000000, 30000000, ☃));
  }
  
  public static double c(String ☃)
    throws cb
  {
    try
    {
      double ☃ = Double.parseDouble(☃);
      if (!Doubles.isFinite(☃)) {
        throw new cb("commands.generic.num.invalid", new Object[] { ☃ });
      }
      return ☃;
    }
    catch (NumberFormatException ☃)
    {
      throw new cb("commands.generic.num.invalid", new Object[] { ☃ });
    }
  }
  
  public static double a(String ☃, double ☃)
    throws cb
  {
    return a(☃, ☃, Double.MAX_VALUE);
  }
  
  public static double a(String ☃, double ☃, double ☃)
    throws cb
  {
    double ☃ = c(☃);
    if (☃ < ☃) {
      throw new cb("commands.generic.double.tooSmall", new Object[] { Double.valueOf(☃), Double.valueOf(☃) });
    }
    if (☃ > ☃) {
      throw new cb("commands.generic.double.tooBig", new Object[] { Double.valueOf(☃), Double.valueOf(☃) });
    }
    return ☃;
  }
  
  public static boolean d(String ☃)
    throws bz
  {
    if ((☃.equals("true")) || (☃.equals("1"))) {
      return true;
    }
    if ((☃.equals("false")) || (☃.equals("0"))) {
      return false;
    }
    throw new bz("commands.generic.boolean.invalid", new Object[] { ☃ });
  }
  
  public static lf b(m ☃)
    throws cd
  {
    if ((☃ instanceof lf)) {
      return (lf)☃;
    }
    throw new cd("You must specify which player you wish to perform this action on.", new Object[0]);
  }
  
  public static lf a(m ☃, String ☃)
    throws cd
  {
    lf ☃ = o.a(☃, ☃);
    if (☃ == null) {
      try
      {
        ☃ = MinecraftServer.N().ap().a(UUID.fromString(☃));
      }
      catch (IllegalArgumentException localIllegalArgumentException) {}
    }
    if (☃ == null) {
      ☃ = MinecraftServer.N().ap().a(☃);
    }
    if (☃ == null) {
      throw new cd();
    }
    return ☃;
  }
  
  public static pk b(m ☃, String ☃)
    throws ca
  {
    return a(☃, ☃, pk.class);
  }
  
  public static <T extends pk> T a(m ☃, String ☃, Class<? extends T> ☃)
    throws ca
  {
    pk ☃ = o.a(☃, ☃, ☃);
    
    MinecraftServer ☃ = MinecraftServer.N();
    if (☃ == null) {
      ☃ = ☃.ap().a(☃);
    }
    if (☃ == null) {
      try
      {
        UUID ☃ = UUID.fromString(☃);
        ☃ = ☃.a(☃);
        if (☃ == null) {
          ☃ = ☃.ap().a(☃);
        }
      }
      catch (IllegalArgumentException ☃)
      {
        throw new ca("commands.generic.entity.invalidUuid", new Object[0]);
      }
    }
    if ((☃ == null) || (!☃.isAssignableFrom(☃.getClass()))) {
      throw new ca();
    }
    return ☃;
  }
  
  public static List<pk> c(m ☃, String ☃)
    throws ca
  {
    if (o.b(☃)) {
      return o.b(☃, ☃, pk.class);
    }
    return Lists.newArrayList(new pk[] { b(☃, ☃) });
  }
  
  public static String d(m ☃, String ☃)
    throws cd
  {
    try
    {
      return a(☃, ☃).e_();
    }
    catch (cd ☃)
    {
      if (o.b(☃)) {
        throw ☃;
      }
    }
    return ☃;
  }
  
  public static String e(m ☃, String ☃)
    throws ca
  {
    try
    {
      return a(☃, ☃).e_();
    }
    catch (cd ☃)
    {
      try
      {
        return b(☃, ☃).aK().toString();
      }
      catch (ca ☃)
      {
        if (o.b(☃)) {
          throw ☃;
        }
      }
    }
    return ☃;
  }
  
  public static eu a(m ☃, String[] ☃, int ☃)
    throws cd
  {
    return b(☃, ☃, ☃, false);
  }
  
  public static eu b(m ☃, String[] ☃, int ☃, boolean ☃)
    throws cd
  {
    eu ☃ = new fa("");
    for (int ☃ = ☃; ☃ < ☃.length; ☃++)
    {
      if (☃ > ☃) {
        ☃.a(" ");
      }
      eu ☃ = new fa(☃[☃]);
      if (☃)
      {
        eu ☃ = o.b(☃, ☃[☃]);
        if (☃ == null)
        {
          if (o.b(☃[☃])) {
            throw new cd();
          }
        }
        else {
          ☃ = ☃;
        }
      }
      ☃.a(☃);
    }
    return ☃;
  }
  
  public static String a(String[] ☃, int ☃)
  {
    StringBuilder ☃ = new StringBuilder();
    for (int ☃ = ☃; ☃ < ☃.length; ☃++)
    {
      if (☃ > ☃) {
        ☃.append(" ");
      }
      String ☃ = ☃[☃];
      
      ☃.append(☃);
    }
    return ☃.toString();
  }
  
  public static i.a a(double ☃, String ☃, boolean ☃)
    throws cb
  {
    return a(☃, ☃, -30000000, 30000000, ☃);
  }
  
  public static i.a a(double ☃, String ☃, int ☃, int ☃, boolean ☃)
    throws cb
  {
    boolean ☃ = ☃.startsWith("~");
    if ((☃) && (Double.isNaN(☃))) {
      throw new cb("commands.generic.num.invalid", new Object[] { Double.valueOf(☃) });
    }
    double ☃ = 0.0D;
    if ((!☃) || (☃.length() > 1))
    {
      boolean ☃ = ☃.contains(".");
      if (☃) {
        ☃ = ☃.substring(1);
      }
      ☃ += c(☃);
      if ((!☃) && (!☃) && (☃)) {
        ☃ += 0.5D;
      }
    }
    if ((☃ != 0) || (☃ != 0))
    {
      if (☃ < ☃) {
        throw new cb("commands.generic.double.tooSmall", new Object[] { Double.valueOf(☃), Integer.valueOf(☃) });
      }
      if (☃ > ☃) {
        throw new cb("commands.generic.double.tooBig", new Object[] { Double.valueOf(☃), Integer.valueOf(☃) });
      }
    }
    return new i.a(☃ + (☃ ? ☃ : 0.0D), ☃, ☃);
  }
  
  public static double b(double ☃, String ☃, boolean ☃)
    throws cb
  {
    return b(☃, ☃, -30000000, 30000000, ☃);
  }
  
  public static double b(double ☃, String ☃, int ☃, int ☃, boolean ☃)
    throws cb
  {
    boolean ☃ = ☃.startsWith("~");
    if ((☃) && (Double.isNaN(☃))) {
      throw new cb("commands.generic.num.invalid", new Object[] { Double.valueOf(☃) });
    }
    double ☃ = ☃ ? ☃ : 0.0D;
    if ((!☃) || (☃.length() > 1))
    {
      boolean ☃ = ☃.contains(".");
      if (☃) {
        ☃ = ☃.substring(1);
      }
      ☃ += c(☃);
      if ((!☃) && (!☃) && (☃)) {
        ☃ += 0.5D;
      }
    }
    if ((☃ != 0) || (☃ != 0))
    {
      if (☃ < ☃) {
        throw new cb("commands.generic.double.tooSmall", new Object[] { Double.valueOf(☃), Integer.valueOf(☃) });
      }
      if (☃ > ☃) {
        throw new cb("commands.generic.double.tooBig", new Object[] { Double.valueOf(☃), Integer.valueOf(☃) });
      }
    }
    return ☃;
  }
  
  public static class a
  {
    private final double a;
    private final double b;
    private final boolean c;
    
    protected a(double ☃, double ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
    }
    
    public double a()
    {
      return this.a;
    }
    
    public double b()
    {
      return this.b;
    }
    
    public boolean c()
    {
      return this.c;
    }
  }
  
  public static zw f(m ☃, String ☃)
    throws cb
  {
    jy ☃ = new jy(☃);
    zw ☃ = (zw)zw.e.a(☃);
    if (☃ == null) {
      throw new cb("commands.give.item.notFound", new Object[] { ☃ });
    }
    return ☃;
  }
  
  public static afh g(m ☃, String ☃)
    throws cb
  {
    jy ☃ = new jy(☃);
    if (!afh.c.d(☃)) {
      throw new cb("commands.give.block.notFound", new Object[] { ☃ });
    }
    afh ☃ = (afh)afh.c.a(☃);
    if (☃ == null) {
      throw new cb("commands.give.block.notFound", new Object[] { ☃ });
    }
    return ☃;
  }
  
  public static String a(Object[] ☃)
  {
    StringBuilder ☃ = new StringBuilder();
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      String ☃ = ☃[☃].toString();
      if (☃ > 0) {
        if (☃ == ☃.length - 1) {
          ☃.append(" and ");
        } else {
          ☃.append(", ");
        }
      }
      ☃.append(☃);
    }
    return ☃.toString();
  }
  
  public static eu a(List<eu> ☃)
  {
    eu ☃ = new fa("");
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      if (☃ > 0) {
        if (☃ == ☃.size() - 1) {
          ☃.a(" and ");
        } else if (☃ > 0) {
          ☃.a(", ");
        }
      }
      ☃.a((eu)☃.get(☃));
    }
    return ☃;
  }
  
  public static String a(Collection<String> ☃)
  {
    return a(☃.toArray(new String[☃.size()]));
  }
  
  public static List<String> a(String[] ☃, int ☃, cj ☃)
  {
    if (☃ == null) {
      return null;
    }
    int ☃ = ☃.length - 1;
    String ☃;
    if (☃ == ☃)
    {
      ☃ = Integer.toString(☃.n());
    }
    else
    {
      String ☃;
      if (☃ == ☃ + 1)
      {
        ☃ = Integer.toString(☃.o());
      }
      else
      {
        String ☃;
        if (☃ == ☃ + 2) {
          ☃ = Integer.toString(☃.p());
        } else {
          return null;
        }
      }
    }
    String ☃;
    return Lists.newArrayList(new String[] { ☃ });
  }
  
  public static List<String> b(String[] ☃, int ☃, cj ☃)
  {
    if (☃ == null) {
      return null;
    }
    int ☃ = ☃.length - 1;
    String ☃;
    if (☃ == ☃)
    {
      ☃ = Integer.toString(☃.n());
    }
    else
    {
      String ☃;
      if (☃ == ☃ + 1) {
        ☃ = Integer.toString(☃.p());
      } else {
        return null;
      }
    }
    String ☃;
    return Lists.newArrayList(new String[] { ☃ });
  }
  
  public static boolean a(String ☃, String ☃)
  {
    return ☃.regionMatches(true, 0, ☃, 0, ☃.length());
  }
  
  public static List<String> a(String[] ☃, String... ☃)
  {
    return a(☃, Arrays.asList(☃));
  }
  
  public static List<String> a(String[] ☃, Collection<?> ☃)
  {
    String ☃ = ☃[(☃.length - 1)];
    List<String> ☃ = Lists.newArrayList();
    if (!☃.isEmpty())
    {
      for (String ☃ : Iterables.transform(☃, Functions.toStringFunction())) {
        if (a(☃, ☃)) {
          ☃.add(☃);
        }
      }
      if (☃.isEmpty()) {
        for (Object ☃ : ☃) {
          if (((☃ instanceof jy)) && 
            (a(☃, ((jy)☃).a()))) {
            ☃.add(String.valueOf(☃));
          }
        }
      }
    }
    return ☃;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return false;
  }
  
  public static void a(m ☃, k ☃, String ☃, Object... ☃)
  {
    a(☃, ☃, 0, ☃, ☃);
  }
  
  public static void a(m ☃, k ☃, int ☃, String ☃, Object... ☃)
  {
    if (a != null) {
      a.a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static void a(h ☃)
  {
    a = ☃;
  }
  
  public int a(k ☃)
  {
    return c().compareTo(☃.c());
  }
}
