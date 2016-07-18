package Facade;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 */
public class User {

    public static void main(String[] args){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
