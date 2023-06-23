// concrete class 
// in which all methods have body

class Meeting {
void micOnOff(){
	System.out.println("KS will do it");
}
void changeName(){
	System.out.println("KS will do it");
}
}

class Participants extends Meeting{ }

class P1{

public static void main(String args[]){
Participants pa = new Participants();
pa.micOnOff();
pa.changeName();
}
}
