import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Aeroplane");
		list.add("BMW");
		list.add("Cricket");
		list.add("Dolphine");
		list.add("Emission");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		list.add(5, "France");
		list.remove(3);
		list.set(2, "Football");
		System.out.println(list.contains("BMW"));
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		
		System.out.println("****** HashMap ******");
		Map<Integer,String> details = new HashMap<Integer,String>();
		details.put(101, "John");
		details.put(102, "Roy");
		details.put(103, "Rose");
		details.put(104, "Tina");
		details.put(105, "Virat");
		System.out.println(details.get(103));
		Map<Integer,String> copy = new HashMap<Integer,String>();
		copy.putAll(details);
		System.out.println(copy);
		System.out.println(details.containsKey(103));
		System.out.println(details.containsValue("Virat"));
		System.out.println(details.isEmpty());
		System.out.println("Size: "+ details.size());
		System.out.println(details.keySet());
		details.remove(103, "Rose");
		System.out.println(details);
		
		System.out.println("****** HashSet ******");
		HashSet<String> mobiles = new HashSet<String>();
		mobiles.add("Apple");
		mobiles.add("Samsung");
		mobiles.add("Redmi");
		mobiles.add("Nokia");
		mobiles.add("VIVO");
		System.out.println(mobiles.size());
		System.out.println(mobiles.isEmpty());
		System.out.println(mobiles.contains("Redmi"));
		System.out.println(mobiles.remove("Samsung"));
		System.out.println(mobiles);
		HashSet cloneSet = new HashSet();
		cloneSet = (HashSet)mobiles.clone();
		System.out.println(cloneSet);
		mobiles.clear();

	}

}
