package test.java.com.jn.ioc.interfaces;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.base.UnitTestBase;

import main.java.com.jn.beanannotation.injection.service.*;
/**
 * Created by JN on 2016/4/26.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    //请配置xml
    @Test
    public void testSetter() {
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }

    @Test
    public void testCons() {
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }

}
