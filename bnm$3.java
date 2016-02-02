import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

class bnm$3
  implements FutureCallback<Object>
{
  bnm$3(bnm parambnm, File paramFile, SettableFuture paramSettableFuture) {}
  
  public void onSuccess(Object ☃)
  {
    this.c.a(this.a);
    this.b.set(null);
  }
  
  public void onFailure(Throwable ☃)
  {
    this.b.setException(☃);
  }
}
