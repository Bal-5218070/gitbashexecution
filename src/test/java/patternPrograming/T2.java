package patternPrograming;

public class T2 {
	public static void main(String[] args) {
		int rownum =3;
		int colnum =3;
		for(int i=1;i<=rownum;i++) {//this loop for row number
			for(int j=1;j<=colnum;j++) {//this loop for print star
				if(i<=j) {
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
