package top.janker.springboot.exp02;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import top.janker.springboot.exp02.storage.StorageProperties;
import top.janker.springboot.exp02.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Exp02UploadingFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exp02UploadingFileApplication.class, args);
    }

    /**
     * 注入CommandLineRunner Bean执行init方法
     * @param storageService
     * @return
     */
    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
