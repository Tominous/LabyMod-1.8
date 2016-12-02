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
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnm
{
  private static final Logger c = ;
  private static final FileFilter d = new FileFilter()
  {
    public boolean accept(File p_accept_1_)
    {
      boolean flag = (p_accept_1_.isFile()) && (p_accept_1_.getName().endsWith(".zip"));
      boolean flag1 = (p_accept_1_.isDirectory()) && (new File(p_accept_1_, "pack.mcmeta").isFile());
      boolean flag2 = (p_accept_1_.isDirectory()) && (p_accept_1_.getName().startsWith("dir_"));
      return (flag) || (flag1) || (flag2);
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
  
  public bnm(File dirResourcepacksIn, File dirServerResourcepacksIn, bnk rprDefaultResourcePackIn, bny rprMetadataSerializerIn, avh settings)
  {
    this.e = dirResourcepacksIn;
    this.f = dirServerResourcepacksIn;
    this.a = rprDefaultResourcePackIn;
    this.b = rprMetadataSerializerIn;
    g();
    a();
    Iterator<String> iterator = settings.k.iterator();
    String s;
    while (iterator.hasNext())
    {
      s = (String)iterator.next();
      for (bnm.a resourcepackrepository$entry : this.j) {
        if (resourcepackrepository$entry.d().equals(s))
        {
          if ((resourcepackrepository$entry.f() == 1) || (settings.l.contains(resourcepackrepository$entry.d())))
          {
            this.k.add(resourcepackrepository$entry);
            break;
          }
          iterator.remove();
          c.warn("Removed selected resource pack {} because it's no longer compatible", new Object[] { resourcepackrepository$entry.d() });
        }
      }
    }
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
    return this.e.isDirectory() ? Arrays.asList(this.e.listFiles(d)) : Collections.emptyList();
  }
  
  public void a()
  {
    List<bnm.a> list = Lists.newArrayList();
    
    readAllAndFill(list, h(), "");
    
    this.j.removeAll(list);
    for (bnm.a resourcepackrepository$entry1 : this.j) {
      resourcepackrepository$entry1.b();
    }
    this.j = list;
  }
  
  private void readAllAndFill(List<bnm.a> list, List<File> files, String path)
  {
    for (File file1 : files)
    {
      if ((file1.isDirectory()) && (file1.getName().startsWith("dir_")) && (path.isEmpty()))
      {
        File[] dirFiles = file1.listFiles();
        if ((dirFiles != null) && (dirFiles.length != 0)) {
          readAllAndFill(list, Arrays.asList(dirFiles), file1.getName());
        }
      }
      if ((!file1.isDirectory()) || (!file1.getName().startsWith("dir_")))
      {
        bnm.a resourcepackrepository$entry = new bnm.a(file1, null);
        if (!this.j.contains(resourcepackrepository$entry))
        {
          try
          {
            resourcepackrepository$entry.a();
            list.add(resourcepackrepository$entry);
          }
          catch (Exception var6)
          {
            list.remove(resourcepackrepository$entry);
          }
        }
        else
        {
          int i = this.j.indexOf(resourcepackrepository$entry);
          if ((i > -1) && (i < this.j.size())) {
            list.add(this.j.get(i));
          }
        }
        resourcepackrepository$entry.setDirPath(path.replaceFirst("dir_", ""));
      }
    }
  }
  
  public List<bnm.a> b()
  {
    return ImmutableList.copyOf(this.j);
  }
  
  public List<bnm.a> c()
  {
    return ImmutableList.copyOf(this.k);
  }
  
  public void a(List<bnm.a> p_148527_1_)
  {
    this.k.clear();
    this.k.addAll(p_148527_1_);
  }
  
  public File d()
  {
    return this.e;
  }
  
  public ListenableFuture<Object> a(String url, String hash)
  {
    String s;
    String s;
    if (hash.matches("^[a-f0-9]{40}$")) {
      s = hash;
    } else {
      s = "legacy";
    }
    final File file1 = new File(this.f, s);
    this.h.lock();
    try
    {
      f();
      if ((file1.exists()) && (hash.length() == 40)) {
        try
        {
          String s1 = Hashing.sha1().hashBytes(Files.toByteArray(file1)).toString();
          if (s1.equals(hash))
          {
            ListenableFuture listenablefuture1 = a(file1);
            return listenablefuture1;
          }
          c.warn("File " + file1 + " had wrong hash (expected " + hash + ", found " + s1 + "). Deleting it.");
          FileUtils.deleteQuietly(file1);
        }
        catch (IOException ioexception)
        {
          c.warn("File " + file1 + " couldn't be hashed. Deleting it.", ioexception);
          FileUtils.deleteQuietly(file1);
        }
      }
      i();
      final axr guiscreenworking = new axr();
      Map<String, String> map = ave.ak();
      final ave minecraft = ave.A();
      Futures.getUnchecked(minecraft.a(new Runnable()
      {
        public void run()
        {
          minecraft.a(guiscreenworking);
        }
      }));
      final SettableFuture<Object> settablefuture = SettableFuture.create();
      this.i = nj.a(file1, url, map, 52428800, guiscreenworking, minecraft.O());
      Futures.addCallback(this.i, new FutureCallback()
      {
        public void onSuccess(Object p_onSuccess_1_)
        {
          bnm.this.a(file1);
          settablefuture.set(null);
        }
        
        public void onFailure(Throwable p_onFailure_1_)
        {
          settablefuture.setException(p_onFailure_1_);
        }
      });
      ListenableFuture listenablefuture = this.i;
      return listenablefuture;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  private void i()
  {
    List<File> list = Lists.newArrayList(FileUtils.listFiles(this.f, TrueFileFilter.TRUE, (IOFileFilter)null));
    Collections.sort(list, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
    int i = 0;
    for (File file1 : list) {
      if (i++ >= 10)
      {
        c.info("Deleting old server resource pack " + file1.getName());
        FileUtils.deleteQuietly(file1);
      }
    }
  }
  
  public ListenableFuture<Object> a(File p_177319_1_)
  {
    this.g = new bnc(p_177319_1_);
    return ave.A().B();
  }
  
  public bnk e()
  {
    return this.g;
  }
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	bnm:h	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: invokevirtual 286	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   7: aload_0
    //   8: getfield 382	bnm:i	Lcom/google/common/util/concurrent/ListenableFuture;
    //   11: ifnull +14 -> 25
    //   14: aload_0
    //   15: getfield 382	bnm:i	Lcom/google/common/util/concurrent/ListenableFuture;
    //   18: iconst_1
    //   19: invokeinterface 456 2 0
    //   24: pop
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield 382	bnm:i	Lcom/google/common/util/concurrent/ListenableFuture;
    //   30: aload_0
    //   31: getfield 444	bnm:g	Lbnk;
    //   34: ifnull +15 -> 49
    //   37: aload_0
    //   38: aconst_null
    //   39: putfield 444	bnm:g	Lbnk;
    //   42: invokestatic 352	ave:A	()Lave;
    //   45: invokevirtual 448	ave:B	()Lcom/google/common/util/concurrent/ListenableFuture;
    //   48: pop
    //   49: aload_0
    //   50: getfield 44	bnm:h	Ljava/util/concurrent/locks/ReentrantLock;
    //   53: invokevirtual 318	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   56: goto +13 -> 69
    //   59: astore_1
    //   60: aload_0
    //   61: getfield 44	bnm:h	Ljava/util/concurrent/locks/ReentrantLock;
    //   64: invokevirtual 318	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   67: aload_1
    //   68: athrow
    //   69: return
    // Line number table:
    //   Java source line #304	-> byte code offset #0
    //   Java source line #308	-> byte code offset #7
    //   Java source line #310	-> byte code offset #14
    //   Java source line #313	-> byte code offset #25
    //   Java source line #315	-> byte code offset #30
    //   Java source line #317	-> byte code offset #37
    //   Java source line #318	-> byte code offset #42
    //   Java source line #323	-> byte code offset #49
    //   Java source line #324	-> byte code offset #56
    //   Java source line #323	-> byte code offset #59
    //   Java source line #325	-> byte code offset #69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	bnm
    //   59	9	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	49	59	finally
  }
  
  public class a
  {
    private final File b;
    private bnk c;
    private boj d;
    private BufferedImage e;
    private jy f;
    private String dirPath = "";
    
    private a(File resourcePackFileIn)
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
}
