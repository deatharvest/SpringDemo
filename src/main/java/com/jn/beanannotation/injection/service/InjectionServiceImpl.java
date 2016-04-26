package main.java.com.jn.beanannotation.injection.service;

import main.java.com.jn.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by JN on 2016/4/26.
 */
public class InjectionServiceImpl implements InjectionService{

    private InjectionDAO injectionDAO;
    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
        System.out.println("使用设值注入");

    }

    //构造注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
        System.out.println("使用构造注入");
    }

    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }


}
