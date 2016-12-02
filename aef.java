import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class aef
  extends aec
{
  private ady b;
  private float c;
  
  public aef(ady ☃, float ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public ady a(cj ☃)
  {
    return b;
  }
  
  public ady[] a(ady[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new ady[☃ * ☃];
    }
    Arrays.fill(☃, 0, ☃ * ☃, b);
    
    return ☃;
  }
  
  public float[] a(float[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new float[☃ * ☃];
    }
    Arrays.fill(☃, 0, ☃ * ☃, c);
    
    return ☃;
  }
  
  public ady[] b(ady[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new ady[☃ * ☃];
    }
    Arrays.fill(☃, 0, ☃ * ☃, b);
    
    return ☃;
  }
  
  public ady[] a(ady[] ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    return b(☃, ☃, ☃, ☃, ☃);
  }
  
  public cj a(int ☃, int ☃, int ☃, List<ady> ☃, Random ☃)
  {
    if (☃.contains(b)) {
      return new cj(☃ - ☃ + ☃.nextInt(☃ * 2 + 1), 0, ☃ - ☃ + ☃.nextInt(☃ * 2 + 1));
    }
    return null;
  }
  
  public boolean a(int ☃, int ☃, int ☃, List<ady> ☃)
  {
    return ☃.contains(b);
  }
}
