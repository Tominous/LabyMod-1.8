import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class bnm$a
{
  private final File b;
  private bnk c;
  private boj d;
  private BufferedImage e;
  private jy f;
  private String dirPath = "";
  
  private bnm$a(bnm this$0, File resourcePackFileIn)
  {
    b = resourcePackFileIn;
  }
  
  public void setDirPath(String path)
  {
    dirPath = path;
  }
  
  public String getDirPath()
  {
    return dirPath;
  }
  
  public File getResourcePackFile()
  {
    return b;
  }
  
  public void a()
    throws IOException
  {
    c = (b.isDirectory() ? new bnd(b) : new bnc(b));
    d = ((boj)c.a(this$0.b, "pack"));
    try
    {
      e = c.a();
    }
    catch (IOException localIOException) {}
    if (e == null) {
      e = this$0.a.a();
    }
    b();
  }
  
  public void a(bmj textureManagerIn)
  {
    if (f == null) {
      f = textureManagerIn.a("texturepackicon", new blz(e));
    }
    textureManagerIn.a(f);
  }
  
  public void b()
  {
    if ((c instanceof Closeable)) {
      IOUtils.closeQuietly((Closeable)c);
    }
  }
  
  public bnk c()
  {
    return c;
  }
  
  public String d()
  {
    return c.b();
  }
  
  public String e()
  {
    return d == null ? a.m + "Invalid pack.mcmeta (or missing 'pack' section)" : d.a().d();
  }
  
  public int f()
  {
    return d.b();
  }
  
  public boolean equals(Object p_equals_1_)
  {
    return this == p_equals_1_;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public String toString()
  {
    return String.format("%s:%s:%d", new Object[] { b.getName(), b.isDirectory() ? "folder" : "zip", Long.valueOf(b.lastModified()) });
  }
}
