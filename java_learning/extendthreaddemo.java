
class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread : " + this);
        start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("child interrupted");
        }
    System.out.println("exiting child thread");
    }
}

class extendthreaddemo {
    public static void main (String args[]){
            new NewThread();
            try{
                for(int i = 5;i>0;i--){
                    System.out.println("Main thread : " + i);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                System.out.println("main thread interrupted");
            }
            System.out.println("Main thread exiting");
    }    
}
