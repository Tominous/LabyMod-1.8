import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public abstract interface bnk
{
  public abstract InputStream a(jy paramjy)
    throws IOException;
  
  public abstract boolean b(jy paramjy);
  
  public abstract Set<String> c();
  
  public abstract <T extends bnw> T a(bny parambny, String paramString)
    throws IOException;
  
  public abstract BufferedImage a()
    throws IOException;
  
  public abstract String b();
}
