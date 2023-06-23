//String pool
//if both the string are declared same with case and space then they refer to the same
//object 
//s1 = "kamal" --> object s1 is created
//s2 = "kamal" --> this wont create s2 object as every case and space is same 
//so s2 will refer to s1
//== operator checks the ref and not the data
//in order to check the data we use .equals function

//wajp to demo String and op

class P2{
public static void main(String args[]){
String s1 = "kamal";
String s2 = "kamal";
System.out.println(s1 == s2);

String s3 = "Kamal";
System.out.println(s1 == s3);

System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s2));
}
}