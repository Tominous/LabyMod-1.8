import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bfe
{
  public void a(bfd ☃)
  {
    if (☃.h() > 0)
    {
      bmu ☃ = ☃.g();
      int ☃ = ☃.g();
      ByteBuffer ☃ = ☃.f();
      List<bmv> ☃ = ☃.h();
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        bmv ☃ = (bmv)☃.get(☃);
        bmv.b ☃ = ☃.b();
        int ☃ = ☃.a().c();
        int ☃ = ☃.d();
        ☃.position(☃.d(☃));
        switch (bfe.1.a[☃.ordinal()])
        {
        case 1: 
          GL11.glVertexPointer(☃.c(), ☃, ☃, ☃);
          GL11.glEnableClientState(32884);
          break;
        case 2: 
          bqs.l(bqs.q + ☃);
          GL11.glTexCoordPointer(☃.c(), ☃, ☃, ☃);
          GL11.glEnableClientState(32888);
          bqs.l(bqs.q);
          break;
        case 3: 
          GL11.glColorPointer(☃.c(), ☃, ☃, ☃);
          GL11.glEnableClientState(32886);
          break;
        case 4: 
          GL11.glNormalPointer(☃, ☃, ☃);
          GL11.glEnableClientState(32885);
        }
      }
      GL11.glDrawArrays(☃.i(), 0, ☃.h());
      
      int ☃ = 0;
      for (int ☃ = ☃.size(); ☃ < ☃; ☃++)
      {
        bmv ☃ = (bmv)☃.get(☃);
        bmv.b ☃ = ☃.b();
        int ☃ = ☃.d();
        switch (bfe.1.a[☃.ordinal()])
        {
        case 1: 
          GL11.glDisableClientState(32884);
          break;
        case 2: 
          bqs.l(bqs.q + ☃);
          GL11.glDisableClientState(32888);
          bqs.l(bqs.q);
          break;
        case 3: 
          GL11.glDisableClientState(32886);
          bfl.G();
          break;
        case 4: 
          GL11.glDisableClientState(32885);
        }
      }
    }
    ☃.b();
  }
}
