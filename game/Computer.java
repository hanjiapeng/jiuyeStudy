package game;

public class Computer {
    private String name; // 名字
    private int integral; // 积分

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
    public String computerPunches() {
        int r;
        String[] arr = {"剪刀", "石头", "布"};
        r = (int) (Math.random() * (2 - 0 + 1) + 0);
//        System.out.println("电脑=" + arr[r]);
        int i;
        for (i = 0; i < arr.length; i++) {
            if (r == i) {
                System.out.println("电脑出拳: " + "** " + arr[i] + " **");
            }

        }
        return arr[r];
    }
}
