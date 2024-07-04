public class Pub{
public static void method1()//without return type and without arguments

{
boolean pub=true;
if(pub){
System.out.println("so many pub"+pub);
}else{
System.out.println("none of pub");
}
}
public static void method2(int pub){//without return type with arguments
if(pub==8){
System.out.println("pub"+pub);
}else{
System.out.println(" not one pub");	
}
}
public static int method3(){//with return type without arguments
int pub=19;
if(pub==15){
System.out.println("many of pub"+pub);

}else{
System.out.println(" not few also");	
}
return 19;
}
public static String method4(String details[]){
for(int pub=0;pub<details.length;pub++){
System.out.println(details[pub]);
}
return "best song";
}
}