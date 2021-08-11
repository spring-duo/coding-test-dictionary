package com.springDuo.app.dataStructure;

/**
 * Created by Hyunsik Lee on 2021-08-12
 * Blog : https://hs95blue.github.io/
 * Github : https://github.com/hs95blue
 */
public class Ex1_1 {
    boolean isUnique(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]){ //이 문자는 이미 문자열 내에 있음
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
