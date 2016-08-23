package com.company;

public class ChangeMaker {

    public enum Denomination {ONE, TWO, FIVE, TEN, TWENTY}
    public int makeChange(Denomination bill) {
        switch (bill) {
            case ONE:
                return 4;
            case TWO:
                return 8;
            case FIVE:
                return 20;
            case TEN:
                return 40;
            case TWENTY:
                return 80;

        }
        return 0;
    }



}