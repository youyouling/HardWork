package bean;

import interfaces.IPhone;

/**
 * 工厂模式的基类
 */

public abstract class IGenerator {
    public abstract IPhone generatePhone(String flag) throws Exception;
}
