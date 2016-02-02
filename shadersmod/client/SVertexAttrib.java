package shadersmod.client;

import bmv.a;

public class SVertexAttrib
{
  public int index;
  public int count;
  public bmv.a type;
  public int offset;
  
  public SVertexAttrib(int index, int count, bmv.a type)
  {
    this.index = index;
    this.count = count;
    this.type = type;
  }
}
