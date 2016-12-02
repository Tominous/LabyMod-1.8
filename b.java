import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b
{
  private static final Logger a = ;
  private final String b;
  private final Throwable c;
  private final c d = new c(this, "System Details");
  private final List<c> e = Lists.newArrayList();
  private File f;
  private boolean g = true;
  private StackTraceElement[] h = new StackTraceElement[0];
  
  public b(String ☃, Throwable ☃)
  {
    this.b = ☃;
    this.c = ☃;
    
    h();
  }
  
  private void h()
  {
    this.d.a("Minecraft Version", new Callable()
    {
      public String a()
      {
        return "1.8.8";
      }
    });
    this.d.a("Operating System", new Callable()
    {
      public String a()
      {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
      }
    });
    this.d.a("Java Version", new Callable()
    {
      public String a()
      {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
      }
    });
    this.d.a("Java VM Version", new Callable()
    {
      public String a()
      {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
      }
    });
    this.d.a("Memory", new Callable()
    {
      public String a()
      {
        Runtime ☃ = Runtime.getRuntime();
        long ☃ = ☃.maxMemory();
        long ☃ = ☃.totalMemory();
        long ☃ = ☃.freeMemory();
        long ☃ = ☃ / 1024L / 1024L;
        long ☃ = ☃ / 1024L / 1024L;
        long ☃ = ☃ / 1024L / 1024L;
        
        return ☃ + " bytes (" + ☃ + " MB) / " + ☃ + " bytes (" + ☃ + " MB) up to " + ☃ + " bytes (" + ☃ + " MB)";
      }
    });
    this.d.a("JVM Flags", new Callable()
    {
      public String a()
      {
        RuntimeMXBean ☃ = ManagementFactory.getRuntimeMXBean();
        List<String> ☃ = ☃.getInputArguments();
        int ☃ = 0;
        StringBuilder ☃ = new StringBuilder();
        for (String ☃ : ☃) {
          if (☃.startsWith("-X"))
          {
            if (☃++ > 0) {
              ☃.append(" ");
            }
            ☃.append(☃);
          }
        }
        return String.format("%d total; %s", new Object[] { Integer.valueOf(☃), ☃.toString() });
      }
    });
    this.d.a("IntCache", new Callable()
    {
      public String a()
        throws Exception
      {
        return asc.b();
      }
    });
  }
  
  public String a()
  {
    return this.b;
  }
  
  public Throwable b()
  {
    return this.c;
  }
  
  public void a(StringBuilder ☃)
  {
    if (((this.h == null) || (this.h.length <= 0)) && (this.e.size() > 0)) {
      this.h = ((StackTraceElement[])ArrayUtils.subarray(((c)this.e.get(0)).a(), 0, 1));
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      ☃.append("-- Head --\n");
      ☃.append("Stacktrace:\n");
      for (StackTraceElement ☃ : this.h)
      {
        ☃.append("\t").append("at ").append(☃.toString());
        ☃.append("\n");
      }
      ☃.append("\n");
    }
    for (c ☃ : this.e)
    {
      ☃.a(☃);
      ☃.append("\n\n");
    }
    this.d.a(☃);
  }
  
  public String d()
  {
    StringWriter ☃ = null;
    PrintWriter ☃ = null;
    Throwable ☃ = this.c;
    if (☃.getMessage() == null)
    {
      if ((☃ instanceof NullPointerException)) {
        ☃ = new NullPointerException(this.b);
      } else if ((☃ instanceof StackOverflowError)) {
        ☃ = new StackOverflowError(this.b);
      } else if ((☃ instanceof OutOfMemoryError)) {
        ☃ = new OutOfMemoryError(this.b);
      }
      ☃.setStackTrace(this.c.getStackTrace());
    }
    String ☃ = ☃.toString();
    try
    {
      ☃ = new StringWriter();
      ☃ = new PrintWriter(☃);
      ☃.printStackTrace(☃);
      ☃ = ☃.toString();
    }
    finally
    {
      IOUtils.closeQuietly(☃);
      IOUtils.closeQuietly(☃);
    }
    return ☃;
  }
  
  public String e()
  {
    StringBuilder ☃ = new StringBuilder();
    
    ☃.append("---- Minecraft Crash Report ----\n");
    ☃.append("// ");
    ☃.append(i());
    ☃.append("\n\n");
    
    ☃.append("Time: ");
    ☃.append(new SimpleDateFormat().format(new Date()));
    ☃.append("\n");
    
    ☃.append("Description: ");
    ☃.append(this.b);
    ☃.append("\n\n");
    
    ☃.append(d());
    ☃.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
    for (int ☃ = 0; ☃ < 87; ☃++) {
      ☃.append("-");
    }
    ☃.append("\n\n");
    a(☃);
    
    return ☃.toString();
  }
  
  public File f()
  {
    return this.f;
  }
  
  public boolean a(File ☃)
  {
    if (this.f != null) {
      return false;
    }
    if (☃.getParentFile() != null) {
      ☃.getParentFile().mkdirs();
    }
    try
    {
      FileWriter ☃ = new FileWriter(☃);
      ☃.write(e());
      ☃.close();
      
      this.f = ☃;
      return true;
    }
    catch (Throwable ☃)
    {
      a.error("Could not save crash report to " + ☃, ☃);
    }
    return false;
  }
  
  public c g()
  {
    return this.d;
  }
  
  public c a(String ☃)
  {
    return a(☃, 1);
  }
  
  public c a(String ☃, int ☃)
  {
    c ☃ = new c(this, ☃);
    if (this.g)
    {
      int ☃ = ☃.a(☃);
      StackTraceElement[] ☃ = this.c.getStackTrace();
      StackTraceElement ☃ = null;
      StackTraceElement ☃ = null;
      
      int ☃ = ☃.length - ☃;
      if (☃ < 0) {
        System.out.println("Negative index in crash report handler (" + ☃.length + "/" + ☃ + ")");
      }
      if ((☃ != null) && (0 <= ☃) && (☃ < ☃.length))
      {
        ☃ = ☃[☃];
        if (☃.length + 1 - ☃ < ☃.length) {
          ☃ = ☃[(☃.length + 1 - ☃)];
        }
      }
      this.g = ☃.a(☃, ☃);
      if ((☃ > 0) && (!this.e.isEmpty()))
      {
        c ☃ = (c)this.e.get(this.e.size() - 1);
        ☃.b(☃);
      }
      else if ((☃ != null) && (☃.length >= ☃) && (0 <= ☃) && (☃ < ☃.length))
      {
        this.h = new StackTraceElement[☃];
        System.arraycopy(☃, 0, this.h, 0, this.h.length);
      }
      else
      {
        this.g = false;
      }
    }
    this.e.add(☃);
    return ☃;
  }
  
  private static String i()
  {
    String[] ☃ = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
    try
    {
      return ☃[((int)(System.nanoTime() % ☃.length))];
    }
    catch (Throwable ☃) {}
    return "Witty comment unavailable :(";
  }
  
  public static b a(Throwable ☃, String ☃)
  {
    b ☃;
    b ☃;
    if ((☃ instanceof e)) {
      ☃ = ((e)☃).a();
    } else {
      ☃ = new b(☃, ☃);
    }
    return ☃;
  }
}
