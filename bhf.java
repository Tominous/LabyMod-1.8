public class bhf
  extends bhd<ale>
{
  private static final jy c = new jy("textures/entity/enchanting_table_book.png");
  private bay d = new bay();
  
  public void a(ale ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    bfl.E();
    bfl.b((float)☃ + 0.5F, (float)☃ + 0.75F, (float)☃ + 0.5F);
    
    float ☃ = ☃.a + ☃;
    
    bfl.b(0.0F, 0.1F + ns.a(☃ * 0.1F) * 0.01F, 0.0F);
    float ☃ = ☃.l - ☃.m;
    while (☃ >= 3.1415927F) {
      ☃ -= 6.2831855F;
    }
    while (☃ < -3.1415927F) {
      ☃ += 6.2831855F;
    }
    float ☃ = ☃.m + ☃ * ☃;
    
    bfl.b(-☃ * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
    bfl.b(80.0F, 0.0F, 0.0F, 1.0F);
    a(c);
    
    float ☃ = ☃.g + (☃.f - ☃.g) * ☃ + 0.25F;
    float ☃ = ☃.g + (☃.f - ☃.g) * ☃ + 0.75F;
    ☃ = (☃ - ns.b(☃)) * 1.6F - 0.3F;
    ☃ = (☃ - ns.b(☃)) * 1.6F - 0.3F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    float ☃ = ☃.k + (☃.j - ☃.k) * ☃;
    bfl.o();
    this.d.a(null, ☃, ☃, ☃, ☃, 0.0F, 0.0625F);
    bfl.F();
  }
}
