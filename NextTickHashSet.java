import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NextTickHashSet
  extends TreeSet
{
  private nq longHashMap = new nq();
  private int minX = Integer.MIN_VALUE;
  private int minZ = Integer.MIN_VALUE;
  private int maxX = Integer.MIN_VALUE;
  private int maxZ = Integer.MIN_VALUE;
  private static final int UNDEFINED = Integer.MIN_VALUE;
  
  public NextTickHashSet(Set oldSet)
  {
    for (Iterator it = oldSet.iterator(); it.hasNext();)
    {
      Object obj = it.next();
      add(obj);
    }
  }
  
  public boolean contains(Object obj)
  {
    if (!(obj instanceof adw)) {
      return false;
    }
    adw entry = (adw)obj;
    
    Set set = getSubSet(entry, false);
    if (set == null) {
      return false;
    }
    return set.contains(entry);
  }
  
  public boolean add(Object obj)
  {
    if (!(obj instanceof adw)) {
      return false;
    }
    adw entry = (adw)obj;
    if (entry == null) {
      return false;
    }
    Set set = getSubSet(entry, true);
    
    boolean added = set.add(entry);
    
    boolean addedParent = super.add(obj);
    if (added != addedParent) {
      throw new IllegalStateException("Added: " + added + ", addedParent: " + addedParent);
    }
    return addedParent;
  }
  
  public boolean remove(Object obj)
  {
    if (!(obj instanceof adw)) {
      return false;
    }
    adw entry = (adw)obj;
    
    Set set = getSubSet(entry, false);
    if (set == null) {
      return false;
    }
    boolean removed = set.remove(entry);
    
    boolean removedParent = super.remove(entry);
    if (removed != removedParent) {
      throw new IllegalStateException("Added: " + removed + ", addedParent: " + removedParent);
    }
    return removedParent;
  }
  
  private Set getSubSet(adw entry, boolean autoCreate)
  {
    if (entry == null) {
      return null;
    }
    cj pos = a;
    int cx = pos.n() >> 4;
    int cz = pos.p() >> 4;
    return getSubSet(cx, cz, autoCreate);
  }
  
  private Set getSubSet(int cx, int cz, boolean autoCreate)
  {
    long key = adg.a(cx, cz);
    HashSet set = (HashSet)longHashMap.a(key);
    if ((set == null) && (autoCreate))
    {
      set = new HashSet();
      longHashMap.a(key, set);
    }
    return set;
  }
  
  public Iterator iterator()
  {
    if (minX == Integer.MIN_VALUE) {
      return super.iterator();
    }
    if (size() <= 0) {
      return Iterators.emptyIterator();
    }
    int cMinX = minX >> 4;
    int cMinZ = minZ >> 4;
    int cMaxX = maxX >> 4;
    int cMaxZ = maxZ >> 4;
    
    List listIterators = new ArrayList();
    for (int x = cMinX; x <= cMaxX; x++) {
      for (int z = cMinZ; z <= cMaxZ; z++)
      {
        Set set = getSubSet(x, z, false);
        if (set != null) {
          listIterators.add(set.iterator());
        }
      }
    }
    if (listIterators.size() <= 0) {
      return Iterators.emptyIterator();
    }
    if (listIterators.size() == 1) {
      return (Iterator)listIterators.get(0);
    }
    return Iterators.concat(listIterators.iterator());
  }
  
  public void setIteratorLimits(int minX, int minZ, int maxX, int maxZ)
  {
    this.minX = Math.min(minX, maxX);
    this.minZ = Math.min(minZ, maxZ);
    this.maxX = Math.max(minX, maxX);
    this.maxZ = Math.max(minZ, maxZ);
  }
  
  public void clearIteratorLimits()
  {
    minX = Integer.MIN_VALUE;
    minZ = Integer.MIN_VALUE;
    maxX = Integer.MIN_VALUE;
    maxZ = Integer.MIN_VALUE;
  }
}
