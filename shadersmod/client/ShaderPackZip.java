package shadersmod.client;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ShaderPackZip
  implements IShaderPack
{
  protected File packFile;
  protected ZipFile packZipFile;
  
  public ShaderPackZip(String name, File file)
  {
    this.packFile = file;
    this.packZipFile = null;
  }
  
  public void close()
  {
    if (this.packZipFile != null)
    {
      try
      {
        this.packZipFile.close();
      }
      catch (Exception excp) {}
      this.packZipFile = null;
    }
  }
  
  public InputStream getResourceAsStream(String resName)
  {
    if (this.packZipFile == null) {
      try
      {
        this.packZipFile = new ZipFile(this.packFile);
      }
      catch (Exception excp) {}
    }
    if (this.packZipFile != null) {
      try
      {
        ZipEntry entry = this.packZipFile.getEntry(resName.substring(1));
        if (entry != null) {
          return this.packZipFile.getInputStream(entry);
        }
      }
      catch (Exception excp) {}
    }
    return null;
  }
  
  public String getName()
  {
    return this.packFile.getName();
  }
}
