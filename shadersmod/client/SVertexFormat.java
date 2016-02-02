package shadersmod.client;

import bmu;
import bmv;
import bmv.a;
import bmv.b;

public class SVertexFormat
{
  public static final int vertexSizeBlock = 14;
  public static final int offsetMidTexCoord = 8;
  public static final int offsetTangent = 10;
  public static final int offsetEntity = 12;
  public static final bmu defVertexFormatTextured = ;
  
  public static bmu makeDefVertexFormatBlock()
  {
    bmu vf = new bmu();
    vf.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    vf.a(new bmv(0, bmv.a.b, bmv.b.c, 4));
    vf.a(new bmv(0, bmv.a.a, bmv.b.d, 2));
    vf.a(new bmv(1, bmv.a.e, bmv.b.d, 2));
    
    vf.a(new bmv(0, bmv.a.c, bmv.b.b, 3));
    vf.a(new bmv(0, bmv.a.c, bmv.b.g, 1));
    
    vf.a(new bmv(0, bmv.a.a, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    return vf;
  }
  
  public static bmu makeDefVertexFormatItem()
  {
    bmu vf = new bmu();
    vf.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    vf.a(new bmv(0, bmv.a.b, bmv.b.c, 4));
    vf.a(new bmv(0, bmv.a.a, bmv.b.d, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.c, bmv.b.b, 3));
    vf.a(new bmv(0, bmv.a.c, bmv.b.g, 1));
    
    vf.a(new bmv(0, bmv.a.a, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    return vf;
  }
  
  public static bmu makeDefVertexFormatTextured()
  {
    bmu vf = new bmu();
    vf.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    vf.a(new bmv(0, bmv.a.b, bmv.b.g, 4));
    vf.a(new bmv(0, bmv.a.a, bmv.b.d, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.c, bmv.b.b, 3));
    vf.a(new bmv(0, bmv.a.c, bmv.b.g, 1));
    
    vf.a(new bmv(0, bmv.a.a, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    return vf;
  }
  
  public static void setDefBakedFormat(bmu vf)
  {
    vf.a();
    vf.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    vf.a(new bmv(0, bmv.a.b, bmv.b.c, 4));
    vf.a(new bmv(0, bmv.a.a, bmv.b.d, 2));
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 2));
    vf.a(new bmv(0, bmv.a.c, bmv.b.b, 3));
    vf.a(new bmv(0, bmv.a.c, bmv.b.g, 1));
    
    vf.a(new bmv(0, bmv.a.a, bmv.b.g, 2));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
    
    vf.a(new bmv(0, bmv.a.e, bmv.b.g, 4));
  }
}
