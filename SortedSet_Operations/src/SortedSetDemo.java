import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		s.add("CPP");
		s.add("C");
		s.add("Java");
		s.add("Python");
		s.add("Android");
		s.add("React");
		
		System.out.println(s);
		//first()
		System.out.println(s.first());//Android
		
		//last()
		System.out.println(s.last());//React
		
		//headSet(Object)
		System.out.println(s.headSet("CPP"));//[Android, C]
		
		//tailSet(Object)
		System.out.println(s.tailSet("CPP"));//[CPP, Java, Python, React]
		
		//subSet(object,object)
		System.out.println(s.subSet("C", "Python"));//[C, CPP, Java]
		

	}

}
