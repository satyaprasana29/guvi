import java.util.Scanner;
public class Test4{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a,b,c;
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if(a>b&&a>c){
System.out.println("a is greater");
}
else if (b>c&&b>a){
System.out.println("b is greater");
}
else {
System.out.println("c is greater");
}
}
}
