import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class bc
  extends i
{
  public String c()
  {
    return "scoreboard";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.scoreboard.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (b(☃, ☃)) {
      return;
    }
    if (☃.length < 1) {
      throw new cf("commands.scoreboard.usage", new Object[0]);
    }
    if (☃[0].equalsIgnoreCase("objectives"))
    {
      if (☃.length == 1) {
        throw new cf("commands.scoreboard.objectives.usage", new Object[0]);
      }
      if (☃[1].equalsIgnoreCase("list")) {
        d(☃);
      } else if (☃[1].equalsIgnoreCase("add"))
      {
        if (☃.length >= 4) {
          b(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("remove"))
      {
        if (☃.length == 3) {
          h(☃, ☃[2]);
        } else {
          throw new cf("commands.scoreboard.objectives.remove.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("setdisplay"))
      {
        if ((☃.length == 3) || (☃.length == 4)) {
          j(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
        }
      }
      else {
        throw new cf("commands.scoreboard.objectives.usage", new Object[0]);
      }
    }
    else if (☃[0].equalsIgnoreCase("players"))
    {
      if (☃.length == 1) {
        throw new cf("commands.scoreboard.players.usage", new Object[0]);
      }
      if (☃[1].equalsIgnoreCase("list"))
      {
        if (☃.length <= 3) {
          k(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.list.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("add"))
      {
        if (☃.length >= 5) {
          l(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.add.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("remove"))
      {
        if (☃.length >= 5) {
          l(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.remove.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("set"))
      {
        if (☃.length >= 5) {
          l(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.set.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("reset"))
      {
        if ((☃.length == 3) || (☃.length == 4)) {
          m(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.reset.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("enable"))
      {
        if (☃.length == 4) {
          n(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.enable.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("test"))
      {
        if ((☃.length == 5) || (☃.length == 6)) {
          o(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.test.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("operation"))
      {
        if (☃.length == 7) {
          p(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.players.operation.usage", new Object[0]);
        }
      }
      else {
        throw new cf("commands.scoreboard.players.usage", new Object[0]);
      }
    }
    else if (☃[0].equalsIgnoreCase("teams"))
    {
      if (☃.length == 1) {
        throw new cf("commands.scoreboard.teams.usage", new Object[0]);
      }
      if (☃[1].equalsIgnoreCase("list"))
      {
        if (☃.length <= 3) {
          f(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.list.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("add"))
      {
        if (☃.length >= 3) {
          c(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.add.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("remove"))
      {
        if (☃.length == 3) {
          e(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.remove.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("empty"))
      {
        if (☃.length == 3) {
          i(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.empty.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("join"))
      {
        if ((☃.length >= 4) || ((☃.length == 3) && ((☃ instanceof wn)))) {
          g(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.join.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("leave"))
      {
        if ((☃.length >= 3) || ((☃ instanceof wn))) {
          h(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.leave.usage", new Object[0]);
        }
      }
      else if (☃[1].equalsIgnoreCase("option"))
      {
        if ((☃.length == 4) || (☃.length == 5)) {
          d(☃, ☃, 2);
        } else {
          throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
        }
      }
      else {
        throw new cf("commands.scoreboard.teams.usage", new Object[0]);
      }
    }
    else
    {
      throw new cf("commands.scoreboard.usage", new Object[0]);
    }
  }
  
  private boolean b(m ☃, String[] ☃)
    throws bz
  {
    int ☃ = -1;
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      if (b(☃, ☃)) {
        if ("*".equals(☃[☃])) {
          if (☃ < 0) {
            ☃ = ☃;
          } else {
            throw new bz("commands.scoreboard.noMultiWildcard", new Object[0]);
          }
        }
      }
    }
    if (☃ < 0) {
      return false;
    }
    List<String> ☃ = Lists.newArrayList(d().d());
    String ☃ = ☃[☃];
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : ☃)
    {
      ☃[☃] = ☃;
      try
      {
        a(☃, ☃);
        ☃.add(☃);
      }
      catch (bz ☃)
      {
        fb ☃ = new fb(☃.getMessage(), ☃.a());
        ☃.b().a(a.m);
        ☃.a(☃);
      }
    }
    ☃[☃] = ☃;
    
    ☃.a(n.a.c, ☃.size());
    if (☃.size() == 0) {
      throw new cf("commands.scoreboard.allMatchesFailed", new Object[0]);
    }
    return true;
  }
  
  protected auo d()
  {
    return MinecraftServer.N().a(0).Z();
  }
  
  protected auk a(String ☃, boolean ☃)
    throws bz
  {
    auo ☃ = d();
    auk ☃ = ☃.b(☃);
    if (☃ == null) {
      throw new bz("commands.scoreboard.objectiveNotFound", new Object[] { ☃ });
    }
    if ((☃) && (☃.c().b())) {
      throw new bz("commands.scoreboard.objectiveReadOnly", new Object[] { ☃ });
    }
    return ☃;
  }
  
  protected aul e(String ☃)
    throws bz
  {
    auo ☃ = d();
    aul ☃ = ☃.d(☃);
    if (☃ == null) {
      throw new bz("commands.scoreboard.teamNotFound", new Object[] { ☃ });
    }
    return ☃;
  }
  
  protected void b(m ☃, String[] ☃, int ☃)
    throws bz
  {
    String ☃ = ☃[(☃++)];
    String ☃ = ☃[(☃++)];
    auo ☃ = d();
    auu ☃ = (auu)auu.a.get(☃);
    if (☃ == null) {
      throw new cf("commands.scoreboard.objectives.add.wrongType", new Object[] { ☃ });
    }
    if (☃.b(☃) != null) {
      throw new bz("commands.scoreboard.objectives.add.alreadyExists", new Object[] { ☃ });
    }
    if (☃.length() > 16) {
      throw new cc("commands.scoreboard.objectives.add.tooLong", new Object[] { ☃, Integer.valueOf(16) });
    }
    if (☃.length() == 0) {
      throw new cf("commands.scoreboard.objectives.add.usage", new Object[0]);
    }
    if (☃.length > ☃)
    {
      String ☃ = a(☃, ☃, ☃).c();
      if (☃.length() > 32) {
        throw new cc("commands.scoreboard.objectives.add.displayTooLong", new Object[] { ☃, Integer.valueOf(32) });
      }
      if (☃.length() > 0) {
        ☃.a(☃, ☃).a(☃);
      } else {
        ☃.a(☃, ☃);
      }
    }
    else
    {
      ☃.a(☃, ☃);
    }
    a(☃, this, "commands.scoreboard.objectives.add.success", new Object[] { ☃ });
  }
  
  protected void c(m ☃, String[] ☃, int ☃)
    throws bz
  {
    String ☃ = ☃[(☃++)];
    auo ☃ = d();
    if (☃.d(☃) != null) {
      throw new bz("commands.scoreboard.teams.add.alreadyExists", new Object[] { ☃ });
    }
    if (☃.length() > 16) {
      throw new cc("commands.scoreboard.teams.add.tooLong", new Object[] { ☃, Integer.valueOf(16) });
    }
    if (☃.length() == 0) {
      throw new cf("commands.scoreboard.teams.add.usage", new Object[0]);
    }
    if (☃.length > ☃)
    {
      String ☃ = a(☃, ☃, ☃).c();
      if (☃.length() > 32) {
        throw new cc("commands.scoreboard.teams.add.displayTooLong", new Object[] { ☃, Integer.valueOf(32) });
      }
      if (☃.length() > 0) {
        ☃.e(☃).a(☃);
      } else {
        ☃.e(☃);
      }
    }
    else
    {
      ☃.e(☃);
    }
    a(☃, this, "commands.scoreboard.teams.add.success", new Object[] { ☃ });
  }
  
  protected void d(m ☃, String[] ☃, int ☃)
    throws bz
  {
    aul ☃ = e(☃[(☃++)]);
    if (☃ == null) {
      return;
    }
    String ☃ = ☃[(☃++)].toLowerCase();
    if ((!☃.equalsIgnoreCase("color")) && (!☃.equalsIgnoreCase("friendlyfire")) && (!☃.equalsIgnoreCase("seeFriendlyInvisibles")) && (!☃.equalsIgnoreCase("nametagVisibility")) && (!☃.equalsIgnoreCase("deathMessageVisibility"))) {
      throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
    }
    if (☃.length == 4)
    {
      if (☃.equalsIgnoreCase("color")) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(a.a(true, false)) });
      }
      if ((☃.equalsIgnoreCase("friendlyfire")) || (☃.equalsIgnoreCase("seeFriendlyInvisibles"))) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(Arrays.asList(new String[] { "true", "false" })) });
      }
      if ((☃.equalsIgnoreCase("nametagVisibility")) || (☃.equalsIgnoreCase("deathMessageVisibility"))) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(auq.a.a()) });
      }
      throw new cf("commands.scoreboard.teams.option.usage", new Object[0]);
    }
    String ☃ = ☃[☃];
    if (☃.equalsIgnoreCase("color"))
    {
      a ☃ = a.b(☃);
      if ((☃ == null) || (☃.c())) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(a.a(true, false)) });
      }
      ☃.a(☃);
      ☃.b(☃.toString());
      ☃.c(a.v.toString());
    }
    else if (☃.equalsIgnoreCase("friendlyfire"))
    {
      if ((!☃.equalsIgnoreCase("true")) && (!☃.equalsIgnoreCase("false"))) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(Arrays.asList(new String[] { "true", "false" })) });
      }
      ☃.a(☃.equalsIgnoreCase("true"));
    }
    else if (☃.equalsIgnoreCase("seeFriendlyInvisibles"))
    {
      if ((!☃.equalsIgnoreCase("true")) && (!☃.equalsIgnoreCase("false"))) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(Arrays.asList(new String[] { "true", "false" })) });
      }
      ☃.b(☃.equalsIgnoreCase("true"));
    }
    else if (☃.equalsIgnoreCase("nametagVisibility"))
    {
      auq.a ☃ = auq.a.a(☃);
      if (☃ == null) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(auq.a.a()) });
      }
      ☃.a(☃);
    }
    else if (☃.equalsIgnoreCase("deathMessageVisibility"))
    {
      auq.a ☃ = auq.a.a(☃);
      if (☃ == null) {
        throw new cf("commands.scoreboard.teams.option.noValue", new Object[] { ☃, a(auq.a.a()) });
      }
      ☃.b(☃);
    }
    a(☃, this, "commands.scoreboard.teams.option.success", new Object[] { ☃, ☃.b(), ☃ });
  }
  
  protected void e(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    aul ☃ = e(☃[☃]);
    if (☃ == null) {
      return;
    }
    ☃.d(☃);
    a(☃, this, "commands.scoreboard.teams.remove.success", new Object[] { ☃.b() });
  }
  
  protected void f(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    if (☃.length > ☃)
    {
      aul ☃ = e(☃[☃]);
      if (☃ == null) {
        return;
      }
      Collection<String> ☃ = ☃.d();
      ☃.a(n.a.e, ☃.size());
      if (☃.size() > 0)
      {
        fb ☃ = new fb("commands.scoreboard.teams.list.player.count", new Object[] { Integer.valueOf(☃.size()), ☃.b() });
        ☃.b().a(a.c);
        ☃.a(☃);
        ☃.a(new fa(a(☃.toArray())));
      }
      else
      {
        throw new bz("commands.scoreboard.teams.list.player.empty", new Object[] { ☃.b() });
      }
    }
    else
    {
      Collection<aul> ☃ = ☃.g();
      
      ☃.a(n.a.e, ☃.size());
      if (☃.size() > 0)
      {
        fb ☃ = new fb("commands.scoreboard.teams.list.count", new Object[] { Integer.valueOf(☃.size()) });
        ☃.b().a(a.c);
        ☃.a(☃);
        for (aul ☃ : ☃) {
          ☃.a(new fb("commands.scoreboard.teams.list.entry", new Object[] { ☃.b(), ☃.c(), Integer.valueOf(☃.d().size()) }));
        }
      }
      else
      {
        throw new bz("commands.scoreboard.teams.list.empty", new Object[0]);
      }
    }
  }
  
  protected void g(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = ☃[(☃++)];
    Set<String> ☃ = Sets.newHashSet();
    Set<String> ☃ = Sets.newHashSet();
    if (((☃ instanceof wn)) && (☃ == ☃.length))
    {
      String ☃ = b(☃).e_();
      if (☃.a(☃, ☃)) {
        ☃.add(☃);
      } else {
        ☃.add(☃);
      }
    }
    else
    {
      while (☃ < ☃.length)
      {
        String ☃ = ☃[(☃++)];
        if (☃.startsWith("@"))
        {
          List<pk> ☃ = c(☃, ☃);
          for (pk ☃ : ☃)
          {
            String ☃ = e(☃, ☃.aK().toString());
            if (☃.a(☃, ☃)) {
              ☃.add(☃);
            } else {
              ☃.add(☃);
            }
          }
        }
        else
        {
          String ☃ = e(☃, ☃);
          if (☃.a(☃, ☃)) {
            ☃.add(☃);
          } else {
            ☃.add(☃);
          }
        }
      }
    }
    if (!☃.isEmpty())
    {
      ☃.a(n.a.c, ☃.size());
      a(☃, this, "commands.scoreboard.teams.join.success", new Object[] { Integer.valueOf(☃.size()), ☃, a(☃.toArray(new String[☃.size()])) });
    }
    if (!☃.isEmpty()) {
      throw new bz("commands.scoreboard.teams.join.failure", new Object[] { Integer.valueOf(☃.size()), ☃, a(☃.toArray(new String[☃.size()])) });
    }
  }
  
  protected void h(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    Set<String> ☃ = Sets.newHashSet();
    Set<String> ☃ = Sets.newHashSet();
    if (((☃ instanceof wn)) && (☃ == ☃.length))
    {
      String ☃ = b(☃).e_();
      if (☃.f(☃)) {
        ☃.add(☃);
      } else {
        ☃.add(☃);
      }
    }
    else
    {
      while (☃ < ☃.length)
      {
        String ☃ = ☃[(☃++)];
        if (☃.startsWith("@"))
        {
          List<pk> ☃ = c(☃, ☃);
          for (pk ☃ : ☃)
          {
            String ☃ = e(☃, ☃.aK().toString());
            if (☃.f(☃)) {
              ☃.add(☃);
            } else {
              ☃.add(☃);
            }
          }
        }
        else
        {
          String ☃ = e(☃, ☃);
          if (☃.f(☃)) {
            ☃.add(☃);
          } else {
            ☃.add(☃);
          }
        }
      }
    }
    if (!☃.isEmpty())
    {
      ☃.a(n.a.c, ☃.size());
      a(☃, this, "commands.scoreboard.teams.leave.success", new Object[] { Integer.valueOf(☃.size()), a(☃.toArray(new String[☃.size()])) });
    }
    if (!☃.isEmpty()) {
      throw new bz("commands.scoreboard.teams.leave.failure", new Object[] { Integer.valueOf(☃.size()), a(☃.toArray(new String[☃.size()])) });
    }
  }
  
  protected void i(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    aul ☃ = e(☃[☃]);
    if (☃ == null) {
      return;
    }
    Collection<String> ☃ = Lists.newArrayList(☃.d());
    ☃.a(n.a.c, ☃.size());
    if (☃.isEmpty()) {
      throw new bz("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { ☃.b() });
    }
    for (String ☃ : ☃) {
      ☃.a(☃, ☃);
    }
    a(☃, this, "commands.scoreboard.teams.empty.success", new Object[] { Integer.valueOf(☃.size()), ☃.b() });
  }
  
  protected void h(m ☃, String ☃)
    throws bz
  {
    auo ☃ = d();
    auk ☃ = a(☃, false);
    
    ☃.k(☃);
    
    a(☃, this, "commands.scoreboard.objectives.remove.success", new Object[] { ☃ });
  }
  
  protected void d(m ☃)
    throws bz
  {
    auo ☃ = d();
    Collection<auk> ☃ = ☃.c();
    if (☃.size() > 0)
    {
      fb ☃ = new fb("commands.scoreboard.objectives.list.count", new Object[] { Integer.valueOf(☃.size()) });
      ☃.b().a(a.c);
      ☃.a(☃);
      for (auk ☃ : ☃) {
        ☃.a(new fb("commands.scoreboard.objectives.list.entry", new Object[] { ☃.b(), ☃.d(), ☃.c().a() }));
      }
    }
    else
    {
      throw new bz("commands.scoreboard.objectives.list.empty", new Object[0]);
    }
  }
  
  protected void j(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = ☃[(☃++)];
    int ☃ = auo.i(☃);
    auk ☃ = null;
    if (☃.length == 4) {
      ☃ = a(☃[☃], false);
    }
    if (☃ < 0) {
      throw new bz("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { ☃ });
    }
    ☃.a(☃, ☃);
    if (☃ != null) {
      a(☃, this, "commands.scoreboard.objectives.setdisplay.successSet", new Object[] { auo.b(☃), ☃.b() });
    } else {
      a(☃, this, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[] { auo.b(☃) });
    }
  }
  
  protected void k(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    if (☃.length > ☃)
    {
      String ☃ = e(☃, ☃[☃]);
      Map<auk, aum> ☃ = ☃.c(☃);
      
      ☃.a(n.a.e, ☃.size());
      if (☃.size() > 0)
      {
        fb ☃ = new fb("commands.scoreboard.players.list.player.count", new Object[] { Integer.valueOf(☃.size()), ☃ });
        ☃.b().a(a.c);
        ☃.a(☃);
        for (aum ☃ : ☃.values()) {
          ☃.a(new fb("commands.scoreboard.players.list.player.entry", new Object[] { Integer.valueOf(☃.c()), ☃.d().d(), ☃.d().b() }));
        }
      }
      else
      {
        throw new bz("commands.scoreboard.players.list.player.empty", new Object[] { ☃ });
      }
    }
    else
    {
      Collection<String> ☃ = ☃.d();
      
      ☃.a(n.a.e, ☃.size());
      if (☃.size() > 0)
      {
        fb ☃ = new fb("commands.scoreboard.players.list.count", new Object[] { Integer.valueOf(☃.size()) });
        ☃.b().a(a.c);
        ☃.a(☃);
        ☃.a(new fa(a(☃.toArray())));
      }
      else
      {
        throw new bz("commands.scoreboard.players.list.empty", new Object[0]);
      }
    }
  }
  
  protected void l(m ☃, String[] ☃, int ☃)
    throws bz
  {
    String ☃ = ☃[(☃ - 1)];
    int ☃ = ☃;
    String ☃ = e(☃, ☃[(☃++)]);
    if (☃.length() > 40) {
      throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { ☃, Integer.valueOf(40) });
    }
    auk ☃ = a(☃[(☃++)], true);
    int ☃ = ☃.equalsIgnoreCase("set") ? a(☃[(☃++)]) : a(☃[(☃++)], 0);
    if (☃.length > ☃)
    {
      pk ☃ = b(☃, ☃[☃]);
      try
      {
        dn ☃ = ed.a(a(☃, ☃));
        dn ☃ = new dn();
        ☃.e(☃);
        if (!dy.a(☃, ☃, true)) {
          throw new bz("commands.scoreboard.players.set.tagMismatch", new Object[] { ☃ });
        }
      }
      catch (ec ☃)
      {
        throw new bz("commands.scoreboard.players.set.tagError", new Object[] { ☃.getMessage() });
      }
    }
    auo ☃ = d();
    aum ☃ = ☃.c(☃, ☃);
    if (☃.equalsIgnoreCase("set")) {
      ☃.c(☃);
    } else if (☃.equalsIgnoreCase("add")) {
      ☃.a(☃);
    } else {
      ☃.b(☃);
    }
    a(☃, this, "commands.scoreboard.players.set.success", new Object[] { ☃.b(), ☃, Integer.valueOf(☃.c()) });
  }
  
  protected void m(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = e(☃, ☃[(☃++)]);
    if (☃.length > ☃)
    {
      auk ☃ = a(☃[(☃++)], false);
      ☃.d(☃, ☃);
      a(☃, this, "commands.scoreboard.players.resetscore.success", new Object[] { ☃.b(), ☃ });
    }
    else
    {
      ☃.d(☃, null);
      a(☃, this, "commands.scoreboard.players.reset.success", new Object[] { ☃ });
    }
  }
  
  protected void n(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = d(☃, ☃[(☃++)]);
    if (☃.length() > 40) {
      throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { ☃, Integer.valueOf(40) });
    }
    auk ☃ = a(☃[☃], false);
    if (☃.c() != auu.c) {
      throw new bz("commands.scoreboard.players.enable.noTrigger", new Object[] { ☃.b() });
    }
    aum ☃ = ☃.c(☃, ☃);
    ☃.a(false);
    a(☃, this, "commands.scoreboard.players.enable.success", new Object[] { ☃.b(), ☃ });
  }
  
  protected void o(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = e(☃, ☃[(☃++)]);
    if (☃.length() > 40) {
      throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { ☃, Integer.valueOf(40) });
    }
    auk ☃ = a(☃[(☃++)], false);
    if (!☃.b(☃, ☃)) {
      throw new bz("commands.scoreboard.players.test.notFound", new Object[] { ☃.b(), ☃ });
    }
    int ☃ = ☃[☃].equals("*") ? Integer.MIN_VALUE : a(☃[☃]);
    ☃++;
    int ☃ = (☃ >= ☃.length) || (☃[☃].equals("*")) ? Integer.MAX_VALUE : a(☃[☃], ☃);
    
    aum ☃ = ☃.c(☃, ☃);
    if ((☃.c() < ☃) || (☃.c() > ☃)) {
      throw new bz("commands.scoreboard.players.test.failed", new Object[] { Integer.valueOf(☃.c()), Integer.valueOf(☃), Integer.valueOf(☃) });
    }
    a(☃, this, "commands.scoreboard.players.test.success", new Object[] { Integer.valueOf(☃.c()), Integer.valueOf(☃), Integer.valueOf(☃) });
  }
  
  protected void p(m ☃, String[] ☃, int ☃)
    throws bz
  {
    auo ☃ = d();
    String ☃ = e(☃, ☃[(☃++)]);
    auk ☃ = a(☃[(☃++)], true);
    
    String ☃ = ☃[(☃++)];
    String ☃ = e(☃, ☃[(☃++)]);
    auk ☃ = a(☃[☃], false);
    if (☃.length() > 40) {
      throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { ☃, Integer.valueOf(40) });
    }
    if (☃.length() > 40) {
      throw new cc("commands.scoreboard.players.name.tooLong", new Object[] { ☃, Integer.valueOf(40) });
    }
    aum ☃ = ☃.c(☃, ☃);
    if (!☃.b(☃, ☃)) {
      throw new bz("commands.scoreboard.players.operation.notFound", new Object[] { ☃.b(), ☃ });
    }
    aum ☃ = ☃.c(☃, ☃);
    if (☃.equals("+="))
    {
      ☃.c(☃.c() + ☃.c());
    }
    else if (☃.equals("-="))
    {
      ☃.c(☃.c() - ☃.c());
    }
    else if (☃.equals("*="))
    {
      ☃.c(☃.c() * ☃.c());
    }
    else if (☃.equals("/="))
    {
      if (☃.c() != 0) {
        ☃.c(☃.c() / ☃.c());
      }
    }
    else if (☃.equals("%="))
    {
      if (☃.c() != 0) {
        ☃.c(☃.c() % ☃.c());
      }
    }
    else if (☃.equals("="))
    {
      ☃.c(☃.c());
    }
    else if (☃.equals("<"))
    {
      ☃.c(Math.min(☃.c(), ☃.c()));
    }
    else if (☃.equals(">"))
    {
      ☃.c(Math.max(☃.c(), ☃.c()));
    }
    else if (☃.equals("><"))
    {
      int ☃ = ☃.c();
      ☃.c(☃.c());
      ☃.c(☃);
    }
    else
    {
      throw new bz("commands.scoreboard.players.operation.invalidOperation", new Object[] { ☃ });
    }
    a(☃, this, "commands.scoreboard.players.operation.success", new Object[0]);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "objectives", "players", "teams" });
    }
    if (☃[0].equalsIgnoreCase("objectives"))
    {
      if (☃.length == 2) {
        return a(☃, new String[] { "list", "add", "remove", "setdisplay" });
      }
      if (☃[1].equalsIgnoreCase("add"))
      {
        if (☃.length == 4)
        {
          Set<String> ☃ = auu.a.keySet();
          return a(☃, ☃);
        }
      }
      else if (☃[1].equalsIgnoreCase("remove"))
      {
        if (☃.length == 3) {
          return a(☃, a(false));
        }
      }
      else if (☃[1].equalsIgnoreCase("setdisplay"))
      {
        if (☃.length == 3) {
          return a(☃, auo.h());
        }
        if (☃.length == 4) {
          return a(☃, a(false));
        }
      }
    }
    else if (☃[0].equalsIgnoreCase("players"))
    {
      if (☃.length == 2) {
        return a(☃, new String[] { "set", "add", "remove", "reset", "list", "enable", "test", "operation" });
      }
      if ((☃[1].equalsIgnoreCase("set")) || (☃[1].equalsIgnoreCase("add")) || (☃[1].equalsIgnoreCase("remove")) || (☃[1].equalsIgnoreCase("reset")))
      {
        if (☃.length == 3) {
          return a(☃, MinecraftServer.N().K());
        }
        if (☃.length == 4) {
          return a(☃, a(true));
        }
      }
      else if (☃[1].equalsIgnoreCase("enable"))
      {
        if (☃.length == 3) {
          return a(☃, MinecraftServer.N().K());
        }
        if (☃.length == 4) {
          return a(☃, e());
        }
      }
      else if ((☃[1].equalsIgnoreCase("list")) || (☃[1].equalsIgnoreCase("test")))
      {
        if (☃.length == 3) {
          return a(☃, d().d());
        }
        if ((☃.length == 4) && (☃[1].equalsIgnoreCase("test"))) {
          return a(☃, a(false));
        }
      }
      else if (☃[1].equalsIgnoreCase("operation"))
      {
        if (☃.length == 3) {
          return a(☃, d().d());
        }
        if (☃.length == 4) {
          return a(☃, a(true));
        }
        if (☃.length == 5) {
          return a(☃, new String[] { "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><" });
        }
        if (☃.length == 6) {
          return a(☃, MinecraftServer.N().K());
        }
        if (☃.length == 7) {
          return a(☃, a(false));
        }
      }
    }
    else if (☃[0].equalsIgnoreCase("teams"))
    {
      if (☃.length == 2) {
        return a(☃, new String[] { "add", "remove", "join", "leave", "empty", "list", "option" });
      }
      if (☃[1].equalsIgnoreCase("join"))
      {
        if (☃.length == 3) {
          return a(☃, d().f());
        }
        if (☃.length >= 4) {
          return a(☃, MinecraftServer.N().K());
        }
      }
      else
      {
        if (☃[1].equalsIgnoreCase("leave")) {
          return a(☃, MinecraftServer.N().K());
        }
        if ((☃[1].equalsIgnoreCase("empty")) || (☃[1].equalsIgnoreCase("list")) || (☃[1].equalsIgnoreCase("remove")))
        {
          if (☃.length == 3) {
            return a(☃, d().f());
          }
        }
        else if (☃[1].equalsIgnoreCase("option"))
        {
          if (☃.length == 3) {
            return a(☃, d().f());
          }
          if (☃.length == 4) {
            return a(☃, new String[] { "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility" });
          }
          if (☃.length == 5)
          {
            if (☃[3].equalsIgnoreCase("color")) {
              return a(☃, a.a(true, false));
            }
            if ((☃[3].equalsIgnoreCase("nametagVisibility")) || (☃[3].equalsIgnoreCase("deathMessageVisibility"))) {
              return a(☃, auq.a.a());
            }
            if ((☃[3].equalsIgnoreCase("friendlyfire")) || (☃[3].equalsIgnoreCase("seeFriendlyInvisibles"))) {
              return a(☃, new String[] { "true", "false" });
            }
          }
        }
      }
    }
    return null;
  }
  
  protected List<String> a(boolean ☃)
  {
    Collection<auk> ☃ = d().c();
    List<String> ☃ = Lists.newArrayList();
    for (auk ☃ : ☃) {
      if ((!☃) || (!☃.c().b())) {
        ☃.add(☃.b());
      }
    }
    return ☃;
  }
  
  protected List<String> e()
  {
    Collection<auk> ☃ = d().c();
    List<String> ☃ = Lists.newArrayList();
    for (auk ☃ : ☃) {
      if (☃.c() == auu.c) {
        ☃.add(☃.b());
      }
    }
    return ☃;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    if (☃[0].equalsIgnoreCase("players"))
    {
      if ((☃.length > 1) && (☃[1].equalsIgnoreCase("operation"))) {
        return (☃ == 2) || (☃ == 5);
      }
      return ☃ == 2;
    }
    if (☃[0].equalsIgnoreCase("teams")) {
      return ☃ == 2;
    }
    return false;
  }
}
