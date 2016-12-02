import com.google.common.base.Predicate;

class ty$a<T extends pr>
  extends sp<T>
{
  public ty$a(final py ☃, Class<T> ☃, int ☃, boolean ☃, boolean ☃, final Predicate<? super T> ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    c = new Predicate()
    {
      public boolean a(T ☃)
      {
        if ((☃ != null) && (!☃.apply(☃))) {
          return false;
        }
        if ((☃ instanceof vn)) {
          return false;
        }
        if ((☃ instanceof wn))
        {
          double ☃ = ty.a.a(ty.a.this);
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
          if (☃.g(☃) > ☃) {
            return false;
          }
        }
        return ty.a.a(ty.a.this, ☃, false);
      }
    };
  }
}
