import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmj
  implements bmm, bnj
{
  private static final Logger a = ;
  private final Map<jy, bmk> b = Maps.newHashMap();
  private final List<bmm> c = Lists.newArrayList();
  private final Map<String, Integer> d = Maps.newHashMap();
  private bni e;
  private HashMap<String, bmk> storedTextures = new HashMap();
  
  public bmj(bni resourceManager)
  {
    e = resourceManager;
  }
  
  public void a(jy resource)
  {
    bmk itextureobject = (bmk)b.get(resource);
    if ((itextureobject != null) && (itextureobject != bml.a) && (!storedTextures.containsKey(resource.a()))) {
      storedTextures.put(resource.a(), itextureobject);
    } else if ((itextureobject == null) || (itextureobject == bml.a)) {
      if (storedTextures.containsKey(resource.a()))
      {
        bmk texure = (bmk)storedTextures.get(resource.a());
        if ((texure != null) && (texure != bml.a))
        {
          ave.A().P().a(resource, texure);
          System.out.println("[TextureManager] Reload texture " + resource.a());
        }
      }
    }
    if (itextureobject == null)
    {
      itextureobject = new bme(resource);
      a(resource, itextureobject);
    }
    bml.b(itextureobject.b());
  }
  
  public boolean a(jy textureLocation, bmn textureObj)
  {
    if (a(textureLocation, textureObj))
    {
      c.add(textureObj);
      return true;
    }
    return false;
  }
  
  public boolean a(jy textureLocation, bmk textureObj)
  {
    boolean flag = true;
    try
    {
      textureObj.a(e);
    }
    catch (IOException ioexception)
    {
      a.warn("Failed to load texture: " + textureLocation, ioexception);
      textureObj = bml.a;
      b.put(textureLocation, textureObj);
      flag = false;
    }
    catch (Throwable throwable)
    {
      final bmk textureObjf = textureObj;
      b crashreport = b.a(throwable, "Registering texture");
      c crashreportcategory = crashreport.a("Resource location being registered");
      crashreportcategory.a("Resource location", textureLocation);
      crashreportcategory.a("Texture object class", new Callable()
      {
        public String a()
          throws Exception
        {
          return textureObjf.getClass().getName();
        }
      });
      throw new e(crashreport);
    }
    b.put(textureLocation, textureObj);
    return flag;
  }
  
  public bmk b(jy textureLocation)
  {
    return (bmk)b.get(textureLocation);
  }
  
  public jy a(String name, blz texture)
  {
    Integer integer = (Integer)d.get(name);
    if (integer == null) {
      integer = Integer.valueOf(1);
    } else {
      integer = Integer.valueOf(integer.intValue() + 1);
    }
    d.put(name, integer);
    
    jy resourcelocation = new jy(String.format("dynamic/%s_%d", new Object[] { name, integer }));
    a(resourcelocation, texture);
    return resourcelocation;
  }
  
  public void e()
  {
    for (bmm itickable : c) {
      itickable.e();
    }
  }
  
  public void c(jy textureLocation)
  {
    bmk itextureobject = b(textureLocation);
    if (itextureobject != null) {
      bml.a(itextureobject.b());
    }
  }
  
  public void a(bni resourceManager)
  {
    Iterator<Map.Entry<jy, bmk>> iterator = b.entrySet().iterator();
    while (iterator.hasNext())
    {
      Map.Entry<jy, bmk> next = (Map.Entry)iterator.next();
      a((jy)next.getKey(), (bmk)next.getValue());
    }
  }
}
