import java.util.HashMap;
import paulscode.sound.Library;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class bpx$a
  extends SoundSystem
{
  private bpx$a(bpx parambpx) {}
  
  public boolean playing(String ☃)
  {
    synchronized (SoundSystemConfig.THREAD_SYNC)
    {
      if (soundLibrary == null) {
        return false;
      }
      Source ☃ = (Source)soundLibrary.getSources().get(☃);
      if (☃ == null) {
        return false;
      }
      return (☃.playing()) || (☃.paused()) || (preLoad);
    }
  }
}
