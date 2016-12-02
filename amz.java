import java.util.List;

public class amz
{
  private int a;
  private int b;
  private int c;
  private char[] d;
  private amw e;
  private amw f;
  private static final String __OBFID = "CL_00000375";
  
  public amz(int y, boolean storeSkylight)
  {
    a = y;
    d = new char['က'];
    e = new amw();
    if (storeSkylight) {
      f = new amw();
    }
  }
  
  public alz a(int x, int y, int z)
  {
    alz var4 = (alz)afh.d.a(d[(y << 8 | z << 4 | x)]);
    return var4 != null ? var4 : afi.a.Q();
  }
  
  public void a(int x, int y, int z, alz state)
  {
    if (Reflector.IExtendedBlockState.isInstance(state)) {
      state = (alz)Reflector.call(state, Reflector.IExtendedBlockState_getClean, new Object[0]);
    }
    alz var5 = a(x, y, z);
    afh var6 = var5.c();
    afh var7 = state.c();
    if (var6 != afi.a)
    {
      b -= 1;
      if (var6.y()) {
        c -= 1;
      }
    }
    if (var7 != afi.a)
    {
      b += 1;
      if (var7.y()) {
        c += 1;
      }
    }
    d[(y << 8 | z << 4 | x)] = ((char)afh.d.b(state));
  }
  
  public afh b(int x, int y, int z)
  {
    return a(x, y, z).c();
  }
  
  public int c(int x, int y, int z)
  {
    alz var4 = a(x, y, z);
    return var4.c().c(var4);
  }
  
  public boolean a()
  {
    return b == 0;
  }
  
  public boolean b()
  {
    return c > 0;
  }
  
  public int d()
  {
    return a;
  }
  
  public void a(int x, int y, int z, int value)
  {
    f.a(x, y, z, value);
  }
  
  public int d(int x, int y, int z)
  {
    return f.a(x, y, z);
  }
  
  public void b(int x, int y, int z, int value)
  {
    e.a(x, y, z, value);
  }
  
  public int e(int x, int y, int z)
  {
    return e.a(x, y, z);
  }
  
  public void e()
  {
    List blockStates = afh.d.getObjectList();
    int maxStateId = blockStates.size();
    
    int localBlockRefCount = 0;
    int localTickRefCount = 0;
    for (int y = 0; y < 16; y++)
    {
      int by = y << 8;
      for (int z = 0; z < 16; z++)
      {
        int byz = by | z << 4;
        for (int x = 0; x < 16; x++)
        {
          int stateId = d[(byz | x)];
          if (stateId > 0)
          {
            localBlockRefCount++;
            if (stateId < maxStateId)
            {
              alz bs = (alz)blockStates.get(stateId);
              if (bs != null)
              {
                afh var4 = bs.c();
                if (var4.y()) {
                  localTickRefCount++;
                }
              }
            }
          }
        }
      }
    }
    b = localBlockRefCount;
    c = localTickRefCount;
  }
  
  public char[] g()
  {
    return d;
  }
  
  public void a(char[] dataArray)
  {
    d = dataArray;
  }
  
  public amw h()
  {
    return e;
  }
  
  public amw i()
  {
    return f;
  }
  
  public void a(amw newBlocklightArray)
  {
    e = newBlocklightArray;
  }
  
  public void b(amw newSkylightArray)
  {
    f = newSkylightArray;
  }
}
