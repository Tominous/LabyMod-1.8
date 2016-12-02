import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Processor;

public class bqs
{
  public static boolean a;
  public static boolean b;
  public static int c;
  public static int d;
  public static int e;
  public static int f;
  public static int g;
  public static int h;
  public static int i;
  public static int j;
  public static int k;
  private static int T;
  public static boolean l;
  private static boolean U;
  private static boolean V;
  public static int m;
  public static int n;
  public static int o;
  public static int p;
  private static boolean W;
  public static int q;
  public static int r;
  public static int s;
  private static boolean X;
  public static int t;
  public static int u;
  public static int v;
  public static int w;
  public static int x;
  public static int y;
  public static int z;
  public static int A;
  public static int B;
  public static int C;
  public static int D;
  public static int E;
  public static int F;
  public static int G;
  public static int H;
  public static int I;
  public static int J;
  public static int K;
  public static int L;
  private static boolean Y;
  public static boolean M;
  public static boolean N;
  public static boolean O;
  private static String Z = "";
  private static String aa;
  public static boolean P;
  public static boolean Q;
  private static boolean ab;
  public static int R;
  public static int S;
  
  public static void a()
  {
    ContextCapabilities ☃ = GLContext.getCapabilities();
    W = (☃.GL_ARB_multitexture) && (!☃.OpenGL13);
    X = (☃.GL_ARB_texture_env_combine) && (!☃.OpenGL13);
    if (W)
    {
      Z += "Using ARB_multitexture.\n";
      q = 33984;
      r = 33985;
      s = 33986;
    }
    else
    {
      Z += "Using GL 1.3 multitexturing.\n";
      q = 33984;
      r = 33985;
      s = 33986;
    }
    if (X)
    {
      Z += "Using ARB_texture_env_combine.\n";
      t = 34160;
      u = 34165;
      v = 34167;
      w = 34166;
      x = 34168;
      y = 34161;
      z = 34176;
      A = 34177;
      B = 34178;
      C = 34192;
      D = 34193;
      E = 34194;
      F = 34162;
      G = 34184;
      H = 34185;
      I = 34186;
      J = 34200;
      K = 34201;
      L = 34202;
    }
    else
    {
      Z += "Using GL 1.3 texture combiners.\n";
      t = 34160;
      u = 34165;
      v = 34167;
      w = 34166;
      x = 34168;
      y = 34161;
      z = 34176;
      A = 34177;
      B = 34178;
      C = 34192;
      D = 34193;
      E = 34194;
      F = 34162;
      G = 34184;
      H = 34185;
      I = 34186;
      J = 34200;
      K = 34201;
      L = 34202;
    }
    M = (☃.GL_EXT_blend_func_separate) && (!☃.OpenGL14);
    Y = (☃.OpenGL14) || (☃.GL_EXT_blend_func_separate);
    l = (Y) && ((☃.GL_ARB_framebuffer_object) || (☃.GL_EXT_framebuffer_object) || (☃.OpenGL30));
    if (l)
    {
      Z += "Using framebuffer objects because ";
      if (☃.OpenGL30)
      {
        Z += "OpenGL 3.0 is supported and separate blending is supported.\n";
        T = 0;
        c = 36160;
        d = 36161;
        e = 36064;
        f = 36096;
        g = 36053;
        h = 36054;
        i = 36055;
        j = 36059;
        k = 36060;
      }
      else if (☃.GL_ARB_framebuffer_object)
      {
        Z += "ARB_framebuffer_object is supported and separate blending is supported.\n";
        T = 1;
        c = 36160;
        d = 36161;
        e = 36064;
        f = 36096;
        g = 36053;
        i = 36055;
        h = 36054;
        j = 36059;
        k = 36060;
      }
      else if (☃.GL_EXT_framebuffer_object)
      {
        Z += "EXT_framebuffer_object is supported.\n";
        T = 2;
        c = 36160;
        d = 36161;
        e = 36064;
        f = 36096;
        g = 36053;
        i = 36055;
        h = 36054;
        j = 36059;
        k = 36060;
      }
    }
    else
    {
      Z += "Not using framebuffer objects because ";
      Z = Z + "OpenGL 1.4 is " + (☃.OpenGL14 ? "" : "not ") + "supported, ";
      Z = Z + "EXT_blend_func_separate is " + (☃.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
      Z = Z + "OpenGL 3.0 is " + (☃.OpenGL30 ? "" : "not ") + "supported, ";
      Z = Z + "ARB_framebuffer_object is " + (☃.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
      Z = Z + "EXT_framebuffer_object is " + (☃.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
    }
    N = ☃.OpenGL21;
    U = (N) || ((☃.GL_ARB_vertex_shader) && (☃.GL_ARB_fragment_shader) && (☃.GL_ARB_shader_objects));
    Z = Z + "Shaders are " + (U ? "" : "not ") + "available because ";
    if (U)
    {
      if (☃.OpenGL21)
      {
        Z += "OpenGL 2.1 is supported.\n";
        V = false;
        m = 35714;
        n = 35713;
        o = 35633;
        p = 35632;
      }
      else
      {
        Z += "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
        V = true;
        m = 35714;
        n = 35713;
        o = 35633;
        p = 35632;
      }
    }
    else
    {
      Z = Z + "OpenGL 2.1 is " + (☃.OpenGL21 ? "" : "not ") + "supported, ";
      Z = Z + "ARB_shader_objects is " + (☃.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
      Z = Z + "ARB_vertex_shader is " + (☃.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
      Z = Z + "ARB_fragment_shader is " + (☃.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
    }
    O = (l) && (U);
    
    String ☃ = GL11.glGetString(7936).toLowerCase();
    a = ☃.contains("nvidia");
    
    ab = (!☃.OpenGL15) && (☃.GL_ARB_vertex_buffer_object);
    P = (☃.OpenGL15) || (ab);
    Z = Z + "VBOs are " + (P ? "" : "not ") + "available because ";
    if (P) {
      if (ab)
      {
        Z += "ARB_vertex_buffer_object is supported.\n";
        S = 35044;
        R = 34962;
      }
      else
      {
        Z += "OpenGL 1.5 is supported.\n";
        S = 35044;
        R = 34962;
      }
    }
    b = ☃.contains("ati");
    if (b) {
      if (P) {
        Q = true;
      } else {
        avh.a.f.a(16.0F);
      }
    }
    try
    {
      Processor[] ☃ = new SystemInfo().getHardware().getProcessors();
      aa = String.format("%dx %s", new Object[] { Integer.valueOf(☃.length), ☃[0] }).replaceAll("\\s+", " ");
    }
    catch (Throwable localThrowable) {}
  }
  
  public static boolean b()
  {
    return O;
  }
  
  public static String c()
  {
    return Z;
  }
  
  public static int a(int ☃, int ☃)
  {
    if (V) {
      return ARBShaderObjects.glGetObjectParameteriARB(☃, ☃);
    }
    return GL20.glGetProgrami(☃, ☃);
  }
  
  public static void b(int ☃, int ☃)
  {
    if (V) {
      ARBShaderObjects.glAttachObjectARB(☃, ☃);
    } else {
      GL20.glAttachShader(☃, ☃);
    }
  }
  
  public static void a(int ☃)
  {
    if (V) {
      ARBShaderObjects.glDeleteObjectARB(☃);
    } else {
      GL20.glDeleteShader(☃);
    }
  }
  
  public static int b(int ☃)
  {
    if (V) {
      return ARBShaderObjects.glCreateShaderObjectARB(☃);
    }
    return GL20.glCreateShader(☃);
  }
  
  public static void a(int ☃, ByteBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glShaderSourceARB(☃, ☃);
    } else {
      GL20.glShaderSource(☃, ☃);
    }
  }
  
  public static void c(int ☃)
  {
    if (V) {
      ARBShaderObjects.glCompileShaderARB(☃);
    } else {
      GL20.glCompileShader(☃);
    }
  }
  
  public static int c(int ☃, int ☃)
  {
    if (V) {
      return ARBShaderObjects.glGetObjectParameteriARB(☃, ☃);
    }
    return GL20.glGetShaderi(☃, ☃);
  }
  
  public static String d(int ☃, int ☃)
  {
    if (V) {
      return ARBShaderObjects.glGetInfoLogARB(☃, ☃);
    }
    return GL20.glGetShaderInfoLog(☃, ☃);
  }
  
  public static String e(int ☃, int ☃)
  {
    if (V) {
      return ARBShaderObjects.glGetInfoLogARB(☃, ☃);
    }
    return GL20.glGetProgramInfoLog(☃, ☃);
  }
  
  public static void d(int ☃)
  {
    if (V) {
      ARBShaderObjects.glUseProgramObjectARB(☃);
    } else {
      GL20.glUseProgram(☃);
    }
  }
  
  public static int d()
  {
    if (V) {
      return ARBShaderObjects.glCreateProgramObjectARB();
    }
    return GL20.glCreateProgram();
  }
  
  public static void e(int ☃)
  {
    if (V) {
      ARBShaderObjects.glDeleteObjectARB(☃);
    } else {
      GL20.glDeleteProgram(☃);
    }
  }
  
  public static void f(int ☃)
  {
    if (V) {
      ARBShaderObjects.glLinkProgramARB(☃);
    } else {
      GL20.glLinkProgram(☃);
    }
  }
  
  public static int a(int ☃, CharSequence ☃)
  {
    if (V) {
      return ARBShaderObjects.glGetUniformLocationARB(☃, ☃);
    }
    return GL20.glGetUniformLocation(☃, ☃);
  }
  
  public static void a(int ☃, IntBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform1ARB(☃, ☃);
    } else {
      GL20.glUniform1(☃, ☃);
    }
  }
  
  public static void f(int ☃, int ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform1iARB(☃, ☃);
    } else {
      GL20.glUniform1i(☃, ☃);
    }
  }
  
  public static void a(int ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform1ARB(☃, ☃);
    } else {
      GL20.glUniform1(☃, ☃);
    }
  }
  
  public static void b(int ☃, IntBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform2ARB(☃, ☃);
    } else {
      GL20.glUniform2(☃, ☃);
    }
  }
  
  public static void b(int ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform2ARB(☃, ☃);
    } else {
      GL20.glUniform2(☃, ☃);
    }
  }
  
