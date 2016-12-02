package net.labymod.spm;

import bpg;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oj;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wn.b;
import wo;

public class SPMSettings
{
  private static final Logger logger = ;
  private static final Gson gson = new Gson();
  private static final ParameterizedType typeListString = new ParameterizedType()
  {
    public Type[] getActualTypeArguments()
    {
      return new Type[] { String.class };
    }
    
    public Type getRawType()
    {
      return List.class;
    }
    
    public Type getOwnerType()
    {
      return null;
    }
  };
  public float mouseSensitivity = 0.5F;
  public boolean invertMouse;
  public int renderDistanceChunks = -1;
  public boolean viewBobbing = true;
  public boolean anaglyph;
  public boolean fboEnable = true;
  public int limitFramerate = 120;
  public int clouds = 2;
  public boolean fancyGraphics = true;
  public int ambientOcclusion = 2;
  public List<String> resourcePacks = Lists.newArrayList();
  public List<String> field_183018_l = Lists.newArrayList();
  public wn.b chatVisibility = wn.b.a;
  public boolean chatColours = true;
  public boolean chatLinks = true;
  public boolean chatLinksPrompt = true;
  public float chatOpacity = 1.0F;
  public boolean snooperEnabled = true;
  public boolean fullScreen;
  public boolean enableVsync = true;
  public boolean useVbo = false;
  public boolean allowBlockAlternatives = true;
  public boolean reducedDebugInfo = false;
  public boolean hideServerAddress;
  public boolean advancedItemTooltips;
  public boolean pauseOnLostFocus = true;
  private final Set<wo> setModelParts = Sets.newHashSet(wo.values());
  public boolean touchscreen;
  public int overrideWidth;
  public int overrideHeight;
  public boolean heldItemTooltips = true;
  public float chatScale = 1.0F;
  public float chatWidth = 1.0F;
  public float chatHeightUnfocused = 0.44366196F;
  public float chatHeightFocused = 1.0F;
  public boolean showInventoryAchievementHint = true;
  public int mipmapLevels = 4;
  private Map<bpg, Float> mapSoundLevels = Maps.newEnumMap(bpg.class);
  public float streamBytesPerPixel = 0.5F;
  public float streamMicVolume = 1.0F;
  public float streamGameVolume = 1.0F;
  public float streamKbps = 0.5412844F;
  public float streamFps = 0.31690142F;
  public int streamCompression = 1;
  public boolean streamSendMetadata = true;
  public String streamPreferredServer = "";
  public int streamChatEnabled = 0;
  public int streamChatUserFilter = 0;
  public int streamMicToggleBehavior = 0;
  public boolean field_181150_U = true;
  public boolean field_181151_V = true;
  public SPMBinding keyBindForward = new SPMBinding("key.forward", 17, "key.categories.movement");
  public SPMBinding keyBindLeft = new SPMBinding("key.left", 30, "key.categories.movement");
  public SPMBinding keyBindBack = new SPMBinding("key.back", 31, "key.categories.movement");
  public SPMBinding keyBindRight = new SPMBinding("key.right", 32, "key.categories.movement");
  public SPMBinding keyBindJump = new SPMBinding("key.jump", 57, "key.categories.movement");
  public SPMBinding keyBindSneak = new SPMBinding("key.sneak", 42, "key.categories.movement");
  public SPMBinding keyBindSprint = new SPMBinding("key.sprint", 29, "key.categories.movement");
  public SPMBinding keyBindInventory = new SPMBinding("key.inventory", 18, "key.categories.inventory");
  public SPMBinding keyBindUseItem = new SPMBinding("key.use", -99, "key.categories.gameplay");
  public SPMBinding keyBindDrop = new SPMBinding("key.drop", 16, "key.categories.gameplay");
  public SPMBinding keyBindAttack = new SPMBinding("key.attack", -100, "key.categories.gameplay");
  public SPMBinding keyBindPickBlock = new SPMBinding("key.pickItem", -98, "key.categories.gameplay");
  public SPMBinding keyBindChat = new SPMBinding("key.chat", 20, "key.categories.multiplayer");
  public SPMBinding keyBindPlayerList = new SPMBinding("key.playerlist", 15, "key.categories.multiplayer");
  public SPMBinding keyBindCommand = new SPMBinding("key.command", 53, "key.categories.multiplayer");
  public SPMBinding keyBindScreenshot = new SPMBinding("key.screenshot", 60, "key.categories.misc");
  public SPMBinding keyBindTogglePerspective = new SPMBinding("key.togglePerspective", 63, "key.categories.misc");
  public SPMBinding keyBindSmoothCamera = new SPMBinding("key.smoothCamera", 0, "key.categories.misc");
  public SPMBinding keyBindFullscreen = new SPMBinding("key.fullscreen", 87, "key.categories.misc");
  public SPMBinding keyBindSpectatorOutlines = new SPMBinding("key.spectatorOutlines", 0, "key.categories.misc");
  public SPMBinding keyBindStreamStartStop = new SPMBinding("key.streamStartStop", 64, "key.categories.stream");
  public SPMBinding keyBindStreamPauseUnpause = new SPMBinding("key.streamPauseUnpause", 65, "key.categories.stream");
  public SPMBinding keyBindStreamCommercials = new SPMBinding("key.streamCommercial", 0, "key.categories.stream");
  public SPMBinding keyBindStreamToggleMic = new SPMBinding("key.streamToggleMic", 0, "key.categories.stream");
  public SPMBinding[] keyBindsHotbar = { new SPMBinding("key.hotbar.1", 2, "key.categories.inventory"), new SPMBinding("key.hotbar.2", 3, "key.categories.inventory"), new SPMBinding("key.hotbar.3", 4, "key.categories.inventory"), new SPMBinding("key.hotbar.4", 5, "key.categories.inventory"), new SPMBinding("key.hotbar.5", 6, "key.categories.inventory"), new SPMBinding("key.hotbar.6", 7, "key.categories.inventory"), new SPMBinding("key.hotbar.7", 8, "key.categories.inventory"), new SPMBinding("key.hotbar.8", 9, "key.categories.inventory"), new SPMBinding("key.hotbar.9", 10, "key.categories.inventory") };
  public SPMBinding[] keyBindings;
  private File optionsFile;
  public oj difficulty;
  public boolean hideGUI;
  public int thirdPersonView;
  public boolean showDebugInfo;
  public boolean showDebugProfilerChart;
  public boolean field_181657_aC;
  public String lastServer;
  public boolean smoothCamera;
  public boolean debugCamEnable;
  public float fovSetting;
  public float gammaSetting;
  public float saturation;
  public int guiScale;
  public int particleSetting;
  public String language;
  public boolean forceUnicodeFont;
  
