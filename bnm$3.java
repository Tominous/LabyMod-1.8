import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

class bnm$3
  implements FutureCallback<Object>
{
  bnm$3(bnm this$0, File paramFile, SettableFuture paramSettableFuture) {}
  
  public void onSuccess(Object p_onSuccess_1_)
  {
    this.this$0.a(this.val$file1);
    this.val$settablefuture.set(null);
  }
  
  public void onFailure(Throwable p_onFailure_1_)
  {
    this.val$settablefuture.setException(p_onFailure_1_);
  }
}
