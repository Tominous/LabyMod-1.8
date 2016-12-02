public class FileDownloadThread
  extends Thread
{
  private String urlString = null;
  private IFileDownloadListener listener = null;
  
  public FileDownloadThread(String urlString, IFileDownloadListener listener)
  {
    this.urlString = urlString;
    this.listener = listener;
  }
  
  public void run()
  {
    try
    {
      byte[] bytes = HttpPipeline.get(urlString, ave.A().O());
      
      listener.fileDownloadFinished(urlString, bytes, null);
    }
    catch (Exception e)
    {
      listener.fileDownloadFinished(urlString, null, e);
    }
  }
  
  public String getUrlString()
  {
    return urlString;
  }
  
  public IFileDownloadListener getListener()
  {
    return listener;
  }
}
