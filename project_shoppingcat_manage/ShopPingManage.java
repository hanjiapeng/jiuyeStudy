package project_shoppingcat_manage;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ShopPingManage {
    private List<ShopPing> list = new LinkedList<>();

    public List<ShopPing> getList() {
        return list;
    }

    public void setList(List<ShopPing> list) {
        this.list = list;
    }

    ShopPing shopPing = new ShopPing();
    private double buyPrice = 10000;
    private double money = 50000;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void addShopPing(ShopPing shopPing) {
        list.add(shopPing);
        System.out.println("** 商品(" + shopPing.getName() + ")添加成功 **");
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
    }

    public void updateShopPingNum(int updateId, int updateNum) {
        ListIterator<ShopPing> li = list.listIterator();
        while (li.hasNext()) {
            shopPing = li.next();
            if (updateId == shopPing.getId()) {
                shopPing.setNum(updateNum);
                System.out.println("** 商品(" + shopPing.getName() + ")数量修改为(" + updateNum + ")个 **");
                System.out.println();
                System.out.println("========================================================");
                System.out.println();
            }
        }
    }

    public void updateShopPingPrice(int updateId, int updatePrice) {
        ListIterator<ShopPing> li = list.listIterator();
        while (li.hasNext()) {
            shopPing = li.next();
            if (updateId == shopPing.getId()) {
                shopPing.setPrice(updatePrice);
                System.out.println("** 商品(" + shopPing.getName() + ")价格修改为(" + updatePrice + ")元 **");
                System.out.println();
                System.out.println("========================================================");
                System.out.println();
            }
        }
    }

    public void deleteShopPing(int deleteId) {

        for (ShopPing shop : list) {
            if (deleteId == shop.getId()) {
                list.remove(shop);
                System.out.println("** 商品(" + shopPing.getName() + ")删除成功 **");
                System.out.println();
                System.out.println("========================================================");
                System.out.println();
            }
        }
//        ListIterator<ShopPing> li = list.listIterator();
//        while (li.hasNext()) {
//            shopPing = li.next();
//            list.removeIf(shopPing -> shopPing.getId() == deleteId);
//            System.out.println("** 商品(" + shopPing.getName() + ")删除成功 **");
//            System.out.println();
//            System.out.println("========================================================");
//            System.out.println();
//        }
    }

    public void buyShopPing(int buyId) {
        ListIterator<ShopPing> li = list.listIterator();
        while (li.hasNext()) {
            shopPing = li.next();
            if (buyId == shopPing.getId()) {
                if (buyPrice >= shopPing.getPrice()) {
                    if (shopPing.getNum() > 0) {
                        buyPrice = buyPrice - shopPing.getPrice();
                        shopPing.setNum(shopPing.getNum() - 1);
                        System.out.println("** 商品 (" + shopPing.getName() + ") 购买成功 **");
                        System.out.println("还剩 ** " + buyPrice + " ** 元");
                        System.out.println();
                        System.out.println("========================================================");
                        System.out.println();
                    } else {
                        System.out.println("** 抱歉，商品已售完 **");
                        System.out.println();
                        System.out.println("========================================================");
                        System.out.println();

                    }
                } else {
                    System.out.println("** 余额不足 **");
                    System.out.println();
                    System.out.println("========================================================");
                    System.out.println();
                }
            }


        }

    }

    public void buyRecharge(double rechargeMoney) {

        if (rechargeMoney <= getMoney()) {
            setBuyPrice(getBuyPrice() + rechargeMoney);
            System.out.println("** 充值成功，本次充值金额为(" + rechargeMoney + ")元 **");
            System.out.println("** 总金额为(" + getBuyPrice() + ")元 **");
            System.out.println();
            System.out.println("========================================================");
            System.out.println();
        } else {
            System.out.println("** 超出最大充值金额 **");
            System.out.println();
            System.out.println("========================================================");
            System.out.println();
        }

    }

    public void queryShopPing() {
        System.out.println("************ 已进入查询系统 ************");
        System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品数量");
        ListIterator<ShopPing> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("**************************************");
        System.out.println();
        System.out.println();
    }


    public void quitShopPing() {
        System.out.println("*** 程序已退出 ** (每次离别 * 都是为了下一次更好的相遇) ***");
        System.exit(0);
    }

}
