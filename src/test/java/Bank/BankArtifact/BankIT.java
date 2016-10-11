package Bank.BankArtifact;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Bank.BankArtifact.Bank;
import Bank.BankArtifact.Client;

public class BankIT {
	public final float floatTolerance = 0.0001f;
	private Bank bank;
	
	@Before
    public void setUp() {
		// this is a simple abstraction from what would be a database connection
		// testing several systems with one simple test
		
		bank = new Bank();
		Client carlos = new Client("Carlos");
		Client melo = new Client("Melo");
		Client rui = new Client("Rui");
		
		bank.addClient(carlos);	bank.addClient(melo); bank.addClient(rui);
    }
	

	@Test
	public void testDepositAmount() {
		// use the functions depositAccount(Client,float) & getClientByName(String) from Bank 
		bank = new Bank();
		Client carlos = new Client("Carlos");
		bank.addClient(carlos);
		
		bank.depositAccount(bank.getClientByName("Carlos"),(float) 100.0);
		assertEquals((float) bank.getClientByName("Carlos").getAccount().getAmount(), (float) 100.0, 0.0001);

	}
	
	@Test	
	public void testWithdrawAmount() {	
		// use the functions depositAccount(Client), getClientByName(String) & withdrawClientAccount(Client) from Bank
		assertTrue(false);
	}
	
	@Test
	public void testTransactionBetweenUsers() {
		// use the functions transfer(Client,Client,float) & getClientByName(String) from Bank
		assertTrue(false);
	}

}
