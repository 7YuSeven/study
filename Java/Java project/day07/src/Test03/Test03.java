package Test03;

public class Test03 {
    public static void main(String[] args) {
        /*
        对象数组1
            定义数组存储3个商品对象。
            商品的属性:商品的id，名字，价格，库存。
            创建三个商品对象，并把商品对象存入到数组当中。
         */
        Goods[] goods = new Goods[3];

        Goods g1 = new Goods(1, "华为", 6999.0, 100);
        Goods g2 = new Goods(2, "小米", 1999.0, 200);
        Goods g3 = new Goods(3, "Vivo", 3999.0, 300);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + ", " + goods[i].getName() + ", " + goods[i].getPrice() + ", " + goods[i].getReamain());
        }
    }
}
