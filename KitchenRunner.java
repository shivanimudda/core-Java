public class KitchenRunner{
public static void main(String args[]){
Kitchen.method1();
Kitchen.method2(45);
Kitchen.method3();
String details[]={"mantri","garuda","gopalan"};
 String returnedType=Kitchen.method4(details);
System.out.println("returned type is:"+returnedType);
}
}