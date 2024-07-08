public class StateRunner{
public static void main(String args[]){
RealeState.method1();
RealeState.method2(45);
RealeState.method3();
String details[]={"home","apartments","pg"};
 String returnedType=RealeState.method4(details);
System.out.println("returned type is:"+returnedType);
}
}