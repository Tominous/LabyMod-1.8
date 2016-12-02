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
      return buffer128;
    case 256: 
      return buffer256;
    }
    return buffer512;
  }
  
  public DynamicTexture(jy location)
  {
    super(location);
    buffer512 = BufferUtils.createByteBuffer(786432);
    buffer256 = BufferUtils.createByteBuffer(196608);
    buffer128 = BufferUtils.createByteBuffer(49152);
    buffers = new ByteBuffer[] { buffer128, buffer256, buffer256, buffer512 };
    a(ave.A().Q());
  }
  
  public void a(bni par1ResourceManager)
  {
    bufferedimage = new BufferedImage(512, 512, 5);
    bml.a(b(), bufferedimage, false, false);
  }
}
