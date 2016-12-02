import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import net.minecraft.server.MinecraftServer;

public class anh
{
  private static final byte[] a = new byte['က'];
  private final File b;
  private RandomAccessFile c;
  private final int[] d;
  private final int[] e;
  private List<Boolean> f;
  private int g;
  private long h;
  
  public anh(File ☃)
  {
    d = new int['Ѐ'];
    e = new int['Ѐ'];
    
    b = ☃;
    
    g = 0;
    try
    {
      if (☃.exists()) {
        h = ☃.lastModified();
      }
      c = new RandomAccessFile(☃, "rw");
      if (c.length() < 4096L)
      {
        for (int ☃ = 0; ☃ < 1024; ☃++) {
          c.writeInt(0);
        }
        for (int ☃ = 0; ☃ < 1024; ☃++) {
          c.writeInt(0);
        }
        g += 8192;
      }
      if ((c.length() & 0xFFF) != 0L) {
        for (int ☃ = 0; ☃ < (c.length() & 0xFFF); ☃++) {
          c.write(0);
        }
      }
      int ☃ = (int)c.length() / 4096;
      f = Lists.newArrayListWithCapacity(☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        f.add(Boolean.valueOf(true));
      }
      f.set(0, Boolean.valueOf(false));
      f.set(1, Boolean.valueOf(false));
      
      c.seek(0L);
      for (int ☃ = 0; ☃ < 1024; ☃++)
      {
        int ☃ = c.readInt();
        d[☃] = ☃;
        if ((☃ != 0) && ((☃ >> 8) + (☃ & 0xFF) <= f.size())) {
          for (int ☃ = 0; ☃ < (☃ & 0xFF); ☃++) {
            f.set((☃ >> 8) + ☃, Boolean.valueOf(false));
          }
        }
      }
      for (int ☃ = 0; ☃ < 1024; ☃++)
      {
        int ☃ = c.readInt();
        e[☃] = ☃;
      }
    }
    catch (IOException ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  public synchronized DataInputStream a(int ☃, int ☃)
  {
    if (d(☃, ☃)) {
      return null;
    }
    try
    {
      int ☃ = e(☃, ☃);
      if (☃ == 0) {
        return null;
      }
      int ☃ = ☃ >> 8;
      int ☃ = ☃ & 0xFF;
      if (☃ + ☃ > f.size()) {
        return null;
      }
      c.seek(☃ * 4096);
      int ☃ = c.readInt();
      if (☃ > 4096 * ☃) {
        return null;
      }
      if (☃ <= 0) {
        return null;
      }
      byte ☃ = c.readByte();
      if (☃ == 1)
      {
        byte[] ☃ = new byte[☃ - 1];
        c.read(☃);
        return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(☃))));
      }
      if (☃ == 2)
      {
        byte[] ☃ = new byte[☃ - 1];
        c.read(☃);
        return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(☃))));
      }
      return null;
    }
    catch (IOException ☃) {}
    return null;
  }
  
  public DataOutputStream b(int ☃, int ☃)
  {
    if (d(☃, ☃)) {
      return null;
    }
    return new DataOutputStream(new DeflaterOutputStream(new anh.a(☃, ☃)));
  }
  
  class a
    extends ByteArrayOutputStream
  {
    private int b;
    private int c;
    
    public a(int ☃, int ☃)
    {
      super();
      b = ☃;
      c = ☃;
    }
    
    public void close()
    {
      a(b, c, buf, count);
    }
  }
  
  protected synchronized void a(int ☃, int ☃, byte[] ☃, int ☃)
  {
    try
    {
      int ☃ = e(☃, ☃);
      int ☃ = ☃ >> 8;
      int ☃ = ☃ & 0xFF;
      int ☃ = (☃ + 5) / 4096 + 1;
      if (☃ >= 256) {
        return;
      }
      if ((☃ != 0) && (☃ == ☃))
      {
        a(☃, ☃, ☃);
      }
      else
      {
        for (int ☃ = 0; ☃ < ☃; ☃++) {
          f.set(☃ + ☃, Boolean.valueOf(true));
        }
        int ☃ = f.indexOf(Boolean.valueOf(true));
        int ☃ = 0;
        if (☃ != -1) {
          for (int ☃ = ☃; ☃ < f.size(); ☃++)
          {
            if (☃ != 0)
            {
              if (((Boolean)f.get(☃)).booleanValue()) {
                ☃++;
              } else {
                ☃ = 0;
              }
            }
            else if (((Boolean)f.get(☃)).booleanValue())
            {
              ☃ = ☃;
              ☃ = 1;
            }
            if (☃ >= ☃) {
              break;
            }
          }
        }
        if (☃ >= ☃)
        {
          ☃ = ☃;
          a(☃, ☃, ☃ << 8 | ☃);
          for (int ☃ = 0; ☃ < ☃; ☃++) {
            f.set(☃ + ☃, Boolean.valueOf(false));
          }
          a(☃, ☃, ☃);
        }
        else
        {
          c.seek(c.length());
          ☃ = f.size();
          for (int ☃ = 0; ☃ < ☃; ☃++)
          {
            c.write(a);
            f.add(Boolean.valueOf(false));
          }
          g += 4096 * ☃;
          
          a(☃, ☃, ☃);
          a(☃, ☃, ☃ << 8 | ☃);
        }
      }
      b(☃, ☃, (int)(MinecraftServer.az() / 1000L));
    }
    catch (IOException ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  private void a(int ☃, byte[] ☃, int ☃)
    throws IOException
  {
    c.seek(☃ * 4096);
    c.writeInt(☃ + 1);
    c.writeByte(2);
    c.write(☃, 0, ☃);
  }
  
  private boolean d(int ☃, int ☃)
  {
    return (☃ < 0) || (☃ >= 32) || (☃ < 0) || (☃ >= 32);
  }
  
  private int e(int ☃, int ☃)
  {
    return d[(☃ + ☃ * 32)];
  }
  
  public boolean c(int ☃, int ☃)
  {
    return e(☃, ☃) != 0;
  }
  
  private void a(int ☃, int ☃, int ☃)
    throws IOException
  {
    d[(☃ + ☃ * 32)] = ☃;
    c.seek((☃ + ☃ * 32) * 4);
    c.writeInt(☃);
  }
  
  private void b(int ☃, int ☃, int ☃)
    throws IOException
  {
    e[(☃ + ☃ * 32)] = ☃;
    c.seek(4096 + (☃ + ☃ * 32) * 4);
    c.writeInt(☃);
  }
  
  public void c()
    throws IOException
  {
    if (c != null) {
      c.close();
    }
  }
}
