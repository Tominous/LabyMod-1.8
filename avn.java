import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class avn
  implements bnj
{
  private static final jy[] c = new jy['Ā'];
  private int[] d = new int['Ā'];
  public int a = 9;
  public Random b = new Random();
  private byte[] e = new byte[65536];
  private int[] f = new int[32];
  private final jy g;
  private final bmj h;
  private float i;
  private float j;
  private boolean k;
  private boolean l;
  private float m;
  private float n;
  private float o;
  private float p;
  private int q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  
  public avn(avh ☃, jy ☃, bmj ☃, boolean ☃)
  {
    this.g = ☃;
    this.h = ☃;
    this.k = ☃;
    
    ☃.a(this.g);
    for (int ☃ = 0; ☃ < 32; ☃++)
    {
      int ☃ = (☃ >> 3 & 0x1) * 85;
      int ☃ = (☃ >> 2 & 0x1) * 170 + ☃;
      int ☃ = (☃ >> 1 & 0x1) * 170 + ☃;
      int ☃ = (☃ >> 0 & 0x1) * 170 + ☃;
      if (☃ == 6) {
        ☃ += 85;
      }
      if (☃.e)
      {
        int ☃ = (☃ * 30 + ☃ * 59 + ☃ * 11) / 100;
        int ☃ = (☃ * 30 + ☃ * 70) / 100;
        int ☃ = (☃ * 30 + ☃ * 70) / 100;
        ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
      }
      if (☃ >= 16)
      {
        ☃ /= 4;
        ☃ /= 4;
        ☃ /= 4;
      }
      this.f[☃] = ((☃ & 0xFF) << 16 | (☃ & 0xFF) << 8 | ☃ & 0xFF);
    }
    d();
  }
  
  public void a(bni ☃)
  {
    c();
  }
  
  private void c()
  {
    BufferedImage ☃;
    try
    {
      ☃ = bml.a(ave.A().Q().a(this.g).b());
    }
    catch (IOException ☃)
    {
      throw new RuntimeException(☃);
    }
    int ☃ = ☃.getWidth();
    int ☃ = ☃.getHeight();
    int[] ☃ = new int[☃ * ☃];
    ☃.getRGB(0, 0, ☃, ☃, ☃, 0, ☃);
    
    int ☃ = ☃ / 16;
    int ☃ = ☃ / 16;
    
    int ☃ = 1;
    
    float ☃ = 8.0F / ☃;
    for (int ☃ = 0; ☃ < 256; ☃++)
    {
      int ☃ = ☃ % 16;
      int ☃ = ☃ / 16;
      if (☃ == 32) {
        this.d[☃] = (3 + ☃);
      }
      for (int ☃ = ☃ - 1; ☃ >= 0; ☃--)
      {
        int ☃ = ☃ * ☃ + ☃;
        boolean ☃ = true;
        for (int ☃ = 0; (☃ < ☃) && (☃); ☃++)
        {
          int ☃ = (☃ * ☃ + ☃) * ☃;
          if ((☃[(☃ + ☃)] >> 24 & 0xFF) != 0) {
            ☃ = false;
          }
        }
        if (!☃) {
          break;
        }
      }
      ☃++;
      
      this.d[☃] = ((int)(0.5D + ☃ * ☃) + ☃);
    }
  }
  
  private void d()
  {
    InputStream ☃ = null;
    try
    {
      ☃ = ave.A().Q().a(new jy("font/glyph_sizes.bin")).b();
      ☃.read(this.e);
    }
    catch (IOException ☃)
    {
      throw new RuntimeException(☃);
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  private float a(char ☃, boolean ☃)
  {
    if (☃ == ' ') {
      return 4.0F;
    }
    int ☃ = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(☃);
    if ((☃ != -1) && (!this.k)) {
      return a(☃, ☃);
    }
    return b(☃, ☃);
  }
  
  private float a(int ☃, boolean ☃)
  {
    int ☃ = ☃ % 16 * 8;
    int ☃ = ☃ / 16 * 8;
    int ☃ = ☃ ? 1 : 0;
    
    this.h.a(this.g);
    
    int ☃ = this.d[☃];
    float ☃ = ☃ - 0.01F;
    
    GL11.glBegin(5);
    GL11.glTexCoord2f(☃ / 128.0F, ☃ / 128.0F);
    GL11.glVertex3f(this.i + ☃, this.j, 0.0F);
    GL11.glTexCoord2f(☃ / 128.0F, (☃ + 7.99F) / 128.0F);
    GL11.glVertex3f(this.i - ☃, this.j + 7.99F, 0.0F);
    GL11.glTexCoord2f((☃ + ☃ - 1.0F) / 128.0F, ☃ / 128.0F);
    GL11.glVertex3f(this.i + ☃ - 1.0F + ☃, this.j, 0.0F);
    GL11.glTexCoord2f((☃ + ☃ - 1.0F) / 128.0F, (☃ + 7.99F) / 128.0F);
    GL11.glVertex3f(this.i + ☃ - 1.0F - ☃, this.j + 7.99F, 0.0F);
    GL11.glEnd();
    
    return ☃;
  }
  
  private jy a(int ☃)
  {
    if (c[☃] == null) {
      c[☃] = new jy(String.format("textures/font/unicode_page_%02x.png", new Object[] { Integer.valueOf(☃) }));
    }
    return c[☃];
  }
  
  private void b(int ☃)
  {
    this.h.a(a(☃));
  }
  
  private float b(char ☃, boolean ☃)
  {
    if (this.e[☃] == 0) {
      return 0.0F;
    }
    int ☃ = ☃ / 'Ā';
    
    b(☃);
    
    int ☃ = this.e[☃] >>> 4;
    
    int ☃ = this.e[☃] & 0xF;
    
    float ☃ = ☃;
    float ☃ = ☃ + 1;
    
    float ☃ = ☃ % '\020' * 16 + ☃;
    float ☃ = (☃ & 0xFF) / '\020' * 16;
    float ☃ = ☃ - ☃ - 0.02F;
    float ☃ = ☃ ? 1.0F : 0.0F;
    
    GL11.glBegin(5);
    GL11.glTexCoord2f(☃ / 256.0F, ☃ / 256.0F);
    GL11.glVertex3f(this.i + ☃, this.j, 0.0F);
    GL11.glTexCoord2f(☃ / 256.0F, (☃ + 15.98F) / 256.0F);
    GL11.glVertex3f(this.i - ☃, this.j + 7.99F, 0.0F);
    GL11.glTexCoord2f((☃ + ☃) / 256.0F, ☃ / 256.0F);
    GL11.glVertex3f(this.i + ☃ / 2.0F + ☃, this.j, 0.0F);
    GL11.glTexCoord2f((☃ + ☃) / 256.0F, (☃ + 15.98F) / 256.0F);
    GL11.glVertex3f(this.i + ☃ / 2.0F - ☃, this.j + 7.99F, 0.0F);
    GL11.glEnd();
    
    return (☃ - ☃) / 2.0F + 1.0F;
  }
  
  public int a(String ☃, float ☃, float ☃, int ☃)
  {
    return a(☃, ☃, ☃, ☃, true);
  }
  
  public int a(String ☃, int ☃, int ☃, int ☃)
  {
    return a(☃, ☃, ☃, ☃, false);
  }
  
  public int a(String ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    bfl.d();
    e();
    int ☃;
    if (☃)
    {
      int ☃ = b(☃, ☃ + 1.0F, ☃ + 1.0F, ☃, true);
      ☃ = Math.max(☃, b(☃, ☃, ☃, ☃, false));
    }
    else
    {
      ☃ = b(☃, ☃, ☃, ☃, false);
    }
    return ☃;
  }
  
  private String c(String ☃)
  {
    try
    {
      Bidi ☃ = new Bidi(new ArabicShaping(8).shape(☃), 127);
      ☃.setReorderingMode(0);
      return ☃.writeReordered(2);
    }
    catch (ArabicShapingException localArabicShapingException) {}
    return ☃;
  }
  
  private void e()
  {
    this.r = false;
    this.s = false;
    this.t = false;
    this.u = false;
    this.v = false;
  }
  
  private void a(String ☃, boolean ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length(); ☃++)
    {
      char ☃ = ☃.charAt(☃);
      if ((☃ == '§') && (☃ + 1 < ☃.length()))
      {
        int ☃ = "0123456789abcdefklmnor".indexOf(☃.toLowerCase(Locale.ENGLISH).charAt(☃ + 1));
        if (☃ < 16)
        {
          this.r = false;
          this.s = false;
          this.v = false;
          this.u = false;
          this.t = false;
          if ((☃ < 0) || (☃ > 15)) {
            ☃ = 15;
          }
          if (☃) {
            ☃ += 16;
          }
          int ☃ = this.f[☃];
          this.q = ☃;
          bfl.c((☃ >> 16) / 255.0F, (☃ >> 8 & 0xFF) / 255.0F, (☃ & 0xFF) / 255.0F, this.p);
        }
        else if (☃ == 16)
        {
          this.r = true;
        }
        else if (☃ == 17)
        {
          this.s = true;
        }
        else if (☃ == 18)
        {
          this.v = true;
        }
        else if (☃ == 19)
        {
          this.u = true;
        }
        else if (☃ == 20)
        {
          this.t = true;
        }
        else if (☃ == 21)
        {
          this.r = false;
          this.s = false;
          this.v = false;
          this.u = false;
          this.t = false;
          
          bfl.c(this.m, this.n, this.o, this.p);
        }
        ☃++;
      }
      else
      {
        int ☃ = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(☃);
        if ((this.r) && (☃ != -1))
        {
          int ☃ = a(☃);
          char ☃;
          do
          {
            ☃ = this.b.nextInt("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".length());
            ☃ = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".charAt(☃);
          } while (☃ != a(☃));
          ☃ = ☃;
        }
        float ☃ = this.k ? 0.5F : 1.0F;
        boolean ☃ = ((☃ == 0) || (☃ == -1) || (this.k)) && (☃);
        if (☃)
        {
          this.i -= ☃;
          this.j -= ☃;
        }
        float ☃ = a(☃, this.t);
        if (☃)
        {
          this.i += ☃;
          this.j += ☃;
        }
        if (this.s)
        {
          this.i += ☃;
          if (☃)
          {
            this.i -= ☃;
            this.j -= ☃;
          }
          a(☃, this.t);
          this.i -= ☃;
          if (☃)
          {
            this.i += ☃;
            this.j += ☃;
          }
          ☃ += 1.0F;
        }
        if (this.v)
        {
          bfx ☃ = bfx.a();
          bfd ☃ = ☃.c();
          bfl.x();
          ☃.a(7, bms.e);
          ☃.b(this.i, this.j + this.a / 2, 0.0D).d();
          ☃.b(this.i + ☃, this.j + this.a / 2, 0.0D).d();
          ☃.b(this.i + ☃, this.j + this.a / 2 - 1.0F, 0.0D).d();
          ☃.b(this.i, this.j + this.a / 2 - 1.0F, 0.0D).d();
          ☃.b();
          bfl.w();
        }
        if (this.u)
        {
          bfx ☃ = bfx.a();
          bfd ☃ = ☃.c();
          bfl.x();
          ☃.a(7, bms.e);
          int ☃ = this.u ? -1 : 0;
          ☃.b(this.i + ☃, this.j + this.a, 0.0D).d();
          ☃.b(this.i + ☃, this.j + this.a, 0.0D).d();
          ☃.b(this.i + ☃, this.j + this.a - 1.0F, 0.0D).d();
          ☃.b(this.i + ☃, this.j + this.a - 1.0F, 0.0D).d();
          ☃.b();
          bfl.w();
        }
        this.i += (int)☃;
      }
    }
  }
  
  private int a(String ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    if (this.l)
    {
      int ☃ = a(c(☃));
      ☃ = ☃ + ☃ - ☃;
    }
    return b(☃, ☃, ☃, ☃, ☃);
  }
  
  private int b(String ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    if (☃ == null) {
      return 0;
    }
    if (this.l) {
      ☃ = c(☃);
    }
    if ((☃ & 0xFC000000) == 0) {
      ☃ |= 0xFF000000;
    }
    if (☃) {
      ☃ = (☃ & 0xFCFCFC) >> 2 | ☃ & 0xFF000000;
    }
    this.m = ((☃ >> 16 & 0xFF) / 255.0F);
    this.n = ((☃ >> 8 & 0xFF) / 255.0F);
    this.o = ((☃ & 0xFF) / 255.0F);
    this.p = ((☃ >> 24 & 0xFF) / 255.0F);
    
    bfl.c(this.m, this.n, this.o, this.p);
    
    this.i = ☃;
    this.j = ☃;
    a(☃, ☃);
    
    return (int)this.i;
  }
  
  public int a(String ☃)
  {
    if (☃ == null) {
      return 0;
    }
    int ☃ = 0;
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < ☃.length(); ☃++)
    {
      char ☃ = ☃.charAt(☃);
      
      int ☃ = a(☃);
      if ((☃ < 0) && (☃ < ☃.length() - 1))
      {
        ☃ = ☃.charAt(++☃);
        if ((☃ == 'l') || (☃ == 'L')) {
          ☃ = true;
        } else if ((☃ == 'r') || (☃ == 'R')) {
          ☃ = false;
        }
        ☃ = 0;
      }
      ☃ += ☃;
      if ((☃) && (☃ > 0)) {
        ☃++;
      }
    }
    return ☃;
  }
  
  public int a(char ☃)
  {
    if (☃ == '§') {
      return -1;
    }
    if (☃ == ' ') {
      return 4;
    }
    int ☃ = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(☃);
    if ((☃ > 0) && (☃ != -1) && (!this.k)) {
      return this.d[☃];
    }
    if (this.e[☃] != 0)
    {
      int ☃ = this.e[☃] >>> 4;
      int ☃ = this.e[☃] & 0xF;
      if (☃ > 7)
      {
        ☃ = 15;
        ☃ = 0;
      }
      ☃++;
      
      return (☃ - ☃) / 2 + 1;
    }
    return 0;
  }
  
  public String a(String ☃, int ☃)
  {
    return a(☃, ☃, false);
  }
  
  public String a(String ☃, int ☃, boolean ☃)
  {
    StringBuilder ☃ = new StringBuilder();
    int ☃ = 0;
    int ☃ = ☃ ? ☃.length() - 1 : 0;
    int ☃ = ☃ ? -1 : 1;
    boolean ☃ = false;
    boolean ☃ = false;
    for (int ☃ = ☃; (☃ >= 0) && (☃ < ☃.length()) && (☃ < ☃); ☃ += ☃)
    {
      char ☃ = ☃.charAt(☃);
      int ☃ = a(☃);
      if (☃)
      {
        ☃ = false;
        if ((☃ == 'l') || (☃ == 'L')) {
          ☃ = true;
        } else if ((☃ == 'r') || (☃ == 'R')) {
          ☃ = false;
        }
      }
      else if (☃ < 0)
      {
        ☃ = true;
      }
      else
      {
        ☃ += ☃;
        if (☃) {
          ☃++;
        }
      }
      if (☃ > ☃) {
        break;
      }
      if (☃) {
        ☃.insert(0, ☃);
      } else {
        ☃.append(☃);
      }
    }
    return ☃.toString();
  }
  
  private String d(String ☃)
  {
    while ((☃ != null) && (☃.endsWith("\n"))) {
      ☃ = ☃.substring(0, ☃.length() - 1);
    }
    return ☃;
  }
  
  public void a(String ☃, int ☃, int ☃, int ☃, int ☃)
  {
    e();
    this.q = ☃;
    ☃ = d(☃);
    
    a(☃, ☃, ☃, ☃, false);
  }
  
  private void a(String ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    List<String> ☃ = c(☃, ☃);
    for (String ☃ : ☃)
    {
      a(☃, ☃, ☃, ☃, this.q, ☃);
      ☃ += this.a;
    }
  }
  
  public int b(String ☃, int ☃)
  {
    return this.a * c(☃, ☃).size();
  }
  
  public void a(boolean ☃)
  {
    this.k = ☃;
  }
  
  public boolean a()
  {
    return this.k;
  }
  
  public void b(boolean ☃)
  {
    this.l = ☃;
  }
  
  public List<String> c(String ☃, int ☃)
  {
    return Arrays.asList(d(☃, ☃).split("\n"));
  }
  
  String d(String ☃, int ☃)
  {
    int ☃ = e(☃, ☃);
    if (☃.length() <= ☃) {
      return ☃;
    }
    String ☃ = ☃.substring(0, ☃);
    
    char ☃ = ☃.charAt(☃);
    boolean ☃ = (☃ == ' ') || (☃ == '\n');
    String ☃ = b(☃) + ☃.substring(☃ + (☃ ? 1 : 0));
    
    return ☃ + "\n" + d(☃, ☃);
  }
  
  private int e(String ☃, int ☃)
  {
    int ☃ = ☃.length();
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = -1;
    boolean ☃ = false;
    for (; ☃ < ☃; ☃++)
    {
      char ☃ = ☃.charAt(☃);
      switch (☃)
      {
      case '§': 
        if (☃ < ☃ - 1)
        {
          char ☃ = ☃.charAt(++☃);
          if ((☃ == 'l') || (☃ == 'L')) {
            ☃ = true;
          } else if ((☃ == 'r') || (☃ == 'R') || (c(☃))) {
            ☃ = false;
          }
        }
        break;
      case '\n': 
        ☃--;
        break;
      case ' ': 
        ☃ = ☃;
      default: 
        ☃ += a(☃);
        if (☃) {
          ☃++;
        }
        break;
      }
      if (☃ == '\n')
      {
        ☃++;☃ = ☃;
      }
      else
      {
        if (☃ > ☃) {
          break;
        }
      }
    }
    if ((☃ != ☃) && (☃ != -1) && (☃ < ☃)) {
      return ☃;
    }
    return ☃;
  }
  
  private static boolean c(char ☃)
  {
    return ((☃ >= '0') && (☃ <= '9')) || ((☃ >= 'a') && (☃ <= 'f')) || ((☃ >= 'A') && (☃ <= 'F'));
  }
  
  private static boolean d(char ☃)
  {
    return ((☃ >= 'k') && (☃ <= 'o')) || ((☃ >= 'K') && (☃ <= 'O')) || (☃ == 'r') || (☃ == 'R');
  }
  
  public static String b(String ☃)
  {
    String ☃ = "";
    int ☃ = -1;
    int ☃ = ☃.length();
    while ((☃ = ☃.indexOf('§', ☃ + 1)) != -1) {
      if (☃ < ☃ - 1)
      {
        char ☃ = ☃.charAt(☃ + 1);
        if (c(☃)) {
          ☃ = "§" + ☃;
        } else if (d(☃)) {
          ☃ = ☃ + "§" + ☃;
        }
      }
    }
    return ☃;
  }
  
  public boolean b()
  {
    return this.l;
  }
  
  public int b(char ☃)
  {
    return this.f["0123456789abcdef".indexOf(☃)];
  }
}
