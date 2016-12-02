import com.google.common.collect.Lists;
import java.util.List;

public class awy
  extends axu
{
  protected awx a;
  protected String f;
  private String r;
  private final List<String> s = Lists.newArrayList();
  protected String g;
  protected String h;
  protected int i;
  private int t;
  
  public awy(awx ☃, String ☃, String ☃, int ☃)
  {
    this.a = ☃;
    this.f = ☃;
    this.r = ☃;
    this.i = ☃;
    
    this.g = bnq.a("gui.yes", new Object[0]);
    this.h = bnq.a("gui.no", new Object[0]);
  }
  
  public awy(awx ☃, String ☃, String ☃, String ☃, String ☃, int ☃)
  {
    this.a = ☃;
    this.f = ☃;
    this.r = ☃;
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
  }
  
  public void b()
  {
    this.n.add(new awe(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
    this.n.add(new awe(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
    
    this.s.clear();
    this.s.addAll(this.q.c(this.r, this.l - 50));
  }
  
  protected void a(avs ☃)
  {
    this.a.a(☃.k == 0, this.i);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, this.f, this.l / 2, 70, 16777215);
    
    int ☃ = 90;
    for (String ☃ : this.s)
    {
      a(this.q, ☃, this.l / 2, ☃, 16777215);
      ☃ += this.q.a;
    }
    super.a(☃, ☃, ☃);
  }
  
  public void b(int ☃)
  {
    this.t = ☃;
    for (avs ☃ : this.n) {
      ☃.l = false;
    }
  }
  
  public void e()
  {
    super.e();
    if (--this.t == 0) {
      for (avs ☃ : this.n) {
        ☃.l = true;
      }
    }
  }
}
