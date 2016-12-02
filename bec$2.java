import java.util.concurrent.Callable;

class bec$2
  implements Callable<String>
{
  bec$2(bec parambec, int paramInt) {}
  
  public String a()
    throws Exception
  {
    if (this.a == 0) {
      return "MISC_TEXTURE";
    }
    if (this.a == 1) {
      return "TERRAIN_TEXTURE";
    }
    if (this.a == 3) {
      return "ENTITY_PARTICLE_TEXTURE";
    }
    return "Unknown - " + this.a;
  }
}
