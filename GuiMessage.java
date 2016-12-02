import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class GuiMessage
  extends axu
{
  private axu parentScreen;
  private String messageLine1;
  private String messageLine2;
  private final List listLines2 = Lists.newArrayList();
  protected String confirmButtonText;
  private int ticksUntilEnable;
  
  public GuiMessage(axu parentScreen, String line1, String line2)
  {
    this.parentScreen = parentScreen;
    messageLine1 = line1;
    messageLine2 = line2;
    confirmButtonText = bnq.a("gui.done", new Object[0]);
  }
  
  public void b()
  {
    n.add(new awe(0, l / 2 - 74, m / 6 + 96, confirmButtonText));
    listLines2.clear();
    listLines2.addAll(q.c(messageLine2, l - 50));
  }
  
  protected void a(avs button)
    throws IOException
  {
    Config.getMinecraft().a(parentScreen);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, messageLine1, l / 2, 70, 16777215);
    int var4 = 90;
    for (Iterator var5 = listLines2.iterator(); var5.hasNext(); var4 += q.a)
    {
      String var6 = (String)var5.next();
      a(q, var6, l / 2, var4, 16777215);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  public void setButtonDelay(int ticksUntilEnable)
  {
    this.ticksUntilEnable = ticksUntilEnable;
    avs var3;
    for (Iterator var2 = n.iterator(); var2.hasNext(); l = false) {
      var3 = (avs)var2.next();
    }
  }
  
  public void e()
  {
    super.e();
    if (--ticksUntilEnable == 0)
    {
      avs var2;
      for (Iterator var1 = n.iterator(); var1.hasNext(); l = true) {
        var2 = (avs)var1.next();
      }
    }
  }
}
