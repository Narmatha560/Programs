public class ATM{
	public static void main(String[] args){
		double balance=1000.0;
		double withdrawamount=1500.0;
		try{
		if(withdrawamount>balance){
			throw new Exception("Insuffcient balance");
		}
		balance=withdrawamount;
		System.out.print("withdrawal successful remaining balance:"+balance);
		}catch(Exception e){
		System.out.println("Error:"+e.getMessage());
		}
	}
}