public class bbn
  extends bbo
{
  public bct[] a = new bct[7];
  
  public bbn()
  {
    this.a[0] = new bct(this, 0, 10);
    this.a[1] = new bct(this, 0, 0);
    this.a[2] = new bct(this, 0, 0);
    this.a[3] = new bct(this, 0, 0);
    this.a[4] = new bct(this, 0, 0);
    this.a[5] = new bct(this, 44, 10);
    
    int ☃ = 20;
    int ☃ = 8;
    int ☃ = 16;
    int ☃ = 4;
    
    this.a[0].a(-☃ / 2, -☃ / 2, -1.0F, ☃, ☃, 2, 0.0F);
    this.a[0].a(0.0F, ☃, 0.0F);
    
    this.a[5].a(-☃ / 2 + 1, -☃ / 2 + 1, -1.0F, ☃ - 2, ☃ - 2, 1, 0.0F);
    this.a[5].a(0.0F, ☃, 0.0F);
    
    this.a[1].a(-☃ / 2 + 2, -☃ - 1, -1.0F, ☃ - 4, ☃, 2, 0.0F);
    this.a[1].a(-☃ / 2 + 1, ☃, 0.0F);
    
    this.a[2].a(-☃ / 2 + 2, -☃ - 1, -1.0F, ☃ - 4, ☃, 2, 0.0F);
    this.a[2].a(☃ / 2 - 1, ☃, 0.0F);
    
    this.a[3].a(-☃ / 2 + 2, -☃ - 1, -1.0F, ☃ - 4, ☃, 2, 0.0F);
    this.a[3].a(0.0F, ☃, -☃ / 2 + 1);
    
    this.a[4].a(-☃ / 2 + 2, -☃ - 1, -1.0F, ☃ - 4, ☃, 2, 0.0F);
    this.a[4].a(0.0F, ☃, ☃ / 2 - 1);
    
    this.a[0].f = 1.5707964F;
    this.a[1].g = 4.712389F;
    this.a[2].g = 1.5707964F;
    this.a[3].g = 3.1415927F;
    this.a[5].f = -1.5707964F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    this.a[5].d = (4.0F - ☃);
    for (int ☃ = 0; ☃ < 6; ☃++) {
      this.a[☃].a(☃);
    }
  }
}
