public class SpotifyRunner{
public static void main(String args[]){
Spotify.method1();
Spotify.method2(45);
Spotify.method3();
String details[]={"classical","romantic","stress free"};
 String returnedType=Spotify.method4(details);
System.out.println("returned type is:"+returnedType);
}
}