public class Structure{
public static void method1()//without return type and without arguments

{
boolean vote=true;
if(vote){
System.out.println("ready to cast vote"+vote);
}else{
System.out.println("not ready");
}
}
public static void method2(int money){//without return type with arguments
if(money==18){
System.out.println("payment successful"+money);
}else{
System.out.println(" not successful");	
}
}
public static int method3(){//with return type without arguments
int age=18;
if(age==18){
System.out.println("right to vote"+age);

}else{
System.out.println(" not right to vote");	
}
return 18;
}
public static String method4(String details[]){
for(int index=0;index<details.length;index++){
System.out.println(details[index]);
}
return "ready to pay";
}
}
}