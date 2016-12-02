public class awk
{
  private static final jy a = new jy("textures/gui/stream_indicator.png");
  private final ave b;
  private float c = 1.0F;
  private int d = 1;
  
  public awk(ave ☃)
  {
    b = ☃;
  }
  
  public void a(int ☃, int ☃)
  {
    if (b.Y().k())
    {
      bfl.l();
      
      int ☃ = b.Y().x();
      if (☃ > 0)
      {
        String ☃ = "" + ☃;
        int ☃ = b.k.a(☃);
        int ☃ = 20;
        
        int ☃ = ☃ - ☃ - 1;
        int ☃ = ☃ + 20 - 1;
        int ☃ = ☃;
        int ☃ = ☃ + 20 + b.k.a - 1;
        bfl.x();
        bfx ☃ = bfx.a();
        bfd ☃ = ☃.c();
        bfl.c(0.0F, 0.0F, 0.0F, (0.65F + 0.35000002F * c) / 2.0F);
        ☃.a(7, bms.e);
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b(☃, ☃, 0.0D).d();
        ☃.b();
        bfl.w();
        b.k.a(☃, ☃ - ☃, ☃ + 20, 16777215);
      }
      a(☃, ☃, b(), 0);
      
      a(☃, ☃, c(), 17);
    }
  }
  
  private void a(int ☃, int ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 0.65F + 0.35000002F * c);
    b.P().a(a);
    float ☃ = 150.0F;
    
    float ☃ = 0.0F;
    float ☃ = ☃ * 0.015625F;
    float ☃ = 1.0F;
    float ☃ = (☃ + 16) * 0.015625F;
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ - 16 - ☃, ☃ + 16, ☃).a(☃, ☃).d();
    ☃.b(☃ - ☃, ☃ + 16, ☃).a(☃, ☃).d();
    ☃.b(☃ - ☃, ☃ + 0, ☃).a(☃, ☃).d();
    ☃.b(☃ - 16 - ☃, ☃ + 0, ☃).a(☃, ☃).d();
    ☃.b();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private int b()
  {
    return b.Y().l() ? 16 : 0;
  }
  
  private int c()
  {
    return b.Y().D() ? 48 : 32;
  }
  
  public void a()
  {
    if (b.Y().k())
    {
      c += 0.025F * d;
      if (c < 0.0F)
      {
        d *= -1;
        c = 0.0F;
      }
      else if (c > 1.0F)
      {
        d *= -1;
        c = 1.0F;
      }
    }
    else
    {
      c = 1.0F;
      d = 1;
    }
  }
}
