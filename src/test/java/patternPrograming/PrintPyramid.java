package patternPrograming;

public class PrintPyramid {
public static void main(String[] args) {
	int rownum=3;
	for(int i=1;i<=rownum;i++) {
		
		for(int j=1;j<rownum;j++) {
			System.out.print("");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
