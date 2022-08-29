package game;

import java.util.Scanner;

public class User {
    private String name;  // 名字
    private int integral; // 积分

    Scanner superman = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral() {
        integral += 10;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    // 出拳方法
    public String userPunches(int num) {
        String[] arr = {"剪刀", "石头", "布"};
        int i;
        int count1 = 1;
        int count2 = 1;
        int count3 = 6;
        while (num > arr.length || num < 1) {
            if (count1 == 1) {
                System.out.println("============================================================================");
                System.out.println("注意：(共有5次重新输入机会,第六次还未输入正确将自动退出系统!!!)");
                System.out.println("============================================================================");
            }
            count1++;
            if (count1 > 7) {
                System.out.println("程序认为您在对游戏进行攻击，自动退出系统!!!");
                System.exit(0);
            } else {
                System.out.println("*** 您还剩" + "(" + count3-- + ")" + "次机会 ***");
                System.out.print("第" + "(" + count2++ + ")" + "次" + "  请重新输入:");
                num = superman.nextInt();
                System.out.println("============================================================================");
            }
        }

        for (i = 0; i < arr.length; i++) {

            if (num == i + 1) {
                System.out.println("玩家出拳: " + "** " + arr[i] + " **");
            }
        }

        return arr[num - 1];
    }
}
