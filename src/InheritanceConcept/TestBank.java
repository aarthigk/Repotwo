package InheritanceConcept;

public class TestBank {
	
	public static void main(String a[]) {
		
		HsbcBank h= new HsbcBank();
		h.credit();
		h.debit();
		h.educationloan();
		h.tranfermoney();
		h.mortgage();
		
		System.out.println(UsBank.min_balace);
	}

}
