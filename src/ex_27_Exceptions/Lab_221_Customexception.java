package ex_27_Exceptions;

public class Lab_221_Customexception {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank Axis = new Bank("INR",200);
        Bank Standard_charted = new Bank("USD",150);
        Integer total_Bal = sbi.add(Axis);
        Integer tot_bal = sbi.add(Standard_charted);
        System.out.println(total_Bal);
        System.out.println(tot_bal);
    }
}
class Bank
{
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

public Integer add(Bank bank) throws Exception {
 if(bank.currency.equalsIgnoreCase("INR")){
     return bank.amount + this.amount;
 } else {
     try {
         throw new Custom_Exception("Currency Mismatched,Can't Proceed");
     }
     catch (Custom_Exception e){
         throw new RuntimeException(e);
     }
 }
}
}


class  Custom_Exception extends Exception{
    Custom_Exception(String msg){
        super(msg);
    }
}