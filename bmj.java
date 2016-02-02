import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import shadersmod.client.ShadersTex;

public class bmj
  implements bmm, bnj
{
  private static final Logger a = ;
  private final Map b = Maps.newHashMap();
  private final List c = Lists.newArrayList();
  private final Map d = Maps.newHashMap();
  private bni e;
  private static final String __OBFID = "CL_00001064";
  
  public bmj(bni p_i1284_1_)
  {
    this.e = p_i1284_1_;
  }
  
  public void a(jy resource)
  {
    if (Config.isRandomMobs()) {
      resource = RandomMobs.getTextureLocation(resource);
    }
    Object var2 = (bmk)this.b.get(resource);
    if (var2 == null)
    {
      var2 = new bme(resource);
      a(resource, (bmk)var2);
    }
    if (Config.isShaders()) {
      ShadersTex.bindTexture((bmk)var2);
    } else {
      bml.b(((bmk)var2).b());
    }
  }
  
  public boolean a(jy p_110580_1_, bmn p_110580_2_)
  {
    if (a(p_110580_1_, p_110580_2_))
    {
      this.c.add(p_110580_2_);
      return true;
    }
    return false;
  }
  
  public boolean a(jy p_110579_1_, final bmk p_110579_2_)
  {
    boolean var3 = true;
    bmk p_110579_2_2 = p_110579_2_;
    try
    {
      p_110579_2_.a(this.e);
    }
    catch (IOException var8)
    {
      a.warn("Failed to load texture: " + p_110579_1_, var8);
      p_110579_2_2 = bml.a;
      this.b.put(p_110579_1_, p_110579_2_2);
      var3 = false;
    }
    catch (Throwable var9)
    {
      b var5 = b.a(var9, "Registering texture");
      c var6 = var5.a("Resource location being registered");
      var6.a("Resource location", p_110579_1_);
      var6.a("Texture object class", new Callable()
      {
        private static final String __OBFID = "CL_00001065";
        
        public String a()
          throws Exception
        {
          return p_110579_2_.getClass().getName();
        }
      });
      throw new e(var5);
    }
    this.b.put(p_110579_1_, p_110579_2_2);
    return var3;
  }
  
  public bmk b(jy p_110581_1_)
  {
    return (bmk)this.b.get(p_110581_1_);
  }
  
  public jy a(String p_110578_1_, blz p_110578_2_)
  {
    Integer var3 = (Integer)this.d.get(p_110578_1_);
    if (var3 == null) {
      var3 = Integer.valueOf(1);
    } else {
      var3 = Integer.valueOf(var3.intValue() + 1);
    }
    this.d.put(p_110578_1_, var3);
    jy var4 = new jy(String.format("dynamic/%s_%d", new Object[] { p_110578_1_, var3 }));
    a(var4, p_110578_2_);
    return var4;
  }
  
  public void e()
  {
    Iterator var1 = this.c.iterator();
    while (var1.hasNext())
    {
      bmm var2 = (bmm)var1.next();
      var2.e();
    }
  }
  
  public void c(jy p_147645_1_)
  {
    bmk var2 = b(p_147645_1_);
    if (var2 != null) {
      bml.a(var2.b());
    }
  }
  
  public void a(bni resourceManager)
  {
    Config.dbg("*** Reloading textures ***");
    Config.log("Resource packs: " + Config.getResourcePackNames());
    
    Iterator it = this.b.keySet().iterator();
    while (it.hasNext())
    {
      jy loc = (jy)it.next();
      if (loc.a().startsWith("mcpatcher/"))
      {
        bmk tex = (bmk)this.b.get(loc);
        if ((tex instanceof bly))
        {
          bly at = (bly)tex;
          
          at.c();
        }
        it.remove();
      }
    }
    Iterator var2 = this.b.entrySet().iterator();
    while (var2.hasNext())
    {
      Map.Entry var3 = (Map.Entry)var2.next();
      a((jy)var3.getKey(), (bmk)var3.getValue());
    }
  }
}
