public class SpiceRunner{
public static void main(String args[]){
Spice.method1();
Spice.method2(45);
Spice.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Spice.method4(details);
System.out.println("returned type is:"+returnedType);
}
}