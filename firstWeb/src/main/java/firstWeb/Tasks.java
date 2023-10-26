
package firstWeb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

	 public static void main(String[] args) {
			List<Integer> list=Arrays.asList(4,5,3,2,1);
	
	    
	        identifyOrder(list);
	    }

	    public static void identifyOrder(List<Integer> list) {
	        int start = 0;
	        String order = "";

	        for (int i = 1; i < list.size(); i++) {
	            if (list.get(i - 1) < list.get(i)) {
	                if (order.equals("descending")) {
	                    System.out.println("Descending from " + start + " to " + (i - 1));
	                }
	                order = "ascending";
	                start = i - 1;
	                System.out.println(start);
	            } else if (list.get(i - 1) > list.get(i)) {
	                if (order.equals("ascending")) {
	                    System.out.println("Ascending from " + start + " to " + (i - 1));
	                }
	                order = "descending";
	                start = i - 1;
	                System.out.println( start);
	            }
	        }

	        if (order.equals("ascending")) {
	            System.out.println("Ascending from " + start + " to " + (list.size() - 1));
	        } else if (order.equals("descending")) {
	            System.out.println("Descending from " + start + " to " + (list.size() - 1));
	            System.out.println( list);
	            
	        }
	    }
	}