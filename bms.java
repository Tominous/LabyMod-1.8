import shadersmod.client.SVertexFormat;

public class bms
{
  public static bmu a = new bmu();
  public static bmu b = new bmu();
  private static final bmu BLOCK_VANILLA = a;
  private static final bmu ITEM_VANILLA = b;
  public static final bmu c = new bmu();
  public static final bmu d = new bmu();
  public static final bmu e = new bmu();
  public static final bmu f = new bmu();
  public static final bmu g = new bmu();
  public static final bmu h = new bmu();
  public static final bmu i = new bmu();
  public static final bmu j = new bmu();
  public static final bmu k = new bmu();
  public static final bmu l = new bmu();
  public static final bmv m = new bmv(0, bmv.a.a, bmv.b.a, 3);
  public static final bmv n = new bmv(0, bmv.a.b, bmv.b.c, 4);
  public static final bmv o = new bmv(0, bmv.a.a, bmv.b.d, 2);
  public static final bmv p = new bmv(1, bmv.a.e, bmv.b.d, 2);
  public static final bmv q = new bmv(0, bmv.a.c, bmv.b.b, 3);
  public static final bmv r = new bmv(0, bmv.a.c, bmv.b.g, 1);
  private static final String __OBFID = "CL_00002403";
  
  public static void updateVertexFormats()
  {
    if (Config.isShaders())
    {
      a = SVertexFormat.makeDefVertexFormatBlock();
      b = SVertexFormat.makeDefVertexFormatItem();
    }
    else
    {
      a = BLOCK_VANILLA;
      b = ITEM_VANILLA;
    }
    if (Reflector.Attributes_DEFAULT_BAKED_FORMAT.exists())
    {
      bmu vfSrc = b;
      bmu vfDst = (bmu)Reflector.getFieldValue(Reflector.Attributes_DEFAULT_BAKED_FORMAT);
      
      vfDst.a();
      for (int i = 0; i < vfSrc.i(); i++) {
        vfDst.a(vfSrc.c(i));
      }
    }
  }
  
  static
  {
    a.a(m);
    a.a(n);
    a.a(o);
    a.a(p);
    b.a(m);
    b.a(n);
    b.a(o);
    b.a(q);
    b.a(r);
    c.a(m);
    c.a(o);
    c.a(q);
    c.a(r);
    d.a(m);
    d.a(o);
    d.a(n);
    d.a(p);
    e.a(m);
    f.a(m);
    f.a(n);
    g.a(m);
    g.a(o);
    h.a(m);
    h.a(q);
    h.a(r);
    i.a(m);
    i.a(o);
    i.a(n);
    j.a(m);
    j.a(o);
    j.a(q);
    j.a(r);
    k.a(m);
    k.a(o);
    k.a(p);
    k.a(n);
    l.a(m);
    l.a(o);
    l.a(n);
    l.a(q);
    l.a(r);
  }
}
