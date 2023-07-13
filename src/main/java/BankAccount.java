public class BankAccount {


    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;


    public BankAccount(){
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = "";
        this.accountNumber = 0;
        this.balance = 0;
    }

//        Getters and Setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }


//    Method to deposit an amount


//    Method to withdraw an amount



}
