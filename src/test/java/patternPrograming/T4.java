package patternPrograming;

public class T4 {
	public static void main(String[] args) {
		int rownum =5;
		int colnum =5;
		for(int i=1;i<=rownum;i++) {//this loop for row number
			for(int j=1;j<=colnum;j++) {//this loop for print star
				if(i+j<=10) {
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
	              
			}
			System.out.println();//this statement for next line
			 
		}
	}
}
