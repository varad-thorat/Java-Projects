
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

class P2{
public static void main(String args[]){
System.out.println("day started");
Assignment a = new Assignment();
Thread t1 = new Thread(a);
Song s = new Song();
Thread t2 = new Thread(s);

t1.start();
t2.start();

try{
        t1.join();
        t2.join();
}catch(InterruptedException e){
        System.out.println("issue " + e);
}
System.out.println("day ended");
}
}