package Test08;

public class BankCard {
    /*
                1、完成银行卡-主卡的存取款方法
              主卡卡有余额，卡号，户主等属性
              有存款和取款的方法（取款时候余额不足要有提示）
     */
    private String card;
    private double money;
    private String cardId;
    private String name;

    public BankCard() {
    }

    public BankCard(String card, double money, String cardId, String name) {
        this.card = card;
        this.money = money;
        this.cardId = cardId;
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double money){
        System.out.println("用" + card + "存" + money);
        System.out.println("卡号为：" + cardId + " 户主为：" + name);
        this.money = this.money + money;
        System.out.println("存款成功，余额为：" + this.money);
    }

    public void withdraw(double money){
        System.out.println("用" + card + "取" + money);
        System.out.println("卡号为：" + cardId + " 户主为：" + name);
        this.money = this.money - money;
        if (this.money <= 0) {
            System.out.println("余额不足，取款失败");
        } else {
            System.out.println("取款成功，余额为：" + this.money);
        }
    }
}
