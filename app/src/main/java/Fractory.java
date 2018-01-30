import implement.ImplA;
import implement.ImplB;
import interfaces.Api;

/**
 * 工厂类，用于创建api对象
 * Created by yuemeiling on 2018/1/30.
 */

public class Fractory {
    /**
     * 具体创建Api对象的方法
     * @param condition 从外部传入的选择条件
     * @return 创建好的Api对象
     */
    public static Api createApi(int condition){
        //应该根据某些条件去选择究竟创建哪一个具体的实现对象
        //这些条件可以从外部传入，也可以从其他途径来获取
        //如果只有一个实现，可以省略条件，因为没有选择的必要
        //示意使用条件
        Api api = null;
        if (condition == 1 ){
            api = new ImplA();
        }else if (condition == 2) {
            api = new ImplB();
        }
        return api;
    }
}
