import org.apache.logging.log4j.Logger;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

class bpx$1
  implements Runnable
{
  bpx$1(bpx parambpx) {}
  
  public void run()
  {
    SoundSystemConfig.setLogger(new SoundSystemLogger()
    {
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
    });
    bpx.a(a, new bpx.a(a, null));
    bpx.a(a, true);
    bpx.b(a).setMasterVolume(bpx.a(a).a(bpg.a));
    bpx.g().info(bpx.h(), "Sound engine started");
  }
}
