package edu.abc;

class BankAccount{
	int accNo;
	String custName;
	String accType;
	double balance;

	public int getAccount_number() {
        return accNo;
    }
   
    public void setAccount_number(int accoNo) {
        this.accNo = accNo;
    }
   
    public String getName() {
        return custName;
    }
   
    public void setName(String custName) {
        this.custName = custName;
    }
   
    public String getAccount_type() {
        return accType;
    }
   
    public void setAccount_type(String accType) {
        this.accType = accType;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
   
   public BankAccount(int accNo, String custName, String accType,
            double balance) {
       
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is = "+balance);
           
        }
       
       
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("cant deposit bal insufficient");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
        }
     void display()
     {
    System.out.println("Balance is = "+getBalance());   
     }
     public static void main(String[] args) {
       
       
        BankAccount b=new BankAccount(1024,"riya","Savings",2000);
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        
        }
    

     }