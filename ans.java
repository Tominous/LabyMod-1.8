public class ans
{
  private final short[] a = new short[65536];
  private final alz b = afi.a.Q();
  
  public alz a(int ☃, int ☃, int ☃)
  {
    int ☃ = ☃ << 12 | ☃ << 8 | ☃;
    return a(☃);
  }
  
  public alz a(int ☃)
  {
    if ((☃ < 0) || (☃ >= this.a.length)) {
      throw new IndexOutOfBoundsException("The coordinate is out of range");
    }
    alz ☃ = (alz)afh.d.a(this.a[☃]);
    if (☃ != null) {
      return ☃;
    }
    return this.b;
  }
  
  public void a(int ☃, int ☃, int ☃, alz ☃)
  {
    int ☃ = ☃ << 12 | ☃ << 8 | ☃;
    
    a(☃, ☃);
  }
  
  public void a(int ☃, alz ☃)
  {
    if ((☃ < 0) || (☃ >= this.a.length)) {
      throw new IndexOutOfBoundsException("The coordinate is out of range");
    }
    this.a[☃] = ((short)afh.d.b(☃));
  }
}
