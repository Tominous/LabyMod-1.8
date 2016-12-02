import java.util.List;

public abstract class azu
  extends awd
{
  protected final ave u;
  protected final List<azp> v;
  
  public azu(ave ☃, int ☃, int ☃, List<azp> ☃)
  {
    super(☃, ☃, ☃, 32, ☃ - 55 + 4, 36);
    u = ☃;
    v = ☃;
    k = false;
    
    a(true, (int)(k.a * 1.5F));
  }
  
  protected void a(int ☃, int ☃, bfx ☃)
  {
    String ☃ = a.t + "" + a.r + e();
    u.k.a(☃, ☃ + b / 2 - u.k.a(☃) / 2, Math.min(d + 3, ☃), 16777215);
  }
  
  protected abstract String e();
  
  public List<azp> f()
  {
    return v;
  }
  
  protected int b()
  {
    return f().size();
  }
  
  public azp c(int ☃)
  {
    return (azp)f().get(☃);
  }
  
  public int c()
  {
    return b;
  }
  
  protected int d()
  {
    return f - 6;
  }
}
