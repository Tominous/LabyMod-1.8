import tv.twitch.broadcast.IngestServer;

class azy$a
  extends awi
{
  public azy$a(azy paramazy, ave ☃)
  {
    super(☃, l, m, 32, m - 35, (int)(k.a * 3.5D));
    b(false);
  }
  
  protected int b()
  {
    return a.Y().s().length;
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    a.t.R = a.Y().s()[☃].serverUrl;
    a.t.b();
  }
  
  protected boolean a(int ☃)
  {
    return a.Y().s()[☃].serverUrl.equals(a.t.R);
  }
  
  protected void a() {}
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    IngestServer ☃ = a.Y().s()[☃];
    String ☃ = serverUrl.replaceAll("\\{stream_key\\}", "");
    String ☃ = (int)bitrateKbps + " kbps";
    String ☃ = null;
    bql ☃ = a.Y().v();
    if (☃ != null)
    {
      if (☃ == ☃.c())
      {
        ☃ = a.k + ☃;
        ☃ = (int)(☃.i() * 100.0F) + "%";
      }
      else if (☃ < ☃.d())
      {
        if (bitrateKbps == 0.0F) {
          ☃ = a.m + "Down!";
        }
      }
      else
      {
        ☃ = a.q + "1234" + a.v + " kbps";
      }
    }
    else if (bitrateKbps == 0.0F) {
      ☃ = a.m + "Down!";
    }
    ☃ -= 15;
    if (a(☃)) {
      ☃ = a.j + "(Preferred)";
    } else if (defaultServer) {
      ☃ = a.k + "(Default)";
    }
    u.c(azy.a(u), serverName, ☃ + 2, ☃ + 5, 16777215);
    u.c(azy.b(u), ☃, ☃ + 2, ☃ + cu).a + 5 + 3, 3158064);
    u.c(azy.d(u), ☃, d() - 5 - azy.e(u).a(☃), ☃ + 5, 8421504);
    if (☃ != null) {
      u.c(azy.f(u), ☃, d() - 5 - azy.g(u).a(☃), ☃ + 5 + 3 + hu).a, 8421504);
    }
  }
  
  protected int d()
  {
    return super.d() + 15;
  }
}
