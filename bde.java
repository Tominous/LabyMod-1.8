public class bde
{
  public String a;
  public String b;
  public String c;
  public int onlinePlayers = 0;
  public int maxPlayers = 0;
  public String d;
  public long e;
  public int f = 47;
  public String g = "1.8.8";
  public boolean h;
  public String i;
  private bde.a j = bde.a.c;
  private String k;
  public String serverCommand = "";
  private boolean l;
  
  public bde(String p_i46420_1_, String p_i46420_2_, boolean p_i46420_3_, String command)
  {
    a = p_i46420_1_;
    b = p_i46420_2_;
    l = p_i46420_3_;
    serverCommand = command;
  }
  
  public bde(String p_i46420_1_, String p_i46420_2_, boolean p_i46420_3_)
  {
    a = p_i46420_1_;
    b = p_i46420_2_;
    l = p_i46420_3_;
  }
  
  public dn a()
  {
    dn nbttagcompound = new dn();
    nbttagcompound.a("name", a);
    nbttagcompound.a("ip", b);
    nbttagcompound.a("command", serverCommand);
    if (k != null) {
      nbttagcompound.a("icon", k);
    }
    if (j == bde.a.a) {
      nbttagcompound.a("acceptTextures", true);
    } else if (j == bde.a.b) {
      nbttagcompound.a("acceptTextures", false);
    }
    return nbttagcompound;
  }
  
  public bde.a b()
  {
    return j;
  }
  
  public void a(bde.a mode)
  {
    j = mode;
  }
  
  public static bde a(dn nbtCompound)
  {
    bde serverdata = new bde(nbtCompound.j("name"), nbtCompound.j("ip"), false, nbtCompound.j("command"));
    if (nbtCompound.b("icon", 8)) {
      serverdata.a(nbtCompound.j("icon"));
    }
    if (nbtCompound.b("acceptTextures", 1))
    {
      if (nbtCompound.n("acceptTextures")) {
        serverdata.a(bde.a.a);
      } else {
        serverdata.a(bde.a.b);
      }
    }
    else {
      serverdata.a(bde.a.c);
    }
    return serverdata;
  }
  
  public String c()
  {
    return k;
  }
  
  public void a(String icon)
  {
    k = icon;
  }
  
  public boolean d()
  {
    return l;
  }
  
  public void a(bde serverDataIn)
  {
    b = b;
    a = a;
    a(serverDataIn.b());
    k = k;
    serverCommand = serverCommand;
    l = l;
  }
  
  public static enum a
  {
    private final eu d;
    
    private a(String p_i1053_3_)
    {
      d = new fb("addServer.resourcePack." + p_i1053_3_, new Object[0]);
    }
    
    public eu a()
    {
      return d;
    }
  }
}
