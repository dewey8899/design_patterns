观察者模式Observer定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，
当主题对象发生变化时，它的所有依赖者都会收到通知并更新。

应用场景：

1.当更改一个对象的状态可能需要更改其它对象，并且实际的对象集事先未知或动态更改时，请使用观察者模式。

优点：

1.符合开闭原则；

2.可以在运行时建立对象之间的关系。
JDK & Spring源码中的应用：
//定义了存放观察者的集合、添加、删除、通知观察者update的方法
1.java.util.Observable

//定义了onApplicationEvent通知方法，消息的发布在ApplicationEventMulticaster中，
由 multicastEvent 方法获取 getApplicationListeners() 注册的监听集合，遍历此集合调用通知方法
2.org.springframework.context.ApplicationListener
