package bean;

import interfaces.IPhone;

/**
 * Created by lenovo on 2017/11/13.
 */

public class BlackberryGenerator extends IGenerator {
    @Override
    public IPhone generatePhone(String flag) throws Exception {
        return new BlackberryPhone();
    }
}
