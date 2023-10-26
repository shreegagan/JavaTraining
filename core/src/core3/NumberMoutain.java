package core3;

import java.util.Arrays;
import java.util.List;

public class NumberMoutain {
	public static void main(String[] args) {
		NumberMoutain nm=new NumberMoutain();
		System.out.println(nm.isMounatin(4,5,3,2,1));
		
		
		
		
	}

	private boolean isMounatin(int ...i) {
//		List<Integer> list=Arrays.asList(4,5,3,2,1);
		int peak =identifyPeak(i);
		if (peak == 0 || peak == i.length - 1)

			return false;
		
		boolean asc= checkAsec(i,peak);
		boolean desc= checkDesc(i,peak);
		
		
		
		
		return asc && desc;
	}

	private boolean checkDesc(int[] i,int peak) {
		boolean desc =true;
		for (int j = peak; j <i.length-1; j++) {
			if(i[j]<i[j+1]) {
				desc=false;
			}
		}
		return desc;
	}

	private boolean checkAsec(int[] i,int peak) {
		boolean asc =true;
		for (int j = 0; j < peak-1; j++) {
			if(i[j]>i[j+1]) {
				asc=false;
			}
		}
		return asc;
	}

	private int identifyPeak(int[] i) {
		int index = 0;
		int max = 0;
		for (int j = 0; j < i.length; j++) {
			if(i[j]>max) {
				max=i[j];
				index=j;
			}
			
		}
			return index;
		
	}

}
