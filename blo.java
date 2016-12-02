import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL14;

public class blo
{
  private static blo a = null;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final boolean g;
  private final boolean h;
  
  private blo(boolean ☃, boolean ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    g = ☃;
    
    b = ☃;
    d = ☃;
    
    c = ☃;
    e = ☃;
    
    h = ☃;
    f = ☃;
  }
  
  public blo()
  {
    this(false, true, 1, 0, 1, 0, 32774);
  }
  
  public blo(int ☃, int ☃, int ☃)
  {
    this(false, false, ☃, ☃, ☃, ☃, ☃);
  }
  
  public blo(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this(true, false, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a()
  {
    if (equals(a)) {
      return;
    }
    if ((a == null) || (h != a.b()))
    {
      a = this;
      if (h)
      {
        bfl.k();
        return;
      }
      bfl.l();
    }
    GL14.glBlendEquation(f);
    if (g) {
      bfl.a(b, d, c, e);
    } else {
      bfl.b(b, d);
    }
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof blo)) {
      return false;
    }
    blo ☃ = (blo)☃;
    if (f != f) {
      return false;
    }
    if (e != e) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (h != h) {
      return false;
    }
    if (g != g) {
      return false;
    }
    if (c != c) {
      return false;
    }
    if (b != b) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = b;
    ☃ = 31 * ☃ + c;
    ☃ = 31 * ☃ + d;
    ☃ = 31 * ☃ + e;
    ☃ = 31 * ☃ + f;
    ☃ = 31 * ☃ + (g ? 1 : 0);
    ☃ = 31 * ☃ + (h ? 1 : 0);
    return ☃;
  }
  
  public boolean b()
  {
    return h;
  }
  
  public static blo a(JsonObject ☃)
  {
    if (☃ == null) {
      return new blo();
    }
    int ☃ = 32774;
    int ☃ = 1;
    int ☃ = 0;
    int ☃ = 1;
    int ☃ = 0;
    boolean ☃ = true;
    boolean ☃ = false;
    if (ni.a(☃, "func"))
    {
      ☃ = a(☃.get("func").getAsString());
      if (☃ != 32774) {
        ☃ = false;
      }
    }
    if (ni.a(☃, "srcrgb"))
    {
      ☃ = b(☃.get("srcrgb").getAsString());
      if (☃ != 1) {
        ☃ = false;
      }
    }
    if (ni.a(☃, "dstrgb"))
    {
      ☃ = b(☃.get("dstrgb").getAsString());
      if (☃ != 0) {
        ☃ = false;
      }
    }
    if (ni.a(☃, "srcalpha"))
    {
      ☃ = b(☃.get("srcalpha").getAsString());
      if (☃ != 1) {
        ☃ = false;
      }
      ☃ = true;
    }
    if (ni.a(☃, "dstalpha"))
    {
      ☃ = b(☃.get("dstalpha").getAsString());
      if (☃ != 0) {
        ☃ = false;
      }
      ☃ = true;
    }
    if (☃) {
      return new blo();
    }
    if (☃) {
      return new blo(☃, ☃, ☃, ☃, ☃);
    }
    return new blo(☃, ☃, ☃);
  }
  
  private static int a(String ☃)
  {
    String ☃ = ☃.trim().toLowerCase();
    if (☃.equals("add")) {
      return 32774;
    }
    if (☃.equals("subtract")) {
      return 32778;
    }
    if (☃.equals("reversesubtract")) {
      return 32779;
    }
    if (☃.equals("reverse_subtract")) {
      return 32779;
    }
    if (☃.equals("min")) {
      return 32775;
    }
    if (☃.equals("max")) {
      return 32776;
    }
    return 32774;
  }
  
  private static int b(String ☃)
  {
    String ☃ = ☃.trim().toLowerCase();
    ☃ = ☃.replaceAll("_", "");
    ☃ = ☃.replaceAll("one", "1");
    ☃ = ☃.replaceAll("zero", "0");
    ☃ = ☃.replaceAll("minus", "-");
    if (☃.equals("0")) {
      return 0;
    }
    if (☃.equals("1")) {
      return 1;
    }
    if (☃.equals("srccolor")) {
      return 768;
    }
    if (☃.equals("1-srccolor")) {
      return 769;
    }
    if (☃.equals("dstcolor")) {
      return 774;
    }
    if (☃.equals("1-dstcolor")) {
      return 775;
    }
    if (☃.equals("srcalpha")) {
      return 770;
    }
    if (☃.equals("1-srcalpha")) {
      return 771;
    }
    if (☃.equals("dstalpha")) {
      return 772;
    }
    if (☃.equals("1-dstalpha")) {
      return 773;
    }
    return -1;
  }
}
