public class HistoryRunner{
public static void main(String args[]){
Amazon.method1();
Amazon.method2(17);
Amazon.method3();
String details[]={"tea","black coffee","cold coffe"};
 String returnedType=Amazon.method4(details);
System.out.println("returned type is:"+returnedType);
}
}