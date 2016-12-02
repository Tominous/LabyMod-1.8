public class bbb
  extends bbt
{
  public bbb()
  {
    super(12, 0.0F);
    
    a = new bct(this, 0, 0);
    a.a(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
    a.a(0.0F, 4.0F, -8.0F);
    
    a.a(22, 0).a(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    a.a(22, 0).a(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    
    b = new bct(this, 18, 4);
    b.a(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
    b.a(0.0F, 5.0F, 2.0F);
    b.a(52, 0).a(-2.0F, 2.0F, -8.0F, 4, 6, 1);
    
    c.c -= 1.0F;
    d.c += 1.0F;
    c.e += 0.0F;
    d.e += 0.0F;
    e.c -= 1.0F;
    f.c += 1.0F;
    e.e -= 1.0F;
    f.e -= 1.0F;
    
    h += 2.0F;
  }
}
