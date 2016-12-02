import java.util.concurrent.Callable;

class bmi$1
  implements Callable
{
  private static final String __OBFID = "CL_00001063";
  
  bmi$1(bmi parambmi, int[][] paramArrayOfInt) {}
  
  public String a()
    throws Exception
  {
    StringBuilder var1 = new StringBuilder();
    int[][] var2 = val$var4;
    int var3 = var2.length;
    for (int var4x = 0; var4x < var3; var4x++)
    {
      int[] var5 = var2[var4x];
      if (var1.length() > 0) {
        var1.append(", ");
      }
      var1.append(var5 == null ? "null" : Integer.valueOf(var5.length));
    }
    return var1.toString();
  }
}
