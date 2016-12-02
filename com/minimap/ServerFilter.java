package com.minimap;

import ave;
import bde;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ServerFilter
{
  private static Map<String, FilterType> serverFilter = new HashMap();
  
  static
  {
    serverFilter.put("playminity.com", FilterType.NO_RADAR);
    serverFilter.put("gommehd.net", FilterType.NO_PLAYER_RADAR);
    serverFilter.put("timolia.de", FilterType.DISALLOWED);
    serverFilter.put("mineplex.com", FilterType.DISALLOWED);
  }
  
  public static FilterType getCurrentFilterType()
  {
    if ((ave.A().D() == null) || 
      (ave.A().D().b == null)) {
      return FilterType.ALLOWED;
    }
    String ip = ave.A().D().b;
    return getFilterTypeForServer(ip);
  }
  
  public static FilterType getFilterTypeForServer(String ip)
  {
    for (Map.Entry<String, FilterType> filters : serverFilter.entrySet()) {
      if (ip.toLowerCase().contains((CharSequence)filters.getKey())) {
        return (FilterType)filters.getValue();
      }
    }
    return FilterType.ALLOWED;
  }
  
  public static enum FilterType
  {
    ALLOWED,  NO_RADAR,  NO_PLAYER_RADAR,  DISALLOWED;
    
    private FilterType() {}
  }
}
