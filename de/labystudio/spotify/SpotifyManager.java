package de.labystudio.spotify;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;

public class SpotifyManager
{
  private String spotify;
  private String title;
  private boolean set;
  SpotifyUser32 spotifyUser32;
  private WinUser.WNDENUMPROC wndeNumProc;
  private String trackName = null;
  private String artistName = null;
  private long displayTime;
  
  public SpotifyManager()
  {
    try
    {
      spotifyUser32 = ((SpotifyUser32)Native.loadLibrary("User32", SpotifyUser32.class));
      spotify = null;
      title = "?";
      set = false;
      
      wndeNumProc = new WinUser.WNDENUMPROC()
      {
        public boolean callback(WinDef.HWND hWnd, Pointer arg1)
        {
          byte[] windowText = new byte['Ȁ'];
          spotifyUser32.GetWindowTextA(hWnd, windowText, 512);
          String wText = Native.toString(windowText);
          if (wText.isEmpty()) {
            return true;
          }
          boolean notPlaying = wText.equals("Spotify");
          if (((spotify == null) && (notPlaying)) || (notPlaying) || ((title.equals(wText)) && (!hWnd.toString().equals(spotify)))) {
            spotify = hWnd.toString();
          }
          if ((spotify != null) && (spotify.equals(hWnd.toString())))
          {
            boolean refresh = !title.equals(wText);
            if (notPlaying)
            {
              title = "No song playing";
            }
            else
            {
              title = wText;
              setDisplayTime(System.currentTimeMillis());
            }
            if (refresh) {
              SpotifyManager.this.newTitleIsPlaying();
            }
            set = true;
          }
          return true;
        }
      };
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    catch (Error error)
    {
      error.printStackTrace();
    }
  }
  
  public String getArtistName()
  {
    return artistName;
  }
  
  public String getTrackName()
  {
    return trackName;
  }
  
  private void newTitleIsPlaying()
  {
    if ((getSpotifyTitle() != null) && (getSpotifyTitle().contains(" - ")))
    {
      String[] split = getSpotifyTitle().replaceFirst(" - ", "@@@").split("@@@");
      artistName = split[0];
      trackName = split[1];
    }
    else
    {
      artistName = null;
      trackName = null;
    }
  }
  
  public SpotifyUser32 getSpotifyUser32()
  {
    return spotifyUser32;
  }
  
  public String getSpotifyTitle()
  {
    return title;
  }
  
  public long getDisplayTime()
  {
    return displayTime;
  }
  
  public void setDisplayTime(long displayTime)
  {
    this.displayTime = displayTime;
  }
  
  public WinUser.WNDENUMPROC getWndeNumProc()
  {
    return wndeNumProc;
  }
  
  public void updateTitle()
  {
    if (getSpotifyUser32() == null) {
      return;
    }
    if (getWndeNumProc() == null) {
      return;
    }
    set = false;
    new SpotifyThread(getSpotifyUser32(), getWndeNumProc(), new SpotifyCallback()
    {
      public void done()
      {
        if ((spotify != null) && (!set)) {
          spotify = null;
        }
      }
    })
    
      .start();
  }
}
