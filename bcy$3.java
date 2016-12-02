import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy$3
  implements Runnable
{
  bcy$3(bcy parambcy, String paramString1, String paramString2) {}
  
  public void run()
  {
    bcy.b(this.c).a(new awy(new awx()
    {
      public void a(boolean ☃, int ☃)
      {
        bcy.a(bcy.3.this.c, ave.A());
        if (☃)
        {
          if (bcy.b(bcy.3.this.c).D() != null) {
            bcy.b(bcy.3.this.c).D().a(bde.a.a);
          }
          bcy.a(bcy.3.this.c).a(new iu(bcy.3.this.a, iu.a.d));
          Futures.addCallback(bcy.b(bcy.3.this.c).R().a(bcy.3.this.b, bcy.3.this.a), new FutureCallback()
          {
            public void onSuccess(Object ☃)
            {
              bcy.a(bcy.3.this.c).a(new iu(bcy.3.this.a, iu.a.a));
            }
            
            public void onFailure(Throwable ☃)
            {
              bcy.a(bcy.3.this.c).a(new iu(bcy.3.this.a, iu.a.c));
            }
          });
        }
        else
        {
          if (bcy.b(bcy.3.this.c).D() != null) {
            bcy.b(bcy.3.this.c).D().a(bde.a.b);
          }
          bcy.a(bcy.3.this.c).a(new iu(bcy.3.this.a, iu.a.b));
        }
        bdf.b(bcy.b(bcy.3.this.c).D());
        
        bcy.b(bcy.3.this.c).a(null);
      }
    }, bnq.a("multiplayer.texturePrompt.line1", new Object[0]), bnq.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
  }
}
