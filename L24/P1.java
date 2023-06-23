import java.util.concurrent.*;

class Assignments implements Callable{
public Integer call(){
        System.out.println("writing work started");
        for (int i =1; i<=10; i++){
                System.out.println("writing "+i);
                try{
                        Thread.sleep(1000);
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
        } 
        System.out.println("writing work ended");
        
return 0;
}
}

class Songs implements Callable{
public Integer call(){
        System.out.println("songs started");
        for (int i =1; i<=20; i++){
                System.out.println("song "+i);
                try{
                        Thread.sleep(500);
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
        } 
        System.out.println("song ended");
        
return 0;
}
}
class Movies implements Callable{
public Integer call(){
        System.out.println("movie download started");
        for (int i =1; i<=2; i++){
                System.out.println("movie "+i);
                try{
                        Thread.sleep(5000);
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
        } 
        System.out.println("movie download ended");
        
return 0;
}
}

class P1{
public static void main(String args[]){
        
        System.out.println("Day started");
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new Assignments());
        es.submit(new Songs());
        es.submit(new Movies());
        es.shutdown();
        try{
        while(!es.awaitTermination(24, TimeUnit.HOURS)){
                        System.out.println("still waiting for termination");
                }
        }catch(InterruptedException e){
                System.out.println("issue" + e);
        }
        System.out.println("Day ended");
}
}
