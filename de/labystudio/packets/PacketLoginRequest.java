package de.labystudio.packets;

import de.labystudio.chat.LabyModPlayer;
import de.labystudio.chat.LabyModPlayerRequester;
import de.labystudio.handling.PacketHandler;
import java.util.ArrayList;
import java.util.List;

public class PacketLoginRequest
  extends Packet
{
  private List<LabyModPlayerRequester> requesters;
  
  public PacketLoginRequest(List<LabyModPlayerRequester> requesters)
  {
    this.requesters = requesters;
  }
  
  public PacketLoginRequest() {}
  
  public List<LabyModPlayerRequester> getRequests()
  {
    return requesters;
  }
  
  public void read(PacketBuf buf)
  {
    requesters = new ArrayList();
    
    int a = buf.readInt();
    for (int i = 0; i < a; i++) {
      requesters.add((LabyModPlayerRequester)buf.readPlayer());
    }
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeInt(getRequests().size());
    for (int i = 0; i < getRequests().size(); i++) {
      buf.writePlayer((LabyModPlayer)getRequests().get(i));
    }
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
}
