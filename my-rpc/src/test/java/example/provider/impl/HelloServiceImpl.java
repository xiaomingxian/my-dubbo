package example.provider.impl;

import example.api.HelloService;

/**
 * @author ไปๆๆ
 * @date 2022/5/26 23:44
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:"+name;
    }
}
