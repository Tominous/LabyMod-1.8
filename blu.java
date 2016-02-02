import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class blu
{
  private static final Logger a = ;
  private static blu b;
  
  public static void a()
  {
    b = new blu();
  }
  
  public static blu b()
  {
    return b;
  }
  
  public void a(blq ☃)
  {
    ☃.f().b(☃);
    ☃.e().b(☃);
    
    bqs.e(☃.h());
  }
  
  public int c()
    throws kc
  {
    int ☃ = bqs.d();
    if (☃ <= 0) {
      throw new kc("Could not create shader program (returned program ID " + ☃ + ")");
    }
    return ☃;
  }
  
  public void b(blq ☃)
    throws IOException
  {
    ☃.f().a(☃);
    ☃.e().a(☃);
    
    bqs.f(☃.h());
    int ☃ = bqs.a(☃.h(), bqs.m);
    if (☃ == 0)
    {
      a.warn("Error encountered when linking program containing VS " + ☃.e().a() + " and FS " + ☃.f().a() + ". Log output:");
      a.warn(bqs.e(☃.h(), 32768));
    }
  }
}
