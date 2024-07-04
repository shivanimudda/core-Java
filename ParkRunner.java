public class ParkRunner{
public static void main(String args[]){
Park.method1();
Park.method2(45);
Park.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Park.method4(details);
System.out.println("returned type is:"+returnedType);
}
}