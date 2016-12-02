import java.lang.reflect.Method;

public class ReflectorMethod
{
  private ReflectorClass reflectorClass = null;
  private String targetMethodName = null;
  private Class[] targetMethodParameterTypes = null;
  private boolean checked = false;
  private Method targetMethod = null;
  
  public ReflectorMethod(ReflectorClass reflectorClass, String targetMethodName)
  {
    this(reflectorClass, targetMethodName, null, false);
  }
  
  public ReflectorMethod(ReflectorClass reflectorClass, String targetMethodName, Class[] targetMethodParameterTypes)
  {
    this(reflectorClass, targetMethodName, targetMethodParameterTypes, false);
  }
  
  public ReflectorMethod(ReflectorClass reflectorClass, String targetMethodName, Class[] targetMethodParameterTypes, boolean lazyResolve)
  {
    this.reflectorClass = reflectorClass;
    this.targetMethodName = targetMethodName;
    this.targetMethodParameterTypes = targetMethodParameterTypes;
    Method m;
    if (!lazyResolve) {
      m = getTargetMethod();
    }
  }
  
  public Method getTargetMethod()
  {
    if (checked) {
      return targetMethod;
    }
    checked = true;
    
    Class cls = reflectorClass.getTargetClass();
    if (cls == null) {
      return null;
    }
    try
    {
      Method[] ms = cls.getDeclaredMethods();
      for (int i = 0; i < ms.length; i++)
      {
        Method m = ms[i];
        if (m.getName().equals(targetMethodName)) {
          if (targetMethodParameterTypes != null)
          {
            Class[] types = m.getParameterTypes();
            if (!Reflector.matchesTypes(targetMethodParameterTypes, types)) {}
          }
          else
          {
            targetMethod = m;
            if (!targetMethod.isAccessible()) {
              targetMethod.setAccessible(true);
            }
            return targetMethod;
          }
        }
      }
      Config.log("(Reflector) Method not present: " + cls.getName() + "." + targetMethodName);
      return null;
    }
    catch (Throwable e)
    {
      e.printStackTrace();
    }
    return null;
  }
  
  public boolean exists()
  {
    if (checked) {
      return targetMethod != null;
    }
    return getTargetMethod() != null;
  }
  
  public Class getReturnType()
  {
    Method tm = getTargetMethod();
    if (tm == null) {
      return null;
    }
    return tm.getReturnType();
  }
  
  public void deactivate()
  {
    checked = true;
    targetMethod = null;
  }
}
