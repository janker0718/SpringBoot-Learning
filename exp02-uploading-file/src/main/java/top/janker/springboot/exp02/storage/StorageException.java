package top.janker.springboot.exp02.storage;

/**
 * 存储异常
 * @author janker
 * @date 2022/2/19
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
