import net.minecraft.server.MinecraftServer;

public class bd
  extends j
  implements h
{
  public bd()
  {
    a(new br());
    a(new ah());
    a(new ag());
    a(new y());
    a(new am());
    a(new bt());
    a(new bv());
    a(new ae());
    a(new bn());
    a(new aj());
    a(new ax());
    a(new bk());
    a(new z());
    a(new ab());
    a(new au());
    a(new aa());
    a(new bi());
    a(new ak());
    a(new x());
    a(new ap());
    a(new bb());
    a(new bh());
    a(new bf());
    a(new ai());
    a(new t());
    a(new bq());
    a(new bj());
    a(new av());
    a(new bc());
    a(new ad());
    a(new bu());
    a(new p());
    a(new bm());
    a(new be());
    a(new af());
    a(new u());
    a(new v());
    a(new s());
    a(new bp());
    a(new aq());
    a(new bx());
    a(new bs());
    a(new ac());
    if (MinecraftServer.N().ae())
    {
      a(new ar());
      a(new w());
      a(new bl());
      a(new ay());
      a(new az());
      a(new ba());
      a(new q());
      a(new as());
      a(new r());
      a(new an());
      a(new at());
      a(new al());
      a(new ao());
      a(new bw());
      a(new bg());
    }
    else
    {
      a(new aw());
    }
    i.a(this);
  }
  
  public void a(m ☃, k ☃, int ☃, String ☃, Object... ☃)
  {
    boolean ☃ = true;
    
    MinecraftServer ☃ = MinecraftServer.N();
    if (!☃.u_()) {
      ☃ = false;
    }
    eu ☃ = new fb("chat.type.admin", new Object[] { ☃.e_(), new fb(☃, ☃) });
    ☃.b().a(a.h);
    ☃.b().b(Boolean.valueOf(true));
    if (☃) {
      for (wn ☃ : ☃.ap().v()) {
        if ((☃ != ☃) && (☃.ap().h(☃.cd())) && (☃.a(☃)))
        {
          boolean ☃ = ((☃ instanceof MinecraftServer)) && (MinecraftServer.N().r());
          boolean ☃ = ((☃ instanceof mj)) && (MinecraftServer.N().q());
          if ((☃) || (☃) || ((!(☃ instanceof mj)) && (!(☃ instanceof MinecraftServer)))) {
            ☃.a(☃);
          }
        }
      }
    }
    if ((☃ != ☃) && (d[0].Q().b("logAdminCommands"))) {
      ☃.a(☃);
    }
    boolean ☃ = d[0].Q().b("sendCommandFeedback");
    if ((☃ instanceof adc)) {
      ☃ = ((adc)☃).m();
    }
    if ((((☃ & 0x1) != 1) && (☃)) || ((☃ instanceof MinecraftServer))) {
      ☃.a(new fb(☃, ☃));
    }
  }
}
