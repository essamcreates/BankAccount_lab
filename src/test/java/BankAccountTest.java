import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
//    the @BeforeEach is setting up an object so that we don't have to create it every single time
    public void setUp(){
        bankAccount = new BankAccount();
        bankAccount.setFirstName("Mohamed");
        bankAccount.setLastName("Hussain");
        bankAccount.setDateOfBirth("10/02/95");
        bankAccount.setAccountNumber(12345);
        bankAccount.setBalance(1987);
    }

    @Test
    public void canGetFirstName(){
//        when
        String actual = bankAccount.getFirstName();
//        then
        String expect = "Mohamed";
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void canGetLastName(){
//        when
        String actual = bankAccount.getLastName();
//        then
        String expect = "Hussain";
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void canGetDateOfBirth(){
//        when
        String actual = bankAccount.getDateOfBirth();
//        then
        String expect = "10/02/95";
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void canGetAccountNumber(){
//        when
        int actual = bankAccount.getAccountNumber();
//        then
        int expect = 12345;
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void canGetBalance(){
        //    when
        int actual = bankAccount.getBalance();
//    then
        int expect = 1987;
        assertThat(actual).isEqualTo(expect);
    }









}