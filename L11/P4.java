// interface
// which has all abstract methods i.e all methods dont have body
// all methods are public and public can only be public
// no need to declare abstract for methods 
// extends -> implements
// interface methods are by default public abstract

interface Meeting {
void micOnOff() ; 
void changeName();
}

class Participants implements Meeting{
//compulsory to write public 
public void changeName(){
	System.out.println("PA will do it");
}
//compulsory to write public 
public void micOnOff(){
	System.out.println("PA will do it");
}

}

class P4{
public static void main(String args[]){
Participants pa = new Participants();
pa.micOnOff();
pa.changeName();
}
}
