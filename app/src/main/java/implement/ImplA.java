package implement;

import interfaces.Api;

/**
 * 接口的具体的实现对象A
 * Created by yuemeiling on 2018/1/29.
 */

public class ImplA implements Api{

    @Override
    public void operation(String s) {
        //实现功能的代码，示意一下
        System.out.println("ImplA s==" + s);
    }
}
