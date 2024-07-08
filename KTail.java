public class KTailRunner{
public static void main(String args[]){
MockTail.method1();
MockTail.method2(45);
MockTail.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=MockTail.method4(details);
System.out.println("returned type is:"+returnedType);
}
}