package Test08;

public class SecondaryBankCard extends BankCard{
    /*
                2、完成银行卡-副卡的取款方法
              副卡额外有透支额度属性(副卡可用主卡中余额，且余额不够，可以透支额度)
              副卡重写取款方法（取款时候余额不足要有提示）
     */

    private double overdraw;

    public SecondaryBankCard() {
    }

    public SecondaryBankCard(String card, double money, String cardId, String name, double overdraw) {
        super(card, money, cardId, name);
        this.overdraw = overdraw;
    }

    public double getOverdraw() {
        return overdraw;
    }

    public void setOverdraw(double overdraw) {
        this.overdraw = overdraw;
    }

    @Override
    public void deposit(double money) {
        System.out.println("用" + getCard() + "存" + money);
        System.out.println("卡号为：" + getCardId() + " 户主为：" + getName());
        setMoney(getMoney() + money);
        System.out.println("存款成功，余额为：" + getMoney() + "，透支额度：" + overdraw);
    }

    @Override
    public void withdraw(double money) {
        System.out.println("用" + getCard() + "取" + money);
        System.out.println("卡号为：" + getCardId() + " 户主为：" + getName());
        if (getMoney() >= money) {
            setMoney(getMoney() - money);
            System.out.println("取款成功，余额为：" + getMoney() + "，透支额度：" + overdraw);
        } else {
            double needMoney = money - getMoney();
            if (overdraw >= needMoney) {
                overdraw = overdraw - needMoney;
                super.setMoney(0);
                System.out.println("取款成功，余额为：" + getMoney() + "，透支额度：" + overdraw);
            } else {
                System.out.println("余额不足，取款失败");
            }
        }
    }
}
