package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        long balance = amit.getBankBalance();
        System.out.println(balance);
//        System.out.println(amit.bankBalance); can't access -> private

        //Cashier
        ICICIBank cashier = new ICICIBank("Cashier", 100);
        cashier.setBankBalance(200, true);
        System.out.println(cashier.getBankBalance());
    }

}

class ICICIBank{
    private String bankName;
    private long bankBalance;

    public ICICIBank(String bankName, long bankBalance) {
        this.bankName = bankName;
        this.bankBalance = bankBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(long bankBalance, boolean isCashier) {
        if(isCashier){
            this.bankBalance = bankBalance;
        }else{
            System.out.println("Not Allowed");
        }
    }
}