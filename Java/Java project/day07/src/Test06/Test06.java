package Test06;

public class Test06 {
    public static void main(String[] args) {
        /*
        对象数组3
            定义数组存储3部手机对象。
            手机的属性:品牌，价格，颜色。
            要求，计算出三部手机的平均价格
         */
        Phone[] phones = new Phone[3];

        Phone p1 = new Phone("华为", 5000.0, "白色");
        Phone p2 = new Phone("小米", 3999.0, "黑色");
        Phone p3 = new Phone("魅族", 2999.0, "蓝色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        double sum = 0;

        for (int i = 0; i < phones.length; i++) {
            sum = sum + phones[i].getPrice();
        }

        double avg = sum / phones.length;

        System.out.println(avg);
    }
}
