
class Assignment extends Thread{
public void run(){
        System.out.println("writing work started");
        for(int i = 1; i<=10; i++){
                System.out.println("writing assignment " + i);
                try{
                        Thread.sleep(1000);
                }catch(InterruptedException e){
                        System.out.println("issue " + e);
                }
        }
        System.out.println("writing work ended");
}
}

class Song extends Thread{
public void run(){
        System.out.println("songs started");
        for(int i=1; i<=20; i++){
                System.out.println("song "+ i);
                try{
                        Thread.sleep(1000);
                }catch(InterruptedException e){
                        System.out.println("issue " + e);
                }
        }
        System.out.println("songs over");
}
}

class P1{
public static void main(String args[]){
System.out.println("day started");
Assignment a = new Assignment();
Song s = new Song();

a.start();
s.start();

try{
        a.join();
        s.join();
}catch(InterruptedException e){
        System.out.println("issue " + e);
}
System.out.println("day ended");
}
}
