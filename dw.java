public class dw
{
  public static final dw a = new dw(0L)
  {
    public void a(long ☃) {}
  };
  private final long b;
  private long c;
  
  public dw(long ☃)
  {
    b = ☃;
  }
  
  public void a(long ☃)
  {
    c += ☃ / 8L;
    if (c > b) {
      throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + c + "bytes where max allowed: " + b);
    }
  }
}
