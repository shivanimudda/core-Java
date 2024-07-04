public class PoliceStation{
public static void method1()//without return type and without arguments

{
boolean crime=true;
if(crime){
System.out.println("many of crime done in gonturupayla"+crime);
}else{
System.out.println("none of crime");
}
}
public static void method2(int crime){//without return type with arguments
if(crime==1){
System.out.println("crime"+crime);
}else{
System.out.println(" not one also");	
}
}
public static int method3(){//with return type without arguments
int police=10;
if(police==15){
System.out.println("many of plice were there"+police);

}else{
System.out.println(" not few also");	
}
return 10;
}
public static String method4(String details[]){
for(int robber=0;robber<details.length;robber++){
System.out.println(details[robber]);
}
return "illigal crime";
}
}
}