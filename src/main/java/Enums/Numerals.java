package Enums;

public enum Numerals {

    M("M", 1000),
    CM("CM", 900),
    D("D", 500),
    CD("CD", 400),
    C("C", 100),
    XC("XC", 90),
    L("L", 50),
    XL("XL", 40),
    XX("XX", 20),
    XIX("XIX", 19),
    X("X", 10),
    IX("IX", 9),
    V("V", 5),
    IV("IV", 4),
    I("I", 1);

    private String rNum;
    private int value;

    Numerals(String rNum, int value){
        this.rNum = rNum;
        this.value = value;
    }

    public String getNumeral(){
        return rNum;
    }

    public int getValue(){
        return value;
    }
}
