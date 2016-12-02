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
    this.a = ☃;
  }
  
  public ff a(zx ☃)
  {
    if (this.d)
    {
      this.d = false;
      return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
    }
    if (this.i++ % 5 == 0) {
      return new gu(☃.i(), this.c.e, this.c.h.values(), this.c.f, 0, 0, 0, 0);
    }
    return null;
  }
  
  public void a(int ☃, int ☃)
  {
    if (this.d)
    {
      this.e = Math.min(this.e, ☃);
      this.f = Math.min(this.f, ☃);
      this.g = Math.max(this.g, ☃);
      this.h = Math.max(this.h, ☃);
    }
    else
    {
      this.d = true;
      this.e = ☃;
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
    }
  }
}
