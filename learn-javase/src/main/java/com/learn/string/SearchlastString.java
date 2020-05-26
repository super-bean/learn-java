package com.learn.string;

public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello LiChao";
        int lastIndex = strOrig.lastIndexOf("LiChao");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串 LiChao");
        }else{
            System.out.println("LiChao 字符串最后出现的位置： "+ lastIndex);
        }
    }
}