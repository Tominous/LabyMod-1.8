import shadersmod.client.SVertexFormat;

public class bbs
{
  public bcg[] a;
  public int b;
  private boolean c;
  private static final String __OBFID = "CL_00000850";
  
  public bbs(bcg[] vertices)
  {
    a = vertices;
    b = vertices.length;
  }
  
  public bbs(bcg[] vertices, int texcoordU1, int texcoordV1, int texcoordU2, int texcoordV2, float textureWidth, float textureHeight)
  {
    this(vertices);
    float var8 = 0.0F / textureWidth;
    float var9 = 0.0F / textureHeight;
    vertices[0] = vertices[0].a(texcoordU2 / textureWidth - var8, texcoordV1 / textureHeight + var9);
    vertices[1] = vertices[1].a(texcoordU1 / textureWidth + var8, texcoordV1 / textureHeight + var9);
    vertices[2] = vertices[2].a(texcoordU1 / textureWidth + var8, texcoordV2 / textureHeight - var9);
    vertices[3] = vertices[3].a(texcoordU2 / textureWidth - var8, texcoordV2 / textureHeight - var9);
  }
  
  public void a()
  {
    bcg[] var1 = new bcg[a.length];
    for (int var2 = 0; var2 < a.length; var2++) {
      var1[var2] = a[(a.length - var2 - 1)];
    }
    a = var1;
  }
  
  public void a(bfd renderer, float scale)
  {
    aui var3 = a[1].a.a(a[0].a);
    aui var4 = a[1].a.a(a[2].a);
    aui var5 = var4.c(var3).a();
    float var6 = (float)a;
    float var7 = (float)b;
    float var8 = (float)c;
    if (c)
    {
      var6 = -var6;
      var7 = -var7;
      var8 = -var8;
    }
    if (Config.isShaders()) {
      renderer.a(7, SVertexFormat.defVertexFormatTextured);
    } else {
      renderer.a(7, bms.c);
    }
    for (int var9 = 0; var9 < 4; var9++)
    {
      bcg var10 = a[var9];
      renderer.b(a.a * scale, a.b * scale, a.c * scale).a(b, c).c(var6, var7, var8).d();
    }
    bfx.a().b();
  }
}
