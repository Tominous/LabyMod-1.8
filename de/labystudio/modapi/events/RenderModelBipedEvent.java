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
    entity = entityIn;
  }
  
  public pk getEntity()
  {
    return entity;
  }
  
  public void setCancelled(boolean cancel)
  {
    cancelled = cancel;
  }
  
  public boolean isCancelled()
  {
    return cancelled;
  }
  
  public bct getBipedHead()
  {
    return bipedHead;
  }
  
  public bct getBipedHeadwear()
  {
    return bipedHeadwear;
  }
  
  public bct getBipedBody()
  {
    return bipedBody;
  }
  
  public bct getBipedRightArm()
  {
    return bipedRightArm;
  }
  
  public bct getBipedLeftArm()
  {
    return bipedLeftArm;
  }
  
  public bct getBipedRightLeg()
  {
    return bipedRightLeg;
  }
  
  public bct getBipedLeftLeg()
  {
    return bipedLeftLeg;
  }
  
  public void setBipedHead(bct bipedHead)
  {
    modifiedBipedHead = bipedHead;
  }
  
  public void setBipedHeadwear(bct bipedHeadwear)
  {
    modifiedBipedHeadwear = bipedHeadwear;
  }
  
  public void setBipedBody(bct bipedBody)
  {
    modifiedBipedBody = bipedBody;
  }
  
  public void setBipedRightArm(bct bipedRightArm)
  {
    modifiedBipedRightArm = bipedRightArm;
  }
  
  public void setBipedLeftArm(bct bipedLeftArm)
  {
    modifiedBipedLeftArm = bipedLeftArm;
  }
  
  public void setBipedRightLeg(bct bipedRightLeg)
  {
    modifiedBipedRightLeg = bipedRightLeg;
  }
  
  public void setBipedLeftLeg(bct bipedLeftLeg)
  {
    modifiedBipedLeftLeg = bipedLeftLeg;
  }
  
  public bct getModifiedBipedBody()
  {
    return modifiedBipedBody;
  }
  
  public bct getModifiedBipedHead()
  {
    return modifiedBipedHead;
  }
  
  public bct getModifiedBipedHeadwear()
  {
    return modifiedBipedHeadwear;
  }
  
  public bct getModifiedBipedLeftArm()
  {
    return modifiedBipedLeftArm;
  }
  
  public bct getModifiedBipedLeftLeg()
  {
    return modifiedBipedLeftLeg;
  }
  
  public bct getModifiedBipedRightArm()
  {
    return modifiedBipedRightArm;
  }
  
  public bct getModifiedBipedRightLeg()
  {
    return modifiedBipedRightLeg;
  }
  
  public void removeBipedHead()
  {
    modifiedBipedHead = bipedHead;
  }
  
  public void removeBipedHeadwear()
  {
    modifiedBipedHeadwear = bipedHeadwear;
  }
  
  public void removeBipedBody()
  {
    modifiedBipedBody = bipedBody;
  }
  
  public void removeBipedRightArm()
  {
    modifiedBipedRightArm = bipedRightArm;
  }
  
  public void removeBipedLeftArm()
  {
    modifiedBipedLeftArm = bipedLeftArm;
  }
  
  public void removeBipedRightLeg()
  {
    modifiedBipedRightLeg = bipedRightLeg;
  }
  
  public void removeBipedLeftLeg()
  {
    modifiedBipedLeftLeg = bipedLeftLeg;
  }
  
  public void setModelBiped(bbj modelBiped)
  {
    this.modelBiped = modelBiped;
  }
  
  public float getScale()
  {
    return scale;
  }
  
  public bbj getModelBiped()
  {
    return modelBiped;
  }
  
  public float getVar1()
  {
    return var1;
  }
  
  public float getVar2()
  {
    return var2;
  }
  
  public float getVar3()
  {
    return var3;
  }
  
  public float getVar4()
  {
    return var4;
  }
  
  public float getVar5()
  {
    return var5;
  }
  
  public Map<Listener, List<Method>> getListenerMethods()
  {
    return listenerMethods;
  }
}
