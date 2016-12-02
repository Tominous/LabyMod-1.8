import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.Logger;

class bdg$1
  implements jp
{
  private boolean d = false;
  private boolean e = false;
  private long f = 0L;
  
  bdg$1(bdg parambdg, ek paramek, bde parambde) {}
  
  public void a(jr ☃)
  {
    if (e)
    {
      a.a(new fa("Received unrequested status"));
      return;
    }
    e = true;
    js ☃ = ☃.a();
    if (☃.a() != null) {
      b.d = ☃.a().d();
    } else {
      b.d = "";
    }
    if (☃.c() != null)
    {
      b.g = ☃.c().a();
      b.f = ☃.c().b();
    }
    else
    {
      b.g = "Old";
      b.f = 0;
    }
    if (☃.b() != null)
    {
      b.c = (a.h + "" + ☃.b().b() + "" + a.i + "/" + a.h + ☃.b().a());
      if (ArrayUtils.isNotEmpty(☃.b().c()))
      {
        StringBuilder ☃ = new StringBuilder();
        for (GameProfile ☃ : ☃.b().c())
        {
          if (☃.length() > 0) {
            ☃.append("\n");
          }
          ☃.append(☃.getName());
        }
        if (☃.b().c().length < ☃.b().b())
        {
          if (☃.length() > 0) {
            ☃.append("\n");
          }
          ☃.append("... and ").append(☃.b().b() - ☃.b().c().length).append(" more ...");
        }
        b.i = ☃.toString();
      }
    }
    else
    {
      b.c = (a.i + "???");
    }
    if (☃.d() != null)
    {
      String ☃ = ☃.d();
      if (☃.startsWith("data:image/png;base64,")) {
        b.a(☃.substring("data:image/png;base64,".length()));
      } else {
        bdg.c().error("Invalid server icon (unknown format)");
      }
    }
    else
    {
      b.a(null);
    }
    f = ave.J();
    a.a(new ju(f));
    d = true;
  }
  
  public void a(jq ☃)
  {
    long ☃ = f;
    long ☃ = ave.J();
    b.e = (☃ - ☃);
    
    a.a(new fa("Finished"));
  }
  
  public void a(eu ☃)
  {
    if (!d)
    {
      bdg.c().error("Can't ping " + b.b + ": " + ☃.c());
      b.d = (a.e + "Can't connect to server.");
      b.c = "";
      
      bdg.a(c, b);
    }
  }
}
