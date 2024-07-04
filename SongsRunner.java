public class SongsRunner{
public static void main(String args[]){
Songs.method1();
Songs.method2(45);
Songs.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Songs.method4(details);
System.out.println("returned type is:"+returnedType);
}
}