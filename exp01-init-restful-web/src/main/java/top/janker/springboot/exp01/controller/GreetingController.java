package top.janker.springboot.exp01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.janker.springboot.exp01.bean.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author janker
 * @date 2022/2/16
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
