import java.util.ArrayList;

public class CompactArrayList
{
  private ArrayList list = null;
  private int initialCapacity = 0;
  private float loadFactor = 1.0F;
  private int countValid = 0;
  
  public CompactArrayList()
  {
    this(10, 0.75F);
  }
  
  public CompactArrayList(int initialCapacity)
  {
    this(initialCapacity, 0.75F);
  }
  
  public CompactArrayList(int initialCapacity, float loadFactor)
  {
    list = new ArrayList(initialCapacity);
    this.initialCapacity = initialCapacity;
    this.loadFactor = loadFactor;
  }
  
  public void add(int index, Object element)
  {
    if (element != null) {
      countValid += 1;
    }
    list.add(index, element);
  }
  
  public boolean add(Object element)
  {
    if (element != null) {
      countValid += 1;
    }
    return list.add(element);
  }
  
  public Object set(int index, Object element)
  {
    Object oldElement = list.set(index, element);
    if (element != oldElement)
    {
      if (oldElement == null) {
        countValid += 1;
      }
      if (element == null) {
        countValid -= 1;
      }
    }
    return oldElement;
  }
  
  public Object remove(int index)
  {
    Object oldElement = list.remove(index);
    if (oldElement != null) {
      countValid -= 1;
    }
    return oldElement;
  }
  
  public void clear()
  {
    list.clear();
    countValid = 0;
  }
  
  public void compact()
  {
    if ((countValid <= 0) && (list.size() <= 0))
    {
      clear();
      return;
    }
    if (list.size() <= initialCapacity) {
      return;
    }
    float currentLoadFactor = countValid * 1.0F / list.size();
    if (currentLoadFactor > loadFactor) {
      return;
    }
    int dstIndex = 0;
    for (int srcIndex = 0; srcIndex < list.size(); srcIndex++)
    {
      Object wr = list.get(srcIndex);
      if (wr != null)
      {
        if (srcIndex != dstIndex) {
          list.set(dstIndex, wr);
        }
        dstIndex++;
      }
    }
    for (int i = list.size() - 1; i >= dstIndex; i--) {
      list.remove(i);
    }
  }
  
  public boolean contains(Object elem)
  {
    return list.contains(elem);
  }
  
  public Object get(int index)
  {
    return list.get(index);
  }
  
  public boolean isEmpty()
  {
    return list.isEmpty();
  }
  
  public int size()
  {
    return list.size();
  }
  
  public int getCountValid()
  {
    return countValid;
  }
}
