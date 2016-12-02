package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketPlayRequestAddFriendResponse
  extends Packet
{
  private String searched;
  private boolean requestSent;
  private String reason;
  
  public PacketPlayRequestAddFriendResponse(String searched, boolean sent)
  {
    this.searched = searched;
    requestSent = sent;
  }
  
  public PacketPlayRequestAddFriendResponse(String searched, boolean sent, String reason)
  {
    this.searched = searched;
    requestSent = sent;
    this.reason = reason;
  }
  
  public PacketPlayRequestAddFriendResponse() {}
  
  public void read(PacketBuf buf)
  {
    searched = buf.readString();
    requestSent = buf.readBoolean();
    if (!requestSent) {
      reason = buf.readString();
    }
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(searched);
    buf.writeBoolean(requestSent);
    if (!isRequestSent()) {
      buf.writeString(reason);
    }
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public boolean isRequestSent()
  {
    return requestSent;
  }
  
  public String getReason()
  {
    return reason;
  }
  
  public String getSearched()
  {
    return searched;
  }
}
