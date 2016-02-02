import java.io.File;
import java.io.FileNotFoundException;

public class bnl
  extends FileNotFoundException
{
  public bnl(File ☃, String ☃)
  {
    super(String.format("'%s' in ResourcePack '%s'", new Object[] { ☃, ☃ }));
  }
}
