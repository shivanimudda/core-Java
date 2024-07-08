public class Fresher{
public static void method1()//without return type and without arguments

{
boolean movie=true;
if(movie){
System.out.println("so many movie"+movie);
}else{
System.out.println("none of movie");
}
}
public static void method2(int movie){//without return type with arguments
if(movie==8){
System.out.println("movies"+movie);
}else{
System.out.println(" not one movie");	
}
}
public static int method3(){//with return type without arguments
int movie=19;
if(movie==15){
System.out.println("many of movies"+movie);

}else{
System.out.println(" not few also");	
}
return 19;
}
public static String method4(String details[]){
for(int actor=0;actor<details.length;actor++){
System.out.println(details[actor]);
}
return "illigal";
}
}
}