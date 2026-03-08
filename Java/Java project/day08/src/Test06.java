public class Test06 {
    public static void main(String[] args) {
        /*
        7位数金额转换
         */
        int money = 5123;

        char[] capital = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};

        String strMoney = "";

        while(money != 0){
            int number = money % 10;
            money = money / 10;

            strMoney = capital[number] + strMoney;
        }

        int len = 7 - strMoney.length();

        for (int i = 0; i < len; i++) {
            strMoney = "零" + strMoney;
        }

        char[] unit = {'佰', '拾', '万', '仟', '佰', '拾', '元'};

        String newMoneyStr = "";

        for (int i = 0; i < strMoney.length(); i++) {
            char c =strMoney.charAt(i);

            newMoneyStr = newMoneyStr + c + unit[i];
        }

        System.out.println(newMoneyStr);
    }
}
