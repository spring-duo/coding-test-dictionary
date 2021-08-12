package com.springDuo.app.dataStructure;

/**
 * Created by Hyunsik Lee on 2021-08-12
 * Blog : https://hs95blue.github.io/
 * Github : https://github.com/hs95blue
 */

public class Ex1_1 {
    /**
     * 의사코드
     * 메소드명 isUnique
     * @param String
     * @return boolean
     *
     * 1. 아스키코드라고 가정했을 때 중복이 아니면 아스키코드의 크기보다 클수 없으니 length()가 더 크면 false
     * 2.순서대로 읽으면서 해당위치의 배열값을 true로 초기화. 이미 해당 위치가 true이면 false를 리턴
     * Loop:
     * 처음부터 끝까지 읽으면서 해당 문자를 int로 받는다.
     * 그 배열 위치가 이미 true인지 확인한다.
     * true면 중복된 값이므로 return false;
     * 아니면 true로 초기화
     */
    public boolean isUnique(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("val : " + val);
            if (char_set[val]){ //이 문자는 이미 문자열 내에 있음
                return false;
            }
            char_set[val] = true;
            System.out.println("char_set[val] : "+char_set[val]);
        }
        return true;
    }

    //메인메소드 호출
    public static void main(String[]args){

        Ex1_1 ex = new Ex1_1();
        System.out.println("isUnique ? : " + ex.isUnique("9....9..."));

    }
}
