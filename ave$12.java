import java.util.List;
import java.util.concurrent.Callable;

class ave$12
  implements Callable<String>
{
  ave$12(ave this$0) {}
  
  public String a()
    throws Exception
  {
    StringBuilder stringbuilder = new StringBuilder();
    for (String s : this$0.t.k)
    {
      if (stringbuilder.length() > 0) {
        stringbuilder.append(", ");
      }
      stringbuilder.append(s);
      if (this$0.t.l.contains(s)) {
        stringbuilder.append(" (incompatible)");
      }
    }
    return stringbuilder.toString();
  }
}
