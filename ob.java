import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ob
  extends oa.a
{
  private zx b;
  private int c;
  private int d;
  
  public ob(zw ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super(☃);
    b = new zx(☃, 1, ☃);
    c = ☃;
    d = ☃;
  }
  
  public ob(zx ☃, int ☃, int ☃, int ☃)
  {
    super(☃);
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public static void a(Random ☃, List<ob> ☃, og ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      ob ☃ = (ob)oa.a(☃, ☃);
      int ☃ = c + ☃.nextInt(d - c + 1);
      if (b.c() >= ☃)
      {
        zx ☃ = b.k();
        b = ☃;
        ☃.a(☃.nextInt(☃.o_()), ☃);
      }
      else
      {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          zx ☃ = b.k();
          b = 1;
          ☃.a(☃.nextInt(☃.o_()), ☃);
        }
      }
    }
  }
  
  public static void a(Random ☃, List<ob> ☃, alc ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      ob ☃ = (ob)oa.a(☃, ☃);
      int ☃ = c + ☃.nextInt(d - c + 1);
      if (b.c() >= ☃)
      {
        zx ☃ = b.k();
        b = ☃;
        ☃.a(☃.nextInt(☃.o_()), ☃);
      }
      else
      {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          zx ☃ = b.k();
          b = 1;
          ☃.a(☃.nextInt(☃.o_()), ☃);
        }
      }
    }
  }
  
  public static List<ob> a(List<ob> ☃, ob... ☃)
  {
    List<ob> ☃ = Lists.newArrayList(☃);
    Collections.addAll(☃, ☃);
    
    return ☃;
  }
}
