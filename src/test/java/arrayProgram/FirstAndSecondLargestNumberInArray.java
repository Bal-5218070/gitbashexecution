package arrayProgram;

public class FirstAndSecondLargestNumberInArray {
public static void main(String[] args) {
	int[] a= {20,50,70,90,110,170};
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	
	}
	
	System.out.println("second largest value"+a[1]);
	System.out.println("first largest value"+a[0]);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
}
}
