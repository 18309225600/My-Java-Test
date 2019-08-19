什么是CopyOnWrite？

我初次了解到CopyOnWrite是通过在《大型网站系统与Java中间件实践》这本书中的1.2.2.3章节中看到关于谈到“共享容器协同的多线程模式”。
大致讲的是多线程协同的一种方式：共享同一个容器数据。在谈到多个线程同时操作同一个容器数据时，如果不加以控制，则会产生意料之外的结果。
处理方式大概两种：CopyOnWrite 或者是 加锁 以此来保证线程安全。


后来我通过查询资料，CopyOnWrite的核心实现就是在写时复制，以此来保证读和写同时发生时不会产生意外情况。
Java8中对于CopyOnWrite的实现主要有两个类：


1.CopyOnWriteArrayList
    源码理解：CopyOnWriteArrayList.md
    功能测试：CopyOnWriteArrayListTest.java
2.CopyOnWriteArraySet
    源码理解：CopyOnWriteArraySet.md
    功能测试：CopyOnWriteArraySetTest.java