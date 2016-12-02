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
    this.b = resourcePackFileIn;
  }
  
  public void setDirPath(String path)
  {
    this.dirPath = path;
  }
  
  public String getDirPath()
  {
    return this.dirPath;
  }
  
  public File getResourcePackFile()
  {
    return this.b;
  }
  
  public void a()
    throws IOException
  {
    this.c = (this.b.isDirectory() ? new bnd(this.b) : new bnc(this.b));
    this.d = ((boj)this.c.a(this.this$0.b, "pack"));
    try
    {
      this.e = this.c.a();
    }
    catch (IOException localIOException) {}
    if (this.e == null) {
      this.e = this.this$0.a.a();
    }
    b();
  }
  
  public void a(bmj textureManagerIn)
  {
    if (this.f == null) {
      this.f = textureManagerIn.a("texturepackicon", new blz(this.e));
    }
    textureManagerIn.a(this.f);
  }
  
  public void b()
  {
    if ((this.c instanceof Closeable)) {
      IOUtils.closeQuietly((Closeable)this.c);
    }
  }
  
  public bnk c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.c.b();
  }
  
  public String e()
  {
    return this.d == null ? a.m + "Invalid pack.mcmeta (or missing 'pack' section)" : this.d.a().d();
  }
  
  public int f()
  {
    return this.d.b();
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
    return String.format("%s:%s:%d", new Object[] { this.b.getName(), this.b.isDirectory() ? "folder" : "zip", Long.valueOf(this.b.lastModified()) });
  }
}
