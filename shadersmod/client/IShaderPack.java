package shadersmod.client;

import java.io.InputStream;

public abstract interface IShaderPack
{
  public abstract void close();
  
  public abstract InputStream getResourceAsStream(String paramString);
  
  public abstract String getName();
}
