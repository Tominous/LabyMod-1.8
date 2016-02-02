import java.util.List;

public class au
  extends i
{
  public String c()
  {
    return "particle";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.particle.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 8) {
      throw new cf("commands.particle.usage", new Object[0]);
    }
    boolean ☃ = false;
    cy ☃ = null;
    for (cy ☃ : cy.values()) {
      if (☃.f())
      {
        if (☃[0].startsWith(☃.b()))
        {
          ☃ = true;
          ☃ = ☃;
          break;
        }
      }
      else if (☃[0].equals(☃.b()))
      {
        ☃ = true;
        ☃ = ☃;
        break;
      }
    }
    if (!☃) {
      throw new bz("commands.particle.notFound", new Object[] { ☃[0] });
    }
    String ☃ = ☃[0];
    aui ☃ = ☃.d();
    double ☃ = (float)b(☃.a, ☃[1], true);
    double ☃ = (float)b(☃.b, ☃[2], true);
    double ☃ = (float)b(☃.c, ☃[3], true);
    double ☃ = (float)c(☃[4]);
    double ☃ = (float)c(☃[5]);
    double ☃ = (float)c(☃[6]);
    double ☃ = (float)c(☃[7]);
    
    int ☃ = 0;
    if (☃.length > 8) {
      ☃ = a(☃[8], 0);
    }
    boolean ☃ = false;
    if ((☃.length > 9) && ("force".equals(☃[9]))) {
      ☃ = true;
    }
    adm ☃ = ☃.e();
    if ((☃ instanceof le))
    {
      le ☃ = (le)☃;
      int[] ☃ = new int[☃.d()];
      if (☃.f())
      {
        String[] ☃ = ☃[0].split("_", 3);
        for (int ☃ = 1; ☃ < ☃.length; ☃++) {
          try
          {
            ☃[(☃ - 1)] = Integer.parseInt(☃[☃]);
          }
          catch (NumberFormatException ☃)
          {
            throw new bz("commands.particle.notFound", new Object[] { ☃[0] });
          }
        }
      }
      ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      a(☃, this, "commands.particle.success", new Object[] { ☃, Integer.valueOf(Math.max(☃, 1)) });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, cy.a());
    }
    if ((☃.length > 1) && (☃.length <= 4)) {
      return a(☃, 1, ☃);
    }
    if (☃.length == 10) {
      return a(☃, new String[] { "normal", "force" });
    }
    return null;
  }
}
