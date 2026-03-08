package Test01;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] dArr = {2.2,3.5,4.8,6.2,5.4,7.2};
        double sum = ArrayUtil.getAvg(dArr);
        System.out.println(sum);
    }
}
