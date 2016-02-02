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
    this.a = ☃;
  }
  
  public void b()
  {
    this.f = bnq.a("options.stream.ingest.title", new Object[0]);
    this.g = new azy.a(this.j);
    if (!this.j.Y().w()) {
      this.j.Y().u();
    }
    this.n.add(new avs(1, this.l / 2 - 155, this.m - 24 - 6, 150, 20, bnq.a("gui.done", new Object[0])));
    this.n.add(new avs(2, this.l / 2 + 5, this.m - 24 - 6, 150, 20, bnq.a("options.stream.ingest.reset", new Object[0])));
  }
  
  public void k()
  {
    super.k();
    this.g.p();
  }
  
  public void m()
  {
    if (this.j.Y().w()) {
      this.j.Y().v().m();
    }
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 1)
    {
      this.j.a(this.a);
    }
    else
    {
      this.j.t.R = "";
      this.j.t.b();
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    this.g.a(☃, ☃, ☃);
    a(this.q, this.f, this.l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a(ave ☃)
    {
      super(azy.this.l, azy.this.m, 32, azy.this.m - 35, (int)(☃.k.a * 3.5D));
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
      azy.this.c(azy.a(azy.this), ☃.serverName, ☃ + 2, ☃ + 5, 16777215);
      azy.this.c(azy.b(azy.this), ☃, ☃ + 2, ☃ + azy.c(azy.this).a + 5 + 3, 3158064);
      azy.this.c(azy.d(azy.this), ☃, d() - 5 - azy.e(azy.this).a(☃), ☃ + 5, 8421504);
      if (☃ != null) {
        azy.this.c(azy.f(azy.this), ☃, d() - 5 - azy.g(azy.this).a(☃), ☃ + 5 + 3 + azy.h(azy.this).a, 8421504);
      }
    }
    
    protected int d()
    {
      return super.d() + 15;
    }
  }
}
