package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        MathUtils mathUtilsMax = new MathUtils();
        int result = mathUtilsMax.max(4,8);
        System.out.println(result);

        MathUtils mathUtilsMin = new MathUtils();
        result = mathUtilsMin.min(4,8);
        System.out.println(result);

        }
    }
