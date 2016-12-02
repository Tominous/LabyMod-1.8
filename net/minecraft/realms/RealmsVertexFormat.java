package net.minecraft.realms;

import bmu;
import bmv;
import java.util.ArrayList;
import java.util.List;

public class RealmsVertexFormat
{
  private bmu v;
  
  public RealmsVertexFormat(bmu ☃)
  {
    this.v = ☃;
  }
  
  public RealmsVertexFormat from(bmu ☃)
  {
    this.v = ☃;
    return this;
  }
  
  public bmu getVertexFormat()
  {
    return this.v;
  }
  
  public void clear()
  {
    this.v.a();
  }
  
  public int getUvOffset(int ☃)
  {
    return this.v.b(☃);
  }
  
  public int getElementCount()
  {
    return this.v.i();
  }
  
  public boolean hasColor()
  {
    return this.v.d();
  }
  
  public boolean hasUv(int ☃)
  {
    return this.v.a(☃);
  }
  
  public RealmsVertexFormatElement getElement(int ☃)
  {
    return new RealmsVertexFormatElement(this.v.c(☃));
  }
  
  public RealmsVertexFormat addElement(RealmsVertexFormatElement ☃)
  {
    return from(this.v.a(☃.getVertexFormatElement()));
  }
  
  public int getColorOffset()
  {
    return this.v.e();
  }
  
  public List<RealmsVertexFormatElement> getElements()
  {
    List<RealmsVertexFormatElement> ☃ = new ArrayList();
    for (bmv ☃ : this.v.h()) {
      ☃.add(new RealmsVertexFormatElement(☃));
    }
    return ☃;
  }
  
  public boolean hasNormal()
  {
    return this.v.b();
  }
  
  public int getVertexSize()
  {
    return this.v.g();
  }
  
  public int getOffset(int ☃)
  {
    return this.v.d(☃);
  }
  
  public int getNormalOffset()
  {
    return this.v.c();
  }
  
  public int getIntegerSize()
  {
    return this.v.f();
  }
  
  public boolean equals(Object ☃)
  {
    return this.v.equals(☃);
  }
  
  public int hashCode()
  {
    return this.v.hashCode();
  }
  
  public String toString()
  {
    return this.v.toString();
  }
}
