import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;

final class ll$2
  extends no<EpollEventLoopGroup>
{
  protected EpollEventLoopGroup a()
  {
    return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
  }
}
