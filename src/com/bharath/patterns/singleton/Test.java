package com.bharath.patterns.singleton;

public class Test {

    public static void main(String[] args) {

        DraftDateUtil dateUtil1 = DraftDateUtil.getInstance();
        DraftDateUtil dateUtil2 = DraftDateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
