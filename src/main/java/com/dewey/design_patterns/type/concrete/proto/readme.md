原型模式的优点

1、原型模式是在内存中进行二进制流的拷贝，要比直接new一个对象性能好，特别是在一个循环体内创建大量对象时。
2、原型模式可以简化对象创建的过程，可以直接拷贝现有的原型实例的值，实现对象复用。


适用场景

1、性能优化场景
类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
2、安全访问场景
当某个对象对外可能是只读的，为了防止外部对这个只读对象的修改，通常可以通过返回一个对象拷贝的形式实现只读的限制。
3、一个对象多个修改者的场景
一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。