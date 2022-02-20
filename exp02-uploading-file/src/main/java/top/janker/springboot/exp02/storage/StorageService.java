package top.janker.springboot.exp02.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 存储文件Service接口
 * @author janker
 * @date 2022/2/19
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
public interface StorageService {

    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

}
