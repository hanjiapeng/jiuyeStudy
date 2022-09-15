package project_book_manage_2;

import project_book_manage_2.content.*;

public class TestBlog {
    public static void main(String[] args) {
        // 显示界面
        Show inter = new Show();
        inter.interFace();

        Content content = new Content();
        content.interFace(0);
    }


}
