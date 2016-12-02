package mods.worldeditcui.render;

import bnq;
import mods.worldeditcui.config.Colour;

public enum LineColour
{
  CUBOIDBOX("colour.cuboidedge", new Colour("#CC3333CC")),  CUBOIDGRID("colour.cuboidgrid", new Colour("#CC4C4CCC")),  CUBOIDPOINT1("colour.cuboidpoint1", new Colour("#33CC33CC")),  CUBOIDPOINT2("colour.cuboidpoint2", new Colour("#3333CCCC")),  POLYGRID("colour.polygrid", new Colour("#CC3333CC")),  POLYBOX("colour.polyedge", new Colour("#CC4C4CCC")),  POLYPOINT("colour.polypoint", new Colour("#33CCCCCC")),  ELLIPSOIDGRID("colour.ellipsoidgrid", new Colour("#CC4C4CCC")),  ELLIPSOIDCENTRE("colour.ellipsoidpoint", new Colour("#CCCC33CC")),  CYLINDERGRID("colour.cylindergrid", new Colour("#CC3333CC")),  CYLINDERBOX("colour.cylinderedge", new Colour("#CC4C4CCC")),  CYLINDERCENTRE("colour.cylinderpoint", new Colour("#CC33CCCC"));
  
  private String displayName;
  private Colour defaultColour;
  private Colour colour;
  private LineInfo normal;
  private LineInfo hidden;
  
  private LineColour(String displayName, Colour colour)
  {
    this.displayName = displayName;
    this.colour = colour;
    this.defaultColour = new Colour().copyFrom(colour);
  }
  
  public String getDisplayName()
  {
    return bnq.a(this.displayName, new Object[0]);
  }
  
  public Colour getColour()
  {
    return this.colour;
  }
  
  public LineInfo getHidden()
  {
    return this.hidden;
  }
  
  public LineInfo getNormal()
  {
    return this.normal;
  }
  
  public LineInfo[] getColours()
  {
    return new LineInfo[] { this.hidden, this.normal };
  }
  
  public void setColour(Colour colour)
  {
    this.colour = colour;
    updateColour();
  }
  
  public void updateColour()
  {
    this.normal = new LineInfo(3.0F, this.colour.red(), this.colour.green(), this.colour.blue(), this.colour.alpha(), 513);
    this.hidden = new LineInfo(3.0F, this.colour.red() * 0.75F, this.colour.green() * 0.75F, this.colour.blue() * 0.75F, this.colour.alpha() * 0.25F, 518);
  }
  
  public void setDefaultColour()
  {
    this.colour.copyFrom(this.defaultColour);
    updateColour();
  }
  
  public void setColourIntRGBA(int argb)
  {
    int rgba = argb << 8 & 0xFF00 | (argb & 0xFF000000) >> 24 & 0xFF;
    this.colour.setHex(Integer.toHexString(rgba));
    updateColour();
  }
  
  public int getColourIntARGB()
  {
    return this.colour.getIntARGB();
  }
}
