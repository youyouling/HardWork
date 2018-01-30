package implement;

import interfaces.Api;

/**
 * 接口实现对象B
 * Created by yuemeiling on 2018/1/30.
 */

public class ImplB implements Api {
    @Override
    public void operation(String s) {
        //实现功能的代码，示意一下
        System.out.println("ImplB s==" + s);
    }
}
