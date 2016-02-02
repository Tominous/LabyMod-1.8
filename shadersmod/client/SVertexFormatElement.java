package shadersmod.client;

import bmv;
import bmv.a;
import bmv.b;

public class SVertexFormatElement
  extends bmv
{
  int sUsage;
  
  public SVertexFormatElement(int sUsage, bmv.a type, int count)
  {
    super(0, type, bmv.b.g, count);
    this.sUsage = sUsage;
  }
}
