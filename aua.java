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
    this.b = ☃;
    b();
  }
  
  public ate a(Class<? extends ate> ☃, String ☃)
  {
    ate ☃ = (ate)this.a.get(☃);
    if (☃ != null) {
      return ☃;
    }
    if (this.b != null) {
      try
      {
        File ☃ = this.b.a(☃);
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
      this.a.put(☃, ☃);
      this.c.add(☃);
    }
    return ☃;
  }
  
  public void a(String ☃, ate ☃)
  {
    if (this.a.containsKey(☃)) {
      this.c.remove(this.a.remove(☃));
    }
    this.a.put(☃, ☃);
    this.c.add(☃);
  }
  
  public void a()
  {
    for (int ☃ = 0; ☃ < this.c.size(); ☃++)
    {
      ate ☃ = (ate)this.c.get(☃);
      if (☃.d())
      {
        a(☃);
        ☃.a(false);
      }
    }
  }
  
  private void a(ate ☃)
  {
    if (this.b == null) {
      return;
    }
    try
    {
      File ☃ = this.b.a(☃.a);
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
      this.d.clear();
      if (this.b == null) {
        return;
      }
      File ☃ = this.b.a("idcounts");
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
            this.d.put(☃, Short.valueOf(☃));
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
    Short ☃ = (Short)this.d.get(☃);
    Short localShort1;
    if (☃ == null)
    {
      ☃ = Short.valueOf((short)0);
    }
    else
    {
      localShort1 = ☃;Short localShort2 = ☃ = Short.valueOf((short)(☃.shortValue() + 1));
    }
    this.d.put(☃, ☃);
    if (this.b == null) {
      return ☃.shortValue();
    }
    try
    {
      File ☃ = this.b.a("idcounts");
      if (☃ != null)
      {
        dn ☃ = new dn();
        for (String ☃ : this.d.keySet())
        {
          short ☃ = ((Short)this.d.get(☃)).shortValue();
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
