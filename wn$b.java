public enum wn$b
{
  private static final b[] d;
  private final int e;
  private final String f;
  
  private wn$b(int id, String resourceKey)
  {
    e = id;
    f = resourceKey;
  }
  
  public int a()
  {
    return e;
  }
  
  public static b a(int id)
  {
    return d[(id % d.length)];
  }
  
  public String b()
  {
    return f;
  }
  
  static
  {
    d = new b[values().length];
    for (b entityplayer$enumchatvisibility : values()) {
      d[e] = entityplayer$enumchatvisibility;
    }
  }
}
