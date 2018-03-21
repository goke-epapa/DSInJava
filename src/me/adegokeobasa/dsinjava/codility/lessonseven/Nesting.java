package me.adegokeobasa.dsinjava.codility.lessonseven;

import java.util.Stack;

/**
 * Created by epapa on 20/03/2018.
 */
public class Nesting {

    public static void main(String[] args) {
        System.out.println(new Nesting().solution("(())"));
        System.out.println(new Nesting().solution("(()"));
    }

    public int solution(String S) {
        Stack<Character> characterStack = new Stack<>();
        if (S.isEmpty()) return 1;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty()) return 0;
                if (c == ')' && characterStack.pop() != '(') return 0;
            }
        }
        return characterStack.isEmpty() ? 1 : 0;
    }
}
