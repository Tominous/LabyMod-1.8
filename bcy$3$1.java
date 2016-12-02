import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy$3$1
  implements awx
{
  bcy$3$1(bcy.3 param3) {}
  
  public void a(boolean ☃, int ☃)
  {
    bcy.a(a.c, ave.A());
    if (☃)
    {
      if (bcy.b(a.c).D() != null) {
        bcy.b(a.c).D().a(bde.a.a);
      }
      bcy.a(a.c).a(new iu(a.a, iu.a.d));
      Futures.addCallback(bcy.b(a.c).R().a(a.b, a.a), new FutureCallback()
      {
        public void onSuccess(Object ☃)
        {
          bcy.a(a.c).a(new iu(a.a, iu.a.a));
        }
        
        public void onFailure(Throwable ☃)
        {
          bcy.a(a.c).a(new iu(a.a, iu.a.c));
        }
      });
    }
    else
    {
      if (bcy.b(a.c).D() != null) {
        bcy.b(a.c).D().a(bde.a.b);
      }
      bcy.a(a.c).a(new iu(a.a, iu.a.b));
    }
    bdf.b(bcy.b(a.c).D());
    
    bcy.b(a.c).a(null);
  }
}
