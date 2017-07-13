package test.me.hm.api.gen;


import static me.libme.webseed.fn._template.ftl.Config.FieldConfig;

import junit.framework.TestCase;
import me.libme.webseed.fn._template.ftl.Config;
import me.libme.webseed.fn._template.ftl.TemplateRunner;
import org.junit.Test;

public class ApiGen extends TestCase {




    @Test
    public void testAutoGenerateMilk() throws Exception{
        Config config=new Config();
        config.setModelPath("D:\\java_\\git\\hm\\api\\src\\main\\java\\me\\hm\\api\\milk\\model");
        config.setUiRelativePath("D:\\java_\\git-project\\YouAPP\\youappweb\\youapp");

        config.setModuleName("MilkManager");

        config.addUIField(new Config.FieldConfig("amount", "喝奶量"));
        config.addUIField(new FieldConfig("time", "喝奶时间"));
        config.addUIField(new FieldConfig("age", "年龄"));
        config.addUIField(new FieldConfig("log","奶粉品牌"));

        TemplateRunner.start(config);
    }

}
