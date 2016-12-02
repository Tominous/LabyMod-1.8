public class bfd$a
{
  private final int[] b;
  private final bmu c;
  private static final String __OBFID = "CL_00002568";
  private bmi[] stateQuadSprites;
  
  public bfd$a(bfd parambfd, int[] buf, bmu vertFormat, bmi[] quadSprites)
  {
    b = buf;
    c = vertFormat;
    stateQuadSprites = quadSprites;
  }
  
  public bfd$a(bfd parambfd, int[] p_i46380_2_, bmu p_i46380_3_)
  {
    b = p_i46380_2_;
    c = p_i46380_3_;
  }
  
  public int[] a()
  {
    return b;
  }
  
  public int b()
  {
    return b.length / c.f();
  }
  
  public bmu c()
  {
    return c;
  }
}
