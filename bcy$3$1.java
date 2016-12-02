import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy$3$1
  implements awx
{
  bcy$3$1(bcy.3 param3) {}
  
  public void a(boolean ☃, int ☃)
  {
    bcy.a(this.a.c, ave.A());
    if (☃)
    {
      if (bcy.b(this.a.c).D() != null) {
        bcy.b(this.a.c).D().a(bde.a.a);
      }
      bcy.a(this.a.c).a(new iu(this.a.a, iu.a.d));
      Futures.addCallback(bcy.b(this.a.c).R().a(this.a.b, this.a.a), new FutureCallback()
      {
        public void onSuccess(Object ☃)
        {
          bcy.a(bcy.3.1.this.a.c).a(new iu(bcy.3.1.this.a.a, iu.a.a));
        }
        
        public void onFailure(Throwable ☃)
        {
          bcy.a(bcy.3.1.this.a.c).a(new iu(bcy.3.1.this.a.a, iu.a.c));
        }
      });
    }
    else
    {
      if (bcy.b(this.a.c).D() != null) {
        bcy.b(this.a.c).D().a(bde.a.b);
      }
      bcy.a(this.a.c).a(new iu(this.a.a, iu.a.b));
    }
    bdf.b(bcy.b(this.a.c).D());
    
    bcy.b(this.a.c).a(null);
  }
}
