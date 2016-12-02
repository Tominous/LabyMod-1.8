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
    if (this.e)
    {
      this.a.a(new fa("Received unrequested status"));
      return;
    }
    this.e = true;
    js ☃ = ☃.a();
    if (☃.a() != null) {
      this.b.d = ☃.a().d();
    } else {
      this.b.d = "";
    }
    if (☃.c() != null)
    {
      this.b.g = ☃.c().a();
      this.b.f = ☃.c().b();
    }
    else
    {
      this.b.g = "Old";
      this.b.f = 0;
    }
    if (☃.b() != null)
    {
      this.b.c = (a.h + "" + ☃.b().b() + "" + a.i + "/" + a.h + ☃.b().a());
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
        this.b.i = ☃.toString();
      }
    }
    else
    {
      this.b.c = (a.i + "???");
    }
    if (☃.d() != null)
    {
      String ☃ = ☃.d();
      if (☃.startsWith("data:image/png;base64,")) {
        this.b.a(☃.substring("data:image/png;base64,".length()));
      } else {
        bdg.c().error("Invalid server icon (unknown format)");
      }
    }
    else
    {
      this.b.a(null);
    }
    this.f = ave.J();
    this.a.a(new ju(this.f));
    this.d = true;
  }
  
  public void a(jq ☃)
  {
    long ☃ = this.f;
    long ☃ = ave.J();
    this.b.e = (☃ - ☃);
    
    this.a.a(new fa("Finished"));
  }
  
  public void a(eu ☃)
  {
    if (!this.d)
    {
      bdg.c().error("Can't ping " + this.b.b + ": " + ☃.c());
      this.b.d = (a.e + "Can't connect to server.");
      this.b.c = "";
      
      bdg.a(this.c, this.b);
    }
  }
}
