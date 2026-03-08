public class Test15 {
    public static void main(String[] args) {
        /*
        给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
            返回字符串中最后一个单词的长度。
            单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
         */

        String str = "Hello World nihao shijie";

        getWord(str);

    }

    public static void getWord(String str){
        int count = 0;

        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 32) {
                break;
            }
            word = str.charAt(i) + word;
            count++;
        }

        System.out.println(word);
        System.out.println(count);
    }
}
