public class LinkDind{
public static void profileDetails(String prof_name,String surName,int age){
System.out.println("name of candidate:"+prof_name);
System.out.println("surName of candidate:"+surName);
System.out.println("age of candidate:"+age);
}
public static void EduactionDetails(String Qualification,int graYear,String course){
System.out.println("qualification of candidate:"+Qualification);
System.out.println("graYear of candidate:"+graYear);
System.out.println("course of candidate:"+course);
}
public static void PersonelDetails(Long phone,String name,String Adress,String EmailAdress){
System.out.println("phno of candidate:"+phone);
System.out.println("name of candidate:"+name);
System.out.println("adress of candidate:"+Adress);
System.out.println("Emailadress of candidate:"+EmailAdress);

}
public static void SkillsDetails(String communication,String programm){
System.out.println("communication of candidate:"+communication);
System.out.println("programm of candidate:"+programm);

}
public static void PercentageDetails(float cgp,int percentage){
System.out.println("cgp of candidate:"+cgp);
System.out.println("percentage of candidate:"+percentage);

}



public static void User(){
	
LinkDind.profileDetails("Jhon","Math",47);
LinkDind.EduactionDetails("B.E",2024,"ComputerScience");
LinkDind.PersonelDetails(2224678788L,"john","Bangalore","xyz@123");
LinkDind.SkillsDetails("English","java");
LinkDind.PercentageDetails(8.9f,67);
}
}