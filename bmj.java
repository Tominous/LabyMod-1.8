import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
  
  public bmj(bni resourceManager)
  {
    this.e = resourceManager;
  }
  
  public void a(jy resource)
  {
    bmk itextureobject = (bmk)this.b.get(resource);
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
      this.c.add(textureObj);
      return true;
    }
    return false;
  }
  
  public boolean a(jy textureLocation, bmk textureObj)
  {
    boolean flag = true;
    try
    {
      textureObj.a(this.e);
    }
    catch (IOException ioexception)
    {
      a.warn("Failed to load texture: " + textureLocation, ioexception);
      textureObj = bml.a;
      this.b.put(textureLocation, textureObj);
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
    this.b.put(textureLocation, textureObj);
    return flag;
  }
  
  public bmk b(jy textureLocation)
  {
    return (bmk)this.b.get(textureLocation);
  }
  
  public jy a(String name, blz texture)
  {
    Integer integer = (Integer)this.d.get(name);
    if (integer == null) {
      integer = Integer.valueOf(1);
    } else {
      integer = Integer.valueOf(integer.intValue() + 1);
    }
    this.d.put(name, integer);
    jy resourcelocation = new jy(String.format("dynamic/%s_%d", new Object[] { name, integer }));
    a(resourcelocation, texture);
    return resourcelocation;
  }
  
  public void e()
  {
    for (bmm itickable : this.c) {
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
    for (Map.Entry<jy, bmk> entry : this.b.entrySet()) {
      a((jy)entry.getKey(), (bmk)entry.getValue());
    }
  }
}
