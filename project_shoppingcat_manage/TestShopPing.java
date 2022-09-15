package project_shoppingcat_manage;

import java.util.Scanner;

public class TestShopPing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShopPingManage shop = new ShopPingManage();
        System.out.println("** 欢迎进入购物车 **");
        while (true) {
            System.out.println("   ** 菜单栏 **");
            System.out.println("   1、添加商品");
            System.out.println("   2、修改商品");
            System.out.println("   3、删除商品");
            System.out.println("   4、查看商品");
            System.out.println("   5、购买商品");
            System.out.println("   6、充值金额");
            System.out.println("   7、退出系统");
            System.out.print("输入选择的数字:");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*** 已进入添加商品系统 ***");
                    System.out.print("输入商品编号:");
                    int id = input.nextInt();
                    System.out.print("输入商品名称:");
                    String name = input.next();
                    System.out.print("输入商品价格:");
                    double price = input.nextDouble();
                    System.out.print("输入商品数量:");
                    int num = input.nextInt();
                    ShopPing shopPing = new ShopPing(id, name, price, num);
                    shop.addShopPing(shopPing);
                    break;
                case 2:
                    System.out.println("** 已进入修改系统 **");
                    System.out.println("1 --> 修改商品数量");
                    System.out.println("2 --> 修改商品价格");
                    System.out.print("请选择要修改的商品信息:");
                    String deleteStr = input.next();
                    if (deleteStr.equals("1")) {
                        System.out.println("** 欢迎进入修改(商品数量)系统 **");
                        System.out.print("请输入要修改的商品编号:");
                        int deleteId = input.nextInt();
                        System.out.print("请输入要修改的商品数量:");
                        int deleteNum = input.nextInt();
                        shop.updateShopPingNum(deleteId, deleteNum);
                    } else if (deleteStr.equals("2")) {
                        System.out.println("** 欢迎进入修改(商品价格)系统 **");
                        System.out.print("请输入要修改的商品编号:");
                        int deleteId = input.nextInt();
                        System.out.print("请输入要修改的商品价格:");
                        int deletePrice = input.nextInt();
                        shop.updateShopPingPrice(deleteId, deletePrice);
                    }
                    break;
                case 3:
                    System.out.println("** 已进入删除系统 **");
                    System.out.print("请输入要删除的商品编号:");
                    int deleteId = input.nextInt();
                    shop.deleteShopPing(deleteId);
                    break;
                case 4:
                    shop.queryShopPing();
                    break;
                case 5:
                    System.out.println("** 已进入购买系统 **");
                    System.out.println("总金额 ** " + shop.getBuyPrice() + " ** 元");
                    System.out.println("==============================================");
                    System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品数量");
                    for (int i = 0; i < shop.getList().size(); i++) {
                        System.out.println(shop.getList().get(i));
                    }
                    System.out.println("==============================================");
                    System.out.print("请输入要购买的商品编号:");
                    int buyId = input.nextInt();
                    shop.buyShopPing(buyId);
                    break;
                case 6:
                    System.out.println("** 欢迎进入充值系统 **");
                    System.out.println("** 当前余额为(" + shop.getBuyPrice() + ")元 **");
                    System.out.print("请输入充值金额(一次最大充值50000元):");
                    double rechargeMoney = input.nextDouble();
                    shop.buyRecharge(rechargeMoney);
                    break;
                case 7:
                    shop.quitShopPing();
                    break;
                default:
                    System.out.println("** 输入错误，请重新输入 **");
            }
        }

    }
}
