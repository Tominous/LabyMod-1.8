import tv.twitch.broadcast.IngestServer;

class azy$a
  extends awi
{
  public azy$a(azy paramazy, ave ☃)
  {
    super(☃, paramazy.l, paramazy.m, 32, paramazy.m - 35, (int)(☃.k.a * 3.5D));
    b(false);
  }
  
  protected int b()
  {
    return this.a.Y().s().length;
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    this.a.t.R = this.a.Y().s()[☃].serverUrl;
    this.a.t.b();
  }
  
  protected boolean a(int ☃)
  {
    return this.a.Y().s()[☃].serverUrl.equals(this.a.t.R);
  }
  
  protected void a() {}
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    IngestServer ☃ = this.a.Y().s()[☃];
    String ☃ = ☃.serverUrl.replaceAll("\\{stream_key\\}", "");
    String ☃ = (int)☃.bitrateKbps + " kbps";
    String ☃ = null;
    bql ☃ = this.a.Y().v();
    if (☃ != null)
    {
      if (☃ == ☃.c())
      {
        ☃ = a.k + ☃;
        ☃ = (int)(☃.i() * 100.0F) + "%";
      }
      else if (☃ < ☃.d())
      {
        if (☃.bitrateKbps == 0.0F) {
          ☃ = a.m + "Down!";
        }
      }
      else
      {
        ☃ = a.q + "1234" + a.v + " kbps";
      }
    }
    else if (☃.bitrateKbps == 0.0F) {
      ☃ = a.m + "Down!";
    }
    ☃ -= 15;
    if (a(☃)) {
      ☃ = a.j + "(Preferred)";
    } else if (☃.defaultServer) {
      ☃ = a.k + "(Default)";
    }
    this.u.c(azy.a(this.u), ☃.serverName, ☃ + 2, ☃ + 5, 16777215);
    this.u.c(azy.b(this.u), ☃, ☃ + 2, ☃ + azy.c(this.u).a + 5 + 3, 3158064);
    this.u.c(azy.d(this.u), ☃, d() - 5 - azy.e(this.u).a(☃), ☃ + 5, 8421504);
    if (☃ != null) {
      this.u.c(azy.f(this.u), ☃, d() - 5 - azy.g(this.u).a(☃), ☃ + 5 + 3 + azy.h(this.u).a, 8421504);
    }
  }
  
  protected int d()
  {
    return super.d() + 15;
  }
}
