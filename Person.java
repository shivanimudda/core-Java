public class Person{
public static void details(int age){
System.out.println("person age is:"+age);

}
public static void details(int age,String name){
System.out.println("person age is:"+age+" "+"name is:"+name);
}
public static void details(int age,String name,long  phno){
System.out.println("person age is:"+age+" "+"name is:"+name+" "+"phno is"+phno);
}
public static void details(int age,String name,long  phno,boolean weight){
	if(weight){
System.out.println("person age is:"+age+" "+"name is:"+name+" "+"phno is"+phno+" " +"weight is more than 45"+weight);
}
else{
	System.out.println("weight is less than 45");
}
}
}