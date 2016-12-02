 enum bgf$c
{
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private static final c[] k;
  private static final c[] l;
  private static final String __OBFID = "CL_00002514";
  
  private bgf$c(String p_i46234_1_, int p_i46234_2_, int p_i46234_3_, int p_i46234_4_, int p_i46234_5_, int p_i46234_6_)
  {
    g = p_i46234_3_;
    h = p_i46234_4_;
    i = p_i46234_5_;
    j = p_i46234_6_;
  }
  
  public static c a(cq p_178184_0_)
  {
    return k[p_178184_0_.a()];
  }
  
  static
  {
    k = new c[6];
    
    l = new c[] { a, b, c, d, e, f };
    
    k[cq.a.a()] = a;
    k[cq.b.a()] = b;
    k[cq.c.a()] = c;
    k[cq.d.a()] = d;
    k[cq.e.a()] = e;
    k[cq.f.a()] = f;
  }
}
