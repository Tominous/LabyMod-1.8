import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;

final class ll$3
  extends no<LocalEventLoopGroup>
{
  protected LocalEventLoopGroup a()
  {
    return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
  }
}
