package Test02;

import java.util.Random;

public class Man1VsMan2 {
    String name;
    int blood;
    char sex;
    String face;

    String[] boyfaces = {"风流俊雅","气字轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces = {"美奂绝伦","沉鱼落雁","婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    String[] attacks_desc = {
        "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
        "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%S。",
        "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
        "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
        "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
        "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Man1VsMan2() {
    }

    public Man1VsMan2(String name, int blood, char sex){
        this.name = name;
        this.blood = blood;
        this.sex = sex;
        getFaces();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void mansPK(Man1VsMan2 man){
        Random r = new Random();

        int injure = r.nextInt(20) + 1;

        int remainBlood = man.getBlood() - injure;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        man.setBlood(remainBlood);

        int index1 = r.nextInt(attacks_desc.length);

        System.out.printf(attacks_desc[index1], this.getName(), man.getName());
        System.out.println();
        if (remainBlood >= 90) {
            System.out.printf(injureds_desc[0], man.getName());
        } else if (remainBlood >=80 && remainBlood < 90) {
            System.out.printf(injureds_desc[1], man.getName());
        } else if (remainBlood >=70 && remainBlood < 80) {
            System.out.printf(injureds_desc[2], man.getName());
        } else if (remainBlood >=50 && remainBlood < 70) {
            System.out.printf(injureds_desc[3], man.getName());
        } else if (remainBlood >=30 && remainBlood < 50) {
            System.out.printf(injureds_desc[4], man.getName());
        } else if (remainBlood >10 && remainBlood < 30) {
            System.out.printf(injureds_desc[5], man.getName());
        } else if (remainBlood >0 && remainBlood < 10) {
            System.out.printf(injureds_desc[6], man.getName());
        } else {
            System.out.printf(injureds_desc[7], man.getName());
        }

    }

    public void getFaces(){
        Random r = new Random();
        int index = 0;
        if (this.getSex() == '男') {
            index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (this.getSex() == '女') {
            index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "惨不忍睹";
        }

    }
}
