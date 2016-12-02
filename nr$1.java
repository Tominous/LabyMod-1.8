import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

class nr$1
  extends TypeAdapter<T>
{
  nr$1(nr paramnr, Map paramMap) {}
  
  public void write(JsonWriter ☃, T ☃)
    throws IOException
  {
    if (☃ == null) {
      ☃.nullValue();
    } else {
      ☃.value(nr.a(b, ☃));
    }
  }
  
  public T read(JsonReader ☃)
    throws IOException
  {
    if (☃.peek() == JsonToken.NULL)
    {
      ☃.nextNull();
      return null;
    }
    return (T)a.get(☃.nextString());
  }
}
