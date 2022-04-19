package javaProgramming1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> als= new ArrayList<>();
		als.add(23);
		als.add(13);
		als.add(43);
		als.add(93);
		als.add(200);

		ArrayList<Integer> alsm = 	(ArrayList<Integer>)als.stream().map(i->i*30).collect(Collectors.toList());

		System.out.println(alsm);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Amit");
		strList.add("Rahul");
		strList.add("Raja");
		strList.add("Ram");
		strList.add("Subhojit");
		
		System.out.println(	strList.stream().filter(s->s.length()>3).collect(Collectors.toList()));
	
	
	
	
	}
	
	class Person{
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		 int age;
		 String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

	
}
