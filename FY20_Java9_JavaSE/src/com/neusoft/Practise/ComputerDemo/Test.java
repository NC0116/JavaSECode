package com.neusoft.Practise.ComputerDemo;

public class Test {
    public static void main(String[] args){
        Computer com = new Computer();
        com.run();
        USB m = new Mouse();
        Computer.useUSB(m);
        USB kb = new KeyBoard();
        Computer.useUSB(kb);
        com.shutdown();
    }
}
