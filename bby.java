public class bby
  extends bbo
{
  private bct[] a;
  private bct[] b;
  private float[] c = new float[7];
  private static final int[][] d = { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
  private static final int[][] e = { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
  
  public bby()
  {
    a = new bct[7];
    float ☃ = -3.5F;
    for (int ☃ = 0; ☃ < a.length; ☃++)
    {
      a[☃] = new bct(this, e[☃][0], e[☃][1]);
      a[☃].a(d[☃][0] * -0.5F, 0.0F, d[☃][2] * -0.5F, d[☃][0], d[☃][1], d[☃][2]);
      a[☃].a(0.0F, 24 - d[☃][1], ☃);
      c[☃] = ☃;
      if (☃ < a.length - 1) {
        ☃ += (d[☃][2] + d[(☃ + 1)][2]) * 0.5F;
      }
    }
    b = new bct[3];
    b[0] = new bct(this, 20, 0);
    b[0].a(-5.0F, 0.0F, d[2][2] * -0.5F, 10, 8, d[2][2]);
    b[0].a(0.0F, 16.0F, c[2]);
    b[1] = new bct(this, 20, 11);
    b[1].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 4, d[4][2]);
    b[1].a(0.0F, 20.0F, c[4]);
    b[2] = new bct(this, 20, 18);
    b[2].a(-3.0F, 0.0F, d[4][2] * -0.5F, 6, 5, d[1][2]);
    b[2].a(0.0F, 19.0F, c[1]);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃].a(☃);
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃].a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++)
    {
      a[☃].g = (ns.b(☃ * 0.9F + ☃ * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (1 + Math.abs(☃ - 2)));
      a[☃].c = (ns.a(☃ * 0.9F + ☃ * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * Math.abs(☃ - 2));
    }
    b[0].g = a[2].g;
    b[1].g = a[4].g;
    b[1].c = a[4].c;
    b[2].g = a[1].g;
    b[2].c = a[1].c;
  }
}
