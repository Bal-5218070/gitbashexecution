package arrayProgram;

public class SecondHighestElement {
public static void main(String[] args) {
	int [] a= {2,5,7,9,5,11};
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]< a[j] ){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			}
		}
	}
	System.out.println("second hishest element"+a[1]);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
}

