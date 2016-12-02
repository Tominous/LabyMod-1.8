public class add$a
  extends oa.a
{
  private final dn c;
  private final String d;
  
  public add$a(add paramadd, dn ☃)
  {
    this(paramadd, ☃.m("Properties"), ☃.j("Type"), ☃.f("Weight"));
  }
  
  public add$a(add paramadd, dn ☃, String ☃)
  {
    this(paramadd, ☃, ☃, 1);
  }
  
  private add$a(add paramadd, dn ☃, String ☃, int ☃)
  {
    super(☃);
    if (☃.equals("Minecart")) {
      if (☃ != null) {
        ☃ = va.a.a(☃.f("Type")).b();
      } else {
        ☃ = "MinecartRideable";
      }
    }
    c = ☃;
    d = ☃;
  }
  
  public dn a()
  {
    dn ☃ = new dn();
    
    ☃.a("Properties", c);
    ☃.a("Type", d);
    ☃.a("Weight", a);
    
    return ☃;
  }
}
