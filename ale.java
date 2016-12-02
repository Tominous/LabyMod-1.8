import java.util.Random;

public class ale
  extends akw
  implements km, ol
{
  public int a;
  public float f;
  public float g;
  public float h;
  public float i;
  public float j;
  public float k;
  public float l;
  public float m;
  public float n;
  private static Random o = new Random();
  private String p;
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (l_()) {
      ☃.a("CustomName", p);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("CustomName", 8)) {
      p = ☃.j("CustomName");
    }
  }
  
  public void c()
  {
    k = j;
    m = l;
    
    wn ☃ = b.a(c.n() + 0.5F, c.o() + 0.5F, c.p() + 0.5F, 3.0D);
    if (☃ != null)
    {
      double ☃ = s - (c.n() + 0.5F);
      double ☃ = u - (c.p() + 0.5F);
      
      n = ((float)ns.b(☃, ☃));
      
      j += 0.1F;
      if ((j < 0.5F) || (o.nextInt(40) == 0))
      {
        float ☃ = h;
        do
        {
          h += o.nextInt(4) - o.nextInt(4);
        } while (☃ == h);
      }
    }
    else
    {
      n += 0.02F;
      j -= 0.1F;
    }
    while (l >= 3.1415927F) {
      l -= 6.2831855F;
    }
    while (l < -3.1415927F) {
      l += 6.2831855F;
    }
    while (n >= 3.1415927F) {
      n -= 6.2831855F;
    }
    while (n < -3.1415927F) {
      n += 6.2831855F;
    }
    float ☃ = n - l;
    while (☃ >= 3.1415927F) {
      ☃ -= 6.2831855F;
    }
    while (☃ < -3.1415927F) {
      ☃ += 6.2831855F;
    }
    l += ☃ * 0.4F;
    
    j = ns.a(j, 0.0F, 1.0F);
    
    a += 1;
    g = f;
    
    float ☃ = (h - f) * 0.4F;
    float ☃ = 0.2F;
    ☃ = ns.a(☃, -☃, ☃);
    i += (☃ - i) * 0.9F;
    
    f += i;
  }
  
  public String e_()
  {
    return l_() ? p : "container.enchant";
  }
  
  public boolean l_()
  {
    return (p != null) && (p.length() > 0);
  }
  
  public void a(String ☃)
  {
    p = ☃;
  }
  
  public eu f_()
  {
    if (l_()) {
      return new fa(e_());
    }
    return new fb(e_(), new Object[0]);
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xs(☃, b, c);
  }
  
  public String k()
  {
    return "minecraft:enchanting_table";
  }
}
