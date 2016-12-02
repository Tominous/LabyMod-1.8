import com.google.gson.JsonParseException;
import de.labystudio.gommehd.GommeHDSign;
import java.util.ArrayList;
import net.minecraft.server.MinecraftServer;

public class aln
  extends akw
{
  public final eu[] a = { new fa(""), new fa(""), new fa(""), new fa("") };
  public int f = -1;
  private boolean g = true;
  private wn h;
  private final n i = new n();
  
  public void b(dn compound)
  {
    super.b(compound);
    for (int i = 0; i < 4; i++)
    {
      String s = eu.a.a(a[i]);
      compound.a("Text" + (i + 1), s);
    }
    this.i.b(compound);
  }
  
  public void a(dn compound)
  {
    g = false;
    super.a(compound);
    m icommandsender = new m()
    {
      public String e_()
      {
        return "Sign";
      }
      
      public eu f_()
      {
        return new fa(e_());
      }
      
      public void a(eu component) {}
      
      public boolean a(int permLevel, String commandName)
      {
        return true;
      }
      
      public cj c()
      {
        return c;
      }
      
      public aui d()
      {
        return new aui(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D);
      }
      
      public adm e()
      {
        return b;
      }
      
      public pk f()
      {
        return null;
      }
      
      public boolean u_()
      {
        return false;
      }
      
      public void a(n.a type, int amount) {}
    };
    for (int i = 0; i < 4; i++)
    {
      String s = compound.j("Text" + (i + 1));
      try
      {
        eu ichatcomponent = eu.a.a(s);
        try
        {
          a[i] = ev.a(icommandsender, ichatcomponent, (pk)null);
        }
        catch (bz var7)
        {
          a[i] = ichatcomponent;
        }
      }
      catch (JsonParseException var8)
      {
        a[i] = new fa(s);
      }
    }
    this.i.a(compound);
  }
  
  public ff y_()
  {
    eu[] aichatcomponent = new eu[4];
    System.arraycopy(a, 0, aichatcomponent, 0, 4);
    return new hw(b, c, aichatcomponent);
  }
  
  public boolean F()
  {
    return true;
  }
  
  public boolean b()
  {
    return g;
  }
  
  public void a(boolean isEditableIn)
  {
    g = isEditableIn;
    if (!isEditableIn) {
      h = null;
    }
  }
  
  public void a(wn playerIn)
  {
    h = playerIn;
  }
  
  public wn c()
  {
    return h;
  }
  
  public boolean b(final wn playerIn)
  {
    m icommandsender = new m()
    {
      public String e_()
      {
        return playerIn.e_();
      }
      
      public eu f_()
      {
        return playerIn.f_();
      }
      
      public void a(eu component) {}
      
      public boolean a(int permLevel, String commandName)
      {
        return permLevel <= 2;
      }
      
      public cj c()
      {
        return c;
      }
      
      public aui d()
      {
        return new aui(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D);
      }
      
      public adm e()
      {
        return playerIn.e();
      }
      
      public pk f()
      {
        return playerIn;
      }
      
      public boolean u_()
      {
        return false;
      }
      
      public void a(n.a type, int amount)
      {
        aln.a(aln.this).a(this, type, amount);
      }
    };
    for (int i = 0; i < a.length; i++)
    {
      ez chatstyle = a[i] == null ? null : a[i].b();
      if ((chatstyle != null) && (chatstyle.h() != null))
      {
        et clickevent = chatstyle.h();
        if (clickevent.a() == et.a.c) {
          MinecraftServer.N().P().a(icommandsender, clickevent.b());
        }
      }
    }
    return true;
  }
  
  public n d()
  {
    return i;
  }
  
  public int updateSign = 0;
  ArrayList<String> text = new ArrayList();
  boolean available = false;
  boolean search = false;
  boolean size = false;
  boolean full = false;
  boolean empty = false;
  
  public void setText(ArrayList<String> arrayList)
  {
    text = GommeHDSign.getText(this);
  }
  
  public ArrayList<String> getText()
  {
    return text;
  }
  
  public void setAvailable(ArrayList<String> text)
  {
    available = GommeHDSign.isAvailable(text);
  }
  
  public boolean getAvailable()
  {
    return available;
  }
  
  public void setSearch(ArrayList<String> text)
  {
    search = GommeHDSign.search(text);
  }
  
  public boolean getSearch()
  {
    return search;
  }
  
  public void setSize(ArrayList<String> text)
  {
    size = GommeHDSign.size(text);
  }
  
  public void setEmpty(ArrayList<String> text)
  {
    empty = GommeHDSign.isEmpty(text);
  }
  
  public boolean isEmpty()
  {
    return empty;
  }
  
  public boolean getSize()
  {
    return size;
  }
  
  public void setFull(ArrayList<String> text)
  {
    full = GommeHDSign.isFull(text);
  }
  
  public boolean isFull()
  {
    return full;
  }
}
