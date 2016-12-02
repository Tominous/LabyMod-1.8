package de.labystudio.modapi.events;

import bbj;
import bct;
import de.labystudio.modapi.Cancellable;
import de.labystudio.modapi.Event;
import de.labystudio.modapi.Listener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pk;

public class RenderModelBipedEvent
  extends Event
  implements Cancellable
{
  public static final Map<Listener, List<Method>> listenerMethods = new HashMap();
  private bct bipedHead;
  private bct bipedHeadwear;
  private bct bipedBody;
  private bct bipedRightArm;
  private bct bipedLeftArm;
  private bct bipedRightLeg;
  private bct bipedLeftLeg;
  private bct modifiedBipedHead;
  private bct modifiedBipedHeadwear;
  private bct modifiedBipedBody;
  private bct modifiedBipedRightArm;
  private bct modifiedBipedLeftArm;
  private bct modifiedBipedRightLeg;
  private bct modifiedBipedLeftLeg;
  private bbj modelBiped;
  private float var1;
  private float var2;
  private float var3;
  private float var4;
  private float var5;
  private pk entity;
  private boolean cancelled;
  private float scale;
  
  public RenderModelBipedEvent(bct bipedHead, bct bipedHeadwear, bct bipedBody, bct bipedRightArm, bct bipedLeftArm, bct bipedRightLeg, bct bipedLeftLeg, float scale, pk entityIn, float var1, float var2, float var3, float var4, float var5, bbj modelBiped)
  {
    this.bipedHead = bipedHead;
    this.bipedHeadwear = bipedHeadwear;
    this.bipedBody = bipedBody;
    this.bipedRightArm = bipedRightArm;
    this.bipedLeftArm = bipedLeftArm;
    this.bipedRightLeg = bipedRightLeg;
    this.bipedLeftLeg = bipedLeftLeg;
    this.scale = scale;
    this.modelBiped = modelBiped;
    this.var1 = var1;
    this.var2 = var2;
    this.var3 = var3;
    this.var4 = var4;
    this.var5 = var5;
    this.entity = entityIn;
  }
  
  public pk getEntity()
  {
    return this.entity;
  }
  
  public void setCancelled(boolean cancel)
  {
    this.cancelled = cancel;
  }
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public bct getBipedHead()
  {
    return this.bipedHead;
  }
  
  public bct getBipedHeadwear()
  {
    return this.bipedHeadwear;
  }
  
  public bct getBipedBody()
  {
    return this.bipedBody;
  }
  
  public bct getBipedRightArm()
  {
    return this.bipedRightArm;
  }
  
  public bct getBipedLeftArm()
  {
    return this.bipedLeftArm;
  }
  
  public bct getBipedRightLeg()
  {
    return this.bipedRightLeg;
  }
  
  public bct getBipedLeftLeg()
  {
    return this.bipedLeftLeg;
  }
  
  public void setBipedHead(bct bipedHead)
  {
    this.modifiedBipedHead = bipedHead;
  }
  
  public void setBipedHeadwear(bct bipedHeadwear)
  {
    this.modifiedBipedHeadwear = bipedHeadwear;
  }
  
  public void setBipedBody(bct bipedBody)
  {
    this.modifiedBipedBody = bipedBody;
  }
  
  public void setBipedRightArm(bct bipedRightArm)
  {
    this.modifiedBipedRightArm = bipedRightArm;
  }
  
  public void setBipedLeftArm(bct bipedLeftArm)
  {
    this.modifiedBipedLeftArm = bipedLeftArm;
  }
  
  public void setBipedRightLeg(bct bipedRightLeg)
  {
    this.modifiedBipedRightLeg = bipedRightLeg;
  }
  
  public void setBipedLeftLeg(bct bipedLeftLeg)
  {
    this.modifiedBipedLeftLeg = bipedLeftLeg;
  }
  
  public bct getModifiedBipedBody()
  {
    return this.modifiedBipedBody;
  }
  
  public bct getModifiedBipedHead()
  {
    return this.modifiedBipedHead;
  }
  
  public bct getModifiedBipedHeadwear()
  {
    return this.modifiedBipedHeadwear;
  }
  
  public bct getModifiedBipedLeftArm()
  {
    return this.modifiedBipedLeftArm;
  }
  
  public bct getModifiedBipedLeftLeg()
  {
    return this.modifiedBipedLeftLeg;
  }
  
  public bct getModifiedBipedRightArm()
  {
    return this.modifiedBipedRightArm;
  }
  
  public bct getModifiedBipedRightLeg()
  {
    return this.modifiedBipedRightLeg;
  }
  
  public void removeBipedHead()
  {
    this.modifiedBipedHead = this.bipedHead;
  }
  
  public void removeBipedHeadwear()
  {
    this.modifiedBipedHeadwear = this.bipedHeadwear;
  }
  
  public void removeBipedBody()
  {
    this.modifiedBipedBody = this.bipedBody;
  }
  
  public void removeBipedRightArm()
  {
    this.modifiedBipedRightArm = this.bipedRightArm;
  }
  
  public void removeBipedLeftArm()
  {
    this.modifiedBipedLeftArm = this.bipedLeftArm;
  }
  
  public void removeBipedRightLeg()
  {
    this.modifiedBipedRightLeg = this.bipedRightLeg;
  }
  
  public void removeBipedLeftLeg()
  {
    this.modifiedBipedLeftLeg = this.bipedLeftLeg;
  }
  
  public void setModelBiped(bbj modelBiped)
  {
    this.modelBiped = modelBiped;
  }
  
  public float getScale()
  {
    return this.scale;
  }
  
  public bbj getModelBiped()
  {
    return this.modelBiped;
  }
  
  public float getVar1()
  {
    return this.var1;
  }
  
  public float getVar2()
  {
    return this.var2;
  }
  
  public float getVar3()
  {
    return this.var3;
  }
  
  public float getVar4()
  {
    return this.var4;
  }
  
  public float getVar5()
  {
    return this.var5;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
