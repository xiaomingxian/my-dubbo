package example.provider;

import example.RpcFramework;
import example.api.HelloService;
import example.provider.impl.HelloServiceImpl;

/**
 * @author 仙晓明
 * @date 2022/5/26 23:42
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        //暴露接口
        RpcFramework.export(service, 1234);
    }

}
