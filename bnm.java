import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnm
{
  private static final Logger c = ;
  private static final FileFilter d = new FileFilter()
  {
    public boolean accept(File ☃)
    {
      boolean ☃ = (☃.isFile()) && (☃.getName().endsWith(".zip"));
      boolean ☃ = (☃.isDirectory()) && (new File(☃, "pack.mcmeta").isFile());
      
      return (☃) || (☃);
    }
  };
  private final File e;
  public final bnk a;
  private final File f;
  public final bny b;
  private bnk g;
  private final ReentrantLock h = new ReentrantLock();
  private ListenableFuture<Object> i;
  private List<bnm.a> j = Lists.newArrayList();
  private List<bnm.a> k = Lists.newArrayList();
  
  public bnm(File ☃, File ☃, bnk ☃, bny ☃, avh ☃)
  {
    this.e = ☃;
    this.f = ☃;
    this.a = ☃;
    this.b = ☃;
    
    g();
    
    a();
    for (Iterator<String> ☃ = ☃.k.iterator(); ☃.hasNext();)
    {
      ☃ = (String)☃.next();
      for (bnm.a ☃ : this.j) {
        if (☃.d().equals(☃))
        {
          if ((☃.f() == 1) || (☃.l.contains(☃.d())))
          {
            this.k.add(☃);
            break;
          }
          ☃.remove();
          c.warn("Removed selected resource pack {} because it's no longer compatible", new Object[] { ☃.d() });
        }
      }
    }
    String ☃;
  }
  
  private void g()
  {
    if (this.e.exists())
    {
      if ((!this.e.isDirectory()) && ((!this.e.delete()) || (!this.e.mkdirs()))) {
        c.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + this.e);
      }
    }
    else if (!this.e.mkdirs()) {
      c.warn("Unable to create resourcepack folder: " + this.e);
    }
  }
  
  private List<File> h()
  {
    if (this.e.isDirectory()) {
      return Arrays.asList(this.e.listFiles(d));
    }
    return Collections.emptyList();
  }
  
  public void a()
  {
    List<bnm.a> ☃ = Lists.newArrayList();
    for (File ☃ : h())
    {
      bnm.a ☃ = new bnm.a(☃, null);
      if (!this.j.contains(☃))
      {
        try
        {
          ☃.a();
          ☃.add(☃);
        }
        catch (Exception ☃)
        {
          ☃.remove(☃);
        }
      }
      else
      {
        int ☃ = this.j.indexOf(☃);
        if ((☃ > -1) && (☃ < this.j.size())) {
          ☃.add(this.j.get(☃));
        }
      }
    }
    this.j.removeAll(☃);
    for (bnm.a ☃ : this.j) {
      ☃.b();
    }
    this.j = ☃;
  }
  
  public List<bnm.a> b()
  {
    return ImmutableList.copyOf(this.j);
  }
  
  public List<bnm.a> c()
  {
    return ImmutableList.copyOf(this.k);
  }
  
  public void a(List<bnm.a> ☃)
  {
    this.k.clear();
    this.k.addAll(☃);
  }
  
  public File d()
  {
    return this.e;
  }
  
  public ListenableFuture<Object> a(String ☃, String ☃)
  {
    String ☃;
    String ☃;
    if (☃.matches("^[a-f0-9]{40}$")) {
      ☃ = ☃;
    } else {
      ☃ = "legacy";
    }
    final File ☃ = new File(this.f, ☃);
    
    this.h.lock();
    try
    {
      f();
      if ((☃.exists()) && (☃.length() == 40)) {
        try
        {
          String ☃ = Hashing.sha1().hashBytes(Files.toByteArray(☃)).toString();
          if (☃.equals(☃)) {
            return a(☃);
          }
          c.warn("File " + ☃ + " had wrong hash (expected " + ☃ + ", found " + ☃ + "). Deleting it.");
          FileUtils.deleteQuietly(☃);
        }
        catch (IOException ☃)
        {
          c.warn("File " + ☃ + " couldn't be hashed. Deleting it.", ☃);
          FileUtils.deleteQuietly(☃);
        }
      }
      i();
      
      final axr ☃ = new axr();
      Object ☃ = ave.ak();
      
      final ave ☃ = ave.A();
      Futures.getUnchecked(☃.a(new Runnable()
      {
        public void run()
        {
          ☃.a(☃);
        }
      }));
      final SettableFuture<Object> ☃ = SettableFuture.create();
      this.i = nj.a(☃, ☃, (Map)☃, 52428800, ☃, ☃.O());
      Futures.addCallback(this.i, new FutureCallback()
      {
        public void onSuccess(Object ☃)
        {
          bnm.this.a(☃);
          ☃.set(null);
        }
        
        public void onFailure(Throwable ☃)
        {
          ☃.setException(☃);
        }
      });
      return this.i;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  private void i()
  {
    List<File> ☃ = Lists.newArrayList(FileUtils.listFiles(this.f, TrueFileFilter.TRUE, null));
    Collections.sort(☃, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
    int ☃ = 0;
    for (File ☃ : ☃) {
      if (☃++ >= 10)
      {
        c.info("Deleting old server resource pack " + ☃.getName());
        FileUtils.deleteQuietly(☃);
      }
    }
  }
  
  public ListenableFuture<Object> a(File ☃)
  {
    this.g = new bnc(☃);
    return ave.A().B();
  }
  
  public bnk e()
  {
    return this.g;
  }
  
  public void f()
  {
    this.h.lock();
    try
    {
      if (this.i != null) {
        this.i.cancel(true);
      }
      this.i = null;
      if (this.g != null)
      {
        this.g = null;
        ave.A().B();
      }
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public class a
  {
    private final File b;
    private bnk c;
    private boj d;
    private BufferedImage e;
    private jy f;
    
    private a(File ☃)
    {
      this.b = ☃;
    }
    
    public void a()
      throws IOException
    {
      this.c = (this.b.isDirectory() ? new bnd(this.b) : new bnc(this.b));
      
      this.d = ((boj)this.c.a(bnm.this.b, "pack"));
      try
      {
        this.e = this.c.a();
      }
      catch (IOException localIOException) {}
      if (this.e == null) {
        this.e = bnm.this.a.a();
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
}
