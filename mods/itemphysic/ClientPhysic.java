package mods.itemphysic;

import adm;
import afh;
import alz;
import arm;
import ave;
import avh;
import bfl;
import bfo;
import biu;
import bjh;
import bmh;
import bmj;
import bmk;
import boq;
import cj;
import java.util.Random;
import jy;
import org.lwjgl.opengl.GL11;
import pk;
import uz;
import zw;
import zx;

public class ClientPhysic
{
  public static Random random = new Random();
  public static ave mc = ave.A();
  public static bjh renderItem = mc.ag();
  public static long tick;
  public static double rotation;
  public static final jy RES_ITEM_GLINT = new jy("textures/misc/enchanted_item_glint.png");
  
  public static void doRender(pk par1Entity, double x, double y, double z, float par8, float par9)
  {
    rotation = (System.nanoTime() - tick) / 3000000.0D * ItemPhysic.rotationSpeed;
    if (!mcw) {
      rotation = 0.0D;
    }
    uz item = (uz)par1Entity;
    zx itemstack = item.l();
    if (itemstack.b() != null)
    {
      random.setSeed(187L);
      boolean flag = false;
      if (bmh.g != null)
      {
        mcafa.a(bmh.g);
        mcafa.b(bmh.g)
          .b(false, false);
        
        flag = true;
      }
      bfl.B();
      bfl.a(516, 0.1F);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.E();
      
      boq ibakedmodel = renderItem.a().a(itemstack);
      int i = func_177077_a(item, x, y, z, par9, ibakedmodel);
      
      cj pos = new cj(item);
      if (z > 360.0F) {
        z = 0.0F;
      }
      if ((item != null) && (!Double.isNaN(s)) && 
        (!Double.isNaN(t)) && (!Double.isNaN(u)) && (o != null)) {
        if (C)
        {
          if ((z != 0.0F) && (z != 90.0F) && (z != 180.0F) && (z != 270.0F))
          {
            double Abstand0 = formPositiv(z);
            double Abstand90 = formPositiv(z - 90.0F);
            double Abstand180 = formPositiv(z - 180.0F);
            double Abstand270 = formPositiv(z - 270.0F);
            if ((Abstand0 <= Abstand90) && (Abstand0 <= Abstand180) && (Abstand0 <= Abstand270)) {
              if (z < 0.0F)
              {
                uz tmp389_387 = item;
                z = ((float)(z + rotation));
              }
              else
              {
                uz tmp407_405 = item;
                z = ((float)(z - rotation));
              }
            }
            if ((Abstand90 < Abstand0) && (Abstand90 <= Abstand180) && (Abstand90 <= Abstand270)) {
              if (z - 90.0F < 0.0F)
              {
                uz tmp459_457 = item;
                z = ((float)(z + rotation));
              }
              else
              {
                uz tmp477_475 = item;
                z = ((float)(z - rotation));
              }
            }
            if ((Abstand180 < Abstand90) && (Abstand180 < Abstand0) && (Abstand180 <= Abstand270)) {
              if (z - 180.0F < 0.0F)
              {
                uz tmp529_527 = item;
                z = ((float)(z + rotation));
              }
              else
              {
                uz tmp547_545 = item;
                z = ((float)(z - rotation));
              }
            }
            if ((Abstand270 < Abstand90) && (Abstand270 < Abstand180) && (Abstand270 < Abstand0)) {
              if (z - 270.0F < 0.0F)
              {
                uz tmp599_597 = item;
                z = ((float)(z + rotation));
              }
              else
              {
                uz tmp617_615 = item;
                z = ((float)(z - rotation));
              }
            }
          }
        }
        else
        {
          cj posUp = new cj(item);
          posUp.a(0, 1, 0);
          
          arm m1 = o.p(posUp).c().t();
          
          arm m2 = o.p(pos).c().t();
          
          boolean m3 = item.a(arm.h);
          boolean m4 = item.V();
          if ((m3 | m1 == arm.h | m2 == arm.h | m4))
          {
            uz tmp748_746 = item;
            z = ((float)(z + rotation / 4.0D));
          }
          else
          {
            uz tmp770_768 = item;
            z = ((float)(z + rotation * 2.0D));
          }
        }
      }
      GL11.glRotatef(y, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(z + 90.0F, 1.0F, 0.0F, 0.0F);
      for (int j = 0; j < i; j++) {
        if (ibakedmodel.b())
        {
          bfl.E();
          
          bfl.a(0.5F, 0.5F, 0.5F);
          renderItem.a(itemstack, ibakedmodel);
          bfl.F();
        }
        else
        {
          bfl.E();
          if ((j > 0) && (shouldSpreadItems())) {
            bfl.b(0.0F, 0.0F, 0.046875F * j);
          }
          renderItem.a(itemstack, ibakedmodel);
          if (!shouldSpreadItems()) {
            bfl.b(0.0F, 0.0F, 0.046875F);
          }
          bfl.F();
        }
      }
      bfl.F();
      bfl.C();
      bfl.k();
      mcafa
        .a(bmh.g);
      if (flag) {
        mcafa.b(bmh.g).a();
      }
    }
  }
  
  public static int func_177077_a(uz item, double x, double y, double z, float p_177077_8_, boq p_177077_9_)
  {
    zx itemstack = item.l();
    zw item2 = itemstack.b();
    if (item2 == null) {
      return 0;
    }
    boolean flag = p_177077_9_.b();
    int i = func_177078_a(itemstack);
    float f1 = 0.25F;
    float f2 = 0.0F;
    bfl.b((float)x, (float)y + f2 + 0.25F, (float)z);
    float f3 = 0.0F;
    if ((flag) || (
      (mcafg != null) && 
      (mcafg.i))) {
      bfl.b(f3, 0.0F, 1.0F, 0.0F);
    }
    if (!flag)
    {
      f3 = -0.0F * (i - 1) * 0.5F;
      float f4 = -0.0F * (i - 1) * 0.5F;
      float f5 = -0.046875F * (i - 1) * 0.5F;
      bfl.b(f3, f4, f5);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    return i;
  }
  
  public static boolean shouldSpreadItems()
  {
    return true;
  }
  
  public static double formPositiv(float rotationPitch)
  {
    if (rotationPitch > 0.0F) {
      return rotationPitch;
    }
    return -rotationPitch;
  }
  
  public static int func_177078_a(zx stack)
  {
    byte b0 = 1;
    if (b > 48) {
      b0 = 5;
    } else if (b > 32) {
      b0 = 4;
    } else if (b > 16) {
      b0 = 3;
    } else if (b > 1) {
      b0 = 2;
    }
    return b0;
  }
  
  public static byte getMiniBlockCount(zx stack, byte original)
  {
    return original;
  }
  
  public static byte getMiniItemCount(zx stack, byte original)
  {
    return original;
  }
}
