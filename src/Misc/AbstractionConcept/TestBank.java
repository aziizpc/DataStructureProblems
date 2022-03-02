package Misc.AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();

		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();

		Bank b1 = new HDFCBank(); // Dynamic Polymorphism?? --> Note this
		b1.credit();
		b1.debit();
		b1.loan();
		// b.funds(); --> Not possible

		// Bank b2 = new Bank(); // THIS IS NOT ALLOWED (Cannot create object of
		// Abstract class!!)

	}

}