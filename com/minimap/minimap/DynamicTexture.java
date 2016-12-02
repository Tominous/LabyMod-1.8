package com.minimap.minimap;

import ave;
import bme;
import bml;
import bni;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import jy;
import org.lwjgl.BufferUtils;

public class DynamicTexture
  extends bme
{
  public BufferedImage bufferedimage;
  public ByteBuffer buffer512;
  public ByteBuffer buffer256;
  public ByteBuffer buffer128;
  public ByteBuffer[] buffers;
  
  public ByteBuffer getBuffer(int size)
  {
    switch (size)
    {
    case 128: 
      return this.buffer128;
    case 256: 
      return this.buffer256;
    }
    return this.buffer512;
  }
  
  public DynamicTexture(jy location)
  {
    super(location);
    this.buffer512 = BufferUtils.createByteBuffer(786432);
    this.buffer256 = BufferUtils.createByteBuffer(196608);
    this.buffer128 = BufferUtils.createByteBuffer(49152);
    this.buffers = new ByteBuffer[] { this.buffer128, this.buffer256, this.buffer256, this.buffer512 };
    a(ave.A().Q());
  }
  
  public void a(bni par1ResourceManager)
  {
    this.bufferedimage = new BufferedImage(512, 512, 5);
    bml.a(b(), this.bufferedimage, false, false);
  }
}
