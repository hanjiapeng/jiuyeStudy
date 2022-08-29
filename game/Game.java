package game;

import java.util.Scanner;

public class Game {
    User user = new User();
    Computer computer = new Computer();
    Scanner superman = new Scanner(System.in);

    public void face() {
        // 输出游戏界面
        System.out.println("--------------------- 欢 迎 进 入 游 戏 世 界 ---------------------");
        System.out.println("     ****************************************************");
        System.out.println("         ** 游戏规则：赢一局系统自动加10积分；平局不加积分 **");
        System.out.println("                      ** 猜拳，开始 **");
        System.out.println("     ****************************************************");

        // 显示游戏规则
        System.out.println("出拳规则：(1、剪刀  2、石头  3、布)");
    }

    public void userRole() {
        int num;
        int count = 1;
        int count1 = 1;
        int count2 = 6;
        String[] arr = {"吸血鬼", "狼人", "变形金刚"};
        System.out.print("请为自己选择角色(1、吸血鬼  2、狼人  3、变形金刚)：");
        num = superman.nextInt();
        while (num < 1 || num > arr.length) {
            if (count == 1) {
                System.out.println("============================================================================");
                System.out.println("注意：(共有5次重新输入机会,第六次还未输入正确将自动退出系统!!!)");
                System.out.println("============================================================================");
            }
            count++;
            if (count > 7) {
                System.out.println("程序认为您在对游戏进行攻击，自动退出系统!!!");
                System.exit(0);
            } else {
                System.out.println("*** 您还剩" + "(" + count2-- + ")" + "次机会 ***");
                System.out.print("第" + "(" + count1++ + ")" + "次" + "  请重新输入:");
                num = superman.nextInt();
                System.out.println("============================================================================");
            }


        }
        for (int i = 0; i < arr.length; i++) {

//                System.out.println("i1=" + (i + 1));
            if (num == i + 1) {
//                    System.out.println("i=" + (i + 1));
                System.out.println("玩家选择的角色 -----> " + "** " + arr[i] + " **");
                user.setName(arr[i]);
            }
        }
    }

    public void computerRole() {
        String[] arr = {"吸血鬼", "狼人", "变形金刚"};
        int r;
        r = (int) (Math.random() * (2 - 0 + 1) + 0);
//        System.out.println("r=" + r);
        for (int i = 0; i < arr.length; i++) {
            if (r == i) {
                System.out.println("电脑选择的角色 -----> " + "** " + arr[i] + " **");
                computer.setName(arr[i]);
            }
        }
    }

    public void show() {
        String input;
        int count = 0;
        int count1 = 1;
        int count2 = 1;
        int count3 = 6;
        int j = 1;

        for (int i = 1; i >= 0; i++) {
            System.out.print("要开始吗？(y/n):");
            input = superman.next();
            while (!input.equals("y") && !input.equals("n")) {
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
                    input = superman.next();
                    System.out.println("============================================================================");
                }
            }


            if (input.equals("y")) {
                System.out.print("(第" + j++ + "局)" + "请出拳:1、剪刀  2、石头  3、布(输入相应数字):");
                int num = superman.nextInt();


                String uarr;
                String carr;
                uarr = user.userPunches(num);
//            System.out.println(uarr); // 剪刀

                carr = computer.computerPunches();
//            System.out.println("carr=" + carr);
                if (uarr.equals(carr)) {
                    System.out.println("结果:和局！");
                } else if (uarr.equals("剪刀")) {
                    if (carr.equals("石头")) {
                        System.out.println("结果(电脑)：" + "恭喜\t\t" + computer.getName() + "\t\t你赢了");
                        computer.setIntegral();
                    } else if (carr.equals("布")) {
                        System.out.println("结果(玩家)：" + "恭喜\t\t" + user.getName() + "\t\t你赢了");
                        user.setIntegral();
                    }
                } else if (uarr.equals("石头")) {
                    if (carr.equals("剪刀")) {
                        System.out.println("结果(玩家)：" + "恭喜\t\t" + user.getName() + "\t\t你赢了");
                        user.setIntegral();
                    } else if (carr.equals("布")) {
                        System.out.println("结果(电脑)：" + "恭喜\t\t" + computer.getName() + "\t\t你赢了");
                        computer.setIntegral();
                    }
                } else if (uarr.equals("布")) {
                    if (carr.equals("剪刀")) {
                        System.out.println("结果(电脑)：" + "恭喜\t\t" + computer.getName() + "\t\t你赢了");
                        computer.setIntegral();
                    } else if (carr.equals("石头")) {
                        System.out.println("结果(玩家)：" + "恭喜\t\t" + user.getName() + "\t\t你赢了");
                        user.setIntegral();
                    }
                }
                count++;
                System.out.println("============================================================================");

            } else if (input.equals("n")) {
                System.out.println("(玩家)" + user.getName() + "\tvs\t" + "(电脑)" + computer.getName());
                System.out.println("对战次数\t----->\t" + count + "\t次");
                System.out.println("玩家积分：" + user.getIntegral() + "分" + "\t" + "电脑积分：" + computer.getIntegral() + "分");
                if (user.getIntegral() > computer.getIntegral()) {
                    System.out.println("恭喜(玩家)" + user.getName() + "，取得了最终的胜利!!!");
                } else if (user.getIntegral() < computer.getIntegral()) {
                    System.out.println("恭喜(电脑)" + computer.getName() + "，取得了最终的胜利!!!");
                } else if (user.getIntegral() == computer.getIntegral()) {
                    System.out.println("(玩家)" + user.getName() + "\tVS\t" + "(电脑)" + computer.getName() + "\t打成平手，期待下次交手!!!");
                }
                System.exit(0);
            }

        }


    }
}
