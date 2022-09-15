package project_book_manage_2.user;
import java.util.Scanner;

public class Login {
    private String user;
    private String password;
    Scanner scanner = new Scanner(System.in);
    public void login(){
        Register register = new Register();
        register.reg();

        System.out.print("输入账号:");
        this.user = scanner.next();
        System.out.print("输入密码:");
        this.password = scanner.next();
        if(this.user.equals(register.getUser()) && this.password.equals(register.getPassword())){
            System.out.println("***** 登录成功 *****");
        }

        while (!(this.user.equals(register.getUser()) && this.password.equals(register.getPassword()))){
            if(!(this.user.equals(register.getUser()))) {
                System.out.print("*** 账号输入错误,请重新输入:");
                this.user = scanner.next();
                System.out.println("***** 登录成功 *****");
            }else if(!(this.password.equals(register.getPassword()))){
                System.out.print("*** 密码输入错误,请重新输入:");
                this.password = scanner.next();
                System.out.println("***** 登录成功 *****");
            }else if(!(this.user.equals(register.getUser()) && this.password.equals(register.getPassword()))){
                System.out.println("*** 账号密码错误 ***");
                System.out.print("*** 请重新输入账号:");
                this.user = scanner.next();
                System.out.print("*** 请重新输入密码:");
                this.password = scanner.next();
                System.out.println("***** 登录成功 *****");
            }


        }
    }
}
