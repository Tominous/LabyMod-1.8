import com.google.common.base.Predicate;

class ty$a$1
  implements Predicate<T>
{
  ty$a$1(ty.a parama, Predicate paramPredicate, py parampy) {}
  
  public boolean a(T ☃)
  {
    if ((this.a != null) && (!this.a.apply(☃))) {
      return false;
    }
    if ((☃ instanceof vn)) {
      return false;
    }
    if ((☃ instanceof wn))
    {
      double ☃ = ty.a.a(this.c);
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
      if (☃.g(this.b) > ☃) {
        return false;
      }
    }
    return ty.a.a(this.c, ☃, false);
  }
}
