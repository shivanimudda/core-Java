public class NotepadRunner{
public static void main(String args[]){
Pub.method1();
Pub.method2(45);
Pub.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Pub.method4(details);
System.out.println("returned type is:"+returnedType);
}
}