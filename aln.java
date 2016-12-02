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
      String s = eu.a.a(this.a[i]);
      compound.a("Text" + (i + 1), s);
    }
    this.i.b(compound);
  }
  
  public void a(dn compound)
  {
    this.g = false;
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
        return aln.this.c;
      }
      
      public aui d()
      {
        return new aui(aln.this.c.n() + 0.5D, aln.this.c.o() + 0.5D, aln.this.c.p() + 0.5D);
      }
      
      public adm e()
      {
        return aln.this.b;
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
          this.a[i] = ev.a(icommandsender, ichatcomponent, (pk)null);
        }
        catch (bz var7)
        {
          this.a[i] = ichatcomponent;
        }
      }
      catch (JsonParseException var8)
      {
        this.a[i] = new fa(s);
      }
    }
    this.i.a(compound);
  }
  
  public ff y_()
  {
    eu[] aichatcomponent = new eu[4];
    System.arraycopy(this.a, 0, aichatcomponent, 0, 4);
    return new hw(this.b, this.c, aichatcomponent);
  }
  
  public boolean F()
  {
    return true;
  }
  
  public boolean b()
  {
    return this.g;
  }
  
  public void a(boolean isEditableIn)
  {
    this.g = isEditableIn;
    if (!isEditableIn) {
      this.h = null;
    }
  }
  
  public void a(wn playerIn)
  {
    this.h = playerIn;
  }
  
  public wn c()
  {
    return this.h;
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
        return aln.this.c;
      }
      
      public aui d()
      {
        return new aui(aln.this.c.n() + 0.5D, aln.this.c.o() + 0.5D, aln.this.c.p() + 0.5D);
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
    for (int i = 0; i < this.a.length; i++)
    {
      ez chatstyle = this.a[i] == null ? null : this.a[i].b();
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
    return this.i;
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
    this.text = GommeHDSign.getText(this);
  }
  
  public ArrayList<String> getText()
  {
    return this.text;
  }
  
  public void setAvailable(ArrayList<String> text)
  {
    this.available = GommeHDSign.isAvailable(text);
  }
  
  public boolean getAvailable()
  {
    return this.available;
  }
  
  public void setSearch(ArrayList<String> text)
  {
    this.search = GommeHDSign.search(text);
  }
  
  public boolean getSearch()
  {
    return this.search;
  }
  
  public void setSize(ArrayList<String> text)
  {
    this.size = GommeHDSign.size(text);
  }
  
  public void setEmpty(ArrayList<String> text)
  {
    this.empty = GommeHDSign.isEmpty(text);
  }
  
  public boolean isEmpty()
  {
    return this.empty;
  }
  
  public boolean getSize()
  {
    return this.size;
  }
  
  public void setFull(ArrayList<String> text)
  {
    this.full = GommeHDSign.isFull(text);
  }
  
  public boolean isFull()
  {
    return this.full;
  }
}
