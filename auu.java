import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public abstract interface auu
{
  public static final Map<String, auu> a = ;
  public static final auu b = new aus("dummy");
  public static final auu c = new aus("trigger");
  public static final auu d = new aus("deathCount");
  public static final auu e = new aus("playerKillCount");
  public static final auu f = new aus("totalKillCount");
  public static final auu g = new aut("health");
  public static final auu[] h = { new aur("teamkill.", a.a), new aur("teamkill.", a.b), new aur("teamkill.", a.c), new aur("teamkill.", a.d), new aur("teamkill.", a.e), new aur("teamkill.", a.f), new aur("teamkill.", a.g), new aur("teamkill.", a.h), new aur("teamkill.", a.i), new aur("teamkill.", a.j), new aur("teamkill.", a.k), new aur("teamkill.", a.l), new aur("teamkill.", a.m), new aur("teamkill.", a.n), new aur("teamkill.", a.o), new aur("teamkill.", a.p) };
  public static final auu[] i = { new aur("killedByTeam.", a.a), new aur("killedByTeam.", a.b), new aur("killedByTeam.", a.c), new aur("killedByTeam.", a.d), new aur("killedByTeam.", a.e), new aur("killedByTeam.", a.f), new aur("killedByTeam.", a.g), new aur("killedByTeam.", a.h), new aur("killedByTeam.", a.i), new aur("killedByTeam.", a.j), new aur("killedByTeam.", a.k), new aur("killedByTeam.", a.l), new aur("killedByTeam.", a.m), new aur("killedByTeam.", a.n), new aur("killedByTeam.", a.o), new aur("killedByTeam.", a.p) };
  
  public abstract String a();
  
  public abstract int a(List<wn> paramList);
  
  public abstract boolean b();
  
  public abstract auu.a c();
  
  public static enum a
  {
    private static final Map<String, a> c;
    private final String d;
    
    static
    {
      c = Maps.newHashMap();
      for (a ☃ : values()) {
        c.put(☃.a(), ☃);
      }
    }
    
    private a(String ☃)
    {
      this.d = ☃;
    }
    
    public String a()
    {
      return this.d;
    }
    
    public static a a(String ☃)
    {
      a ☃ = (a)c.get(☃);
      return ☃ == null ? a : ☃;
    }
  }
}
