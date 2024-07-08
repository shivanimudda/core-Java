public class kTailRunner{
public static void method1()//without return type and without arguments

{
boolean drink=true;
if(drink){
System.out.println("so many drink"+drink);
}else{
System.out.println("none of drink");
}
}
public static void method2(int drink){//without return type with arguments
if(drink==8){
System.out.println("drink"+drink);
}else{
System.out.println(" not one drink");	
}
}
public static int method3(){//with return type without arguments
int song=7;
if(song==15){
System.out.println("many of song"+song);

}else{
System.out.println(" not few also");	
}
return 7;
}
public static String method4(String details[]){
for(int song=0;song<details.length;song++){
System.out.println(details[song]);
}
return "best song";
}
}