package togglesneak;

import avb;
import ave;
import avh;
import bev;
import bew;
import java.text.DecimalFormat;
import wl;
import xg;

public class CustomMovementInput
{
  public boolean isDisabled;
  public boolean canDoubleTap;
  public boolean sprint = false;
  public boolean sprintHeldAndReleased = false;
  public boolean sprintDoubleTapped = false;
  private long lastPressed;
  private long lastSprintPressed;
  private boolean handledSneakPress;
  private boolean handledSprintPress;
  private boolean wasRiding;
  
  public void update(ave mc, bev options, bew thisPlayer)
  {
    options.a = 0.0F;
    options.b = 0.0F;
    
    avh settings = mc.t;
    if (settings.X.d()) {
      options.b += 1.0F;
    }
    if (settings.Z.d()) {
      options.b -= 1.0F;
    }
    if (settings.Y.d()) {
      options.a += 1.0F;
    }
    if (settings.aa.d()) {
      options.a -= 1.0F;
    }
    options.c = settings.ab.d();
    if (ToggleSneakMod.optionToggleSneak)
    {
      if ((settings.ac.d()) && (!this.handledSneakPress))
      {
        if ((thisPlayer.au()) || (thisPlayer.bA.b))
        {
          options.d = true;
          this.wasRiding = thisPlayer.au();
        }
        else
        {
          options.d = (!options.d);
        }
        this.lastPressed = System.currentTimeMillis();
        this.handledSneakPress = true;
      }
      if ((!settings.ac.d()) && (this.handledSneakPress))
      {
        if ((thisPlayer.bA.b) || (this.wasRiding))
        {
          options.d = false;
          this.wasRiding = false;
        }
        else if (System.currentTimeMillis() - this.lastPressed > 300L)
        {
          options.d = false;
        }
        this.handledSneakPress = false;
      }
    }
    else
    {
      options.d = settings.ac.d();
    }
    if ((options.d) && (mc.m != null)) {
      options.d = false;
    }
    if (options.d)
    {
      options.a = ((float)(options.a * 0.3D));
      options.b = ((float)(options.b * 0.3D));
    }
    boolean enoughHunger = (thisPlayer.cl().a() > 6.0F) || (thisPlayer.bA.b);
    boolean canSprint = (!options.d) && (!thisPlayer.au()) && (!thisPlayer.bA.b) && (enoughHunger);
    
    this.isDisabled = (!ToggleSneakMod.optionToggleSprint);
    this.canDoubleTap = ToggleSneakMod.optionDoubleTap;
    if (((canSprint) || (this.isDisabled)) && (settings.ad.d()) && (!this.handledSprintPress)) {
      if (!this.isDisabled)
      {
        this.sprint = (!this.sprint);
        this.lastSprintPressed = System.currentTimeMillis();
        this.handledSprintPress = true;
        this.sprintHeldAndReleased = false;
      }
    }
    if (((canSprint) || (this.isDisabled)) && (!settings.ad.d()) && (this.handledSprintPress))
    {
      if (System.currentTimeMillis() - this.lastSprintPressed > 300L) {
        this.sprintHeldAndReleased = true;
      }
      this.handledSprintPress = false;
    }
    UpdateStatus(options, thisPlayer, settings);
  }
  
  public void UpdateSprint(boolean newValue, boolean doubleTapped)
  {
    this.sprint = newValue;
    this.sprintDoubleTapped = doubleTapped;
  }
  
  private void UpdateStatus(bev options, bew thisPlayer, avh settings)
  {
    if (ToggleSneakMod.optionShowHUDText)
    {
      String output = "";
      
      boolean isFlying = thisPlayer.bA.b;
      boolean isRiding = thisPlayer.au();
      boolean isHoldingSneak = settings.ac.d();
      boolean isHoldingSprint = settings.ad.d();
      if (isFlying)
      {
        DecimalFormat numFormat = new DecimalFormat("#.00");
        if ((ToggleSneakMod.optionEnableFlyBoost) && (isHoldingSprint)) {
          output = output + "[Flying (" + numFormat.format(ToggleSneakMod.optionFlyBoostAmount) + "x boost)]  ";
        } else {
          output = output + "[Flying]  ";
        }
      }
      if (isRiding) {
        output = output + "[Riding]  ";
      }
      if (options.d)
      {
        if (isFlying) {
          output = output + "[Descending]  ";
        } else if (isRiding) {
          output = output + "[Dismounting]  ";
        } else if (isHoldingSneak) {
          output = output + "[Sneaking (Key Held)]  ";
        } else {
          output = output + "[Sneaking (Toggled)]  ";
        }
      }
      else if (this.sprint) {
        if ((!isFlying) && (!isRiding))
        {
          boolean isVanilla = (this.sprintHeldAndReleased) || (this.isDisabled) || (this.sprintDoubleTapped);
          if (isHoldingSprint) {
            output = output + "[Sprinting (Key Held)]";
          } else if (isVanilla) {
            output = output + "[Sprinting (Vanilla)]";
          } else {
            output = output + "[Sprinting (Toggled)]";
          }
        }
      }
      ToggleSneakModEvents.SetHUDText(output);
    }
  }
}
