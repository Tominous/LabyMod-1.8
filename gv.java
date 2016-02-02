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
      this.h = true;
    }
    
    public b(int ☃, byte ☃, byte ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
      this.f = ☃;
      this.g = ☃;
      this.h = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      this.b = ☃.readByte();
      this.c = ☃.readByte();
      this.d = ☃.readByte();
      this.e = ☃.readByte();
      this.f = ☃.readByte();
      this.g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(this.b);
      ☃.writeByte(this.c);
      ☃.writeByte(this.d);
      ☃.writeByte(this.e);
      ☃.writeByte(this.f);
      ☃.writeBoolean(this.g);
    }
  }
  
  public static class a
    extends gv
  {
    public a() {}
    
    public a(int ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
      this.g = ☃;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      this.b = ☃.readByte();
      this.c = ☃.readByte();
      this.d = ☃.readByte();
      this.g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(this.b);
      ☃.writeByte(this.c);
      ☃.writeByte(this.d);
      ☃.writeBoolean(this.g);
    }
  }
  
  public static class c
    extends gv
  {
    public c()
    {
      this.h = true;
    }
    
    public c(int ☃, byte ☃, byte ☃, boolean ☃)
    {
      super();
      this.e = ☃;
      this.f = ☃;
      this.h = true;
      this.g = ☃;
    }
    
    public void a(em ☃)
      throws IOException
    {
      super.a(☃);
      this.e = ☃.readByte();
      this.f = ☃.readByte();
      this.g = ☃.readBoolean();
    }
    
    public void b(em ☃)
      throws IOException
    {
      super.b(☃);
      ☃.writeByte(this.e);
      ☃.writeByte(this.f);
      ☃.writeBoolean(this.g);
    }
  }
  
  public gv(int ☃)
  {
    this.a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
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
    return ☃.a(this.a);
  }
  
  public byte a()
  {
    return this.b;
  }
  
  public byte b()
  {
    return this.c;
  }
  
  public byte c()
  {
    return this.d;
  }
  
  public byte d()
  {
    return this.e;
  }
  
  public byte e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public boolean g()
  {
    return this.g;
  }
}
