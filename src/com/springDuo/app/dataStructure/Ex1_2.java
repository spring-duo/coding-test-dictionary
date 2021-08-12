package com.springDuo.app.dataStructure;

import java.util.Arrays;

/**
 * Created by Hyunsik Lee on 2021-08-12
 * Blog : https://hs95blue.github.io/
 * Github : https://github.com/hs95blue
 */
public class Ex1_2 {

    public static void main(String[] args) {
        Ex1_2 ex = new Ex1_2();
        // 풀이 #1
        System.out.println(ex.permutation("go d", "dog"));
        // 풀이 #2
        System.out.println(ex.permutation2("g od", "dog"));
    }

    /**
     * 의사코드
     * 조건 : 대소문자 구분, 공백도 문자
     * # 풀이 1
     * 만약 두 문자열이 순열관계에 있다면, 같은 문자로 구성되어있고 순서만 다를것.
     * 같은 규칙으로 정렬한 결과가 다르면 false
     * 길이가 달라도 false
     *
     * #풀이 2
     * 두 문자열이 동일한 문자를 동일한 개수만큼 가지고 있다는 점을 이용.
     * 문자열 길이가 같으면 false
     * 각 문자의 개수가 같으면 true
     *
     *
     */
    //풀이 #1
    //스트링을 새롭게 정렬하는 메소드
    public String sort(String s){
        char[] content =s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    //순열인지 확인하는 메소드
    public boolean permutation(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    // #풀이 2
    boolean permutation2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // 아스키코드라고 가정
        int[] letters = new int[128];

        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
            return true;
    }
    }
