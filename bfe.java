import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.opengl.GL11;
import shadersmod.client.SVertexBuilder;

public class bfe
{
  private static final String __OBFID = "CL_00002567";
  
  public void a(bfd p_178177_1_)
  {
    if (p_178177_1_.h() > 0)
    {
      bmu var2 = p_178177_1_.g();
      int var3 = var2.g();
      ByteBuffer var4 = p_178177_1_.f();
      List var5 = var2.h();
      
      boolean forgePreDrawExists = Reflector.ForgeVertexFormatElementEnumUseage_preDraw.exists();
      boolean forgePostDrawExists = Reflector.ForgeVertexFormatElementEnumUseage_postDraw.exists();
      for (int var6 = 0; var6 < var5.size(); var6++)
      {
        bmv var7 = (bmv)var5.get(var6);
        bmv.b var8 = var7.b();
        if (forgePreDrawExists)
        {
          Reflector.callVoid(var8, Reflector.ForgeVertexFormatElementEnumUseage_preDraw, new Object[] { var2, Integer.valueOf(var6), Integer.valueOf(var3), var4 });
        }
        else
        {
          int var9 = var7.a().c();
          int var10 = var7.d();
          var4.position(var2.d(var6));
          switch (bfe.1.a[var8.ordinal()])
          {
          case 1: 
            GL11.glVertexPointer(var7.c(), var9, var3, var4);
            GL11.glEnableClientState(32884);
            break;
          case 2: 
            bqs.l(bqs.q + var10);
            GL11.glTexCoordPointer(var7.c(), var9, var3, var4);
            GL11.glEnableClientState(32888);
            bqs.l(bqs.q);
            break;
          case 3: 
            GL11.glColorPointer(var7.c(), var9, var3, var4);
            GL11.glEnableClientState(32886);
            break;
          case 4: 
            GL11.glNormalPointer(var9, var3, var4);
            GL11.glEnableClientState(32885);
          }
        }
      }
      bfd wr = p_178177_1_;
      if (wr.isMultiTexture()) {
        wr.drawMultiTexture();
      } else if (Config.isShaders()) {
        SVertexBuilder.drawArrays(p_178177_1_.i(), 0, p_178177_1_.h(), p_178177_1_);
      } else {
        GL11.glDrawArrays(p_178177_1_.i(), 0, p_178177_1_.h());
      }
      var6 = 0;
      for (int var11 = var5.size(); var6 < var11; var6++)
      {
        bmv var12 = (bmv)var5.get(var6);
        bmv.b var13 = var12.b();
        if (forgePostDrawExists)
        {
          Reflector.callVoid(var13, Reflector.ForgeVertexFormatElementEnumUseage_postDraw, new Object[] { var2, Integer.valueOf(var6), Integer.valueOf(var3), var4 });
        }
        else
        {
          int var10 = var12.d();
          switch (bfe.1.a[var13.ordinal()])
          {
          case 1: 
            GL11.glDisableClientState(32884);
            break;
          case 2: 
            bqs.l(bqs.q + var10);
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
    }
    p_178177_1_.b();
  }
}
