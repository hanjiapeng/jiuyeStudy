package game;
import game.User;  // 引入用户类
import game.Computer; // 引入计算机类
import game.Game; // 引入游戏类


public class Test {
    public static void main(String[] args){

        // 游戏类
        Game game = new Game();
        game.face();
        game.userRole();
        game.computerRole();
        game.show();


    }
}
