package togglesneak;

public class Property
{
  private String value;
  
  public Property(String value)
  {
    this.value = value;
  }
  
  public void set(String newValue)
  {
    value = newValue;
  }
  
  public String getValue()
  {
    return value;
  }
  
  public double getDouble()
  {
    return Double.parseDouble(value);
  }
  
  public int getInt()
  {
    return Integer.parseInt(value);
  }
  
  public boolean getBoolean()
  {
    return Boolean.parseBoolean(value);
  }
  
  public String getString()
  {
    return value;
  }
}
