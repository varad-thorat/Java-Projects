// abstract class 
// in which some methods have body and some dont have body or all methods dont 
// have body
// an abstract method always need to declare subclass and in it method need to be 
// overriden
// method need to be declared as abstract which dont have body

abstract class Meeting {
void micOnOff(){
	System.out.println("KS will do it");
}
abstract void changeName();
}

class Participants extends Meeting{
void changeName(){
	System.out.println("PA will do it");
}

}

class P2{

public static void main(String args[]){
Participants pa = new Participants();
pa.micOnOff();
pa.changeName();
}
}
