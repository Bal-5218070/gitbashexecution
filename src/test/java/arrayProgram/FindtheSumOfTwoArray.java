package arrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindtheSumOfTwoArray {
public static void main(String[] args) {
	int[]a= {1,2,3,4};
	int[]b= {4,5,6,7,8,9};
	int noe=Math.max(a.length, b.length);
	int[] result=new int[noe];
	for(int i=0;i<result.length;i++) {
		if(i<a.length) {
			result[i]=result[i]+a[i];
		}
		if(i<b.length){
			result[i]=result[i]+b[i];
		}
	}
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i]);
	}
	//System.out.println(Arrays.toString(result));
}
}
