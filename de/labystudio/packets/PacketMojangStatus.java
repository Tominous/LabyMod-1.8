package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;
import de.labystudio.utils.MojangService;

public class PacketMojangStatus
  extends Packet
{
  private MojangService service;
  private String status = "green";
  
  public PacketMojangStatus() {}
  
  public PacketMojangStatus(MojangService ms, String status)
  {
    service = ms;
    this.status = status;
  }
  
  public void read(PacketBuf buf)
  {
    service = MojangService.fromId(buf.readInt());
    status = buf.readString();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeInt(service.getId());
    buf.writeString(status);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
  
  public MojangService getMojangService()
  {
    return service;
  }
  
  public String getStatus()
  {
    return status;
  }
}
