import com.mojang.authlib.GameProfile;
import de.labystudio.capes.CapeManager;
import de.labystudio.capes.MineconRenderer;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Debug;
import java.io.File;

public abstract class bet
  extends wn
{
  private bdc a;
  private String nameClear = null;
  private jy locationCape;
  private MineconRenderer mineconParticleRender;
  
  public bet(adm worldIn, GameProfile playerProfile)
  {
    super(worldIn, playerProfile);
    
    this.locationCape = null;
    this.nameClear = playerProfile.getName();
    if ((this.nameClear != null) && (!this.nameClear.isEmpty())) {
      this.nameClear = nx.a(this.nameClear);
    }
    LabyMod.getInstance().getCapeManager().downloadCape(this, false, false);
    if (ConfigManager.settings.mineconParticle) {
      this.mineconParticleRender = new MineconRenderer();
    }
  }
  
  public boolean v()
  {
    bdc networkplayerinfo = ave.A().u().a(cd().getId());
    return (networkplayerinfo != null) && (networkplayerinfo.b() == adp.a.e);
  }
  
  public boolean a()
  {
    return b() != null;
  }
  
  protected bdc b()
  {
    if (this.a == null) {
      this.a = ave.A().u().a(aK());
    }
    return this.a;
  }
  
  public boolean g()
  {
    bdc networkplayerinfo = b();
    return (networkplayerinfo != null) && (networkplayerinfo.e());
  }
  
  public jy i()
  {
    bdc networkplayerinfo = b();
    return networkplayerinfo == null ? bmz.a(aK()) : networkplayerinfo.g();
  }
  
  public jy k()
  {
    bdc networkplayerinfo = b();
    jy original = networkplayerinfo == null ? null : networkplayerinfo.h();
    if ((ConfigManager.settings.capes) && (this.locationCape != null)) {
      return this.locationCape;
    }
    if ((original != null) && (this.mineconParticleRender != null) && (ConfigManager.settings.mineconParticle)) {
      this.mineconParticleRender.render(this);
    }
    return original;
  }
  
  public static bma a(jy resourceLocationIn, String username)
  {
    bmj texturemanager = ave.A().P();
    bmk itextureobject = texturemanager.b(resourceLocationIn);
    if (itextureobject == null)
    {
      itextureobject = new bma((File)null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[] {nx.a(username) }), bmz.a(b(username)), new bfs());
      texturemanager.a(resourceLocationIn, itextureobject);
    }
    return (bma)itextureobject;
  }
  
  public static jy c(String username)
  {
    return new jy("skins/" + nx.a(username));
  }
  
  public String l()
  {
    bdc networkplayerinfo = b();
    return networkplayerinfo == null ? bmz.b(aK()) : networkplayerinfo.f();
  }
  
  public float o()
  {
    float f = 1.0F;
    if (this.bA.b) {
      f *= 1.1F;
    }
    qc iattributeinstance = a(vy.d);
    if ((ConfigManager.settings.speedFOV) && (Allowed.unfairExtra()))
    {
      f = (float)(f * ((iattributeinstance.e() / this.bA.b() + 1.0D) / 2.0D));
    }
    else
    {
      double speed = 0.10000000149011612D;
      if (aw()) {
        speed = 0.13000000312924387D;
      }
      f = (float)(f * ((speed / this.bA.b() + 1.0D) / 2.0D));
    }
    if ((this.bA.b() == 0.0F) || (Float.isNaN(f)) || (Float.isInfinite(f))) {
      f = 1.0F;
    }
    if ((bS()) && (bQ().b() == zy.f))
    {
      int i = bT();
      float f1 = i / 20.0F;
      if (f1 > 1.0F) {
        f1 = 1.0F;
      } else {
        f1 *= f1;
      }
      f *= (1.0F - f1 * 0.15F);
    }
    return f;
  }
  
  public String getNameClear()
  {
    return this.nameClear;
  }
  
  public void setLocationOfCape(jy locationOfCape, boolean optifine)
  {
    this.locationCape = locationOfCape;
    Debug.debug("[LabyMod] Loaded " + (optifine ? "Optifine" : "LabyMod") + " cape of " + getNameClear());
  }
}
