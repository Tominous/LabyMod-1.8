import java.io.File;
import java.io.FileFilter;

final class bnm$1
  implements FileFilter
{
  public boolean accept(File p_accept_1_)
  {
    boolean flag = (p_accept_1_.isFile()) && (p_accept_1_.getName().endsWith(".zip"));
    boolean flag1 = (p_accept_1_.isDirectory()) && (new File(p_accept_1_, "pack.mcmeta").isFile());
    boolean flag2 = (p_accept_1_.isDirectory()) && (p_accept_1_.getName().startsWith("dir_"));
    return (flag) || (flag1) || (flag2);
  }
}
