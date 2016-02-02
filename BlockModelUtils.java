import java.util.ArrayList;
import java.util.List;
import org.lwjgl.util.vector.Vector3f;

public class BlockModelUtils
{
  public static boq makeModelCube(String spriteName, int tintIndex)
  {
    bmi sprite = Config.getMinecraft().T().a(spriteName);
    
    return makeModelCube(sprite, tintIndex);
  }
  
  public static boq makeModelCube(bmi sprite, int tintIndex)
  {
    List generalQuads = new ArrayList();
    cq[] facings = cq.n;
    List faceQuads = new ArrayList(facings.length);
    for (int i = 0; i < facings.length; i++)
    {
      cq facing = facings[i];
      List quads = new ArrayList();
      quads.add(makeBakedQuad(facing, sprite, tintIndex));
      
      faceQuads.add(quads);
    }
    boq bakedModel = new bow(generalQuads, faceQuads, true, true, sprite, bgr.a);
    return bakedModel;
  }
  
  private static bgg makeBakedQuad(cq facing, bmi sprite, int tintIndex)
  {
    Vector3f posFrom = new Vector3f(0.0F, 0.0F, 0.0F);
    Vector3f posTo = new Vector3f(16.0F, 16.0F, 16.0F);
    bgk uv = new bgk(new float[] { 0.0F, 0.0F, 16.0F, 16.0F }, 0);
    bgi face = new bgi(facing, tintIndex, "#" + facing.l(), uv);
    bor modelRotation = bor.a;
    bgj partRotation = null;
    boolean uvLocked = false;
    boolean shade = true;
    
    bgo faceBakery = new bgo();
    bgg quad = faceBakery.a(posFrom, posTo, face, sprite, facing, modelRotation, partRotation, uvLocked, shade);
    return quad;
  }
}
