package net.minecraftforge.client.model;

import cq;
import javax.vecmath.Matrix4f;

public abstract interface ITransformation
{
  public abstract Matrix4f getMatrix();
  
  public abstract cq rotate(cq paramcq);
  
  public abstract int rotate(cq paramcq, int paramInt);
}
