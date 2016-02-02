import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.util.UUID;

public final class dy
{
  public static GameProfile a(dn ☃)
  {
    String ☃ = null;
    String ☃ = null;
    if (☃.b("Name", 8)) {
      ☃ = ☃.j("Name");
    }
    if (☃.b("Id", 8)) {
      ☃ = ☃.j("Id");
    }
    if ((!nx.b(☃)) || (!nx.b(☃)))
    {
      UUID ☃;
      try
      {
        ☃ = UUID.fromString(☃);
      }
      catch (Throwable ☃)
      {
        ☃ = null;
      }
      GameProfile ☃ = new GameProfile(☃, ☃);
      dn ☃;
      if (☃.b("Properties", 10))
      {
        ☃ = ☃.m("Properties");
        for (String ☃ : ☃.c())
        {
          du ☃ = ☃.c(☃, 10);
          for (int ☃ = 0; ☃ < ☃.c(); ☃++)
          {
            dn ☃ = ☃.b(☃);
            String ☃ = ☃.j("Value");
            if (☃.b("Signature", 8)) {
              ☃.getProperties().put(☃, new Property(☃, ☃, ☃.j("Signature")));
            } else {
              ☃.getProperties().put(☃, new Property(☃, ☃));
            }
          }
        }
      }
      return ☃;
    }
    return null;
  }
  
  public static dn a(dn ☃, GameProfile ☃)
  {
    if (!nx.b(☃.getName())) {
      ☃.a("Name", ☃.getName());
    }
    if (☃.getId() != null) {
      ☃.a("Id", ☃.getId().toString());
    }
    if (!☃.getProperties().isEmpty())
    {
      dn ☃ = new dn();
      for (String ☃ : ☃.getProperties().keySet())
      {
        du ☃ = new du();
        for (Property ☃ : ☃.getProperties().get(☃))
        {
          dn ☃ = new dn();
          ☃.a("Value", ☃.getValue());
          if (☃.hasSignature()) {
            ☃.a("Signature", ☃.getSignature());
          }
          ☃.a(☃);
        }
        ☃.a(☃, ☃);
      }
      ☃.a("Properties", ☃);
    }
    return ☃;
  }
  
  public static boolean a(eb ☃, eb ☃, boolean ☃)
  {
    if (☃ == ☃) {
      return true;
    }
    if (☃ == null) {
      return true;
    }
    if (☃ == null) {
      return false;
    }
    if (!☃.getClass().equals(☃.getClass())) {
      return false;
    }
    if ((☃ instanceof dn))
    {
      dn ☃ = (dn)☃;
      dn ☃ = (dn)☃;
      for (String ☃ : ☃.c())
      {
        eb ☃ = ☃.a(☃);
        if (!a(☃, ☃.a(☃), ☃)) {
          return false;
        }
      }
      return true;
    }
    if (((☃ instanceof du)) && (☃))
    {
      du ☃ = (du)☃;
      du ☃ = (du)☃;
      if (☃.c() == 0) {
        return ☃.c() == 0;
      }
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        eb ☃ = ☃.g(☃);
        boolean ☃ = false;
        for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
          if (a(☃, ☃.g(☃), ☃))
          {
            ☃ = true;
            break;
          }
        }
        if (!☃) {
          return false;
        }
      }
      return true;
    }
    return ☃.equals(☃);
  }
}
