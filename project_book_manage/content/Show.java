package project_book_manage_2.content;

import project_book_manage_2.user.Login;

public class Show {
    public void interFace() {
        System.out.println("*************** 欢迎来到博客管理系统 ***************");
        System.out.println("           ******* 请先注册账号 *******");
        Login login = new Login();
        login.login();
    }

}
