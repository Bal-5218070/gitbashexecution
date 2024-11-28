package arrayProgram;

public class BubbleSort {
public static void main(String[] args) {
	int[]a= {5,2,12,45,34,78,97};
	int temp;
	for(int i=0;i<a.length;i++) {
		System.out.println("Index Number: " + i + ", Element: " + a[i]);
		
		
		
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}

	}
	System.out.println("highest number is"+a[0]);
	System.out.println("lowset number is"+a[6]);
	
}
}
