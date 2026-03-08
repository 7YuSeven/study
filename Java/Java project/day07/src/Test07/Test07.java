package Test07;

public class Test07 {
    public static void main(String[] args) {
        /*
        对象数组4
            定义数组存储4个女朋友的对象
            女朋友的属性:姓名、年龄、性别、爱好
            要求1:计算出四女朋友的平均年龄
            要求2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来。
         */

        GirlFriend[] girlFriend = new GirlFriend[4];

        GirlFriend g1 = new GirlFriend("张三", 18, '女', "看电视");
        GirlFriend g2 = new GirlFriend("莉丝", 19, '女', "跑步");
        GirlFriend g3 = new GirlFriend("王五", 20, '女', "游泳");
        GirlFriend g4 = new GirlFriend("阿狸", 22, '女', "骑行");

        girlFriend[0] = g1;
        girlFriend[1] = g2;
        girlFriend[2] = g3;
        girlFriend[3] = g4;

        int sum = 0;
        for (int i = 0; i < girlFriend.length; i++) {
            GirlFriend gf = new GirlFriend();
            gf = girlFriend[i];
            sum = sum + gf.getAge();
        }

        int avg = sum / girlFriend.length;
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < girlFriend.length; i++) {
            GirlFriend gf = new GirlFriend();
            gf = girlFriend[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getSex() + ", " + gf.getHobby());
            }
        }

    }
}
