import java.util.Comparator;

final class CustomItems$1
  implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    CustomItemProperties cip1 = (CustomItemProperties)o1;
    CustomItemProperties cip2 = (CustomItemProperties)o2;
    if (layer != layer) {
      return layer - layer;
    }
    if (weight != weight) {
      return weight - weight;
    }
    if (!basePath.equals(basePath)) {
      return basePath.compareTo(basePath);
    }
    return name.compareTo(name);
  }
}
