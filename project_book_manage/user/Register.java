package project_book_manage_2.user;

import java.util.Scanner;

public class Register {
    private String user; // 账号
    private String password; // 密码
    private String confirmPassword; // 确认密码
    private String[] arr = new String[3]; // 存放账号和密码
    Scanner scanner = new Scanner(System.in);

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }


    public void reg() {
        // 输入账号
        int count1 = 1, count2 = 6;
        System.out.print("输入账号:");
        this.user = scanner.next();
        System.out.print("输入密码:");
        this.password = scanner.next();
        System.out.print("再次确认密码:");
        this.confirmPassword = scanner.next();

        if (password.equals(confirmPassword)) {
            arr[0] = this.user;
            arr[1] = this.password;
            System.out.println("*** 注册成功，自动跳转到登录界面 ***");
        }

        while (!(password.equals(confirmPassword))) {
            if(count1 == 1) {
                System.out.println("===========================");
                System.out.println("只有6次重新输入的机会哦!!!");
                System.out.println("===========================");
            }

            if(count1 <= 6) {
                System.out.println("****************************");
                System.out.println("还剩" + " ** " + count2-- + " ** " + "次机会");
                System.out.print("重新输入密码:");
                this.password = scanner.next();
                System.out.print("再次确认密码:");
                this.confirmPassword = scanner.next();
                System.out.println("****************************");
                count1++;
                System.out.println("*** 注册成功，自动跳转到登录界面 ***");
            }else{
                System.out.println("系统认为您在对程序进行攻击，强制退出程序");
                System.exit(0);
            }
        }
//        System.out.println("账号:" + arr[0]);
//        System.out.println("密码:" + arr[1]);


//        arr[0] = "1";


    }
}
