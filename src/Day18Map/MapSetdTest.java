package Day18Map;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapSetdTest {
   public static void main(String[] args) {
	 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	 map.put(1, "夜猫哈u");
	 map.put(3, "夜猫");
	 map.put(2, "哈u");
	 map.put(4, "叶茂华");
	 Set<Integer> list=new HashSet<Integer>();
	 list=(Set<Integer>) map.keySet();
	 for(Integer li :list){
		 System.out.println(map.get(li));
		 
	 }
	 Collection c=map.values();
	 Iterator it=c.iterator();
	 
	 while(it.hasNext()){
		 String s=(String) it.next();
		 System.out.println(s);
	 }
}
} 
