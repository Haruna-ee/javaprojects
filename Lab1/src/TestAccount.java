public class TestAccount {
    public static void main(String[] args){
        Account acc1 = new Account("12346","Euro Account");
        Account acc2 = new Account("234566","Dollar", 3000);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc1.credit(1000));
        System.out.println(acc1.getBalance());
        System.out.println(acc2.transferTo(acc1,1000));
        System.out.println(acc1.getBalance());
    }

}