  public static void c(int ☃, IntBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform3ARB(☃, ☃);
    } else {
      GL20.glUniform3(☃, ☃);
    }
  }
  
  public static void c(int ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform3ARB(☃, ☃);
    } else {
      GL20.glUniform3(☃, ☃);
    }
  }
  
  public static void d(int ☃, IntBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform4ARB(☃, ☃);
    } else {
      GL20.glUniform4(☃, ☃);
    }
  }
  
  public static void d(int ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniform4ARB(☃, ☃);
    } else {
      GL20.glUniform4(☃, ☃);
    }
  }
  
  public static void a(int ☃, boolean ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix2ARB(☃, ☃, ☃);
    } else {
      GL20.glUniformMatrix2(☃, ☃, ☃);
    }
  }
  
  public static void b(int ☃, boolean ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix3ARB(☃, ☃, ☃);
    } else {
      GL20.glUniformMatrix3(☃, ☃, ☃);
    }
  }
  
  public static void c(int ☃, boolean ☃, FloatBuffer ☃)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix4ARB(☃, ☃, ☃);
    } else {
      GL20.glUniformMatrix4(☃, ☃, ☃);
    }
  }
  
  public static int b(int ☃, CharSequence ☃)
  {
    if (V) {
      return ARBVertexShader.glGetAttribLocationARB(☃, ☃);
    }
    return GL20.glGetAttribLocation(☃, ☃);
  }
  
  public static int e()
  {
    if (ab) {
      return ARBVertexBufferObject.glGenBuffersARB();
    }
    return GL15.glGenBuffers();
  }
  
  public static void g(int ☃, int ☃)
  {
    if (ab) {
      ARBVertexBufferObject.glBindBufferARB(☃, ☃);
    } else {
      GL15.glBindBuffer(☃, ☃);
    }
  }
  
  public static void a(int ☃, ByteBuffer ☃, int ☃)
  {
    if (ab) {
      ARBVertexBufferObject.glBufferDataARB(☃, ☃, ☃);
    } else {
      GL15.glBufferData(☃, ☃, ☃);
    }
  }
  
  public static void g(int ☃)
  {
    if (ab) {
      ARBVertexBufferObject.glDeleteBuffersARB(☃);
    } else {
      GL15.glDeleteBuffers(☃);
    }
  }
  
  public static boolean f()
  {
    return (P) && (ave.A().t.u);
  }
  
  public static void h(int ☃, int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glBindFramebuffer(☃, ☃);
      break;
    case 1: 
      ARBFramebufferObject.glBindFramebuffer(☃, ☃);
      break;
    case 2: 
      EXTFramebufferObject.glBindFramebufferEXT(☃, ☃);
    }
  }
  
  public static void i(int ☃, int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glBindRenderbuffer(☃, ☃);
      break;
    case 1: 
      ARBFramebufferObject.glBindRenderbuffer(☃, ☃);
      break;
    case 2: 
      EXTFramebufferObject.glBindRenderbufferEXT(☃, ☃);
    }
  }
  
  public static void h(int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glDeleteRenderbuffers(☃);
      break;
    case 1: 
      ARBFramebufferObject.glDeleteRenderbuffers(☃);
      break;
    case 2: 
      EXTFramebufferObject.glDeleteRenderbuffersEXT(☃);
    }
  }
  
  public static void i(int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glDeleteFramebuffers(☃);
      break;
    case 1: 
      ARBFramebufferObject.glDeleteFramebuffers(☃);
      break;
    case 2: 
      EXTFramebufferObject.glDeleteFramebuffersEXT(☃);
    }
  }
  
  public static int g()
  {
    if (!l) {
      return -1;
    }
    switch (T)
    {
    case 0: 
      return GL30.glGenFramebuffers();
    case 1: 
      return ARBFramebufferObject.glGenFramebuffers();
    case 2: 
      return EXTFramebufferObject.glGenFramebuffersEXT();
    }
    return -1;
  }
  
  public static int h()
  {
    if (!l) {
      return -1;
    }
    switch (T)
    {
    case 0: 
      return GL30.glGenRenderbuffers();
    case 1: 
      return ARBFramebufferObject.glGenRenderbuffers();
    case 2: 
      return EXTFramebufferObject.glGenRenderbuffersEXT();
    }
    return -1;
  }
  
  public static void a(int ☃, int ☃, int ☃, int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glRenderbufferStorage(☃, ☃, ☃, ☃);
      break;
    case 1: 
      ARBFramebufferObject.glRenderbufferStorage(☃, ☃, ☃, ☃);
      break;
    case 2: 
      EXTFramebufferObject.glRenderbufferStorageEXT(☃, ☃, ☃, ☃);
    }
  }
  
  public static void b(int ☃, int ☃, int ☃, int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glFramebufferRenderbuffer(☃, ☃, ☃, ☃);
      break;
    case 1: 
      ARBFramebufferObject.glFramebufferRenderbuffer(☃, ☃, ☃, ☃);
      break;
    case 2: 
      EXTFramebufferObject.glFramebufferRenderbufferEXT(☃, ☃, ☃, ☃);
    }
  }
  
  public static int j(int ☃)
  {
    if (!l) {
      return -1;
    }
    switch (T)
    {
    case 0: 
      return GL30.glCheckFramebufferStatus(☃);
    case 1: 
      return ARBFramebufferObject.glCheckFramebufferStatus(☃);
    case 2: 
      return EXTFramebufferObject.glCheckFramebufferStatusEXT(☃);
    }
    return -1;
  }
  
  public static void a(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (!l) {
      return;
    }
    switch (T)
    {
    case 0: 
      GL30.glFramebufferTexture2D(☃, ☃, ☃, ☃, ☃);
      break;
    case 1: 
      ARBFramebufferObject.glFramebufferTexture2D(☃, ☃, ☃, ☃, ☃);
      break;
    case 2: 
      EXTFramebufferObject.glFramebufferTexture2DEXT(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static void k(int ☃)
  {
    if (W) {
      ARBMultitexture.glActiveTextureARB(☃);
    } else {
      GL13.glActiveTexture(☃);
    }
  }
  
  public static void l(int ☃)
  {
    if (W) {
      ARBMultitexture.glClientActiveTextureARB(☃);
    } else {
      GL13.glClientActiveTexture(☃);
    }
  }
  
  public static void a(int ☃, float ☃, float ☃)
  {
    if (W) {
      ARBMultitexture.glMultiTexCoord2fARB(☃, ☃, ☃);
    } else {
      GL13.glMultiTexCoord2f(☃, ☃, ☃);
    }
  }
  
  public static void c(int ☃, int ☃, int ☃, int ☃)
  {
    if (Y)
    {
      if (M) {
        EXTBlendFuncSeparate.glBlendFuncSeparateEXT(☃, ☃, ☃, ☃);
      } else {
        GL14.glBlendFuncSeparate(☃, ☃, ☃, ☃);
      }
    }
    else {
      GL11.glBlendFunc(☃, ☃);
    }
  }
  
  public static boolean i()
  {
    return (l) && (ave.A().t.f);
  }
  
  public static String j()
  {
    return aa == null ? "<unknown>" : aa;
  }
}
