public class bfd$a
{
  private final int[] b;
  private final bmu c;
  private static final String __OBFID = "CL_00002568";
  private bmi[] stateQuadSprites;
  
  public bfd$a(bfd parambfd, int[] buf, bmu vertFormat, bmi[] quadSprites)
  {
    this.b = buf;
    this.c = vertFormat;
    this.stateQuadSprites = quadSprites;
  }
  
  public bfd$a(bfd parambfd, int[] p_i46380_2_, bmu p_i46380_3_)
  {
    this.b = p_i46380_2_;
    this.c = p_i46380_3_;
  }
  
  public int[] a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.b.length / this.c.f();
  }
  
  public bmu c()
  {
    return this.c;
  }
}
