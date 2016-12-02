import com.google.common.base.Predicate;

final class o$6
  implements Predicate<pk>
{
  o$6(int paramInt1, int paramInt2) {}
  
  public boolean a(pk ☃)
  {
    if (!(☃ instanceof lf)) {
      return false;
    }
    lf ☃ = (lf)☃;
    return ((this.a <= -1) || (☃.bB >= this.a)) && ((this.b <= -1) || (☃.bB <= this.b));
  }
}
