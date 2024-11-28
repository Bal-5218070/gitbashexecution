package arrayProgram;

public class ShiftallzirotoRightSide {
public static void main(String[] args) {
	int []a= {1,12,0,0,0,0,5,6,7,9};
	int [] b=new int[a.length];
	int first =0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0){
			b[first++]=a[i];
		}
	}
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+",");
	}
	
}
}
