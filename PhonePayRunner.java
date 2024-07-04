public class PhonePayRunner{
public static void main(String args[]){
PhonePay.method1();
PhonePay.method2(65);
PhonePay.method3();
String details[]={"tea","black coffee","cold coffe"};
 String returnedType=PhonePay.method4(details);
System.out.println("returned type is:"+returnedType);
}
}