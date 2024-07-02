public class Shopping{
public static void details(String shopping_type){
System.out.println("shopping type is:"+shopping_type);

}
public static void gst(int price ){
System.out.println("gst of the item:"+price);
double totalprice=0.4f*price+price;
System.out.println("total price of item:"+totalprice);

}
public static void details(String shopping_type,char item_name,int price){
System.out.println("shopping type is:"+shopping_type+" "+"item_name is:"+item_name+ " "+"price is"+price);

}

}
