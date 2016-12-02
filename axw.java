import java.util.List;

public class axw
  extends axu
{
  private final axu a;
  private avs f;
  private avs g;
  private String h = "survival";
  private boolean i;
  
  public axw(axu ☃)
  {
    a = ☃;
  }
  
  public void b()
  {
    n.clear();
    n.add(new avs(101, l / 2 - 155, m - 28, 150, 20, bnq.a("lanServer.start", new Object[0])));
    n.add(new avs(102, l / 2 + 5, m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    n.add(g = new avs(104, l / 2 - 155, 100, 150, 20, bnq.a("selectWorld.gameMode", new Object[0])));
    n.add(f = new avs(103, l / 2 + 5, 100, 150, 20, bnq.a("selectWorld.allowCommands", new Object[0])));
    
    a();
  }
  
  private void a()
  {
    g.j = (bnq.a("selectWorld.gameMode", new Object[0]) + " " + bnq.a(new StringBuilder().append("selectWorld.gameMode.").append(h).toString(), new Object[0]));
    
    f.j = (bnq.a("selectWorld.allowCommands", new Object[0]) + " ");
    if (i) {
      f.j += bnq.a("options.on", new Object[0]);
    } else {
      f.j += bnq.a("options.off", new Object[0]);
    }
  }
  
  protected void a(avs ☃)
  {
    if (k == 102)
    {
      j.a(a);
    }
    else if (k == 104)
    {
      if (h.equals("spectator")) {
        h = "creative";
      } else if (h.equals("creative")) {
        h = "adventure";
      } else if (h.equals("adventure")) {
        h = "survival";
      } else {
        h = "spectator";
      }
      a();
    }
    else if (k == 103)
    {
      i = (!i);
      a();
    }
    else if (k == 101)
    {
      j.a(null);
      String ☃ = j.G().a(adp.a.a(h), i);
      eu ☃;
      eu ☃;
      if (☃ != null) {
        ☃ = new fb("commands.publish.started", new Object[] { ☃ });
      } else {
        ☃ = new fa("commands.publish.failed");
      }
      j.q.d().a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, bnq.a("lanServer.title", new Object[0]), l / 2, 50, 16777215);
    a(q, bnq.a("lanServer.otherPlayers", new Object[0]), l / 2, 82, 16777215);
    
    super.a(☃, ☃, ☃);
  }
}
