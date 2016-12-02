public class adz$a
{
  public float[] a = new float['Ā'];
  public ady[] b = new ady['Ā'];
  public int c;
  public int d;
  public long e;
  
  public adz$a(adz paramadz, int ☃, int ☃)
  {
    c = ☃;
    d = ☃;
    adz.a(paramadz).a(a, ☃ << 4, ☃ << 4, 16, 16);
    adz.a(paramadz).a(b, ☃ << 4, ☃ << 4, 16, 16, false);
  }
  
  public ady a(int ☃, int ☃)
  {
    return b[(☃ & 0xF | (☃ & 0xF) << 4)];
  }
}
