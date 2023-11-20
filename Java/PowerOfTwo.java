import java.lang.Math;
class PowerOfTwo{
	public static void main(String args[]){
		if(Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[0]) >= 31){
			System.out.println("Invalid N value");	
		}
		else{
			for(int i = 1; i <= Integer.parseInt(args[0]); i++){
				System.out.println("2 ^ " + i + " = " + Math.pow(2 , i));
			}
		}
	}
}
