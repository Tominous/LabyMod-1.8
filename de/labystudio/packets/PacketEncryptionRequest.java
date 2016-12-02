package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;

public class PacketEncryptionRequest
  extends Packet
{
  private String serverId;
  private byte[] publicKey;
  private byte[] verifyToken;
  
  public PacketEncryptionRequest(String serverId, byte[] publicKey, byte[] verifyToken)
  {
    this.serverId = serverId;
    this.publicKey = publicKey;
    this.verifyToken = verifyToken;
  }
  
  public PacketEncryptionRequest() {}
  
  public byte[] getPublicKey()
  {
    return publicKey;
  }
  
  public String getServerId()
  {
    return serverId;
  }
  
  public byte[] getVerifyToken()
  {
    return verifyToken;
  }
  
  public void read(PacketBuf buf)
  {
    serverId = buf.readString();
    publicKey = buf.readByteArray();
    verifyToken = buf.readByteArray();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeString(serverId);
    buf.writeByteArray(publicKey);
    buf.writeByteArray(verifyToken);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
}
