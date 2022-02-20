package top.janker.springboot.exp02.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 存储属性
 * @author janker
 * @date 2022/2/19
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * 保存文件的文件位置
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
