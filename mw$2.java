import java.text.DecimalFormat;

final class mw$2
  implements mx
{
  public String a(int ☃)
  {
    double ☃ = ☃ / 20.0D;
    double ☃ = ☃ / 60.0D;
    double ☃ = ☃ / 60.0D;
    double ☃ = ☃ / 24.0D;
    double ☃ = ☃ / 365.0D;
    if (☃ > 0.5D) {
      return mw.n().format(☃) + " y";
    }
    if (☃ > 0.5D) {
      return mw.n().format(☃) + " d";
    }
    if (☃ > 0.5D) {
      return mw.n().format(☃) + " h";
    }
    if (☃ > 0.5D) {
      return mw.n().format(☃) + " m";
    }
    return ☃ + " s";
  }
}
