public class Biryani{
public static void food(String item_name){
System.out.println("biryani is good"+item_name);
}
public static void food(int review){
if( review=10){
System.out.println("biryani is wow"+review);
}
else if(review<10 && review>5){
System.out.println("biryani is worst"+review);
}
else if(review<5){
System.out.println("biryani is good"+review);
}
}
}