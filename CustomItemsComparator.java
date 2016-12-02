import java.util.Comparator;

public class CustomItemsComparator
  implements Comparator
{
  public int compare(Object o1, Object o2)
  {
    CustomItemProperties p1 = (CustomItemProperties)o1;
    CustomItemProperties p2 = (CustomItemProperties)o2;
    if (weight != weight) {
      return weight - weight;
    }
    if (!Config.equals(basePath, basePath)) {
      return basePath.compareTo(basePath);
    }
    return name.compareTo(name);
  }
}
