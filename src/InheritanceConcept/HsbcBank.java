package InheritanceConcept;

public class HsbcBank implements BrazilBank,NorthAmericaBank {
	
	/**all the inteface methods must be inherited, this is multiple inheritance**/

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc credit");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc debit");
		
		
	}

	@Override
	public void tranfermoney() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc transfermoney");
		
		
	}
	
	public void educationloan() {
		System.out.println("Hsbc edu loan");
		
	}

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc mutual fund");
	}

	@Override
	public void mortgage() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc mortgage fund");
	}
	}
	
	
	
