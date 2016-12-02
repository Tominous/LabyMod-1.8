import java.util.Map;

public class atg$a
{
  public final wn a;
  private boolean d = true;
  private int e = 0;
  private int f = 0;
  private int g = 127;
  private int h = 127;
  private int i;
  public int b;
  
  public atg$a(atg paramatg, wn ☃)
  {
    a = ☃;
  }
  
  public ff a(zx ☃)
  {
    if (d)
    {
      d = false;
      return new gu(☃.i(), c.e, c.h.values(), c.f, e, f, g + 1 - e, h + 1 - f);
    }
    if (i++ % 5 == 0) {
      return new gu(☃.i(), c.e, c.h.values(), c.f, 0, 0, 0, 0);
    }
    return null;
  }
  
  public void a(int ☃, int ☃)
  {
    if (d)
    {
      e = Math.min(e, ☃);
      f = Math.min(f, ☃);
      g = Math.max(g, ☃);
      h = Math.max(h, ☃);
    }
    else
    {
      d = true;
      e = ☃;
      f = ☃;
      g = ☃;
      h = ☃;
    }
  }
}