  public SPMSettings(File file)
  {
    keyBindings = ((SPMBinding[])ArrayUtils.addAll(new SPMBinding[] { keyBindAttack, keyBindUseItem, keyBindForward, keyBindLeft, keyBindBack, keyBindRight, keyBindJump, keyBindSneak, keyBindSprint, keyBindDrop, keyBindInventory, keyBindChat, keyBindPlayerList, keyBindPickBlock, keyBindCommand, keyBindScreenshot, keyBindTogglePerspective, keyBindSmoothCamera, keyBindStreamStartStop, keyBindStreamPauseUnpause, keyBindStreamCommercials, keyBindStreamToggleMic, keyBindFullscreen, keyBindSpectatorOutlines }, keyBindsHotbar));
    difficulty = oj.c;
    lastServer = "";
    fovSetting = 70.0F;
    language = "en_US";
    forceUnicodeFont = false;
    optionsFile = file;
    renderDistanceChunks = 8;
    loadOptions();
  }
  
  public void loadOptions()
  {
    try
    {
      if (!optionsFile.exists()) {
        return;
      }
      BufferedReader bufferedreader = new BufferedReader(new FileReader(optionsFile));
      String s = "";
      mapSoundLevels.clear();
      while ((s = bufferedreader.readLine()) != null) {
        try
        {
          String[] astring = s.split(":");
          if (astring[0].equals("mouseSensitivity")) {
            mouseSensitivity = parseFloat(astring[1]);
          }
          if (astring[0].equals("fov")) {
            fovSetting = (parseFloat(astring[1]) * 40.0F + 70.0F);
          }
          if (astring[0].equals("gamma")) {
            gammaSetting = parseFloat(astring[1]);
          }
          if (astring[0].equals("saturation")) {
            saturation = parseFloat(astring[1]);
          }
          if (astring[0].equals("invertYMouse")) {
            invertMouse = astring[1].equals("true");
          }
          if (astring[0].equals("renderDistance")) {
            renderDistanceChunks = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("guiScale")) {
            guiScale = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("particles")) {
            particleSetting = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("bobView")) {
            viewBobbing = astring[1].equals("true");
          }
          if (astring[0].equals("anaglyph3d")) {
            anaglyph = astring[1].equals("true");
          }
          if (astring[0].equals("maxFps")) {
            limitFramerate = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("fboEnable")) {
            fboEnable = astring[1].equals("true");
          }
          if (astring[0].equals("difficulty")) {
            difficulty = oj.a(Integer.parseInt(astring[1]));
          }
          if (astring[0].equals("fancyGraphics")) {
            fancyGraphics = astring[1].equals("true");
          }
          if (astring[0].equals("ao")) {
            if (astring[1].equals("true")) {
              ambientOcclusion = 2;
            } else if (astring[1].equals("false")) {
              ambientOcclusion = 0;
            } else {
              ambientOcclusion = Integer.parseInt(astring[1]);
            }
          }
          if (astring[0].equals("renderClouds")) {
            if (astring[1].equals("true")) {
              clouds = 2;
            } else if (astring[1].equals("false")) {
              clouds = 0;
            } else if (astring[1].equals("fast")) {
              clouds = 1;
            }
          }
          if (astring[0].equals("resourcePacks"))
          {
            resourcePacks = ((List)gson.fromJson(s.substring(s.indexOf(':') + 1), typeListString));
            if (resourcePacks == null) {
              resourcePacks = Lists.newArrayList();
            }
          }
          if (astring[0].equals("incompatibleResourcePacks"))
          {
            field_183018_l = ((List)gson.fromJson(s.substring(s.indexOf(':') + 1), typeListString));
            if (field_183018_l == null) {
              field_183018_l = Lists.newArrayList();
            }
          }
          if ((astring[0].equals("lastServer")) && (astring.length >= 2)) {
            lastServer = s.substring(s.indexOf(':') + 1);
          }
          if ((astring[0].equals("lang")) && (astring.length >= 2)) {
            language = astring[1];
          }
          if (astring[0].equals("chatVisibility")) {
            chatVisibility = wn.b.a(Integer.parseInt(astring[1]));
          }
          if (astring[0].equals("chatColors")) {
            chatColours = astring[1].equals("true");
          }
          if (astring[0].equals("chatLinks")) {
            chatLinks = astring[1].equals("true");
          }
          if (astring[0].equals("chatLinksPrompt")) {
            chatLinksPrompt = astring[1].equals("true");
          }
          if (astring[0].equals("chatOpacity")) {
            chatOpacity = parseFloat(astring[1]);
          }
          if (astring[0].equals("snooperEnabled")) {
            snooperEnabled = astring[1].equals("true");
          }
          if (astring[0].equals("fullscreen")) {
            fullScreen = astring[1].equals("true");
          }
          if (astring[0].equals("enableVsync")) {
            enableVsync = astring[1].equals("true");
          }
          if (astring[0].equals("useVbo")) {
            useVbo = astring[1].equals("true");
          }
          if (astring[0].equals("hideServerAddress")) {
            hideServerAddress = astring[1].equals("true");
          }
          if (astring[0].equals("advancedItemTooltips")) {
            advancedItemTooltips = astring[1].equals("true");
          }
          if (astring[0].equals("pauseOnLostFocus")) {
            pauseOnLostFocus = astring[1].equals("true");
          }
          if (astring[0].equals("touchscreen")) {
            touchscreen = astring[1].equals("true");
          }
          if (astring[0].equals("overrideHeight")) {
            overrideHeight = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("overrideWidth")) {
            overrideWidth = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("heldItemTooltips")) {
            heldItemTooltips = astring[1].equals("true");
          }
          if (astring[0].equals("chatHeightFocused")) {
            chatHeightFocused = parseFloat(astring[1]);
          }
          if (astring[0].equals("chatHeightUnfocused")) {
            chatHeightUnfocused = parseFloat(astring[1]);
          }
          if (astring[0].equals("chatScale")) {
            chatScale = parseFloat(astring[1]);
          }
          if (astring[0].equals("chatWidth")) {
            chatWidth = parseFloat(astring[1]);
          }
          if (astring[0].equals("showInventoryAchievementHint")) {
            showInventoryAchievementHint = astring[1].equals("true");
          }
          if (astring[0].equals("mipmapLevels")) {
            mipmapLevels = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("streamBytesPerPixel")) {
            streamBytesPerPixel = parseFloat(astring[1]);
          }
          if (astring[0].equals("streamMicVolume")) {
            streamMicVolume = parseFloat(astring[1]);
          }
          if (astring[0].equals("streamSystemVolume")) {
            streamGameVolume = parseFloat(astring[1]);
          }
          if (astring[0].equals("streamKbps")) {
            streamKbps = parseFloat(astring[1]);
          }
          if (astring[0].equals("streamFps")) {
            streamFps = parseFloat(astring[1]);
          }
          if (astring[0].equals("streamCompression")) {
            streamCompression = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("streamSendMetadata")) {
            streamSendMetadata = astring[1].equals("true");
          }
          if ((astring[0].equals("streamPreferredServer")) && (astring.length >= 2)) {
            streamPreferredServer = s.substring(s.indexOf(':') + 1);
          }
          if (astring[0].equals("streamChatEnabled")) {
            streamChatEnabled = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("streamChatUserFilter")) {
            streamChatUserFilter = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("streamMicToggleBehavior")) {
            streamMicToggleBehavior = Integer.parseInt(astring[1]);
          }
          if (astring[0].equals("forceUnicodeFont")) {
            forceUnicodeFont = astring[1].equals("true");
          }
          if (astring[0].equals("allowBlockAlternatives")) {
            allowBlockAlternatives = astring[1].equals("true");
          }
          if (astring[0].equals("reducedDebugInfo")) {
            reducedDebugInfo = astring[1].equals("true");
          }
          if (astring[0].equals("useNativeTransport")) {
            field_181150_U = astring[1].equals("true");
          }
          if (astring[0].equals("entityShadows")) {
            field_181151_V = astring[1].equals("true");
          }
          for (SPMBinding keybinding : keyBindings) {
            if (astring[0].equals("key_" + keybinding.getKeyDescription())) {
              keybinding.setKeyCode(Integer.parseInt(astring[1]));
            }
          }
          for (bpg soundcategory : bpg.values()) {
            if (astring[0].equals("soundCategory_" + soundcategory.a())) {
              mapSoundLevels.put(soundcategory, Float.valueOf(parseFloat(astring[1])));
            }
          }
          for (wo enumplayermodelparts : wo.values()) {
            if (!astring[0].equals("modelPart_" + enumplayermodelparts.c())) {}
          }
        }
        catch (Exception var8)
        {
          logger.warn("Skipping bad option: " + s);
        }
      }
      bufferedreader.close();
    }
    catch (Exception exception)
    {
      logger.error("Failed to load options", exception);
    }
  }
  
  private float parseFloat(String p_74305_1_)
  {
    return p_74305_1_.equals("false") ? 0.0F : p_74305_1_.equals("true") ? 1.0F : Float.parseFloat(p_74305_1_);
  }
}
