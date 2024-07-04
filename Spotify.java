public class Spotify{
public static void method1()//without return type and without arguments

{
boolean music=true;
if(music){
System.out.println("this is one of the best music"+music);
}else{
System.out.println("not that best");
}
}
public static void method2(int movierate){//without return type with arguments
if(movierate==7){
System.out.println("good movie"+movierate);
}else{
System.out.println(" not good");	
}
}
public static int method3(){//with return type without arguments
int album=10;
if(album==15){
System.out.println("verstile song"+album);

}else{
System.out.println(" not verstile");	
}
return 10;
}
public static String method4(String details[]){
for(int song=0;song<details.length;song++){
System.out.println(details[song]);
}
return "ready to pay";
}
}
}