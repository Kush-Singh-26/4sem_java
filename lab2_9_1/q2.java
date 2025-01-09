class q2{
	public static void main(String[] args){
		int noeven = 0;
		int noodd = 0;
		for(int i = 0;i<args.length;i++)
		{
			int temp = Integer.parseInt(args[i]);
			if(temp%2 == 0)
				noeven++;
			else
				noodd++;
		}
		
		System.out.println("Number of even numbers = " + noeven);
		System.out.println("Number of odd numbers = " + noodd);
	}
}