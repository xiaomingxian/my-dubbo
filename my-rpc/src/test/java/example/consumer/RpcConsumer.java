package example.consumer;

import example.RpcFramework;
import example.api.HelloService;

/**
 * @author 仙晓明
 * @date 2022/5/26 23:44
 */
public class RpcConsumer {
    public static void main(String[] args) throws Exception {
        //
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.hello("World" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}
