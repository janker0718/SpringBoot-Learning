package top.janker.springboot.exp02.storage;

/**
 * 保存文件找不到异常
 * @author janker
 * @date 2022/2/19
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
