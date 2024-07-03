public class OpenAi{
public static void method1()//without return type and without arguments

{
boolean vote=true;
if(vote){
System.out.println("ready to cast vote"+vote);
}else{
System.out.println("not ready");
}
}
public static void method2(int age){//without return type with arguments
if(age==18){
System.out.println("right to vote"+age);
}else{
System.out.println(" not right to vote");	
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
public static int method4(int age){//with return type with arguments
if(age==18){
System.out.println("right to vote"+age);

}else{
System.out.println(" not right to vote");	
}
return age;
}
}
