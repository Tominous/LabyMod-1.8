import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;

final class ll$1
  extends no<NioEventLoopGroup>
{
  protected NioEventLoopGroup a()
  {
    return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
  }
}
