package Test05;

import java.util.Scanner;

public class RemoteControl {
    public void controlTV(TV tv){
        System.out.println("遥控器控制电视");
        System.out.println("请输入电视节目");
        Scanner sc = new Scanner(System.in);
        String channel = sc.next();
        tv.play(channel);
    }
}
