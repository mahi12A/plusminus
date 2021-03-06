package javaProgramming1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedWords {

	public static void main(String[] args) {
		sortStrings("I love leetcode , I love code");

	}
	
	
	static void sortStrings(String str){
		Map<String, Integer> map  = new HashMap<>();
		String[] strList = str.split(" ");
		System.out.println(Arrays.toString(strList));
		
		for(int i=0; i< strList.length;i++)
		{
			if(map.containsKey(strList[i])) {
				map.put(strList[i], map.get(strList[i])+1);
			}else {
				map.put(strList[i], 1);
			}
		}
		
		System.out.println(map.entrySet().stream().filter((i)->i.getValue()==2).collect(Collectors.toList()));
		
		//System.out.println(map);
		
	}

}
