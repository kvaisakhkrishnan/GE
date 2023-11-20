class LeapYear{
	public static void main(String args[])
	{
		String year = args[0];
		if(year.length() != 4){
			System.out.println("Invalid Year");
		}
		else{
			if(Integer.parseInt(year) % 4 == 0){
				System.out.println("Leap Year");
			}
			else{
				System.out.println("Not Leap Year");
			}
		}
		
	}
}
