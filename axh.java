import de.labystudio.utils.WebPanel;
import java.io.IOException;
import java.util.List;

public class axh
  extends axu
{
  private String a;
  private eu f;
  private List<String> g;
  private final axu h;
  private int i;
  
  public axh(axu screen, String reasonLocalizationKey, eu chatComp)
  {
    this.h = screen;
    this.a = bnq.a(reasonLocalizationKey, new Object[0]);
    this.f = chatComp;
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {}
  
  public void b()
  {
    this.n.clear();
    this.g = this.q.c(this.f.d(), this.l - 50);
    this.i = (this.g.size() * this.q.a);
    this.n.add(new avs(0, this.l / 2 - 100, this.m / 2 + this.i / 2 + this.q.a, bnq.a("gui.toMenu", new Object[0])));
    
    WebPanel.open(this.f.e(), this.h);
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 0) {
      this.j.a(this.h);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, this.a, this.l / 2, this.m / 2 - this.i / 2 - this.q.a * 2, 11184810);
    int i = this.m / 2 - this.i / 2;
    if (this.g != null) {
      for (String s : this.g)
      {
        a(this.q, s, this.l / 2, i, 16777215);
        i += this.q.a;
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
