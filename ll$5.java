import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import java.util.List;

class ll$5
  extends ChannelInitializer<Channel>
{
  ll$5(ll paramll) {}
  
  protected void initChannel(Channel ☃)
    throws Exception
  {
    ek ☃ = new ek(fg.a);
    ☃.a(new lk(ll.b(this.a), ☃));
    ll.a(this.a).add(☃);
    ☃.pipeline().addLast("packet_handler", ☃);
  }
}
