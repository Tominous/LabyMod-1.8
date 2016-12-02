import com.google.common.base.Predicate;

class so$1
  implements Predicate<pk>
{
  so$1(so paramso) {}
  
  public boolean a(pk ☃)
  {
    if (!(☃ instanceof wn)) {
      return false;
    }
    if (bA.a) {
      return false;
    }
    double ☃ = a.f();
    if (☃.av()) {
      ☃ *= 0.800000011920929D;
    }
    if (☃.ax())
    {
      float ☃ = ((wn)☃).bY();
      if (☃ < 0.1F) {
        ☃ = 0.1F;
      }
      ☃ *= 0.7F * ☃;
    }
    if (☃.g(so.a(a)) > ☃) {
      return false;
    }
    return st.a(so.a(a), (pr)☃, false, true);
  }
}
