import java.util.Comparator;

class ayf$c
  extends ayf.e
{
  /* Error */
  public ayf$c(ayf arg1, ave ☃)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 17	ayf$c:u	Layf;
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: invokespecial 19	ayf$e:<init>	(Layf;Lave;)V
    //   11: aload_0
    //   12: invokestatic 25	com/google/common/collect/Lists:newArrayList	()Ljava/util/ArrayList;
    //   15: putfield 29	ayf$c:w	Ljava/util/List;
    //   18: getstatic 34	na:d	Ljava/util/List;
    //   21: invokeinterface 40 1 0
    //   26: astore_3
    //   27: aload_3
    //   28: invokeinterface 46 1 0
    //   33: ifeq +124 -> 157
    //   36: aload_3
    //   37: invokeinterface 50 1 0
    //   42: checkcast 52	mu
    //   45: astore 4
    //   47: iconst_0
    //   48: istore 5
    //   50: aload 4
    //   52: invokevirtual 56	mu:a	()Lzw;
    //   55: invokestatic 62	zw:b	(Lzw;)I
    //   58: istore 6
    //   60: aload_1
    //   61: invokestatic 65	ayf:b	(Layf;)Lnb;
    //   64: aload 4
    //   66: invokevirtual 70	nb:a	(Lmw;)I
    //   69: ifle +9 -> 78
    //   72: iconst_1
    //   73: istore 5
    //   75: goto +62 -> 137
    //   78: getstatic 74	na:ae	[Lmw;
    //   81: iload 6
    //   83: aaload
    //   84: ifnull +25 -> 109
    //   87: aload_1
    //   88: invokestatic 65	ayf:b	(Layf;)Lnb;
    //   91: getstatic 74	na:ae	[Lmw;
    //   94: iload 6
    //   96: aaload
    //   97: invokevirtual 70	nb:a	(Lmw;)I
    //   100: ifle +9 -> 109
    //   103: iconst_1
    //   104: istore 5
    //   106: goto +31 -> 137
    //   109: getstatic 77	na:ac	[Lmw;
    //   112: iload 6
    //   114: aaload
    //   115: ifnull +22 -> 137
    //   118: aload_1
    //   119: invokestatic 65	ayf:b	(Layf;)Lnb;
    //   122: getstatic 77	na:ac	[Lmw;
    //   125: iload 6
    //   127: aaload
    //   128: invokevirtual 70	nb:a	(Lmw;)I
    //   131: ifle +6 -> 137
    //   134: iconst_1
    //   135: istore 5
    //   137: iload 5
    //   139: ifeq +15 -> 154
    //   142: aload_0
    //   143: getfield 29	ayf$c:w	Ljava/util/List;
    //   146: aload 4
    //   148: invokeinterface 81 2 0
    //   153: pop
    //   154: goto -127 -> 27
    //   157: aload_0
    //   158: new 10	ayf$c$1
    //   161: dup
    //   162: aload_0
    //   163: aload_1
    //   164: invokespecial 84	ayf$c$1:<init>	(Layf$c;Layf;)V
    //   167: putfield 88	ayf$c:x	Ljava/util/Comparator;
    //   170: return
    // Line number table:
    //   Java source line #437	-> byte code offset #0
    //   Java source line #438	-> byte code offset #5
    //   Java source line #440	-> byte code offset #11
    //   Java source line #441	-> byte code offset #18
    //   Java source line #442	-> byte code offset #47
    //   Java source line #443	-> byte code offset #50
    //   Java source line #445	-> byte code offset #60
    //   Java source line #446	-> byte code offset #72
    //   Java source line #447	-> byte code offset #78
    //   Java source line #448	-> byte code offset #103
    //   Java source line #449	-> byte code offset #109
    //   Java source line #450	-> byte code offset #134
    //   Java source line #452	-> byte code offset #137
    //   Java source line #453	-> byte code offset #142
    //   Java source line #455	-> byte code offset #154
    //   Java source line #457	-> byte code offset #157
    //   Java source line #493	-> byte code offset #170
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	c
    //   1	163	1	???	ayf
    //   0	171	2	☃	ave
    //   26	131	3	☃	java.util.Iterator
    //   45	102	4	☃	mu
    //   48	90	5	☃	boolean
    //   58	68	6	☃	int
  }
  
  protected void a(int ☃, int ☃, bfx ☃)
  {
    super.a(☃, ☃, ☃);
    if (v == 0) {
      ayf.a(u, ☃ + 115 - 18 + 1, ☃ + 1 + 1, 72, 18);
    } else {
      ayf.a(u, ☃ + 115 - 18, ☃ + 1, 72, 18);
    }
    if (v == 1) {
      ayf.a(u, ☃ + 165 - 18 + 1, ☃ + 1 + 1, 18, 18);
    } else {
      ayf.a(u, ☃ + 165 - 18, ☃ + 1, 18, 18);
    }
    if (v == 2) {
      ayf.a(u, ☃ + 215 - 18 + 1, ☃ + 1 + 1, 36, 18);
    } else {
      ayf.a(u, ☃ + 215 - 18, ☃ + 1, 36, 18);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    mu ☃ = c(☃);
    
    zw ☃ = ☃.a();
    ayf.a(u, ☃ + 40, ☃, ☃);
    
    int ☃ = zw.b(☃);
    a(na.ae[☃], ☃ + 115, ☃, ☃ % 2 == 0);
    a(na.ac[☃], ☃ + 165, ☃, ☃ % 2 == 0);
    a(☃, ☃ + 215, ☃, ☃ % 2 == 0);
  }
  
  protected String b(int ☃)
  {
    if (☃ == 1) {
      return "stat.crafted";
    }
    if (☃ == 2) {
      return "stat.used";
    }
    return "stat.depleted";
  }
}
