package main.java.com.jn.beanannotation.injection.dao;

/**
 * Created by JN on 2016/4/26.
 */
import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
    public void save(String arg) {
        //模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}
