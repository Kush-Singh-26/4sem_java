
class NewThread extends Thread{
    NewThread(){}
    public void run(){
        System.out.println("Thread name : " + Thread.currentThread().getName() + "Priority : " + Thread.currentThread().getPriority());
        for(int i= 4;i>0;i--){
            System.out.println("Thread : " + Thread.currentThread().getName() + ", " + i);
        }
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void start(){
        super.start();
    }
}

class prioritythread {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();
        NewThread t3 = new NewThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
