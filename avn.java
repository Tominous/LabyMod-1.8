import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class avn
  implements bnj
{
  private static final jy[] c = new jy['Ā'];
  private float[] d = new float['Ā'];
  public int a = 9;
  public Random b = new Random();
  private byte[] e = new byte[65536];
  private int[] f = new int[32];
  private jy g;
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
  private static final String __OBFID = "CL_00000660";
  public avh gameSettings;
  public jy locationFontTextureBase;
  public boolean enabled = true;
  public float scaleFactor = 1.0F;
  
  public avn(avh p_i1035_1_, jy p_i1035_2_, bmj p_i1035_3_, boolean p_i1035_4_)
  {
    this.gameSettings = p_i1035_1_;
    this.locationFontTextureBase = p_i1035_2_;
    
    this.g = p_i1035_2_;
    this.h = p_i1035_3_;
    this.k = p_i1035_4_;
    
    this.g = getHdFontLocation(this.locationFontTextureBase);
    
    bindTexture(this.g);
    for (int var5 = 0; var5 < 32; var5++)
    {
      int var6 = (var5 >> 3 & 0x1) * 85;
      int var7 = (var5 >> 2 & 0x1) * 170 + var6;
      int var8 = (var5 >> 1 & 0x1) * 170 + var6;
      int var9 = (var5 >> 0 & 0x1) * 170 + var6;
      if (var5 == 6) {
        var7 += 85;
      }
      if (p_i1035_1_.e)
      {
        int var10 = (var7 * 30 + var8 * 59 + var9 * 11) / 100;
        int var11 = (var7 * 30 + var8 * 70) / 100;
        int var12 = (var7 * 30 + var9 * 70) / 100;
        var7 = var10;
        var8 = var11;
        var9 = var12;
      }
      if (var5 >= 16)
      {
        var7 /= 4;
        var8 /= 4;
        var9 /= 4;
      }
      this.f[var5] = ((var7 & 0xFF) << 16 | (var8 & 0xFF) << 8 | var9 & 0xFF);
    }
    d();
  }
  
  public void a(bni resourceManager)
  {
    this.g = getHdFontLocation(this.locationFontTextureBase);
    for (int i = 0; i < c.length; i++) {
      c[i] = null;
    }
    c();
    
    d();
  }
  
  private void c()
  {
    BufferedImage bufferedimage;
    try
    {
      bufferedimage = bml.a(getResourceInputStream(this.g));
    }
    catch (IOException var17)
    {
      throw new RuntimeException(var17);
    }
    int imgWidth = bufferedimage.getWidth();
    int imgHeight = bufferedimage.getHeight();
    
    int charW = imgWidth / 16;
    int charH = imgHeight / 16;
    
    float kx = imgWidth / 128.0F;
    this.scaleFactor = kx;
    
    int[] ai = new int[imgWidth * imgHeight];
    bufferedimage.getRGB(0, 0, imgWidth, imgHeight, ai, 0, imgWidth);
    for (int k = 0; k < 256; k++)
    {
      int cx = k % 16;
      int cy = k / 16;
      int px = 0;
      for (px = charW - 1; px >= 0; px--)
      {
        int x = cx * charW + px;
        boolean flag = true;
        for (int py = 0; (py < charH) && (flag); py++)
        {
          int ypos = (cy * charH + py) * imgWidth;
          int col = ai[(x + ypos)];
          int al = col >> 24 & 0xFF;
          if (al > 16) {
            flag = false;
          }
        }
        if (!flag) {
          break;
        }
      }
      if (k == 65) {
        k = k;
      }
      if (k == 32) {
        if (charW <= 8) {
          px = (int)(2.0F * kx);
        } else {
          px = (int)(1.5F * kx);
        }
      }
      this.d[k] = ((px + 1) / kx + 1.0F);
    }
    readCustomCharWidths();
  }
  
  private void d()
  {
    InputStream var1 = null;
    try
    {
      var1 = getResourceInputStream(new jy("font/glyph_sizes.bin"));
      
      var1.read(this.e);
    }
    catch (IOException var6)
    {
      throw new RuntimeException(var6);
    }
    finally
    {
      IOUtils.closeQuietly(var1);
    }
  }
  
  private float a(char p_78278_2_, boolean p_78278_3_)
  {
    if (p_78278_2_ == ' ') {
      return this.d[p_78278_2_];
    }
    int var3 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(p_78278_2_);
    return (var3 != -1) && (!this.k) ? a(var3, p_78278_3_) : b(p_78278_2_, p_78278_3_);
  }
  
  private float a(int p_78266_1_, boolean p_78266_2_)
  {
    int var3 = p_78266_1_ % 16 * 8;
    int var4 = p_78266_1_ / 16 * 8;
    int var5 = p_78266_2_ ? 1 : 0;
    
    bindTexture(this.g);
    float var6 = this.d[p_78266_1_];
    
    float var7 = 7.99F;
    GL11.glBegin(5);
    GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
    GL11.glVertex3f(this.i + var5, this.j, 0.0F);
    GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
    GL11.glVertex3f(this.i - var5, this.j + 7.99F, 0.0F);
    GL11.glTexCoord2f((var3 + var7 - 1.0F) / 128.0F, var4 / 128.0F);
    GL11.glVertex3f(this.i + var7 - 1.0F + var5, this.j, 0.0F);
    GL11.glTexCoord2f((var3 + var7 - 1.0F) / 128.0F, (var4 + 7.99F) / 128.0F);
    GL11.glVertex3f(this.i + var7 - 1.0F - var5, this.j + 7.99F, 0.0F);
    GL11.glEnd();
    return var6;
  }
  
  private jy a(int p_111271_1_)
  {
    if (c[p_111271_1_] == null)
    {
      c[p_111271_1_] = new jy(String.format("textures/font/unicode_page_%02x.png", new Object[] { Integer.valueOf(p_111271_1_) }));
      
      c[p_111271_1_] = getHdFontLocation(c[p_111271_1_]);
    }
    return c[p_111271_1_];
  }
  
  private void b(int p_78257_1_)
  {
    bindTexture(a(p_78257_1_));
  }
  
  private float b(char p_78277_1_, boolean p_78277_2_)
  {
    if (this.e[p_78277_1_] == 0) {
      return 0.0F;
    }
    int var3 = p_78277_1_ / 'Ā';
    b(var3);
    int var4 = this.e[p_78277_1_] >>> 4;
    int var5 = this.e[p_78277_1_] & 0xF;
    
    var4 &= 0xF;
    
    float var6 = var4;
    float var7 = var5 + 1;
    float var8 = p_78277_1_ % '\020' * 16 + var6;
    float var9 = (p_78277_1_ & 0xFF) / '\020' * 16;
    float var10 = var7 - var6 - 0.02F;
    float var11 = p_78277_2_ ? 1.0F : 0.0F;
    GL11.glBegin(5);
    GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
    GL11.glVertex3f(this.i + var11, this.j, 0.0F);
    GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
    GL11.glVertex3f(this.i - var11, this.j + 7.99F, 0.0F);
    GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
    GL11.glVertex3f(this.i + var10 / 2.0F + var11, this.j, 0.0F);
    GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
    GL11.glVertex3f(this.i + var10 / 2.0F - var11, this.j + 7.99F, 0.0F);
    GL11.glEnd();
    return (var7 - var6) / 2.0F + 1.0F;
  }
  
  public int a(String p_175063_1_, float p_175063_2_, float p_175063_3_, int p_175063_4_)
  {
    return a(p_175063_1_, p_175063_2_, p_175063_3_, p_175063_4_, true);
  }
  
  public int a(String text, int x, int y, int color)
  {
    if (!this.enabled) {
      return 0;
    }
    return a(text, x, y, color, false);
  }
  
  public int a(String p_175065_1_, float p_175065_2_, float p_175065_3_, int p_175065_4_, boolean p_175065_5_)
  {
    enableAlpha();
    
    e();
    int var6;
    if (p_175065_5_)
    {
      int var6 = b(p_175065_1_, p_175065_2_ + 1.0F, p_175065_3_ + 1.0F, p_175065_4_, true);
      var6 = Math.max(var6, b(p_175065_1_, p_175065_2_, p_175065_3_, p_175065_4_, false));
    }
    else
    {
      var6 = b(p_175065_1_, p_175065_2_, p_175065_3_, p_175065_4_, false);
    }
    return var6;
  }
  
  private String c(String p_147647_1_)
  {
    try
    {
      Bidi var2 = new Bidi(new ArabicShaping(8).shape(p_147647_1_), 127);
      var2.setReorderingMode(0);
      return var2.writeReordered(2);
    }
    catch (ArabicShapingException var3) {}
    return p_147647_1_;
  }
  
  private void e()
  {
    this.r = false;
    this.s = false;
    this.t = false;
    this.u = false;
    this.v = false;
  }
  
  private void a(String p_78255_1_, boolean p_78255_2_)
  {
    for (int var3 = 0; var3 < p_78255_1_.length(); var3++)
    {
      char var4 = p_78255_1_.charAt(var3);
      if ((var4 == '§') && (var3 + 1 < p_78255_1_.length()))
      {
        int var5 = "0123456789abcdefklmnor".indexOf(p_78255_1_.toLowerCase().charAt(var3 + 1));
        if (var5 < 16)
        {
          this.r = false;
          this.s = false;
          this.v = false;
          this.u = false;
          this.t = false;
          if ((var5 < 0) || (var5 > 15)) {
            var5 = 15;
          }
          if (p_78255_2_) {
            var5 += 16;
          }
          int var6 = this.f[var5];
          if (Config.isCustomColors()) {
            var6 = CustomColorizer.getTextColor(var5, var6);
          }
          this.q = var6;
          
          setColor((var6 >> 16) / 255.0F, (var6 >> 8 & 0xFF) / 255.0F, (var6 & 0xFF) / 255.0F, this.p);
        }
        else if (var5 == 16)
        {
          this.r = true;
        }
        else if (var5 == 17)
        {
          this.s = true;
        }
        else if (var5 == 18)
        {
          this.v = true;
        }
        else if (var5 == 19)
        {
          this.u = true;
        }
        else if (var5 == 20)
        {
          this.t = true;
        }
        else if (var5 == 21)
        {
          this.r = false;
          this.s = false;
          this.v = false;
          this.u = false;
          this.t = false;
          
          setColor(this.m, this.n, this.o, this.p);
        }
        var3++;
      }
      else
      {
        int var5 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(var4);
        if ((this.r) && (var5 != -1))
        {
          int var6 = a(var4);
          char var7;
          do
          {
            var5 = this.b.nextInt("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".length());
            var7 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".charAt(var5);
          } while (var6 != a(var7));
          var4 = var7;
        }
        float var12 = this.k ? 0.5F : 1.0F / this.scaleFactor;
        boolean var13 = ((var4 == 0) || (var5 == -1) || (this.k)) && (p_78255_2_);
        if (var13)
        {
          this.i -= var12;
          this.j -= var12;
        }
        float var8 = a(var4, this.t);
        if (var13)
        {
          this.i += var12;
          this.j += var12;
        }
        if (this.s)
        {
          this.i += var12;
          if (var13)
          {
            this.i -= var12;
            this.j -= var12;
          }
          a(var4, this.t);
          this.i -= var12;
          if (var13)
          {
            this.i += var12;
            this.j += var12;
          }
          var8 += var12;
        }
        if (this.v)
        {
          bfx var9 = bfx.a();
          bfd var10 = var9.c();
          bfl.x();
          var10.a(7, bms.e);
          var10.b(this.i, this.j + this.a / 2, 0.0D).d();
          var10.b(this.i + var8, this.j + this.a / 2, 0.0D).d();
          var10.b(this.i + var8, this.j + this.a / 2 - 1.0F, 0.0D).d();
          var10.b(this.i, this.j + this.a / 2 - 1.0F, 0.0D).d();
          var9.b();
          bfl.w();
        }
        if (this.u)
        {
          bfx var9 = bfx.a();
          bfd var10 = var9.c();
          bfl.x();
          var10.a(7, bms.e);
          int var11 = this.u ? -1 : 0;
          var10.b(this.i + var11, this.j + this.a, 0.0D).d();
          var10.b(this.i + var8, this.j + this.a, 0.0D).d();
          var10.b(this.i + var8, this.j + this.a - 1.0F, 0.0D).d();
          var10.b(this.i + var11, this.j + this.a - 1.0F, 0.0D).d();
          var9.b();
          bfl.w();
        }
        this.i += var8;
      }
    }
  }
  
  private int a(String p_78274_1_, int p_78274_2_, int p_78274_3_, int p_78274_4_, int p_78274_5_, boolean p_78274_6_)
  {
    if (this.l)
    {
      int var7 = a(c(p_78274_1_));
      p_78274_2_ = p_78274_2_ + p_78274_4_ - var7;
    }
    return b(p_78274_1_, p_78274_2_, p_78274_3_, p_78274_5_, p_78274_6_);
  }
  
  private int b(String p_180455_1_, float p_180455_2_, float p_180455_3_, int p_180455_4_, boolean p_180455_5_)
  {
    if (p_180455_1_ == null) {
      return 0;
    }
    if (this.l) {
      p_180455_1_ = c(p_180455_1_);
    }
    if ((p_180455_4_ & 0xFC000000) == 0) {
      p_180455_4_ |= 0xFF000000;
    }
    if (p_180455_5_) {
      p_180455_4_ = (p_180455_4_ & 0xFCFCFC) >> 2 | p_180455_4_ & 0xFF000000;
    }
    this.m = ((p_180455_4_ >> 16 & 0xFF) / 255.0F);
    this.n = ((p_180455_4_ >> 8 & 0xFF) / 255.0F);
    this.o = ((p_180455_4_ & 0xFF) / 255.0F);
    this.p = ((p_180455_4_ >> 24 & 0xFF) / 255.0F);
    
    setColor(this.m, this.n, this.o, this.p);
    this.i = p_180455_2_;
    this.j = p_180455_3_;
    a(p_180455_1_, p_180455_5_);
    return (int)this.i;
  }
  
  public int a(String p_78256_1_)
  {
    if (p_78256_1_ == null) {
      return 0;
    }
    float var2 = 0.0F;
    boolean var3 = false;
    for (int var4 = 0; var4 < p_78256_1_.length(); var4++)
    {
      char var5 = p_78256_1_.charAt(var4);
      
      float var6 = getCharWidthFloat(var5);
      if ((var6 < 0.0F) && (var4 < p_78256_1_.length() - 1))
      {
        var4++;
        var5 = p_78256_1_.charAt(var4);
        if ((var5 != 'l') && (var5 != 'L'))
        {
          if ((var5 == 'r') || (var5 == 'R')) {
            var3 = false;
          }
        }
        else {
          var3 = true;
        }
        var6 = 0.0F;
      }
      var2 += var6;
      if ((var3) && (var6 > 0.0F)) {
        var2 += 1.0F;
      }
    }
    return (int)var2;
  }
  
  public int a(char par1)
  {
    return Math.round(getCharWidthFloat(par1));
  }
  
  private float getCharWidthFloat(char p_78263_1_)
  {
    if (p_78263_1_ == '§') {
      return -1.0F;
    }
    if (p_78263_1_ == ' ') {
      return this.d[32];
    }
    int var2 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\000\000\000\000\000\000\000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\000".indexOf(p_78263_1_);
    if ((p_78263_1_ > 0) && (var2 != -1) && (!this.k)) {
      return this.d[var2];
    }
    if (this.e[p_78263_1_] != 0)
    {
      int var3 = this.e[p_78263_1_] >>> 4;
      int var4 = this.e[p_78263_1_] & 0xF;
      
      var3 &= 0xF;
      
      var4++;
      return (var4 - var3) / 2 + 1;
    }
    return 0.0F;
  }
  
  public String a(String p_78269_1_, int p_78269_2_)
  {
    return a(p_78269_1_, p_78269_2_, false);
  }
  
  public String a(String p_78262_1_, int p_78262_2_, boolean p_78262_3_)
  {
    StringBuilder var4 = new StringBuilder();
    
    float var5 = 0.0F;
    int var6 = p_78262_3_ ? p_78262_1_.length() - 1 : 0;
    int var7 = p_78262_3_ ? -1 : 1;
    boolean var8 = false;
    boolean var9 = false;
    for (int var10 = var6; (var10 >= 0) && (var10 < p_78262_1_.length()) && (var5 < p_78262_2_); var10 += var7)
    {
      char var11 = p_78262_1_.charAt(var10);
      
      float var12 = getCharWidthFloat(var11);
      if (var8)
      {
        var8 = false;
        if ((var11 != 'l') && (var11 != 'L'))
        {
          if ((var11 == 'r') || (var11 == 'R')) {
            var9 = false;
          }
        }
        else {
          var9 = true;
        }
      }
      else if (var12 < 0.0F)
      {
        var8 = true;
      }
      else
      {
        var5 += var12;
        if (var9) {
          var5 += 1.0F;
        }
      }
      if (var5 > p_78262_2_) {
        break;
      }
      if (p_78262_3_) {
        var4.insert(0, var11);
      } else {
        var4.append(var11);
      }
    }
    return var4.toString();
  }
  
  private String d(String p_78273_1_)
  {
    while ((p_78273_1_ != null) && (p_78273_1_.endsWith("\n"))) {
      p_78273_1_ = p_78273_1_.substring(0, p_78273_1_.length() - 1);
    }
    return p_78273_1_;
  }
  
  public void a(String str, int x, int y, int wrapWidth, int textColor)
  {
    e();
    this.q = textColor;
    str = d(str);
    a(str, x, y, wrapWidth, false);
  }
  
  private void a(String str, int x, int y, int wrapWidth, boolean addShadow)
  {
    List var6 = c(str, wrapWidth);
    for (Iterator var7 = var6.iterator(); var7.hasNext(); y += this.a)
    {
      String var8 = (String)var7.next();
      a(var8, x, y, wrapWidth, this.q, addShadow);
    }
  }
  
  public int b(String p_78267_1_, int p_78267_2_)
  {
    return this.a * c(p_78267_1_, p_78267_2_).size();
  }
  
  public void a(boolean p_78264_1_)
  {
    this.k = p_78264_1_;
  }
  
  public boolean a()
  {
    return this.k;
  }
  
  public void b(boolean p_78275_1_)
  {
    this.l = p_78275_1_;
  }
  
  public List c(String str, int wrapWidth)
  {
    return Arrays.asList(d(str, wrapWidth).split("\n"));
  }
  
  String d(String str, int wrapWidth)
  {
    int var3 = e(str, wrapWidth);
    if (str.length() <= var3) {
      return str;
    }
    String var4 = str.substring(0, var3);
    char var5 = str.charAt(var3);
    boolean var6 = (var5 == ' ') || (var5 == '\n');
    String var7 = b(var4) + str.substring(var3 + (var6 ? 1 : 0));
    return var4 + "\n" + d(var7, wrapWidth);
  }
  
  private int e(String str, int wrapWidth)
  {
    int var3 = str.length();
    
    float var4 = 0.0F;
    int var5 = 0;
    int var6 = -1;
    for (boolean var7 = false; var5 < var3; var5++)
    {
      char var8 = str.charAt(var5);
      switch (var8)
      {
      case '\n': 
        var5--;
        break;
      case '§': 
        if (var5 < var3 - 1)
        {
          var5++;
          char var9 = str.charAt(var5);
          if ((var9 != 'l') && (var9 != 'L'))
          {
            if ((var9 == 'r') || (var9 == 'R') || (c(var9))) {
              var7 = false;
            }
          }
          else {
            var7 = true;
          }
        }
        break;
      case ' ': 
        var6 = var5;
      default: 
        var4 += getCharWidthFloat(var8);
        if (var7) {
          var4 += 1.0F;
        }
        break;
      }
      if (var8 == '\n')
      {
        var5++;
        var6 = var5;
      }
      else
      {
        if (var4 > wrapWidth) {
          break;
        }
      }
    }
    return (var5 != var3) && (var6 != -1) && (var6 < var5) ? var6 : var5;
  }
  
  private static boolean c(char colorChar)
  {
    return ((colorChar >= '0') && (colorChar <= '9')) || ((colorChar >= 'a') && (colorChar <= 'f')) || ((colorChar >= 'A') && (colorChar <= 'F'));
  }
  
  private static boolean d(char formatChar)
  {
    return ((formatChar >= 'k') && (formatChar <= 'o')) || ((formatChar >= 'K') && (formatChar <= 'O')) || (formatChar == 'r') || (formatChar == 'R');
  }
  
  public static String b(String p_78282_0_)
  {
    String var1 = "";
    int var2 = -1;
    int var3 = p_78282_0_.length();
    while ((var2 = p_78282_0_.indexOf('§', var2 + 1)) != -1) {
      if (var2 < var3 - 1)
      {
        char var4 = p_78282_0_.charAt(var2 + 1);
        if (c(var4)) {
          var1 = "§" + var4;
        } else if (d(var4)) {
          var1 = var1 + "§" + var4;
        }
      }
    }
    return var1;
  }
  
  public boolean b()
  {
    return this.l;
  }
  
  public int b(char p_175064_1_)
  {
    int index = "0123456789abcdef".indexOf(p_175064_1_);
    if ((index < 0) || (index >= this.f.length)) {
      return 16777215;
    }
    int color = this.f[index];
    if (Config.isCustomColors()) {
      color = CustomColorizer.getTextColor(index, color);
    }
    return color;
  }
  
  protected void setColor(float r, float g, float b, float a)
  {
    bfl.c(r, g, b, a);
  }
  
  protected void enableAlpha() {}
  
  protected void bindTexture(jy location)
  {
    this.h.a(location);
  }
  
  protected InputStream getResourceInputStream(jy location)
    throws IOException
  {
    return ave.A().Q().a(location).b();
  }
  
  private void readCustomCharWidths()
  {
    String fontFileName = this.g.a();
    
    String suffix = ".png";
    if (!fontFileName.endsWith(suffix)) {
      return;
    }
    String fileName = fontFileName.substring(0, fontFileName.length() - suffix.length()) + ".properties";
    try
    {
      jy locProp = new jy(this.g.b(), fileName);
      InputStream in = Config.getResourceStream(Config.getResourceManager(), locProp);
      if (in == null) {
        return;
      }
      Config.log("Loading " + fileName);
      props = new Properties();
      props.load(in);
      Set keySet = props.keySet();
      for (iter = keySet.iterator(); iter.hasNext();)
      {
        String key = (String)iter.next();
        
        String prefix = "width.";
        if (key.startsWith(prefix))
        {
          String numStr = key.substring(prefix.length());
          int num = Config.parseInt(numStr, -1);
          if ((num >= 0) && (num < this.d.length))
          {
            String value = props.getProperty(key);
            float width = Config.parseFloat(value, -1.0F);
            if (width >= 0.0F) {
              this.d[num] = width;
            }
          }
        }
      }
    }
    catch (FileNotFoundException e) {}catch (IOException e)
    {
      Properties props;
      Iterator iter;
      e.printStackTrace();
    }
  }
  
  private static jy getHdFontLocation(jy fontLoc)
  {
    if (!Config.isCustomFonts()) {
      return fontLoc;
    }
    if (fontLoc == null) {
      return fontLoc;
    }
    String fontName = fontLoc.a();
    String texturesStr = "textures/";
    String mcpatcherStr = "mcpatcher/";
    if (!fontName.startsWith(texturesStr)) {
      return fontLoc;
    }
    fontName = fontName.substring(texturesStr.length());
    fontName = mcpatcherStr + fontName;
    
    jy fontLocHD = new jy(fontLoc.b(), fontName);
    if (Config.hasResource(Config.getResourceManager(), fontLocHD)) {
      return fontLocHD;
    }
    return fontLoc;
  }
}
