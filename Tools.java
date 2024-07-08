public class Tools{
public static void method1()//without return type and without arguments

{
boolean item=true;
if(item){
System.out.println("so many item"+item);
}else{
System.out.println("none of item");
}
}
public static void method2(int product){//without return type with arguments
if(product==8){
System.out.println("spice"+product);
}else{
System.out.println(" not one ");	
}
}
public static int method3(){//with return type without arguments
int spice=7;
if(spice==15){
System.out.println("many of park"+spice);

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