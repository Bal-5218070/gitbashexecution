package arrayProgram;

import java.util.Arrays;

public class ShiftAllTheZeroSideOtherOnleftSide {
public static void main(String[] args) {
	int[] a = {5,6,9,0,0,0,0,1,2,3};
	//{0,0,0,0,5,6,9,1,2,3}<---output shift all zero left side
	int[] b=new int[a.length];
	int last =a.length-1;
	for(int i=a.length-1;i>=0;i--) {
		if(a[i]!=0){
			b[last--]=a[i];
			
		}
	}
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+",");
	}
	//System.out.println(Arrays.toString(b));
}
}
