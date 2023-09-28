策略+枚举
减少 if + else 的面向过程编程



在DayEnum枚举属性当中，定义了一个实现了toDo()抽象方法——public abstract String toDo();

在每个枚举元素当中，都重写了该toDo()抽象方法。这样，当传参DayEnum.valueOf("Monday")
流转到dayEnum.toDo()时，实质上是去DayEnum枚举里找到对应Monday定义的枚举元素，
然后执行其内部重写的toDo()方法。
用if-esle形式表示，就类似"Monday".equals(day)匹配为true时，可得到其内部东西。

为什么在枚举里定义一个抽象方法，会在各个枚举元素里实现呢？

这功能就类似子类继承父类的做法了。DayEnum类似一个父类，DayEnum枚举里的元素就相当是其子类。
当父类里定义了抽象方法toDo（），其继承的子类就会默认实现toDo()方法，这样，就会出现枚举里可以这样的写法：

private enum Type {
    ENGLISH {
        @Override
        public String toDo() {
            return "今天上英语课";
        }
    }；
    public abstract String toDo();
}