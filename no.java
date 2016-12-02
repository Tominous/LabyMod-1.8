public abstract class no<T>
{
  private T a;
  private boolean b = false;
  
  public T c()
  {
    if (!b)
    {
      b = true;
      a = b();
    }
    return (T)a;
  }
  
  protected abstract T b();
}
