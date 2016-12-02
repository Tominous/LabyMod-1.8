import java.io.IOException;

public class gv
  implements ff<fj>
{
  protected int a;
  protected byte b;
  protected byte c;
  protected byte d;
  protected byte e;
  protected byte f;
  protected boolean g;
  protected boolean h;
  public gv() {}
  
  public static class b
    extends gv
  {
    public b()
    {
      h = true;
    }
    
    public b(int ☃, byte ☃, byte ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      b = ☃;
      c = ☃;
      d = ☃;
      e = ☃;
      f = ☃;
      g = ☃;
      h = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      b = ☃.readByte();
      c = ☃.readByte();
      d = ☃.readByte();
      e = ☃.readByte();
      f = ☃.readByte();
      g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(b);
      ☃.writeByte(c);
      ☃.writeByte(d);
      ☃.writeByte(e);
      ☃.writeByte(f);
      ☃.writeBoolean(g);
    }
  }
  
  public static class a
    extends gv
  {
    public a() {}
    
    public a(int ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      b = ☃;
      c = ☃;
      d = ☃;
      g = ☃;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      b = ☃.readByte();
      c = ☃.readByte();
      d = ☃.readByte();
      g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(b);
      ☃.writeByte(c);
      ☃.writeByte(d);
      ☃.writeBoolean(g);
    }
  }
  
  public static class c
    extends gv
  {
    public c()
    {
      h = true;
    }
    
    public c(int ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      e = ☃;
      f = ☃;
      h = true;
      g = ☃;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      e = ☃.readByte();
      f = ☃.readByte();
      g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(e);
      ☃.writeByte(f);
      ☃.writeBoolean(g);
    }
  }
  
  public gv(int ☃)
  {
    a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String toString()
  {
    return "Entity_" + super.toString();
  }
  
  public pk a(adm ☃)
  {
    return ☃.a(a);
  }
  
  public byte a()
  {
    return b;
  }
  
  public byte b()
  {
    return c;
  }
  
  public byte c()
  {
    return d;
  }
  
  public byte d()
  {
    return e;
  }
  
  public byte e()
  {
    return f;
  }
  
  public boolean f()
  {
    return h;
  }
  
  public boolean g()
  {
    return g;
  }
}
