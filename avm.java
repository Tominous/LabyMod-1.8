import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Map;
import java.util.UUID;

public class avm
{
  private final String a;
  private final String b;
  private final String c;
  private final avm.a d;
  
  public avm(String ☃, String ☃, String ☃, String ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = avm.a.a(☃);
  }
  
  public String a()
  {
    return "token:" + this.c + ":" + this.b;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public GameProfile e()
  {
    try
    {
      UUID ☃ = UUIDTypeAdapter.fromString(b());
      return new GameProfile(☃, c());
    }
    catch (IllegalArgumentException ☃) {}
    return new GameProfile(null, c());
  }
  
  public avm.a f()
  {
    return this.d;
  }
  
  public static enum a
  {
    private static final Map<String, a> c;
    private final String d;
    
    private a(String ☃)
    {
      this.d = ☃;
    }
    
    public static a a(String ☃)
    {
      return (a)c.get(☃.toLowerCase());
    }
    
    static
    {
      c = Maps.newHashMap();
      for (a ☃ : values()) {
        c.put(☃.d, ☃);
      }
    }
  }
}
