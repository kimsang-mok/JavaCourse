public class Main {


    public static void main(String[] args) {
//        Account account1 = new Account("12345", 1000.00, "Kimsang",
//                "kimsang.mok01@gmail.con", "017702326");
        Account account1 = new Account();
        account1.deposit(20);
        account1.withDraw(1030);
        account1.describeAccount();
        System.out.println(account1.getName());
        System.out.println(Account.lastName);
    }
}