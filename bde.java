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
    this.a = p_i46420_1_;
    this.b = p_i46420_2_;
    this.l = p_i46420_3_;
    this.serverCommand = command;
  }
  
  public bde(String p_i46420_1_, String p_i46420_2_, boolean p_i46420_3_)
  {
    this.a = p_i46420_1_;
    this.b = p_i46420_2_;
    this.l = p_i46420_3_;
  }
  
  public dn a()
  {
    dn nbttagcompound = new dn();
    nbttagcompound.a("name", this.a);
    nbttagcompound.a("ip", this.b);
    nbttagcompound.a("command", this.serverCommand);
    if (this.k != null) {
      nbttagcompound.a("icon", this.k);
    }
    if (this.j == bde.a.a) {
      nbttagcompound.a("acceptTextures", true);
    } else if (this.j == bde.a.b) {
      nbttagcompound.a("acceptTextures", false);
    }
    return nbttagcompound;
  }
  
  public bde.a b()
  {
    return this.j;
  }
  
  public void a(bde.a mode)
  {
    this.j = mode;
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
    return this.k;
  }
  
  public void a(String icon)
  {
    this.k = icon;
  }
  
  public boolean d()
  {
    return this.l;
  }
  
  public void a(bde serverDataIn)
  {
    this.b = serverDataIn.b;
    this.a = serverDataIn.a;
    a(serverDataIn.b());
    this.k = serverDataIn.k;
    this.serverCommand = serverDataIn.serverCommand;
    this.l = serverDataIn.l;
  }
  
  public static enum a
  {
    private final eu d;
    
    private a(String p_i1053_3_)
    {
      this.d = new fb("addServer.resourcePack." + p_i1053_3_, new Object[0]);
    }
    
    public eu a()
    {
      return this.d;
    }
  }
}
