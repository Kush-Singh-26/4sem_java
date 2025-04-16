
class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread : " + t);
        t.start();
    }

    public void run(){
        try{
            for(int i= 5;i>0;i--){
                System.out.println(name + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "exiting");
    }
}

class multithreaddemo {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("two");
        NewThread obj3 = new NewThread("three");
        System.out.println(obj1.t.isAlive());
        System.out.println(obj2.t.isAlive());
        System.out.println(obj3.t.isAlive());
        try{
            System.out.println("Waiting to finish");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }catch(InterruptedException e){
            System.err.println("maint thread interrupted");
        }
        System.out.println(obj1.t.isAlive());
        System.out.println(obj2.t.isAlive());
        System.out.println(obj3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
