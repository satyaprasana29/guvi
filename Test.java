import java.util.Scanner;
public class Test{
public static void main(String[]args){
int a;
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
if(a>0){
System.out.println("Number is positive");
}
else if(a<0){
System.out.println("Number is negative");
}
else{
System.out.println("number is zero");
}
}
}
