package mods.accountmanager;

import avm;
import avm.a;
import com.mojang.util.UUIDTypeAdapter;
import de.labystudio.account.AccountManager;
import java.util.UUID;

public class Account
{
  private String accessToken;
  private UUID uuid;
  private String userName;
  
  public Account(String userName, String accessToken, UUID uuid)
  {
    this.accessToken = accessToken;
    this.uuid = uuid;
    this.userName = userName;
  }
  
  public boolean setToCurrentUser()
  {
    String session = AccountManager.setSession(new avm(this.userName, UUIDTypeAdapter.fromUUID(this.uuid), this.accessToken, avm.a.b.toString()));
    
    return session.equals("");
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public String getAccessToken()
  {
    return this.accessToken;
  }
  
  public UUID getUuid()
  {
    return this.uuid;
  }
}
