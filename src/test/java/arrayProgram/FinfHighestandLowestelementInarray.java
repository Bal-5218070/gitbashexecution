package arrayProgram;

public class FinfHighestandLowestelementInarray {
public static void main(String[] args) {
	int[]a= {5,2,12,45,34,78,97};
	int highest =a[0];
	int lowest=a[0];
	for(int i=1;i<a.length;i++) {
		if(lowest>a[i]) {
			lowest=a[i];
		}
		if(highest<a[i]) {
			highest=a[i];
		}
	}
	System.out.println(highest);
	System.out.println(lowest);
}
}
