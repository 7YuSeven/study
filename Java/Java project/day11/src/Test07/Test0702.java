package Test07;

public class Test0702 {
    public class Test {
        public static void main(String[] args) {
            // 在此处完成代码
            A a = new Test0702().new A();
//            a.methodA(new InterA() {
//                @Override
//                public void showA() {
//                    System.out.println("showA");
//                }
//            });
            InterA interA = new Test0702().new InterImpl();
            a.methodA(interA);
        }
    }
    //定义接口
    interface InterA {
        void showA();
    }

    class InterImpl implements InterA {

        @Override
        public void showA() {
            System.out.println("nihao");
        }
    }

    class A {
        public void methodA(InterA a) {
            a.showA();
        }
    }
}
