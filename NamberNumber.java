package basic; 
public class NamberNumber {
public static void main(String[] args) { 
	
	String str="PROGRAM";
	String a[]=str.split("");
	for(int i=0;i<str.length();i++) {
		int count=0;
		if(i==0) {
			System.out.print(a[i]+"\n");
		}
		for(int j=i;j<str.length()-3;j--) {
			 count++;
			System.out.print(" ");
			if(count==i) {
				System.out.println(a[i]);
			}
		} 
	}
  }
}
