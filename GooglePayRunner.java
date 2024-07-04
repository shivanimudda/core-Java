public class GooglePayRunner{
public static void main(String args[]){
GooglePay.method1();
GooglePay.method2(45);
GooglePay.method3();
String details[]={"money","check","check holder"};
 String returnedType=GooglePay.method4(details);
System.out.println("returned type is:"+returnedType);
}
}