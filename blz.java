import java.awt.image.BufferedImage;
import java.io.IOException;

public class blz
  extends bly
{
  private final int[] f;
  private final int g;
  private final int h;
  
  public blz(BufferedImage bufferedImage)
  {
    this(bufferedImage.getWidth(), bufferedImage.getHeight());
    bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.f, 0, bufferedImage.getWidth());
    d();
  }
  
  public blz(int textureWidth, int textureHeight)
  {
    this.g = textureWidth;
    this.h = textureHeight;
    this.f = new int[textureWidth * textureHeight];
    bml.a(b(), textureWidth, textureHeight);
  }
  
  public void a(bni resourceManager)
    throws IOException
  {}
  
  public void d()
  {
    bml.a(b(), this.f, this.g, this.h);
  }
  
  public int[] e()
  {
    return this.f;
  }
}
