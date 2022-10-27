package com.dietelProject.chapterFifteen.fileIO.creditInquiry;

public enum MenuOptions {
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;

    MenuOptions(int value) {
        this.value = value;
    }
}
