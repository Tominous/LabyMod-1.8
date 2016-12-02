import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;

public class lt
{
  public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
  private final Map<String, lt.a> c = Maps.newHashMap();
  private final Map<UUID, lt.a> d = Maps.newHashMap();
  private final LinkedList<GameProfile> e = Lists.newLinkedList();
  private final MinecraftServer f;
  protected final Gson b;
  private final File g;
  
  public lt(MinecraftServer ☃, File ☃)
  {
    f = ☃;
    g = ☃;
    
    GsonBuilder ☃ = new GsonBuilder();
    ☃.registerTypeHierarchyAdapter(lt.a.class, new lt.b(null));
    b = ☃.create();
    
    b();
  }
  
  private static GameProfile a(MinecraftServer ☃, String ☃)
  {
    GameProfile[] ☃ = new GameProfile[1];
    ProfileLookupCallback ☃ = new ProfileLookupCallback()
    {
      public void onProfileLookupSucceeded(GameProfile ☃)
      {
        a[0] = ☃;
      }
      
      public void onProfileLookupFailed(GameProfile ☃, Exception ☃)
      {
        a[0] = null;
      }
    };
    ☃.aE().findProfilesByNames(new String[] { ☃ }, Agent.MINECRAFT, ☃);
    if ((!☃.af()) && (☃[0] == null))
    {
      UUID ☃ = wn.a(new GameProfile(null, ☃));
      GameProfile ☃ = new GameProfile(☃, ☃);
      ☃.onProfileLookupSucceeded(☃);
    }
    return ☃[0];
  }
  
  public void a(GameProfile ☃)
  {
    a(☃, null);
  }
  
  private void a(GameProfile ☃, Date ☃)
  {
    UUID ☃ = ☃.getId();
    if (☃ == null)
    {
      Calendar ☃ = Calendar.getInstance();
      ☃.setTime(new Date());
      ☃.add(2, 1);
      ☃ = ☃.getTime();
    }
    String ☃ = ☃.getName().toLowerCase(Locale.ROOT);
    lt.a ☃ = new lt.a(☃, ☃, null);
    if (d.containsKey(☃))
    {
      lt.a ☃ = (lt.a)d.get(☃);
      c.remove(☃.a().getName().toLowerCase(Locale.ROOT));
      e.remove(☃);
    }
    c.put(☃.getName().toLowerCase(Locale.ROOT), ☃);
    d.put(☃, ☃);
    e.addFirst(☃);
    c();
  }
  
  public GameProfile a(String ☃)
  {
    String ☃ = ☃.toLowerCase(Locale.ROOT);
    lt.a ☃ = (lt.a)c.get(☃);
    if ((☃ != null) && (new Date().getTime() >= lt.a.a(☃).getTime()))
    {
      d.remove(☃.a().getId());
      c.remove(☃.a().getName().toLowerCase(Locale.ROOT));
      e.remove(☃.a());
      ☃ = null;
    }
    if (☃ != null)
    {
      GameProfile ☃ = ☃.a();
      e.remove(☃);
      e.addFirst(☃);
    }
    else
    {
      GameProfile ☃ = a(f, ☃);
      if (☃ != null)
      {
        a(☃);
        ☃ = (lt.a)c.get(☃);
      }
    }
    c();
    return ☃ == null ? null : ☃.a();
  }
  
  public String[] a()
  {
    List<String> ☃ = Lists.newArrayList(c.keySet());
    return (String[])☃.toArray(new String[☃.size()]);
  }
  
  public GameProfile a(UUID ☃)
  {
    lt.a ☃ = (lt.a)d.get(☃);
    return ☃ == null ? null : ☃.a();
  }
  
  private lt.a b(UUID ☃)
  {
    lt.a ☃ = (lt.a)d.get(☃);
    if (☃ != null)
    {
      GameProfile ☃ = ☃.a();
      e.remove(☃);
      e.addFirst(☃);
    }
    return ☃;
  }
  
  public void b()
  {
    BufferedReader ☃ = null;
    try
    {
      ☃ = Files.newReader(g, Charsets.UTF_8);
      List<lt.a> ☃ = (List)b.fromJson(☃, h);
      
      c.clear();
      d.clear();
      e.clear();
      for (lt.a ☃ : Lists.reverse(☃)) {
        if (☃ != null) {
          a(☃.a(), ☃.b());
        }
      }
    }
    catch (FileNotFoundException localFileNotFoundException) {}catch (JsonParseException localJsonParseException) {}finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  public void c()
  {
    String ☃ = b.toJson(a(1000));
    BufferedWriter ☃ = null;
    try
    {
      ☃ = Files.newWriter(g, Charsets.UTF_8);
      ☃.write(☃);
    }
    catch (FileNotFoundException ☃) {}catch (IOException ☃) {}finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  private List<lt.a> a(int ☃)
  {
    ArrayList<lt.a> ☃ = Lists.newArrayList();
    List<GameProfile> ☃ = Lists.newArrayList(Iterators.limit(e.iterator(), ☃));
    for (GameProfile ☃ : ☃)
    {
      lt.a ☃ = b(☃.getId());
      if (☃ != null) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  class b
    implements JsonDeserializer<lt.a>, JsonSerializer<lt.a>
  {
    private b() {}
    
    public JsonElement a(lt.a ☃, Type ☃, JsonSerializationContext ☃)
    {
      JsonObject ☃ = new JsonObject();
      ☃.addProperty("name", ☃.a().getName());
      UUID ☃ = ☃.a().getId();
      ☃.addProperty("uuid", ☃ == null ? "" : ☃.toString());
      ☃.addProperty("expiresOn", lt.a.format(☃.b()));
      return ☃;
    }
    
    public lt.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      if (☃.isJsonObject())
      {
        JsonObject ☃ = ☃.getAsJsonObject();
        JsonElement ☃ = ☃.get("name");
        JsonElement ☃ = ☃.get("uuid");
        JsonElement ☃ = ☃.get("expiresOn");
        if ((☃ == null) || (☃ == null)) {
          return null;
        }
        String ☃ = ☃.getAsString();
        String ☃ = ☃.getAsString();
        Date ☃ = null;
        if (☃ != null) {
          try
          {
            ☃ = lt.a.parse(☃.getAsString());
          }
          catch (ParseException ☃)
          {
            ☃ = null;
          }
        }
        if ((☃ == null) || (☃ == null)) {
          return null;
        }
        UUID ☃;
        try
        {
          ☃ = UUID.fromString(☃);
        }
        catch (Throwable ☃)
        {
          return null;
        }
        lt.a ☃ = new lt.a(lt.this, new GameProfile(☃, ☃), ☃, null);
        return ☃;
      }
      return null;
    }
  }
  
  class a
  {
    private final GameProfile b;
    private final Date c;
    
    private a(GameProfile ☃, Date ☃)
    {
      b = ☃;
      c = ☃;
    }
    
    public GameProfile a()
    {
      return b;
    }
    
    public Date b()
    {
      return c;
    }
  }
  
  private static final ParameterizedType h = new ParameterizedType()
  {
    public Type[] getActualTypeArguments()
    {
      return new Type[] { lt.a.class };
    }
    
    public Type getRawType()
    {
      return List.class;
    }
    
    public Type getOwnerType()
    {
      return null;
    }
  };
}
