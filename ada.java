import java.io.IOException;
import java.util.ArrayList;

public class ada
  extends ArrayList<acz>
{
  public ada() {}
  
  public ada(dn ☃)
  {
    a(☃);
  }
  
  public acz a(zx ☃, zx ☃, int ☃)
  {
    if ((☃ > 0) && (☃ < size()))
    {
      acz ☃ = (acz)get(☃);
      if ((a(☃, ☃.a())) && (((☃ == null) && (!☃.c())) || ((☃.c()) && (a(☃, ☃.b())) && 
        (☃.b >= ☃.a().b) && ((!☃.c()) || (☃.b >= ☃.b().b))))) {
        return ☃;
      }
      return null;
    }
    for (int ☃ = 0; ☃ < size(); ☃++)
    {
      acz ☃ = (acz)get(☃);
      if ((a(☃, ☃.a())) && (☃.b >= ☃.a().b) && (((!☃.c()) && (☃ == null)) || ((☃.c()) && (a(☃, ☃.b())) && (☃.b >= ☃.b().b)))) {
        return ☃;
      }
    }
    return null;
  }
  
  private boolean a(zx ☃, zx ☃)
  {
    return (zx.c(☃, ☃)) && ((!☃.n()) || ((☃.n()) && (dy.a(☃.o(), ☃.o(), false))));
  }
  
  public void a(em ☃)
  {
    ☃.writeByte((byte)(size() & 0xFF));
    for (int ☃ = 0; ☃ < size(); ☃++)
    {
      acz ☃ = (acz)get(☃);
      ☃.a(☃.a());
      ☃.a(☃.d());
      
      zx ☃ = ☃.b();
      ☃.writeBoolean(☃ != null);
      if (☃ != null) {
        ☃.a(☃);
      }
      ☃.writeBoolean(☃.h());
      ☃.writeInt(☃.e());
      ☃.writeInt(☃.f());
    }
  }
  
  public static ada b(em ☃)
    throws IOException
  {
    ada ☃ = new ada();
    
    int ☃ = ☃.readByte() & 0xFF;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      zx ☃ = ☃.i();
      zx ☃ = ☃.i();
      
      zx ☃ = null;
      if (☃.readBoolean()) {
        ☃ = ☃.i();
      }
      boolean ☃ = ☃.readBoolean();
      int ☃ = ☃.readInt();
      int ☃ = ☃.readInt();
      
      acz ☃ = new acz(☃, ☃, ☃, ☃, ☃);
      if (☃) {
        ☃.i();
      }
      ☃.add(☃);
    }
    return ☃;
  }
  
  public void a(dn ☃)
  {
    du ☃ = ☃.c("Recipes", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      add(new acz(☃));
    }
  }
  
  public dn a()
  {
    dn ☃ = new dn();
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < size(); ☃++)
    {
      acz ☃ = (acz)get(☃);
      ☃.a(☃.k());
    }
    ☃.a("Recipes", ☃);
    return ☃;
  }
}
