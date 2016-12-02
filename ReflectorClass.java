public class ReflectorClass
{
  private String targetClassName = null;
  private boolean checked = false;
  private Class targetClass = null;
  
  public ReflectorClass(String targetClassName)
  {
    this(targetClassName, false);
  }
  
  public ReflectorClass(String targetClassName, boolean lazyResolve)
  {
    this.targetClassName = targetClassName;
    Class cls;
    if (!lazyResolve) {
      cls = getTargetClass();
    }
  }
  
  public ReflectorClass(Class targetClass)
  {
    this.targetClass = targetClass;
    targetClassName = targetClass.getName();
    checked = true;
  }
  
  public Class getTargetClass()
  {
    if (checked) {
      return targetClass;
    }
    checked = true;
    try
    {
      targetClass = Class.forName(targetClassName);
    }
    catch (ClassNotFoundException e)
    {
      Config.log("(Reflector) Class not present: " + targetClassName);
    }
    catch (Throwable e)
    {
      e.printStackTrace();
    }
    return targetClass;
  }
  
  public boolean exists()
  {
    return getTargetClass() != null;
  }
  
  public String getTargetClassName()
  {
    return targetClassName;
  }
  
  public boolean isInstance(Object obj)
  {
    if (getTargetClass() == null) {
      return false;
    }
    return getTargetClass().isInstance(obj);
  }
}
