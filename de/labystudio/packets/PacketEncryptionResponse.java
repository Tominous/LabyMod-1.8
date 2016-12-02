package de.labystudio.packets;

import de.labystudio.handling.PacketHandler;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class PacketEncryptionResponse
  extends Packet
{
  private byte[] sharedSecret;
  private byte[] verifyToken;
  
  public PacketEncryptionResponse(SecretKey key, PublicKey publicKey, byte[] hash)
  {
    sharedSecret = CryptManager.encryptData(publicKey, key.getEncoded());
    verifyToken = CryptManager.encryptData(publicKey, hash);
  }
  
  public PacketEncryptionResponse() {}
  
  public byte[] getSharedSecret()
  {
    return sharedSecret;
  }
  
  public byte[] getVerifyToken()
  {
    return verifyToken;
  }
  
  public void read(PacketBuf buf)
  {
    sharedSecret = buf.readByteArray();
    verifyToken = buf.readByteArray();
  }
  
  public void write(PacketBuf buf)
  {
    buf.writeByteArray(sharedSecret);
    buf.writeByteArray(verifyToken);
  }
  
  public void handle(PacketHandler packetHandler)
  {
    packetHandler.handle(this);
  }
}
