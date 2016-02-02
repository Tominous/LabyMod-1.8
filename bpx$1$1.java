import org.apache.logging.log4j.Logger;
import paulscode.sound.SoundSystemLogger;

class bpx$1$1
  extends SoundSystemLogger
{
  bpx$1$1(bpx.1 param1) {}
  
  public void message(String ☃, int ☃)
  {
    if (!☃.isEmpty()) {
      bpx.g().info(☃);
    }
  }
  
  public void importantMessage(String ☃, int ☃)
  {
    if (!☃.isEmpty()) {
      bpx.g().warn(☃);
    }
  }
  
  public void errorMessage(String ☃, String ☃, int ☃)
  {
    if (!☃.isEmpty())
    {
      bpx.g().error("Error in class '" + ☃ + "'");
      bpx.g().error(☃);
    }
  }
}
