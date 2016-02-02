package net.minecraftforge.client.model.pipeline;

import bmu;
import cq;

public abstract interface IVertexConsumer
{
  public abstract bmu getVertexFormat();
  
  public abstract void setQuadTint(int paramInt);
  
  public abstract void setQuadOrientation(cq paramcq);
  
  public abstract void setQuadColored();
  
  public abstract void put(int paramInt, float... paramVarArgs);
}
