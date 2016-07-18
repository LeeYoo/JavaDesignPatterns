package Facade;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 * 09【外观模式】（结构式模式）
 *      概念：为子系统中的一组接口提供一个统一接口。Facade模式定义了一个高层接口，这个接口使得这子系统更容易使用。
 *      外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
 *      而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口.
 *      （我们以一个计算机的启动过程为例）
 * 总结：
 *      如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关系，这样会造成严重的依赖，
 *      修改一个类，可能会带来其他类的修改，这不是我们想要看到的，有了Computer类，他们之间的关系被放在了Computer类里，
 *      这样就起到了解耦的作用，这，就是外观模式！
 *
 * 应用场景：
 *      1. 为一个复杂子系统提供一个简单接口。
 *      2. 提高子系统的独立性。
 *      3. 在层次化结构中，可以使用Facade模式定义系统中每一层的入口。
 *
 * 其他相关介绍：http://blog.csdn.net/hfmbook/article/details/7702642
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
