import java.io.IOException;

public class gr
  implements ff<fj>
{
  private cy a;
  private float b;
  private float c;
  private float d;
  private float e;
  private float f;
  private float g;
  private float h;
  private int i;
  private boolean j;
  private int[] k;
  
  public gr() {}
  
  public gr(cy ☃, boolean ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, int ☃, int... ☃)
  {
    a = ☃;
    j = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    h = ☃;
    i = ☃;
    k = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = cy.a(☃.readInt());
    if (a == null) {
      a = cy.J;
    }
    j = ☃.readBoolean();
    b = ☃.readFloat();
    c = ☃.readFloat();
    d = ☃.readFloat();
    e = ☃.readFloat();
    f = ☃.readFloat();
    g = ☃.readFloat();
    h = ☃.readFloat();
    i = ☃.readInt();
    int ☃ = a.d();
    k = new int[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      k[☃] = ☃.e();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a.c());
    ☃.writeBoolean(j);
    ☃.writeFloat(b);
    ☃.writeFloat(c);
    ☃.writeFloat(d);
    ☃.writeFloat(e);
    ☃.writeFloat(f);
    ☃.writeFloat(g);
    ☃.writeFloat(h);
    ☃.writeInt(i);
    int ☃ = a.d();
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      ☃.b(k[☃]);
    }
  }
  
  public cy a()
  {
    return a;
  }
  
  public boolean b()
  {
    return j;
  }
  
  public double c()
  {
    return b;
  }
  
  public double d()
  {
    return c;
  }
  
  public double e()
  {
    return d;
  }
  
  public float f()
  {
    return e;
  }
  
  public float g()
  {
    return f;
  }
  
  public float h()
  {
    return g;
  }
  
  public float i()
  {
    return h;
  }
  
  public int j()
  {
    return i;
  }
  
  public int[] k()
  {
    return k;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
}
