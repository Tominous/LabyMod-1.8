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
import java.util.Iterator;
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
  private final List e = Lists.newArrayList();
  private File f;
  private boolean g = true;
  private StackTraceElement[] h = new StackTraceElement[0];
  private static final String __OBFID = "CL_00000990";
  private boolean reported = false;
  
  public b(String descriptionIn, Throwable causeThrowable)
  {
    this.b = descriptionIn;
    this.c = causeThrowable;
    h();
  }
  
  private void h()
  {
    this.d.a("Minecraft Version", new Callable()
    {
      private static final String __OBFID = "CL_00001197";
      
      public String a()
      {
        return "1.8.8";
      }
    });
    this.d.a("Operating System", new Callable()
    {
      private static final String __OBFID = "CL_00001222";
      
      public String a()
      {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
      }
    });
    this.d.a("CPU", new b.3(this));
    this.d.a("Java Version", new Callable()
    {
      private static final String __OBFID = "CL_00001248";
      
      public String a()
      {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
      }
    });
    this.d.a("Java VM Version", new Callable()
    {
      private static final String __OBFID = "CL_00001275";
      
      public String a()
      {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
      }
    });
    this.d.a("Memory", new Callable()
    {
      private static final String __OBFID = "CL_00001302";
      
      public String a()
      {
        Runtime var1 = Runtime.getRuntime();
        long var2 = var1.maxMemory();
        long var4 = var1.totalMemory();
        long var6 = var1.freeMemory();
        long var8 = var2 / 1024L / 1024L;
        long var10 = var4 / 1024L / 1024L;
        long var12 = var6 / 1024L / 1024L;
        return var6 + " bytes (" + var12 + " MB) / " + var4 + " bytes (" + var10 + " MB) up to " + var2 + " bytes (" + var8 + " MB)";
      }
    });
    this.d.a("JVM Flags", new Callable()
    {
      private static final String __OBFID = "CL_00001329";
      
      public String a()
      {
        RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
        List var2 = var1.getInputArguments();
        int var3 = 0;
        StringBuilder var4 = new StringBuilder();
        Iterator var5 = var2.iterator();
        while (var5.hasNext())
        {
          String var6 = (String)var5.next();
          if (var6.startsWith("-X"))
          {
            if (var3++ > 0) {
              var4.append(" ");
            }
            var4.append(var6);
          }
        }
        return String.format("%d total; %s", new Object[] { Integer.valueOf(var3), var4.toString() });
      }
    });
    this.d.a("IntCache", new Callable()
    {
      private static final String __OBFID = "CL_00001355";
      
      public String a()
        throws Exception
      {
        return asc.b();
      }
    });
    if (Reflector.FMLCommonHandler_enhanceCrashReport.exists())
    {
      Object instance = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
      Reflector.callString(instance, Reflector.FMLCommonHandler_enhanceCrashReport, new Object[] { this, this.d });
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public Throwable b()
  {
    return this.c;
  }
  
  public void a(StringBuilder builder)
  {
    if (((this.h == null) || (this.h.length <= 0)) && (this.e.size() > 0)) {
      this.h = ((StackTraceElement[])ArrayUtils.subarray(((c)this.e.get(0)).a(), 0, 1));
    }
    if ((this.h != null) && (this.h.length > 0))
    {
      builder.append("-- Head --\n");
      builder.append("Stacktrace:\n");
      StackTraceElement[] var2 = this.h;
      int var3 = var2.length;
      for (int var4 = 0; var4 < var3; var4++)
      {
        StackTraceElement var5 = var2[var4];
        builder.append("\t").append("at ").append(var5.toString());
        builder.append("\n");
      }
      builder.append("\n");
    }
    Iterator var6 = this.e.iterator();
    while (var6.hasNext())
    {
      c var7 = (c)var6.next();
      var7.a(builder);
      builder.append("\n\n");
    }
    this.d.a(builder);
  }
  
  public String d()
  {
    StringWriter var1 = null;
    PrintWriter var2 = null;
    Object var3 = this.c;
    if (((Throwable)var3).getMessage() == null)
    {
      if ((var3 instanceof NullPointerException)) {
        var3 = new NullPointerException(this.b);
      } else if ((var3 instanceof StackOverflowError)) {
        var3 = new StackOverflowError(this.b);
      } else if ((var3 instanceof OutOfMemoryError)) {
        var3 = new OutOfMemoryError(this.b);
      }
      ((Throwable)var3).setStackTrace(this.c.getStackTrace());
    }
    String var4 = ((Throwable)var3).toString();
    try
    {
      var1 = new StringWriter();
      var2 = new PrintWriter(var1);
      ((Throwable)var3).printStackTrace(var2);
      var4 = var1.toString();
    }
    finally
    {
      IOUtils.closeQuietly(var1);
      IOUtils.closeQuietly(var2);
    }
    return var4;
  }
  
  public String e()
  {
    if (!this.reported)
    {
      this.reported = true;
      CrashReporter.onCrashReport(this);
    }
    StringBuilder var1 = new StringBuilder();
    var1.append("---- Minecraft Crash Report ----\n");
    
    Reflector.call(Reflector.BlamingTransformer_onCrash, new Object[] { var1 });
    Reflector.call(Reflector.CoreModManager_onCrash, new Object[] { var1 });
    
    var1.append("// ");
    var1.append(i());
    var1.append("\n\n");
    var1.append("Time: ");
    var1.append(new SimpleDateFormat().format(new Date()));
    var1.append("\n");
    var1.append("Description: ");
    var1.append(this.b);
    var1.append("\n\n");
    var1.append(d());
    var1.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
    for (int var2 = 0; var2 < 87; var2++) {
      var1.append("-");
    }
    var1.append("\n\n");
    a(var1);
    return var1.toString();
  }
  
  public File f()
  {
    return this.f;
  }
  
  public boolean a(File toFile)
  {
    if (this.f != null) {
      return false;
    }
    if (toFile.getParentFile() != null) {
      toFile.getParentFile().mkdirs();
    }
    try
    {
      FileWriter var2 = new FileWriter(toFile);
      var2.write(e());
      var2.close();
      this.f = toFile;
      return true;
    }
    catch (Throwable var3)
    {
      a.error("Could not save crash report to " + toFile, var3);
    }
    return false;
  }
  
  public c g()
  {
    return this.d;
  }
  
  public c a(String name)
  {
    return a(name, 1);
  }
  
  public c a(String categoryName, int stacktraceLength)
  {
    c var3 = new c(this, categoryName);
    if (this.g)
    {
      int var4 = var3.a(stacktraceLength);
      StackTraceElement[] var5 = this.c.getStackTrace();
      StackTraceElement var6 = null;
      StackTraceElement var7 = null;
      int var8 = var5.length - var4;
      if (var8 < 0) {
        System.out.println("Negative index in crash report handler (" + var5.length + "/" + var4 + ")");
      }
      if ((var5 != null) && (0 <= var8) && (var8 < var5.length))
      {
        var6 = var5[var8];
        if (var5.length + 1 - var4 < var5.length) {
          var7 = var5[(var5.length + 1 - var4)];
        }
      }
      this.g = var3.a(var6, var7);
      if ((var4 > 0) && (!this.e.isEmpty()))
      {
        c var9 = (c)this.e.get(this.e.size() - 1);
        var9.b(var4);
      }
      else if ((var5 != null) && (var5.length >= var4) && (0 <= var8) && (var8 < var5.length))
      {
        this.h = new StackTraceElement[var8];
        System.arraycopy(var5, 0, this.h, 0, this.h.length);
      }
      else
      {
        this.g = false;
      }
    }
    this.e.add(var3);
    return var3;
  }
  
  private static String i()
  {
    String[] var0 = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
    try
    {
      return var0[((int)(System.nanoTime() % var0.length))];
    }
    catch (Throwable var2) {}
    return "Witty comment unavailable :(";
  }
  
  public static b a(Throwable causeIn, String descriptionIn)
  {
    b var2;
    b var2;
    if ((causeIn instanceof e)) {
      var2 = ((e)causeIn).a();
    } else {
      var2 = new b(descriptionIn, causeIn);
    }
    return var2;
  }
}
