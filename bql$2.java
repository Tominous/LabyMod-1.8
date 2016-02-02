import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StatType;

class bql$2
  implements IStatCallbacks
{
  bql$2(bql parambql) {}
  
  public void statCallback(StatType ☃, long ☃)
  {
    switch (bql.3.a[☃.ordinal()])
    {
    case 1: 
      this.a.h = RTMPState.lookupValue((int)☃);
      break;
    case 2: 
      this.a.g = ☃;
    }
  }
}
