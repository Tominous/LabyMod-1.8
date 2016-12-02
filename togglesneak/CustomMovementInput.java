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
    a = 0.0F;
    b = 0.0F;
    
    avh settings = t;
    if (X.d()) {
      b += 1.0F;
    }
    if (Z.d()) {
      b -= 1.0F;
    }
    if (Y.d()) {
      a += 1.0F;
    }
    if (aa.d()) {
      a -= 1.0F;
    }
    c = ab.d();
    if (ToggleSneakMod.optionToggleSneak)
    {
      if ((ac.d()) && (!handledSneakPress))
      {
        if ((thisPlayer.au()) || (bA.b))
        {
          d = true;
          wasRiding = thisPlayer.au();
        }
        else
        {
          d = (!d);
        }
        lastPressed = System.currentTimeMillis();
        handledSneakPress = true;
      }
      if ((!ac.d()) && (handledSneakPress))
      {
        if ((bA.b) || (wasRiding))
        {
          d = false;
          wasRiding = false;
        }
        else if (System.currentTimeMillis() - lastPressed > 300L)
        {
          d = false;
        }
        handledSneakPress = false;
      }
    }
    else
    {
      d = ac.d();
    }
    if ((d) && (m != null)) {
      d = false;
    }
    if (d)
    {
      a = ((float)(a * 0.3D));
      b = ((float)(b * 0.3D));
    }
    boolean enoughHunger = (thisPlayer.cl().a() > 6.0F) || (bA.b);
    boolean canSprint = (!d) && (!thisPlayer.au()) && (!bA.b) && (enoughHunger);
    
    isDisabled = (!ToggleSneakMod.optionToggleSprint);
    canDoubleTap = ToggleSneakMod.optionDoubleTap;
    if (((canSprint) || (isDisabled)) && (ad.d()) && (!handledSprintPress)) {
      if (!isDisabled)
      {
        sprint = (!sprint);
        lastSprintPressed = System.currentTimeMillis();
        handledSprintPress = true;
        sprintHeldAndReleased = false;
      }
    }
    if (((canSprint) || (isDisabled)) && (!ad.d()) && (handledSprintPress))
    {
      if (System.currentTimeMillis() - lastSprintPressed > 300L) {
        sprintHeldAndReleased = true;
      }
      handledSprintPress = false;
    }
    UpdateStatus(options, thisPlayer, settings);
  }
  
  public void UpdateSprint(boolean newValue, boolean doubleTapped)
  {
    sprint = newValue;
    sprintDoubleTapped = doubleTapped;
  }
  
  private void UpdateStatus(bev options, bew thisPlayer, avh settings)
  {
    if (ToggleSneakMod.optionShowHUDText)
    {
      String output = "";
      
      boolean isFlying = bA.b;
      boolean isRiding = thisPlayer.au();
      boolean isHoldingSneak = ac.d();
      boolean isHoldingSprint = ad.d();
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
      if (d)
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
      else if (sprint) {
        if ((!isFlying) && (!isRiding))
        {
          boolean isVanilla = (sprintHeldAndReleased) || (isDisabled) || (sprintDoubleTapped);
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
