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
    a = 64.0F;
    b = 32.0F;
    j = true;
    l = Lists.newArrayList();
    baseModel = model;
    s.add(this);
    n = boxNameIn;
    b(t, u);
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
    if (m == null) {
      m = Lists.newArrayList();
    }
    m.add(renderer);
  }
  
  public bct a(int x, int y)
  {
    textureOffsetX = x;
    textureOffsetY = y;
    return this;
  }
  
  public bct a(String partName, float offX, float offY, float offZ, int width, int height, int depth)
  {
    partName = n + "." + partName;
    bcu textureoffset = baseModel.a(partName);
    a(a, b);
    l.add(new bcr(this, textureOffsetX, textureOffsetY, offX, offY, offZ, width, height, depth, 0.0F).a(partName));
    return this;
  }
  
  public bct a(float offX, float offY, float offZ, int width, int height, int depth)
  {
    l.add(new bcr(this, textureOffsetX, textureOffsetY, offX, offY, offZ, width, height, depth, 0.0F));
    return this;
  }
  
  public bct a(float p_178769_1_, float p_178769_2_, float p_178769_3_, int p_178769_4_, int p_178769_5_, int p_178769_6_, boolean p_178769_7_)
  {
    l.add(new bcr(this, textureOffsetX, textureOffsetY, p_178769_1_, p_178769_2_, p_178769_3_, p_178769_4_, p_178769_5_, p_178769_6_, 0.0F, p_178769_7_));
    return this;
  }
  
  public void a(float p_78790_1_, float p_78790_2_, float p_78790_3_, int width, int height, int depth, float scaleFactor)
  {
    l.add(new bcr(this, textureOffsetX, textureOffsetY, p_78790_1_, p_78790_2_, p_78790_3_, width, height, depth, scaleFactor));
  }
  
  public void a(float rotationPointXIn, float rotationPointYIn, float rotationPointZIn)
  {
    c = rotationPointXIn;
    d = rotationPointYIn;
    e = rotationPointZIn;
  }
  
  public void renderBetterHat(float p_78791_1_)
  {
    if (!k) {
      if (j)
      {
        if (!compiled) {
          compileDisplayList(p_78791_1_);
        }
        bfl.E();
        bfl.b(c * p_78791_1_, d * p_78791_1_, e * p_78791_1_);
        if (g != 0.0F) {
          bfl.b(g * 57.295776F, 0.0F, 1.0F, 0.0F);
        }
        if (f != 0.0F) {
          bfl.b(f * 57.295776F, 1.0F, 0.0F, 0.0F);
        }
        if (h != 0.0F) {
          bfl.b(h * 57.295776F, 0.0F, 0.0F, 1.0F);
        }
        bfl.o(displayList);
        bfl.F();
      }
    }
  }
  
  private void compileDisplayList(float scale)
  {
    displayList = avd.a(1);
    GL11.glNewList(displayList, 4864);
    for (int i = 0; i < l.size(); i++) {
      ((ModelBoxUV)l.get(i)).render(bfx.a(), scale);
    }
    GL11.glEndList();
    compiled = true;
  }
  
  public void applyRotation(bct source)
  {
    f = f;
    g = g;
    h = h;
    c = c;
    d = d;
    e = e;
  }
  
  public bct b(int textureWidthIn, int textureHeightIn)
  {
    a = textureWidthIn;
    b = textureHeightIn;
    return this;
  }
}
