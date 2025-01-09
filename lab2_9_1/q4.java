class counter{
	static int obj = 0;
	
	counter(){
		obj++;
	}
	static int getcount(){
		return obj;
	}
}

class q4{
	public static void main(String[] args){
		counter a = new counter();
		counter b = new counter();
		counter c = new counter();
		
		System.out.println("Number of objects = " +counter.getcount());
	}
}