import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class PracticeCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> soyUnVector = new Vector<>();
		
		List<String> arrayList = new ArrayList<>();
		Set<String> setString = new HashSet<>();		
		
		for (String str : Arrays.asList("Geek2", "Geek1","Geek3","Geek1")) {
			
			arrayList.add(str);
			setString.add(str);
		} 
		
		System.out.println("ArrayList: " + arrayList.toString());
		System.out.println("HashSet: " + setString.toString());

		
		setString.remove("Geek1");
		System.out.println("HashSet: " + setString.toString());
		
		String arraySet[] = new String[setString.size()];
		
		setString.toArray(arraySet);
		
		for (int i = 0; i < arraySet.length; i++) {
			System.out.println("Array List Values: " + arraySet[i]);
		}
		
		//arrayList.set(0, "Hello World");
		System.out.println("ArrayList: " + arrayList.toString());
		
		arrayList.sort(Comparator.reverseOrder());
		
		System.out.println("ArrayList: " + arrayList.toString());
		System.out.println("ArrayList: " + arraySet.toString());
		
		Set<String> newSet = new HashSet<>(Arrays.asList(arraySet));
		System.out.println("ArrayList: " + newSet.toString());
		
		List<String> arrayList2 = new LinkedList<>(Arrays.asList(arraySet));
		System.out.println("ArrayList2: " + newSet.toString());
		
		List<String> otherList = new LinkedList<>();
		System.out.println("LinkedList: " + arrayList2.get(0));
		
	}

}
