import com.google.common.collect.Sets;
import java.util.Set;

public class aag
  extends za
{
  private static final Set<afh> c = Sets.newHashSet(new afh[] { afi.cs, afi.q, afi.e, afi.E, afi.ah, afi.ag, afi.T, afi.D, afi.R, afi.o, afi.aI, afi.S, afi.p, afi.y, afi.x, afi.aD, afi.Y, afi.aV, afi.cB, afi.av, afi.aC, afi.A, afi.cM, afi.b, afi.U });
  
  protected aag(zw.a ☃)
  {
    super(2.0F, ☃, c);
  }
  
  public boolean b(afh ☃)
  {
    if (☃ == afi.Z) {
      return this.b.d() == 3;
    }
    if ((☃ == afi.ah) || (☃ == afi.ag)) {
      return this.b.d() >= 2;
    }
    if ((☃ == afi.bP) || (☃ == afi.bT)) {
      return this.b.d() >= 2;
    }
    if ((☃ == afi.R) || (☃ == afi.o)) {
      return this.b.d() >= 2;
    }
    if ((☃ == afi.S) || (☃ == afi.p)) {
      return this.b.d() >= 1;
    }
    if ((☃ == afi.y) || (☃ == afi.x)) {
      return this.b.d() >= 1;
    }
    if ((☃ == afi.aC) || (☃ == afi.aD)) {
      return this.b.d() >= 2;
    }
    if (☃.t() == arm.e) {
      return true;
    }
    if (☃.t() == arm.f) {
      return true;
    }
    if (☃.t() == arm.g) {
      return true;
    }
    return false;
  }
  
  public float a(zx ☃, afh ☃)
  {
    if ((☃.t() == arm.f) || (☃.t() == arm.g) || (☃.t() == arm.e)) {
      return this.a;
    }
    return super.a(☃, ☃);
  }
}
