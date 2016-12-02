import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

public class aua
{
  private atp b;
  protected Map<String, ate> a = Maps.newHashMap();
  private List<ate> c = Lists.newArrayList();
  private Map<String, Short> d = Maps.newHashMap();
  
  public aua(atp ☃)
  {
    b = ☃;
    b();
  }
  
  public ate a(Class<? extends ate> ☃, String ☃)
  {
    ate ☃ = (ate)a.get(☃);
    if (☃ != null) {
      return ☃;
    }
    if (b != null) {
      try
      {
        File ☃ = b.a(☃);
        if ((☃ != null) && (☃.exists()))
        {
          try
          {
            ☃ = (ate)☃.getConstructor(new Class[] { String.class }).newInstance(new Object[] { ☃ });
          }
          catch (Exception ☃)
          {
            throw new RuntimeException("Failed to instantiate " + ☃.toString(), ☃);
          }
          FileInputStream ☃ = new FileInputStream(☃);
          dn ☃ = dx.a(☃);
          ☃.close();
          
          ☃.a(☃.m("data"));
        }
      }
      catch (Exception ☃)
      {
        ☃.printStackTrace();
      }
    }
    if (☃ != null)
    {
      a.put(☃, ☃);
      c.add(☃);
    }
    return ☃;
  }
  
  public void a(String ☃, ate ☃)
  {
    if (a.containsKey(☃)) {
      c.remove(a.remove(☃));
    }
    a.put(☃, ☃);
    c.add(☃);
  }
  
  public void a()
  {
    for (int ☃ = 0; ☃ < c.size(); ☃++)
    {
      ate ☃ = (ate)c.get(☃);
      if (☃.d())
      {
        a(☃);
        ☃.a(false);
      }
    }
  }
  
  private void a(ate ☃)
  {
    if (b == null) {
      return;
    }
    try
    {
      File ☃ = b.a(a);
      if (☃ != null)
      {
        dn ☃ = new dn();
        ☃.b(☃);
        
        dn ☃ = new dn();
        ☃.a("data", ☃);
        
        FileOutputStream ☃ = new FileOutputStream(☃);
        dx.a(☃, ☃);
        ☃.close();
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  private void b()
  {
    try
    {
      d.clear();
      if (b == null) {
        return;
      }
      File ☃ = b.a("idcounts");
      if ((☃ != null) && (☃.exists()))
      {
        DataInputStream ☃ = new DataInputStream(new FileInputStream(☃));
        ☃ = dx.a(☃);
        ☃.close();
        for (String ☃ : ☃.c())
        {
          eb ☃ = ☃.a(☃);
          if ((☃ instanceof dz))
          {
            dz ☃ = (dz)☃;
            String ☃ = ☃;
            short ☃ = ☃.e();
            d.put(☃, Short.valueOf(☃));
          }
        }
      }
    }
    catch (Exception ☃)
    {
      dn ☃;
      ☃.printStackTrace();
    }
  }
  
  public int a(String ☃)
  {
    Short ☃ = (Short)d.get(☃);
    Short localShort1;
    if (☃ == null)
    {
      ☃ = Short.valueOf((short)0);
    }
    else
    {
      localShort1 = ☃;Short localShort2 = ☃ = Short.valueOf((short)(☃.shortValue() + 1));
    }
    d.put(☃, ☃);
    if (b == null) {
      return ☃.shortValue();
    }
    try
    {
      File ☃ = b.a("idcounts");
      if (☃ != null)
      {
        dn ☃ = new dn();
        for (String ☃ : d.keySet())
        {
          short ☃ = ((Short)d.get(☃)).shortValue();
          ☃.a(☃, ☃);
        }
        DataOutputStream ☃ = new DataOutputStream(new FileOutputStream(☃));
        dx.a(☃, ☃);
        ☃.close();
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
    return ☃.shortValue();
  }
}
