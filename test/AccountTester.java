import org.junit.*;
import static org.junit.Assert.*;

public class AccountTester {

    private SavingsAccount sacc;

    @Before
    protected void setUp() throws Exception {
        sacc = new SavingsAccount();
    }

// The garbage collector does this implicitly, so this method is here just for didactic reason.
    @After
    protected void tearDown() {
        sacc = null;
    }

    @Test
    public void testTransferIfEnoughFunds () throws InsufficientFundsException {
        
    }

} 
