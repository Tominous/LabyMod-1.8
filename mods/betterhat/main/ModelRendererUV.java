package mods.betterhat.main;

import avd;
import bbo;
import bcr;
import bct;
import bcu;
import bfl;
import bfx;
import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class ModelRendererUV
  extends bct
{
  public float a;
  public float b;
  private int textureOffsetX;
  private int textureOffsetY;
  public float c;
  public float d;
  public float e;
  public float f;
  public float g;
  public float h;
  private boolean compiled;
  private int displayList;
  public boolean i;
  public List<bcr> l;
  public List<bct> m;
  public final String n;
  private bbo baseModel;
  public float o;
  public float p;
  public float q;
  
  public ModelRendererUV(bbo model, String boxNameIn)
  {
    super(model, boxNameIn);
    this.a = 64.0F;
    this.b = 32.0F;
    this.j = true;
    this.l = Lists.newArrayList();
    this.baseModel = model;
    model.s.add(this);
    this.n = boxNameIn;
    b(model.t, model.u);
  }
  
  public ModelRendererUV(bbo model)
  {
    this(model, (String)null);
  }
  
  public ModelRendererUV(bbo model, int texOffX, int texOffY)
  {
    this(model);
    a(texOffX, texOffY);
  }
  
  public void a(bct renderer)
  {
    if (this.m == null) {
      this.m = Lists.newArrayList();
    }
    this.m.add(renderer);
  }
  
  public bct a(int x, int y)
  {
    this.textureOffsetX = x;
    this.textureOffsetY = y;
    return this;
  }
  
  public bct a(String partName, float offX, float offY, float offZ, int width, int height, int depth)
  {
    partName = this.n + "." + partName;
    bcu textureoffset = this.baseModel.a(partName);
    a(textureoffset.a, textureoffset.b);
    this.l.add(new bcr(this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, 0.0F).a(partName));
    return this;
  }
  
  public bct a(float offX, float offY, float offZ, int width, int height, int depth)
  {
    this.l.add(new bcr(this, this.textureOffsetX, this.textureOffsetY, offX, offY, offZ, width, height, depth, 0.0F));
    return this;
  }
  
  public bct a(float p_178769_1_, float p_178769_2_, float p_178769_3_, int p_178769_4_, int p_178769_5_, int p_178769_6_, boolean p_178769_7_)
  {
    this.l.add(new bcr(this, this.textureOffsetX, this.textureOffsetY, p_178769_1_, p_178769_2_, p_178769_3_, p_178769_4_, p_178769_5_, p_178769_6_, 0.0F, p_178769_7_));
    return this;
  }
  
  public void a(float p_78790_1_, float p_78790_2_, float p_78790_3_, int width, int height, int depth, float scaleFactor)
  {
    this.l.add(new bcr(this, this.textureOffsetX, this.textureOffsetY, p_78790_1_, p_78790_2_, p_78790_3_, width, height, depth, scaleFactor));
  }
  
  public void a(float rotationPointXIn, float rotationPointYIn, float rotationPointZIn)
  {
    this.c = rotationPointXIn;
    this.d = rotationPointYIn;
    this.e = rotationPointZIn;
  }
  
  public void renderBetterHat(float p_78791_1_)
  {
    if (!this.k) {
      if (this.j)
      {
        if (!this.compiled) {
          compileDisplayList(p_78791_1_);
        }
        bfl.E();
        bfl.b(this.c * p_78791_1_, this.d * p_78791_1_, this.e * p_78791_1_);
        if (this.g != 0.0F) {
          bfl.b(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
        }
        if (this.f != 0.0F) {
          bfl.b(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
        }
        if (this.h != 0.0F) {
          bfl.b(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
        }
        bfl.o(this.displayList);
        bfl.F();
      }
    }
  }
  
  private void compileDisplayList(float scale)
  {
    this.displayList = avd.a(1);
    GL11.glNewList(this.displayList, 4864);
    for (int i = 0; i < this.l.size(); i++) {
      ((ModelBoxUV)this.l.get(i)).render(bfx.a(), scale);
    }
    GL11.glEndList();
    this.compiled = true;
  }
  
  public void applyRotation(bct source)
  {
    this.f = source.f;
    this.g = source.g;
    this.h = source.h;
    this.c = source.c;
    this.d = source.d;
    this.e = source.e;
  }
  
  public bct b(int textureWidthIn, int textureHeightIn)
  {
    this.a = textureWidthIn;
    this.b = textureHeightIn;
    return this;
  }
}
