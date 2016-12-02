import com.google.common.collect.Lists;
import de.resourcepacks24.gui.ModGuiScreenResourcePacks;
import de.resourcepacks24.main.ResourcePacks24;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;

public class azo
  extends axu
{
  private static final Logger a = ;
  private final axu f;
  private List<azp> g;
  private List<azp> h;
  private azt i;
  private azv r;
  private boolean s = false;
  public avw search;
  List<azp> packList = new ArrayList();
  private avs buttonDone;
  
  public azo(axu parentScreenIn)
  {
    this.f = parentScreenIn;
  }
  
  public axu getParentScreen()
  {
    return this.f;
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    ResourcePacks24.getInstance();
    
    this.n.add(new awe(3, this.l / 2 - 205, this.m - 48, 202, 20, "ResourcePacks24.de"));
    
    this.n.add(new awe(2, this.l / 2 + 3, this.m - 48, 130, 20, "Open pack folder"));
    this.n.add(this.buttonDone = new awe(1, this.l / 2 + 135, this.m - 48, 70, 20, bnq.a("gui.done", new Object[0])));
    if (!this.s)
    {
      this.g = Lists.newArrayList();
      this.h = Lists.newArrayList();
      bnm resourcepackrepository = this.j.R();
      resourcepackrepository.a();
      List<bnm.a> list = Lists.newArrayList(resourcepackrepository.b());
      list.removeAll(resourcepackrepository.c());
      ArrayList<bnm.a> toRemove = new ArrayList();
      for (Iterator localIterator1 = list.iterator(); localIterator1.hasNext();)
      {
        resourcepackrepository$entry = (bnm.a)localIterator1.next();
        for (String deletedPack : ResourcePacks24.getInstance().getDeletedPacks()) {
          if (resourcepackrepository$entry.d().equals(deletedPack)) {
            toRemove.add(resourcepackrepository$entry);
          }
        }
      }
      bnm.a resourcepackrepository$entry;
      list.removeAll(toRemove);
      for (bnm.a resourcepackrepository$entry : list) {
        this.g.add(new azr(this, resourcepackrepository$entry));
      }
      for (bnm.a resourcepackrepository$entry1 : Lists.reverse(resourcepackrepository.c())) {
        this.h.add(new azr(this, resourcepackrepository$entry1));
      }
      this.h.add(new azq(this));
    }
    this.i = new azt(this.j, 200, this.m, this.g);
    this.i.i(this.l / 2 - 4 - 200);
    this.i.d(7, 8);
    this.r = new azv(this.j, 200, this.m, this.h);
    this.r.i(this.l / 2 + 4);
    this.r.d(7, 8);
    
    this.i.d += 25;
    avr res = new avr(this.j);
    this.search = new avw(0, this.j.k, res.a() / 2 - 203, 33, 198, 20);
    
    this.packList.clear();
    this.packList.addAll(this.i.f());
    
    refreshPackList();
  }
  
  public void k()
    throws IOException
  {
    super.k();
    this.r.p();
    this.i.p();
  }
  
  public boolean a(azp p_146961_1_)
  {
    return this.h.contains(p_146961_1_);
  }
  
  public List<azp> b(azp p_146962_1_)
  {
    return a(p_146962_1_) ? this.h : this.g;
  }
  
  public List<azp> a()
  {
    return this.g;
  }
  
  public List<azp> f()
  {
    return this.h;
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l)
    {
      String s;
      if (button.k == 2)
      {
        File file1 = this.j.R().d();
        s = file1.getAbsolutePath();
        if (g.a() == g.a.d)
        {
          try
          {
            a.info(s);
            Runtime.getRuntime().exec(new String[] { "/usr/bin/open", s });
            return;
          }
          catch (IOException ioexception1)
          {
            a.error("Couldn't open file", ioexception1);
          }
        }
        else if (g.a() == g.a.c)
        {
          String s1 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { s });
          try
          {
            Runtime.getRuntime().exec(s1);
            return;
          }
          catch (IOException ioexception)
          {
            a.error("Couldn't open file", ioexception);
          }
        }
        boolean flag = false;
        try
        {
          Class<?> oclass = Class.forName("java.awt.Desktop");
          Object object = oclass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { file1.toURI() });
        }
        catch (Throwable throwable)
        {
          a.error("Couldn't open link", throwable);
          flag = true;
        }
        if (flag)
        {
          a.info("Opening via system class!");
          Sys.openURL("file://" + s);
        }
      }
      else if (button.k == 1)
      {
        if ((this.s) && (!r()))
        {
          List<bnm.a> list = Lists.newArrayList();
          for (azp resourcepacklistentry : this.h) {
            if ((resourcepacklistentry instanceof azr)) {
              list.add(((azr)resourcepacklistentry).j());
            }
          }
          Collections.reverse(list);
          this.j.R().a(list);
          this.j.t.k.clear();
          this.j.t.l.clear();
          for (bnm.a resourcepackrepository$entry : list)
          {
            this.j.t.k.add(resourcepackrepository$entry.d());
            if (resourcepackrepository$entry.f() != 1) {
              this.j.t.l.add(resourcepackrepository$entry.d());
            }
          }
          this.j.t.b();
          this.j.e();
        }
        this.j.a(this.f);
      }
      else if (button.k == 3)
      {
        this.j.a(new ModGuiScreenResourcePacks(this.j, this));
      }
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    this.i.b(mouseX, mouseY, mouseButton);
    this.r.b(mouseX, mouseY, mouseButton);
    this.search.a(mouseX, mouseY, mouseButton);
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    super.b(mouseX, mouseY, state);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    this.i.a(mouseX, mouseY, partialTicks);
    this.r.a(mouseX, mouseY, partialTicks);
    a(this.q, bnq.a("resourcePack.title", new Object[0]), this.l / 2, 16, 16777215);
    
    this.search.g();
    if ((!this.search.m()) && (this.search.b().isEmpty())) {
      this.j.k.a("Search..", this.search.a + 5, this.search.f + 6, Color.lightGray.getRGB());
    }
    if (this.buttonDone != null) {
      this.buttonDone.j = (r() ? "Cancel" : "Done");
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  public void g()
  {
    this.s = true;
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (this.search.a(typedChar, keyCode)) {
      refreshPackList();
    }
    super.a(typedChar, keyCode);
  }
  
  public void refreshPackList()
  {
    String input = this.search.b().replace(" ", "");
    final String selectedPath = ResourcePacks24.getInstance().getPath();
    this.i.f().clear();
    
    List<bnm.a> all = ave.A().R().b();
    final String path;
    azp pack;
    if (input.isEmpty())
    {
      ArrayList<String> alreadyAdded;
      if (selectedPath.isEmpty())
      {
        alreadyAdded = new ArrayList();
        for (bnm.a entry : all)
        {
          path = entry.getDirPath().replaceFirst("dir_", "");
          if ((!path.isEmpty()) && (!alreadyAdded.contains(path)))
          {
            int total = 0;
            for (bnm.a allEntry : all) {
              total += (allEntry.getDirPath().equals(entry.getDirPath()) ? 1 : 0);
            }
            final int finalCount = total;
            azp pack = new azp(this)
            {
              protected int a()
              {
                return 1;
              }
              
              protected void d() {}
              
              protected String c()
              {
                return path;
              }
              
              protected String b()
              {
                return finalCount + " resource pack" + (finalCount == 1 ? "" : "s");
              }
            };
            pack.setFolder(true);
            this.i.f().add(pack);
            alreadyAdded.add(path);
          }
        }
      }
      else
      {
        pack = new azp(this)
        {
          protected int a()
          {
            return 1;
          }
          
          protected void d() {}
          
          protected String c()
          {
            return "..";
          }
          
          protected String b()
          {
            return "You are in \"" + selectedPath + "\"\nGo back!";
          }
        };
        pack.setFolder(true);
        this.i.f().add(pack);
      }
    }
    for (azp pack : this.packList) {
      if ((input.isEmpty()) || (pack.getTitle().toLowerCase().replace(" ", "").contains(input.toLowerCase()))) {
        if (input.isEmpty())
        {
          boolean continuePack = false;
          for (bnm.a entry : all) {
            if ((entry.d().equals(pack.getTitle())) && (!entry.getDirPath().equals(selectedPath)))
            {
              continuePack = true;
              break;
            }
          }
          if (continuePack) {}
        }
        else
        {
          this.i.f().add(pack);
        }
      }
    }
    this.i.f().removeAll(this.h);
  }
}
