import java.util.Random;

class wi$c
  implements wi.f
{
  public zx a;
  public wi.g b;
  
  public wi$c(zw ☃, wi.g ☃)
  {
    this.a = new zx(☃);
    this.b = ☃;
  }
  
  public void a(ada ☃, Random ☃)
  {
    int ☃ = 1;
    if (this.b != null) {
      ☃ = this.b.a(☃);
    }
    zx ☃ = new zx(zy.bO, ☃, 0);
    zx ☃ = new zx(this.a.b(), 1, this.a.i());
    ☃ = ack.a(☃, ☃, 5 + ☃.nextInt(15));
    
    ☃.add(new acz(☃, ☃));
  }
}
