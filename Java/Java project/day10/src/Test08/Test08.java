package Test08;

public class Test08 {
    public static void main(String[] args) {
        /*
        定义银行卡：主卡和副卡类，完成下列功能
            1、完成银行卡-主卡的存取款方法
              主卡卡有余额，卡号，户主等属性
              有存款和取款的方法（取款时候余额不足要有提示）
            2、完成银行卡-副卡的取款方法
              副卡额外有透支额度属性(副卡可用主卡中余额，且余额不够，可以透支额度)
              副卡重写取款方法（取款时候余额不足要有提示）
            3、写测试案例，分别测试主卡和副卡的存取款功能（存取款后显示余额）
         */
        BankCard bankCard = new BankCard("主卡",100, "123456", "张三");
        System.out.println("初始银行卡 - " + bankCard.getCard() + "余额为：" + bankCard.getMoney());
        bankCard.deposit(100);
        bankCard.withdraw(1000);

        System.out.println("--------------------------------------------------------------------------------");

        SecondaryBankCard secondaryBankCard = new SecondaryBankCard("副卡", 200, "456789", "李四", 1000);
        System.out.println("初始银行卡 - " + secondaryBankCard.getCard() + "余额为：" + secondaryBankCard.getMoney());
        secondaryBankCard.deposit(100);
        secondaryBankCard.withdraw(1000);
    }
}
