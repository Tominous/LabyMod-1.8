import java.util.List;
import tv.twitch.broadcast.IngestServer;

public class azy
  extends axu
{
  private final axu a;
  private String f;
  private azy.a g;
  
  public azy(axu ☃)
  {
    a = ☃;
  }
  
  public void b()
  {
    f = bnq.a("options.stream.ingest.title", new Object[0]);
    g = new azy.a(j);
    if (!j.Y().w()) {
      j.Y().u();
    }
    n.add(new avs(1, l / 2 - 155, m - 24 - 6, 150, 20, bnq.a("gui.done", new Object[0])));
    n.add(new avs(2, l / 2 + 5, m - 24 - 6, 150, 20, bnq.a("options.stream.ingest.reset", new Object[0])));
  }
  
  public void k()
  {
    super.k();
    g.p();
  }
  
  public void m()
  {
    if (j.Y().w()) {
      j.Y().v().m();
    }
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 1)
    {
      j.a(a);
    }
    else
    {
      j.t.R = "";
      j.t.b();
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    g.a(☃, ☃, ☃);
    a(q, f, l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a(ave ☃)
    {
      super(l, m, 32, m - 35, (int)(k.a * 3.5D));
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
      c(azy.a(azy.this), serverName, ☃ + 2, ☃ + 5, 16777215);
      c(azy.b(azy.this), ☃, ☃ + 2, ☃ + ca + 5 + 3, 3158064);
      c(azy.d(azy.this), ☃, d() - 5 - azy.e(azy.this).a(☃), ☃ + 5, 8421504);
      if (☃ != null) {
        c(azy.f(azy.this), ☃, d() - 5 - azy.g(azy.this).a(☃), ☃ + 5 + 3 + ha, 8421504);
      }
    }
    
    protected int d()
    {
      return super.d() + 15;
    }
  }
}
