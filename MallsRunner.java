public class MallsRunner{
public static void main(String args[]){
Malls.method1();
Malls.method2(45);
Malls.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Malls.method4(details);
System.out.println("returned type is:"+returnedType);
}
}