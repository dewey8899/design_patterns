package com.dewey.design_patterns.type.behavioral.filterchain2;

/**
 * @auther dewey
 * @date 2022/6/5 21:48
 */
public class Main2 {
    public static void main(String[] args) {
        //目标 ：把 < 替换为 [, 把 > 替换为 ], 把996认为是敏感词，把敏感词替换为 955,替换笑脸，添加url的前缀 ---> "http://"
        String msg = "你好,<script>你好996。):，欢迎访问我的网站 www.dewey.com";
//        msg = msg.replace('<', '[');
//        msg = msg.replace('>', ']');
//        msg = msg.replace("996", "955");
//        System.out.println(msg);
        //输出： “ 你好,[script]你好955 ”

        //使用过滤器链
        Msg msg1 = new Msg();
        msg1.setMsg(msg);
//        new HtmlFilter().doFilter(msg1);
//        new SensitiveFilter().doFilter(msg1);
        FilterChain filterChain = new FilterChain();
//        FilterChain filterChain2 = new FilterChain();
        filterChain.add(new HtmlFilter())
                .add(new SensitiveFilter())
                .add(new FaceFilter())
                .add(new UrlFilter());
        Request request = new Request();
        request.setMsg(msg);
        Response response = new Response();
        response.setMsg(msg);
        filterChain.doFilter(request,response);
        System.out.println(request.getMsg());
        System.out.println(response.getMsg());


    }
}
