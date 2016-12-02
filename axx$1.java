import de.labystudio.utils.Color;
import de.labystudio.utils.SkinChanger.MessageCallBack;

class axx$1
  implements SkinChanger.MessageCallBack
{
  axx$1(axx this$0) {}
  
  public void ok(String message)
  {
    this.this$0.g.l = true;
    if (message.isEmpty()) {
      this.this$0.output = (Color.cl("a") + "Your skin has been changed, reconnect in order to see it!");
    } else if (message.contains("Current IP not secured")) {
      this.this$0.output = (Color.cl("c") + "Your IP has been changed since your last login into the Minecraft website!");
    } else if (message.contains("The request requires user authentication")) {
      this.this$0.output = (Color.cl("c") + "Invalid session id. (Try restarting your game)");
    } else {
      this.this$0.output = message;
    }
  }
}
