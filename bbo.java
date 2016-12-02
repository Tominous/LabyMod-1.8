import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class bbo
{
  public float p;
  public boolean q;
  public boolean r = true;
  public List<bct> s = Lists.newArrayList();
  private Map<String, bcu> a = Maps.newHashMap();
  public int t = 64;
  public int u = 32;
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃) {}
  
  public void a(pr ☃, float ☃, float ☃, float ☃) {}
  
  public bct a(Random ☃)
  {
    return (bct)s.get(☃.nextInt(s.size()));
  }
  
  protected void a(String ☃, int ☃, int ☃)
  {
    a.put(☃, new bcu(☃, ☃));
  }
  
  public bcu a(String ☃)
  {
    return (bcu)a.get(☃);
  }
  
  public static void a(bct ☃, bct ☃)
  {
    f = f;
    g = g;
    h = h;
    c = c;
    d = d;
    e = e;
  }
  
  public void a(bbo ☃)
  {
    p = p;
    q = q;
    r = r;
  }
}
