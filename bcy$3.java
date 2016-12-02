import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy$3
  implements Runnable
{
  bcy$3(bcy parambcy, String paramString1, String paramString2) {}
  
  public void run()
  {
    bcy.b(c).a(new awy(new awx()
    {
      public void a(boolean ☃, int ☃)
      {
        bcy.a(c, ave.A());
        if (☃)
        {
          if (bcy.b(c).D() != null) {
            bcy.b(c).D().a(bde.a.a);
          }
          bcy.a(c).a(new iu(a, iu.a.d));
          Futures.addCallback(bcy.b(c).R().a(b, a), new FutureCallback()
          {
            public void onSuccess(Object ☃)
            {
              bcy.a(c).a(new iu(a, iu.a.a));
            }
            
            public void onFailure(Throwable ☃)
            {
              bcy.a(c).a(new iu(a, iu.a.c));
            }
          });
        }
        else
        {
          if (bcy.b(c).D() != null) {
            bcy.b(c).D().a(bde.a.b);
          }
          bcy.a(c).a(new iu(a, iu.a.b));
        }
        bdf.b(bcy.b(c).D());
        
        bcy.b(c).a(null);
      }
    }, bnq.a("multiplayer.texturePrompt.line1", new Object[0]), bnq.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
  }
}
