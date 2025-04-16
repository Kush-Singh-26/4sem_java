class prac{
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Current thread : " + t + " , id : " + t.threadId());
		t.setName("Main thread");
		System.out.println("After name change : " + t);
		try{
			for(int i = 0;i<5;i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
				System.out.println("Main thread interupted");
		}
	}
		
}