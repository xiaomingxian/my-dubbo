package example.provider.impl;

import example.api.HelloService;

/**
 * @author 仙晓明
 * @date 2022/5/26 23:44
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:"+name;
    }
}
