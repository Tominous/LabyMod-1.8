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
  private static final String __OBFID = "CL_00001179";
  public static float lastBrightnessX = 0.0F;
  public static float lastBrightnessY = 0.0F;
  
  public static void a()
  {
    Config.initDisplay();
    
    ContextCapabilities var0 = GLContext.getCapabilities();
    W = (GL_ARB_multitexture) && (!OpenGL13);
    X = (GL_ARB_texture_env_combine) && (!OpenGL13);
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
    M = (GL_EXT_blend_func_separate) && (!OpenGL14);
    Y = (OpenGL14) || (GL_EXT_blend_func_separate);
    l = (Y) && ((GL_ARB_framebuffer_object) || (GL_EXT_framebuffer_object) || (OpenGL30));
    if (l)
    {
      Z += "Using framebuffer objects because ";
      if (OpenGL30)
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
      else if (GL_ARB_framebuffer_object)
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
      else if (GL_EXT_framebuffer_object)
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
      Z = Z + "OpenGL 1.4 is " + (OpenGL14 ? "" : "not ") + "supported, ";
      Z = Z + "EXT_blend_func_separate is " + (GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
      Z = Z + "OpenGL 3.0 is " + (OpenGL30 ? "" : "not ") + "supported, ";
      Z = Z + "ARB_framebuffer_object is " + (GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
      Z = Z + "EXT_framebuffer_object is " + (GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
    }
    N = OpenGL21;
    U = (N) || ((GL_ARB_vertex_shader) && (GL_ARB_fragment_shader) && (GL_ARB_shader_objects));
    Z = Z + "Shaders are " + (U ? "" : "not ") + "available because ";
    if (U)
    {
      if (OpenGL21)
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
      Z = Z + "OpenGL 2.1 is " + (OpenGL21 ? "" : "not ") + "supported, ";
      Z = Z + "ARB_shader_objects is " + (GL_ARB_shader_objects ? "" : "not ") + "supported, ";
      Z = Z + "ARB_vertex_shader is " + (GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
      Z = Z + "ARB_fragment_shader is " + (GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
    }
    O = (l) && (U);
    String var1 = GL11.glGetString(7936).toLowerCase();
    a = var1.contains("nvidia");
    ab = (!OpenGL15) && (GL_ARB_vertex_buffer_object);
    P = (OpenGL15) || (ab);
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
    b = var1.contains("ati");
    if (b) {
      if (P) {
        Q = true;
      } else {
        avh.a.f.a(16.0F);
      }
    }
    try
    {
      Processor[] var2 = new SystemInfo().getHardware().getProcessors();
      aa = String.format("%dx %s", new Object[] { Integer.valueOf(var2.length), var2[0] }).replaceAll("\\s+", " ");
    }
    catch (Throwable var3) {}
  }
  
  public static boolean b()
  {
    return O;
  }
  
  public static String c()
  {
    return Z;
  }
  
  public static int a(int p_153175_0_, int p_153175_1_)
  {
    return V ? ARBShaderObjects.glGetObjectParameteriARB(p_153175_0_, p_153175_1_) : GL20.glGetProgrami(p_153175_0_, p_153175_1_);
  }
  
  public static void b(int p_153178_0_, int p_153178_1_)
  {
    if (V) {
      ARBShaderObjects.glAttachObjectARB(p_153178_0_, p_153178_1_);
    } else {
      GL20.glAttachShader(p_153178_0_, p_153178_1_);
    }
  }
  
  public static void a(int p_153180_0_)
  {
    if (V) {
      ARBShaderObjects.glDeleteObjectARB(p_153180_0_);
    } else {
      GL20.glDeleteShader(p_153180_0_);
    }
  }
  
  public static int b(int p_153195_0_)
  {
    return V ? ARBShaderObjects.glCreateShaderObjectARB(p_153195_0_) : GL20.glCreateShader(p_153195_0_);
  }
  
  public static void a(int p_153169_0_, ByteBuffer p_153169_1_)
  {
    if (V) {
      ARBShaderObjects.glShaderSourceARB(p_153169_0_, p_153169_1_);
    } else {
      GL20.glShaderSource(p_153169_0_, p_153169_1_);
    }
  }
  
  public static void c(int p_153170_0_)
  {
    if (V) {
      ARBShaderObjects.glCompileShaderARB(p_153170_0_);
    } else {
      GL20.glCompileShader(p_153170_0_);
    }
  }
  
  public static int c(int p_153157_0_, int p_153157_1_)
  {
    return V ? ARBShaderObjects.glGetObjectParameteriARB(p_153157_0_, p_153157_1_) : GL20.glGetShaderi(p_153157_0_, p_153157_1_);
  }
  
  public static String d(int p_153158_0_, int p_153158_1_)
  {
    return V ? ARBShaderObjects.glGetInfoLogARB(p_153158_0_, p_153158_1_) : GL20.glGetShaderInfoLog(p_153158_0_, p_153158_1_);
  }
  
  public static String e(int p_153166_0_, int p_153166_1_)
  {
    return V ? ARBShaderObjects.glGetInfoLogARB(p_153166_0_, p_153166_1_) : GL20.glGetProgramInfoLog(p_153166_0_, p_153166_1_);
  }
  
  public static void d(int p_153161_0_)
  {
    if (V) {
      ARBShaderObjects.glUseProgramObjectARB(p_153161_0_);
    } else {
      GL20.glUseProgram(p_153161_0_);
    }
  }
  
  public static int d()
  {
    return V ? ARBShaderObjects.glCreateProgramObjectARB() : GL20.glCreateProgram();
  }
  
  public static void e(int p_153187_0_)
  {
    if (V) {
      ARBShaderObjects.glDeleteObjectARB(p_153187_0_);
    } else {
      GL20.glDeleteProgram(p_153187_0_);
    }
  }
  
  public static void f(int p_153179_0_)
  {
    if (V) {
      ARBShaderObjects.glLinkProgramARB(p_153179_0_);
    } else {
      GL20.glLinkProgram(p_153179_0_);
    }
  }
  
  public static int a(int p_153194_0_, CharSequence p_153194_1_)
  {
    return V ? ARBShaderObjects.glGetUniformLocationARB(p_153194_0_, p_153194_1_) : GL20.glGetUniformLocation(p_153194_0_, p_153194_1_);
  }
  
  public static void a(int p_153181_0_, IntBuffer p_153181_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform1ARB(p_153181_0_, p_153181_1_);
    } else {
      GL20.glUniform1(p_153181_0_, p_153181_1_);
    }
  }
  
  public static void f(int p_153163_0_, int p_153163_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform1iARB(p_153163_0_, p_153163_1_);
    } else {
      GL20.glUniform1i(p_153163_0_, p_153163_1_);
    }
  }
  
  public static void a(int p_153168_0_, FloatBuffer p_153168_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform1ARB(p_153168_0_, p_153168_1_);
    } else {
      GL20.glUniform1(p_153168_0_, p_153168_1_);
    }
  }
  
  public static void b(int p_153182_0_, IntBuffer p_153182_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform2ARB(p_153182_0_, p_153182_1_);
    } else {
      GL20.glUniform2(p_153182_0_, p_153182_1_);
    }
  }
  
  public static void b(int p_153177_0_, FloatBuffer p_153177_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform2ARB(p_153177_0_, p_153177_1_);
    } else {
      GL20.glUniform2(p_153177_0_, p_153177_1_);
    }
  }
  
  public static void c(int p_153192_0_, IntBuffer p_153192_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform3ARB(p_153192_0_, p_153192_1_);
    } else {
      GL20.glUniform3(p_153192_0_, p_153192_1_);
    }
  }
  
  public static void c(int p_153191_0_, FloatBuffer p_153191_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform3ARB(p_153191_0_, p_153191_1_);
    } else {
      GL20.glUniform3(p_153191_0_, p_153191_1_);
    }
  }
  
  public static void d(int p_153162_0_, IntBuffer p_153162_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform4ARB(p_153162_0_, p_153162_1_);
    } else {
      GL20.glUniform4(p_153162_0_, p_153162_1_);
    }
  }
  
  public static void d(int p_153159_0_, FloatBuffer p_153159_1_)
  {
    if (V) {
      ARBShaderObjects.glUniform4ARB(p_153159_0_, p_153159_1_);
    } else {
      GL20.glUniform4(p_153159_0_, p_153159_1_);
    }
  }
  
  public static void a(int p_153173_0_, boolean p_153173_1_, FloatBuffer p_153173_2_)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix2ARB(p_153173_0_, p_153173_1_, p_153173_2_);
    } else {
      GL20.glUniformMatrix2(p_153173_0_, p_153173_1_, p_153173_2_);
    }
  }
  
  public static void b(int p_153189_0_, boolean p_153189_1_, FloatBuffer p_153189_2_)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix3ARB(p_153189_0_, p_153189_1_, p_153189_2_);
    } else {
      GL20.glUniformMatrix3(p_153189_0_, p_153189_1_, p_153189_2_);
    }
  }
  
  public static void c(int p_153160_0_, boolean p_153160_1_, FloatBuffer p_153160_2_)
  {
    if (V) {
      ARBShaderObjects.glUniformMatrix4ARB(p_153160_0_, p_153160_1_, p_153160_2_);
    } else {
      GL20.glUniformMatrix4(p_153160_0_, p_153160_1_, p_153160_2_);
    }
  }
  
  public static int b(int p_153164_0_, CharSequence p_153164_1_)
  {
    return V ? ARBVertexShader.glGetAttribLocationARB(p_153164_0_, p_153164_1_) : GL20.glGetAttribLocation(p_153164_0_, p_153164_1_);
  }
  
  public static int e()
  {
    return ab ? ARBVertexBufferObject.glGenBuffersARB() : GL15.glGenBuffers();
  }
  
  public static void g(int p_176072_0_, int p_176072_1_)
  {
    if (ab) {
      ARBVertexBufferObject.glBindBufferARB(p_176072_0_, p_176072_1_);
    } else {
      GL15.glBindBuffer(p_176072_0_, p_176072_1_);
    }
  }
  
  public static void a(int p_176071_0_, ByteBuffer p_176071_1_, int p_176071_2_)
  {
    if (ab) {
      ARBVertexBufferObject.glBufferDataARB(p_176071_0_, p_176071_1_, p_176071_2_);
    } else {
      GL15.glBufferData(p_176071_0_, p_176071_1_, p_176071_2_);
    }
  }
  
  public static void g(int p_176074_0_)
  {
    if (ab) {
      ARBVertexBufferObject.glDeleteBuffersARB(p_176074_0_);
    } else {
      GL15.glDeleteBuffers(p_176074_0_);
    }
  }
  
  public static boolean f()
  {
    if (Config.isMultiTexture()) {
      return false;
    }
    return (P) && (At.u);
  }
  
  public static void h(int p_153171_0_, int p_153171_1_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glBindFramebuffer(p_153171_0_, p_153171_1_);
        break;
      case 1: 
        ARBFramebufferObject.glBindFramebuffer(p_153171_0_, p_153171_1_);
        break;
      case 2: 
        EXTFramebufferObject.glBindFramebufferEXT(p_153171_0_, p_153171_1_);
      }
    }
  }
  
  public static void i(int p_153176_0_, int p_153176_1_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glBindRenderbuffer(p_153176_0_, p_153176_1_);
        break;
      case 1: 
        ARBFramebufferObject.glBindRenderbuffer(p_153176_0_, p_153176_1_);
        break;
      case 2: 
        EXTFramebufferObject.glBindRenderbufferEXT(p_153176_0_, p_153176_1_);
      }
    }
  }
  
  public static void h(int p_153184_0_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glDeleteRenderbuffers(p_153184_0_);
        break;
      case 1: 
        ARBFramebufferObject.glDeleteRenderbuffers(p_153184_0_);
        break;
      case 2: 
        EXTFramebufferObject.glDeleteRenderbuffersEXT(p_153184_0_);
      }
    }
  }
  
  public static void i(int p_153174_0_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glDeleteFramebuffers(p_153174_0_);
        break;
      case 1: 
        ARBFramebufferObject.glDeleteFramebuffers(p_153174_0_);
        break;
      case 2: 
        EXTFramebufferObject.glDeleteFramebuffersEXT(p_153174_0_);
      }
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
  
  public static void a(int p_153186_0_, int p_153186_1_, int p_153186_2_, int p_153186_3_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glRenderbufferStorage(p_153186_0_, p_153186_1_, p_153186_2_, p_153186_3_);
        break;
      case 1: 
        ARBFramebufferObject.glRenderbufferStorage(p_153186_0_, p_153186_1_, p_153186_2_, p_153186_3_);
        break;
      case 2: 
        EXTFramebufferObject.glRenderbufferStorageEXT(p_153186_0_, p_153186_1_, p_153186_2_, p_153186_3_);
      }
    }
  }
  
  public static void b(int p_153190_0_, int p_153190_1_, int p_153190_2_, int p_153190_3_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glFramebufferRenderbuffer(p_153190_0_, p_153190_1_, p_153190_2_, p_153190_3_);
        break;
      case 1: 
        ARBFramebufferObject.glFramebufferRenderbuffer(p_153190_0_, p_153190_1_, p_153190_2_, p_153190_3_);
        break;
      case 2: 
        EXTFramebufferObject.glFramebufferRenderbufferEXT(p_153190_0_, p_153190_1_, p_153190_2_, p_153190_3_);
      }
    }
  }
  
  public static int j(int p_153167_0_)
  {
    if (!l) {
      return -1;
    }
    switch (T)
    {
    case 0: 
      return GL30.glCheckFramebufferStatus(p_153167_0_);
    case 1: 
      return ARBFramebufferObject.glCheckFramebufferStatus(p_153167_0_);
    case 2: 
      return EXTFramebufferObject.glCheckFramebufferStatusEXT(p_153167_0_);
    }
    return -1;
  }
  
  public static void a(int p_153188_0_, int p_153188_1_, int p_153188_2_, int p_153188_3_, int p_153188_4_)
  {
    if (l) {
      switch (T)
      {
      case 0: 
        GL30.glFramebufferTexture2D(p_153188_0_, p_153188_1_, p_153188_2_, p_153188_3_, p_153188_4_);
        break;
      case 1: 
        ARBFramebufferObject.glFramebufferTexture2D(p_153188_0_, p_153188_1_, p_153188_2_, p_153188_3_, p_153188_4_);
        break;
      case 2: 
        EXTFramebufferObject.glFramebufferTexture2DEXT(p_153188_0_, p_153188_1_, p_153188_2_, p_153188_3_, p_153188_4_);
      }
    }
  }
  
  public static void k(int p_77473_0_)
  {
    if (W) {
      ARBMultitexture.glActiveTextureARB(p_77473_0_);
    } else {
      GL13.glActiveTexture(p_77473_0_);
    }
  }
  
  public static void l(int p_77472_0_)
  {
    if (W) {
      ARBMultitexture.glClientActiveTextureARB(p_77472_0_);
    } else {
      GL13.glClientActiveTexture(p_77472_0_);
    }
  }
  
  public static void a(int p_77475_0_, float p_77475_1_, float p_77475_2_)
  {
    if (W) {
      ARBMultitexture.glMultiTexCoord2fARB(p_77475_0_, p_77475_1_, p_77475_2_);
    } else {
      GL13.glMultiTexCoord2f(p_77475_0_, p_77475_1_, p_77475_2_);
    }
    if (p_77475_0_ == r)
    {
      lastBrightnessX = p_77475_1_;
      lastBrightnessY = p_77475_2_;
    }
  }
  
  public static void c(int p_148821_0_, int p_148821_1_, int p_148821_2_, int p_148821_3_)
  {
    if (Y)
    {
      if (M) {
        EXTBlendFuncSeparate.glBlendFuncSeparateEXT(p_148821_0_, p_148821_1_, p_148821_2_, p_148821_3_);
      } else {
        GL14.glBlendFuncSeparate(p_148821_0_, p_148821_1_, p_148821_2_, p_148821_3_);
      }
    }
    else {
      GL11.glBlendFunc(p_148821_0_, p_148821_1_);
    }
  }
  
  public static boolean i()
  {
    if (Config.isFastRender()) {
      return false;
    }
    if (Config.isAntialiasing()) {
      return false;
    }
    return (l) && (At.f);
  }
  
  public static String j()
  {
    return aa == null ? "<unknown>" : aa;
  }
}
