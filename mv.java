import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mv
  extends nb
{
  private static final Logger b = ;
  private final MinecraftServer c;
  private final File d;
  private final Set<mw> e = Sets.newHashSet();
  private int f = 65236;
  private boolean g = false;
  
  public mv(MinecraftServer ☃, File ☃)
  {
    c = ☃;
    d = ☃;
  }
  
  public void a()
  {
    if (d.isFile()) {
      try
      {
        a.clear();
        a.putAll(a(FileUtils.readFileToString(d)));
      }
      catch (IOException ☃)
      {
        b.error("Couldn't read statistics file " + d, ☃);
      }
      catch (JsonParseException ☃)
      {
        b.error("Couldn't parse statistics file " + d, ☃);
      }
    }
  }
  
  public void b()
  {
    try
    {
      FileUtils.writeStringToFile(d, a(a));
    }
    catch (IOException ☃)
    {
      b.error("Couldn't save stats", ☃);
    }
  }
  
  public void a(wn ☃, mw ☃, int ☃)
  {
    int ☃ = ☃.d() ? a(☃) : 0;
    super.a(☃, ☃, ☃);
    e.add(☃);
    if ((☃.d()) && (☃ == 0) && (☃ > 0))
    {
      g = true;
      if (c.aB()) {
        c.ap().a(new fb("chat.type.achievement", new Object[] { ☃.f_(), ☃.j() }));
      }
    }
    if ((☃.d()) && (☃ > 0) && (☃ == 0))
    {
      g = true;
      if (c.aB()) {
        c.ap().a(new fb("chat.type.achievement.taken", new Object[] { ☃.f_(), ☃.j() }));
      }
    }
  }
  
  public Set<mw> c()
  {
    Set<mw> ☃ = Sets.newHashSet(e);
    e.clear();
    g = false;
    return ☃;
  }
  
  public Map<mw, my> a(String ☃)
  {
    JsonElement ☃ = new JsonParser().parse(☃);
    if (!☃.isJsonObject()) {
      return Maps.newHashMap();
    }
    JsonObject ☃ = ☃.getAsJsonObject();
    Map<mw, my> ☃ = Maps.newHashMap();
    for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet())
    {
      mw ☃ = na.a((String)☃.getKey());
      if (☃ != null)
      {
        my ☃ = new my();
        if ((((JsonElement)☃.getValue()).isJsonPrimitive()) && (((JsonElement)☃.getValue()).getAsJsonPrimitive().isNumber()))
        {
          ☃.a(((JsonElement)☃.getValue()).getAsInt());
        }
        else if (((JsonElement)☃.getValue()).isJsonObject())
        {
          JsonObject ☃ = ((JsonElement)☃.getValue()).getAsJsonObject();
          if ((☃.has("value")) && (☃.get("value").isJsonPrimitive()) && (☃.get("value").getAsJsonPrimitive().isNumber())) {
            ☃.a(☃.getAsJsonPrimitive("value").getAsInt());
          }
          if ((☃.has("progress")) && (☃.l() != null)) {
            try
            {
              Constructor<? extends mz> ☃ = ☃.l().getConstructor(new Class[0]);
              mz ☃ = (mz)☃.newInstance(new Object[0]);
              ☃.a(☃.get("progress"));
              ☃.a(☃);
            }
            catch (Throwable ☃)
            {
              b.warn("Invalid statistic progress in " + d, ☃);
            }
          }
        }
        ☃.put(☃, ☃);
      }
      else
      {
        b.warn("Invalid statistic in " + d + ": Don't know what " + (String)☃.getKey() + " is");
      }
    }
    return ☃;
  }
  
  public static String a(Map<mw, my> ☃)
  {
    JsonObject ☃ = new JsonObject();
    for (Map.Entry<mw, my> ☃ : ☃.entrySet()) {
      if (((my)☃.getValue()).b() != null)
      {
        JsonObject ☃ = new JsonObject();
        
        ☃.addProperty("value", Integer.valueOf(((my)☃.getValue()).a()));
        try
        {
          ☃.add("progress", ((my)☃.getValue()).b().a());
        }
        catch (Throwable ☃)
        {
          b.warn("Couldn't save statistic " + ((mw)☃.getKey()).e() + ": error serializing progress", ☃);
        }
        ☃.add(getKeye, ☃);
      }
      else
      {
        ☃.addProperty(getKeye, Integer.valueOf(((my)☃.getValue()).a()));
      }
    }
    return ☃.toString();
  }
  
  public void d()
  {
    for (mw ☃ : a.keySet()) {
      e.add(☃);
    }
  }
  
  public void a(lf ☃)
  {
    int ☃ = c.at();
    Map<mw, Integer> ☃ = Maps.newHashMap();
    if ((g) || (☃ - f > 300))
    {
      f = ☃;
      for (mw ☃ : c()) {
        ☃.put(☃, Integer.valueOf(a(☃)));
      }
    }
    a.a(new fr(☃));
  }
  
  public void b(lf ☃)
  {
    Map<mw, Integer> ☃ = Maps.newHashMap();
    for (mq ☃ : mr.e) {
      if (a(☃))
      {
        ☃.put(☃, Integer.valueOf(a(☃)));
        e.remove(☃);
      }
    }
    a.a(new fr(☃));
  }
  
  public boolean e()
  {
    return g;
  }
}
