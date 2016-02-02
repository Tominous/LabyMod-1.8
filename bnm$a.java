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
  
  private bnm$a(bnm parambnm, File ☃)
  {
    this.b = ☃;
  }
  
  public void a()
    throws IOException
  {
    this.c = (this.b.isDirectory() ? new bnd(this.b) : new bnc(this.b));
    
    this.d = ((boj)this.c.a(this.a.b, "pack"));
    try
    {
      this.e = this.c.a();
    }
    catch (IOException localIOException) {}
    if (this.e == null) {
      this.e = this.a.a.a();
    }
    b();
  }
  
  public void a(bmj ☃)
  {
    if (this.f == null) {
      this.f = ☃.a("texturepackicon", new blz(this.e));
    }
    ☃.a(this.f);
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
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof a)) {
      return toString().equals(☃.toString());
    }
    return false;
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
