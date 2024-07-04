package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {
	// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등이 있다.
	// Set : 인덱스X , 중복값을 갖지 않는다.
	
	public static void main(String[] args) {
	Set<String> setHashSet = new HashSet<String>();
	Set<String> setLinkedHashSet = new LinkedHashSet<String>();
	Set<String> setTreeSet = new TreeSet<String>();
	setHashSet.add("Java");
	setHashSet.add("Oracle");
	setHashSet.add("JDBC");
	setHashSet.add("HTML");
	setHashSet.add("CSS");
	setHashSet.add("JavaScript"); //6
	setHashSet.add("JDBC"); //7 중복된 값은 저장되지 않는다.
		int size = setHashSet.size();
		System.out.println("Set 객체수 : "+size);
		System.out.println("------------------------");
		int i = 1;
		Iterator<String> iterator = setHashSet.iterator();
		while(iterator.hasNext()) { //boolean hasNext : 다음에 올 객체가 있으면 true, 없으면 false
				String y = iterator.next(); //next() -> 가져온 값을 넣는다.
				System.out.println((i++) + "번 객체 : " + y);
		}//while end
		
		setHashSet.remove("CSS");
		
		System.out.println("------------------------------");
		i = 1;
		for(String x : setHashSet) {
			System.out.println((i++)+"번 객체 : " + x);
		}//for end
		

	}// main method end

}//class end
