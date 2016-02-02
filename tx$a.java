import java.util.Random;

class tx$a
  extends rd
{
  private tx a;
  
  public tx$a(tx ☃)
  {
    this.a = ☃;
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void e()
  {
    int ☃ = this.a.bh();
    if (☃ > 100)
    {
      this.a.b(0.0F, 0.0F, 0.0F);
    }
    else if ((this.a.bc().nextInt(50) == 0) || (!tx.a(this.a)) || (!this.a.n()))
    {
      float ☃ = this.a.bc().nextFloat() * 3.1415927F * 2.0F;
      float ☃ = ns.b(☃) * 0.2F;
      float ☃ = -0.1F + this.a.bc().nextFloat() * 0.2F;
      float ☃ = ns.a(☃) * 0.2F;
      this.a.b(☃, ☃, ☃);
    }
  }
}
