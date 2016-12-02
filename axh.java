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
    h = screen;
    a = bnq.a(reasonLocalizationKey, new Object[0]);
    f = chatComp;
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {}
  
  public void b()
  {
    n.clear();
    g = q.c(f.d(), l - 50);
    i = (g.size() * q.a);
    n.add(new avs(0, l / 2 - 100, m / 2 + i / 2 + q.a, bnq.a("gui.toMenu", new Object[0])));
    
    WebPanel.open(f.e(), h);
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 0) {
      j.a(h);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, a, l / 2, m / 2 - this.i / 2 - q.a * 2, 11184810);
    int i = m / 2 - this.i / 2;
    if (g != null) {
      for (String s : g)
      {
        a(q, s, l / 2, i, 16777215);
        i += q.a;
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
