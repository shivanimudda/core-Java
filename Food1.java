public class Food1{
public static void accept(String foodName,int foodQuantity,int foodprice){
if(foodName=="dosa" && foodQuantity==2 && foodprice==10){
System.out.println("foodName:"+foodName+" "+"foodQuantity:"+foodQuantity+" "+"foodprice:"+foodprice);
int Totalprice=foodprice*foodQuantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(String Name,float price,int Quantity){
if(Name=="idli" && price==30.0f && Quantity==3  ){
System.out.println("foodName:"+Name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(int price,float Quantity,String Name){
if( price==20 && Quantity==1.0f &&Name=="vada"  ){
System.out.println("foodName:"+Name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(String item,int Quantity,float price){
if( item=="chapati" && Quantity==1 &&price==20.0f ){
System.out.println("item:"+item+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(float Quantity,String name,float price){
if( Quantity==3.0f && name=="kari" &&price==20.f ){
System.out.println("fooditem:"+name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(float price,int Quantity,String name){
if( price==20.f&&Quantity==4&& name=="samosa"  ){
System.out.println("fooditem:"+name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(int price,String name,float Quantity){
if( price==50&&name=="rice"&& Quantity==2.0f  ){
System.out.println("fooditem:"+name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
public static void accept(float price_food,float Quantity,String name){
if( price_food==20.0f&&Quantity==2.0f&& name=="daal" ){
System.out.println("fooditem:"+name+" "+"foodQuantity:"+Quantity+" "+"foodprice:"+price_food);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}
public static void accept(int price_food,String name,float Quantity_food){
if( price_food==20&&name=="paneer"&& Quantity_food==5.0f ){
System.out.println("fooditem:"+name+" "+"foodQuantity:"+Quantity_food+" "+"foodprice:"+price_food);
float Totalprice=price*Quantity;
System.out.println("total price:"+Totalprice);
}
System.out.println("good service");
}






}