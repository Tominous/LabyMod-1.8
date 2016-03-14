class axn$1
  extends avs
{
  axn$1(axn this$0, int buttonId, int x, int y, int widthIn, int heightIn, String buttonText)
  {
    super(buttonId, x, y, widthIn, heightIn, buttonText);
  }
  
  public void a(bpz soundHandlerIn)
  {
    bpy soundeventaccessorcomposite = soundHandlerIn.a(new bpg[] { bpg.g, bpg.e, bpg.f, bpg.h, bpg.d });
    if (soundeventaccessorcomposite != null) {
      soundHandlerIn.a(bpf.a(soundeventaccessorcomposite.c(), 0.5F));
    }
  }
}
