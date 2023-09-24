package com.dewey.design_patterns.interpret;

/**
 * @author dewey
 * @date 2023/9/24 18:50
 * 解释器模式
 * 解释器模式 interpret 给分析对象定义一个语言，并定义该语言的文法表示，
 * 再设计一个解析器来解释语言中的句子。
 * 也就是说，用编译语言的方式来分析应用中的实例，这种模式实现了文法表达式处理的接口，
 * 该接口解释一个特定的上下文。
 * 应用场景： 1.当语言的文法比较简单， 且执行效率不是关键问题时；
 *          2.当问题重复出现，且可以用一种简单的语言来进行表达时；
 *          3.当一个语言需要解释执行，并且语言中的句子可以表示为一个抽象语法树的时候。
 * 优点：    1.扩展性好，由于在解释器模式中使用类来表示语言的文法规则，因此可以通过继承等机制来改变或扩展文法；
 *          2.容易实现，在语法树中的每个表达式节点类都是相似的，所以实现其文法较为简单。
 */
public class InterpretTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.checkMes("军人的子女");
        context.checkMes("军人的妻子");
        context.checkMes("工人的子女");
        context.checkMes("警察的父母");
        context.checkMes("警察的朋友");
    }
}
