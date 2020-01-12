package JavaAbstraction;

public class BankExample {
	public static void main(String[] args) {
		bank r =new SBI();
		bank h = new HDFC();
		/*r.rateOfInterest();
		h.rateOfInterest();*/
		System.out.println("sbi rate "+r.rateOfInterest()+"%");
		System.out.println("hdfc rate "+h.rateOfInterest()+"%");
	}
}

abstract class bank{
	abstract int rateOfInterest();
}

class SBI extends bank{
	int rateOfInterest() {
		return 7;	
	}
}

class HDFC extends bank{
	int rateOfInterest() {
		return 10;
	}
}