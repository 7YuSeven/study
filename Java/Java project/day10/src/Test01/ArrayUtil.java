package Test01;

public class ArrayUtil {
    //打印整数数组
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (i == arr.length - 1) {
                sb.append(number);
            } else {
                sb.append(number + ", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }

    //返回平均分
    public static double getAvg(double[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum / arr.length;
    }
}
