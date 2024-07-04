public class MovieRunner{
public static void main(String args[]){
Movies.method1();
Movies.method2(45);
Movies.method3();
String details[]={"cpa","patan","cris"};
 String returnedType=Movies.method4(details);
System.out.println("returned type is:"+returnedType);
}
}