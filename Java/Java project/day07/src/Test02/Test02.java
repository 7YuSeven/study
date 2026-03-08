package Test02;

public class Test02 {
    public static void main(String[] args) {
        Man1VsMan2 man1 = new Man1VsMan2("灰太狼", 100, '男');
        Man1VsMan2 man2 = new Man1VsMan2("喜羊羊", 100, '男');

        System.out.println(man1.getName() + ", " + man1.getBlood() + ", " + man1.getSex() + ", " + man1.getFace());
        System.out.println(man2.getName() + ", " + man2.getBlood() + ", " + man2.getSex() + ", " + man2.getFace());

        while(true){
            man1.mansPK(man2);
            System.out.println();
            if (man2.getBlood() == 0) {
                System.out.println(man1.getName() + "K.O.了" + man2.getName());
                break;
            }
            man2.mansPK(man1);
            System.out.println();
            if (man1.getBlood() == 0) {
                System.out.println(man2.getName() + "K.O.了" + man1.getName());
                break;
            }
        }
    }
}
