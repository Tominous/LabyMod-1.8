class ayn$c
  extends ayn.d
{
  private final int p;
  private final int q;
  
  public ayn$c(ayn this$0, int p_i1076_2_, int p_i1076_3_, int p_i1076_4_, int p_i1076_5_, int p_i1076_6_)
  {
    super(p_i1076_2_, p_i1076_3_, p_i1076_4_, ayl.a, 0 + pe.a[p_i1076_5_].f() % 8 * 18, 198 + pe.a[p_i1076_5_].f() / 8 * 18);
    p = p_i1076_5_;
    q = p_i1076_6_;
  }
  
  public void b(int mouseX, int mouseY)
  {
    String s = bnq.a(pe.a[p].a(), new Object[0]);
    if ((q >= 3) && (p != lH)) {
      s = s + " II";
    }
    this$0.a(s, mouseX, mouseY);
  }
}
