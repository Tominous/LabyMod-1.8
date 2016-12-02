package net.minecraft.realms;

import bmv;

public class RealmsVertexFormatElement
{
  private bmv v;
  
  public RealmsVertexFormatElement(bmv ☃)
  {
    this.v = ☃;
  }
  
  public bmv getVertexFormatElement()
  {
    return this.v;
  }
  
  public boolean isPosition()
  {
    return this.v.f();
  }
  
  public int getIndex()
  {
    return this.v.d();
  }
  
  public int getByteSize()
  {
    return this.v.e();
  }
  
  public int getCount()
  {
    return this.v.c();
  }
  
  public int hashCode()
  {
    return this.v.hashCode();
  }
  
  public boolean equals(Object ☃)
  {
    return this.v.equals(☃);
  }
  
  public String toString()
  {
    return this.v.toString();
  }
}
