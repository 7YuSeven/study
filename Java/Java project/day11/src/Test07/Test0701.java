package Test07;

public class Test0701 {
    interface Inter {
        void show();
    }
    class Outer {
        //补齐代码，要求在控制台输出”HelloWorld”
        public Inter method(){
            return new A();
        }
    }

    class A implements Inter{
        public void show(){
            System.out.println("HelloWorld");
        }
    }
    public class OuterDemo {
        public static void main(String[] args) {
            Outer outer = new Test0701().new Outer();
            outer.method().show();
        }
    }
}
