package Composite;

/**
 * Created by LIYAO-SZ on 2016/7/18.
 * 11【组合模式】（结构式模式）
 *      定义：将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *      组合模式有时又叫【部分-整体】模式，在处理类似树形结构的问题时比较方便。
 *
 * 总结：
 *      意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 *      Bridge模式是一个非常有用的模式，也非常复杂，它很好的符合了开放-封闭原则和优先使用对象，而不是继承这两个面向对象原则。
 *
 * 应用场景：
 *      1．将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，树等。
 *      2. 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，
 *         统一地使用组合结构中的所有对象时，就应该考虑组合模式了。
 *
 * 其他相关介绍： 1. http://blog.csdn.net/jason0539/article/details/22642281
 *              2. http://www.cnblogs.com/jingmoxukong/p/4224661.html
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
