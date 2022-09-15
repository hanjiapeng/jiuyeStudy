package project_book_manage_2.content;

import project_book_manage_2.TestBlog;
import project_book_manage_2.user.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Content {

    private Employee[] employees = new Employee[100];


    private String id;
    private String name;
    private String content;
    Scanner scanner = new Scanner(System.in);
    Quit quit = new Quit();

    public void interFace(int n) {

        try {
            do {
                if (n <= 0) {
                    System.out.println("*** 欢迎进入图书系统1.0版 ***");
                }
                System.out.println("*** 菜单栏 ***");
                System.out.println("   1、添加");
                System.out.println("   2、修改");
                System.out.println("   3、删除");
                System.out.println("   4、查询");
                System.out.println("   5、退出");
                System.out.println("**************");
                System.out.print("请输入要操作的数字:");
                int num = scanner.nextInt();

                switch (num) {
                    case 1:
                        addContent();
                    case 2:
                        updateContent();
                    case 3:
                        deleteContent();
                    case 4:
                        checkContent();
                    case 5:
                        quit.quit();
                    default:
                        System.out.println("输入错误，重新输入");
                }
            } while (true);

        } catch (InputMismatchException e) {
            TestBlog.main(null);
        }
    }


    public void addContent() {


        System.out.println("*** 欢迎进入程序，请添加内容 ***");
        String add;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null) {
                System.out.print("输入图书编号:");
                this.id = scanner.next();
                System.out.print("输入图书名称:");
                this.name = scanner.next();
                System.out.print("输入图书价格:");
                this.content = scanner.next();
                employees[i] = new Employee(this.id, this.name, this.content);


                System.out.println("y --> 继续添加内容");
                System.out.println("n --> 回到菜单栏");
                System.out.print("请输入您的选择:");
                add = scanner.next();
                if (add.equals("y")) {
                    addContent();
                } else if (add.equals("n")) {
                    interFace(1);
                }

                while (!(add.equals("y") || add.equals("n"))) {
                    System.out.print("输入错误，重新输入:");
                    add = scanner.next();
                    if (add.equals("y")) {
                        addContent();
                    } else if (add.equals("n")) {
                        interFace(1);
                    }
                }
            }
        }

    }


    public void checkContent() {
        System.out.println("********** 欢迎进入查询系统 **********");
        System.out.println("图书编号\t\t图书名称\t\t图书价格");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
        System.out.println("***********************************");
        interFace(1);

    }

    public void updateContent() {
//        Employee employee = new Employee("001", "aaa", "aaa");
//        Employee [] arr = {employee};
        String up;
        System.out.println("图书编号\t\t图书名称\t\t图书价格");
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null) {
                System.out.println(employees[j]);
            }
        }
        System.out.print("请输入要修改的id:");
        int update = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (update == i + 1) {
                System.out.print("请输入要修改的价格:");
                String con = scanner.next();
                employees[i].setContent(con);
                System.out.println("** 价格修改成功 **");
                System.out.println("==============================");

                System.out.println("y --> 继续修改");
                System.out.println("n --> 回到菜单栏");
                System.out.print("是否继续修改:");
                up = scanner.next();
                if (up.equals("y")) {
                    updateContent();
                } else if (up.equals("n")) {
                    interFace(1);
                }
                while (!(up.equals("y") || up.equals("n"))) {
                    System.out.print("输入错误，重新输入:");
                    up = scanner.next();
                    if (up.equals("y")) {
                        updateContent();
                    } else if (up.equals("n")) {
                        interFace(1);
                    }
                }
            }
        }


    }


//    }


    public void deleteContent() {
        System.out.println("图书编号\t\t图书名称\t\t图书价格");
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null) {
                System.out.println(employees[j]);
            }
        }
        System.out.print("输入要删除的id:");
        int n = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (n == i + 1) {
                for (int j = i; j < employees.length - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                if (employees[employees.length - 1] != null) {
                    employees[employees.length - 1] = null;
                }
                System.out.println("** 删除成功 **");
                System.out.println("==============================");

                System.out.println("y --> 继续删除");
                System.out.println("n --> 回到菜单栏");
                System.out.print("是否继续删除:");
                String de = scanner.next();
                if (de.equals("y")) {
                    deleteContent();
                } else if (de.equals("n")) {
                    interFace(1);
                }

                while (!(de.equals("y") || de.equals("n"))) {
                    System.out.print("输入错误，重新输入:");
                    de = scanner.next();
                    if (de.equals("y")) {
                        deleteContent();
                    } else if (de.equals("n")) {
                        interFace(1);
                    }
                }
            }
        }
    }

}
