package top.janker.exp09.nacos.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
//使用 @NacosPropertySource 加载 dataId 为 example 的配置源，并开启自动更新
@NacosPropertySource(dataId = "nacos.conf.test", autoRefreshed = true)
public class TestController {

    //通过 Nacos 的 @NacosValue 注解设置属性值
    @NacosValue(value = "${test.properties:null}", autoRefreshed = true)
    private String testProperties;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return testProperties;
    }
}
