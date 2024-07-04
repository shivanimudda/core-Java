public class Park{
public static void method1()//without return type and without arguments

{
boolean park=true;
if(park){
System.out.println("so many park"+park);
}else{
System.out.println("none of park");
}
}
public static void method2(int park){//without return type with arguments
if(park==8){
System.out.println("park"+park);
}else{
System.out.println(" not one park");	
}
}
public static int method3(){//with return type without arguments
int park=7;
if(park==15){
System.out.println("many of park"+park);

}else{
System.out.println(" not few also");	
}
return 7;
}
public static String method4(String details[]){
for(int park=0;park<details.length;park++){
System.out.println(details[park]);
}
return "best song";
}
}