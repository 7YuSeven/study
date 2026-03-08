package Test04;

import Test03.Husky;

public class Test04 {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        System.out.println("--------------------------------");

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();

        System.out.println("--------------------------------");

        SharPei sharPei = new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();
    }
}
