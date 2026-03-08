package Test01;

public class Test01 {
    public static void main(String[] args) {
        Man1VsMan2 man1 = new Man1VsMan2("灰太狼", 100);
        Man1VsMan2 man2 = new Man1VsMan2("喜羊羊", 100);

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
