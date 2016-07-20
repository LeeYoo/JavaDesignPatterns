package Iterator;

/**
 * Created by LIYAO-SZ on 2016/7/20.
 * 16【迭代子模式】（行为型模式）
 *      概念：迭代子模式又叫游标(Cursor)模式，是对象的行为模式。迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象.
 *
 *    【聚集】多个对象聚在一起形成的总体称之为聚集(Aggregate)，聚集对象是能够包容一组对象的容器对象。
 *           聚集依赖于聚集结构的抽象化，具有复杂化和多样性。数组就是最基本的聚集，也是其他的JAVA聚集对象的设计基础。
 *           JAVA聚集对象是实现了共同的java.util.Collection接口的对象，是JAVA语言对聚集概念的直接支持。
 *           从1.2版开始，JAVA语言提供了很多种聚集，包括Vector、ArrayList、HashSet、HashMap、Hashtable等，这些都是JAVA聚集的例子。
 *
 *    迭代子模式有两种实现方式，分别是【白箱聚集与外禀迭代子】和【黑箱聚集与内禀迭代子】。
 *      A. 白箱聚集与外禀迭代子
 *         一个白箱聚集向外界提供访问自己内部元素的接口（称作遍历方法），从而使外禀迭代子可以通过聚集的遍历方法实现迭代功能。
 *      B. 黑箱聚集于内禀迭代子
 *         聚集对象的内部结构应当对迭代子对象适当公开，以便迭代子对象能够对聚集对象有足够的了解，从而可以进行迭代操作。
 *
 *    迭代子模式涉及到以下四个角色：
 *      抽象迭代子角色：此抽象角色定义出遍历元素所需的接口。
 *      具体迭代子角色：此角色实现了Iterator接口，并保持迭代过程中的游标位置。
 *      聚集角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
 *      具体聚集角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例。
 *      客户端角色：持有对聚集及其迭代子对象的引用，调用迭代子对象的迭代接口，也有可能通过迭代子操作聚集元素的增加和删除。
 *
 * 其他相关介绍： http://www.cnblogs.com/java-my-life/archive/2012/05/22/2511506.html
 *
 */
public class Client {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.operation();
    }
}
