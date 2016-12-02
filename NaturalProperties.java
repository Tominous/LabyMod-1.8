import java.util.IdentityHashMap;
import java.util.Map;

public class NaturalProperties
{
  public int rotation = 1;
  public boolean flip = false;
  private Map[] quadMaps = new Map[8];
  
  public NaturalProperties(String type)
  {
    if (type.equals("4"))
    {
      rotation = 4;
      return;
    }
    if (type.equals("2"))
    {
      rotation = 2;
      return;
    }
    if (type.equals("F"))
    {
      flip = true;
      return;
    }
    if (type.equals("4F"))
    {
      rotation = 4;
      flip = true;
      return;
    }
    if (type.equals("2F"))
    {
      rotation = 2;
      flip = true;
      return;
    }
    Config.warn("NaturalTextures: Unknown type: " + type);
  }
  
  public boolean isValid()
  {
    if ((rotation == 2) || (rotation == 4)) {
      return true;
    }
    if (flip) {
      return true;
    }
    return false;
  }
  
  public synchronized bgg getQuad(bgg quadIn, int rotate, boolean flipU)
  {
    int index = rotate;
    if (flipU) {
      index |= 0x4;
    }
    if ((index <= 0) || (index >= quadMaps.length)) {
      return quadIn;
    }
    Map map = quadMaps[index];
    if (map == null)
    {
      map = new IdentityHashMap(1);
      quadMaps[index] = map;
    }
    bgg quad = (bgg)map.get(quadIn);
    if (quad == null)
    {
      quad = makeQuad(quadIn, rotate, flipU);
      map.put(quadIn, quad);
    }
    return quad;
  }
  
  private bgg makeQuad(bgg quad, int rotate, boolean flipU)
  {
    int[] vertexData = quad.a();
    int tintIndex = quad.c();
    cq face = quad.d();
    bmi sprite = quad.getSprite();
    
    vertexData = fixVertexData(vertexData, rotate, flipU);
    
    bgg bq = new bgg(vertexData, tintIndex, face, sprite);
    
    return bq;
  }
  
  private int[] fixVertexData(int[] vertexData, int rotate, boolean flipU)
  {
    int[] vertexData2 = (int[])vertexData.clone();
    
    int v2 = 4 - rotate;
    if (flipU) {
      v2 += 3;
    }
    v2 %= 4;
    
    int mul = vertexData2.length / 4;
    for (int v = 0; v < 4; v++)
    {
      int pos = v * mul;
      int pos2 = v2 * mul;
      
      vertexData2[(pos2 + 4)] = vertexData[(pos + 4)];
      vertexData2[(pos2 + 4 + 1)] = vertexData[(pos + 4 + 1)];
      if (flipU)
      {
        v2--;
        if (v2 < 0) {
          v2 = 3;
        }
      }
      else
      {
        v2++;
        if (v2 > 3) {
          v2 = 0;
        }
      }
    }
    return vertexData2;
  }
}
