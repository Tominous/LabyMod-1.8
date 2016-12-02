import de.labystudio.gommehd.GommeHDSign;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bhj
  extends bhd<aln>
{
  private static final jy c = new jy("textures/entity/sign.png");
  private final bbx d = new bbx();
  
  public void a(aln te, double x, double y, double z, float partialTicks, int destroyStage)
  {
    GommeHDSign.render(te);
    afh block = te.w();
    bfl.E();
    float f = 0.6666667F;
    if (block == afi.an)
    {
      bfl.b((float)x + 0.5F, (float)y + 0.75F * f, (float)z + 0.5F);
      float f1 = te.u() * 360 / 16.0F;
      bfl.b(-f1, 0.0F, 1.0F, 0.0F);
      this.d.b.j = true;
    }
    else
    {
      int k = te.u();
      float f2 = 0.0F;
      if (k == 2) {
        f2 = 180.0F;
      }
      if (k == 4) {
        f2 = 90.0F;
      }
      if (k == 5) {
        f2 = -90.0F;
      }
      bfl.b((float)x + 0.5F, (float)y + 0.75F * f, (float)z + 0.5F);
      bfl.b(-f2, 0.0F, 1.0F, 0.0F);
      bfl.b(0.0F, -0.3125F, -0.4375F);
      this.d.b.j = false;
    }
    if (destroyStage >= 0)
    {
      a(a[destroyStage]);
      bfl.n(5890);
      bfl.E();
      bfl.a(4.0F, 2.0F, 1.0F);
      bfl.b(0.0625F, 0.0625F, 0.0625F);
      bfl.n(5888);
    }
    else
    {
      a(c);
    }
    bfl.B();
    bfl.E();
    bfl.a(f, -f, -f);
    this.d.a();
    bfl.F();
    avn fontrenderer = c();
    float f3 = 0.015625F * f;
    bfl.b(0.0F, 0.5F * f, 0.07F * f);
    bfl.a(f3, -f3, f3);
    GL11.glNormal3f(0.0F, 0.0F, -1.0F * f3);
    bfl.a(false);
    int i = 0;
    if (destroyStage < 0) {
      for (int j = 0; j < te.a.length; j++) {
        if (te.a[j] != null)
        {
          eu ichatcomponent = te.a[j];
          List<eu> list = avu.a(ichatcomponent, 90, fontrenderer, false, true);
          String s = (list != null) && (list.size() > 0) ? ((eu)list.get(0)).d() : "";
          if (j == te.f)
          {
            s = "> " + s + " <";
            fontrenderer.a(s, -fontrenderer.a(s) / 2, j * 10 - te.a.length * 5, i);
          }
          else
          {
            fontrenderer.a(s, -fontrenderer.a(s) / 2, j * 10 - te.a.length * 5, i);
          }
        }
      }
    }
    bfl.a(true);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
    if (destroyStage >= 0)
    {
      bfl.n(5890);
      bfl.F();
      bfl.n(5888);
    }
  }
}
