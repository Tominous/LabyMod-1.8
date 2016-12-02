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
    f = parentScreenIn;
  }
  
  public axu getParentScreen()
  {
    return f;
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    
    ResourcePacks24.getInstance();
    
    n.add(new awe(3, l / 2 - 205, m - 48, 202, 20, "ResourcePacks24.de"));
    
    n.add(new awe(2, l / 2 + 3, m - 48, 130, 20, "Open pack folder"));
    n.add(buttonDone = new awe(1, l / 2 + 135, m - 48, 70, 20, bnq.a("gui.done", new Object[0])));
    if (!s)
    {
      g = Lists.newArrayList();
      h = Lists.newArrayList();
      bnm resourcepackrepository = j.R();
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
        g.add(new azr(this, resourcepackrepository$entry));
      }
      for (bnm.a resourcepackrepository$entry1 : Lists.reverse(resourcepackrepository.c())) {
        h.add(new azr(this, resourcepackrepository$entry1));
      }
      h.add(new azq(this));
    }
    i = new azt(j, 200, m, g);
    i.i(l / 2 - 4 - 200);
    i.d(7, 8);
    r = new azv(j, 200, m, h);
    r.i(l / 2 + 4);
    r.d(7, 8);
    
    i.d += 25;
    avr res = new avr(j);
    search = new avw(0, j.k, res.a() / 2 - 203, 33, 198, 20);
    
    packList.clear();
    packList.addAll(i.f());
    
    refreshPackList();
  }
  
  public void k()
    throws IOException
  {
    super.k();
    r.p();
    i.p();
  }
  
  public boolean a(azp p_146961_1_)
  {
    return h.contains(p_146961_1_);
  }
  
  public List<azp> b(azp p_146962_1_)
  {
    return a(p_146962_1_) ? h : g;
  }
  
  public List<azp> a()
  {
    return g;
  }
  
  public List<azp> f()
  {
    return h;
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l)
    {
      String s;
      if (k == 2)
      {
        File file1 = j.R().d();
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
      else if (k == 1)
      {
        if ((this.s) && (!r()))
        {
          List<bnm.a> list = Lists.newArrayList();
          for (azp resourcepacklistentry : h) {
            if ((resourcepacklistentry instanceof azr)) {
              list.add(((azr)resourcepacklistentry).j());
            }
          }
          Collections.reverse(list);
          j.R().a(list);
          j.t.k.clear();
          j.t.l.clear();
          for (bnm.a resourcepackrepository$entry : list)
          {
            j.t.k.add(resourcepackrepository$entry.d());
            if (resourcepackrepository$entry.f() != 1) {
              j.t.l.add(resourcepackrepository$entry.d());
            }
          }
          j.t.b();
          j.e();
        }
        j.a(f);
      }
      else if (k == 3)
      {
        j.a(new ModGuiScreenResourcePacks(j, this));
      }
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    i.b(mouseX, mouseY, mouseButton);
    r.b(mouseX, mouseY, mouseButton);
    search.a(mouseX, mouseY, mouseButton);
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    super.b(mouseX, mouseY, state);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    i.a(mouseX, mouseY, partialTicks);
    r.a(mouseX, mouseY, partialTicks);
    a(q, bnq.a("resourcePack.title", new Object[0]), l / 2, 16, 16777215);
    
    search.g();
    if ((!search.m()) && (search.b().isEmpty())) {
      j.k.a("Search..", search.a + 5, search.f + 6, Color.lightGray.getRGB());
    }
    if (buttonDone != null) {
      buttonDone.j = (r() ? "Cancel" : "Done");
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  public void g()
  {
    s = true;
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (search.a(typedChar, keyCode)) {
      refreshPackList();
    }
    super.a(typedChar, keyCode);
  }
  
  public void refreshPackList()
  {
    String input = search.b().replace(" ", "");
    final String selectedPath = ResourcePacks24.getInstance().getPath();
    i.f().clear();
    
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
            i.f().add(pack);
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
        i.f().add(pack);
      }
    }
    for (azp pack : packList) {
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
          i.f().add(pack);
        }
      }
    }
    i.f().removeAll(h);
  }
}
