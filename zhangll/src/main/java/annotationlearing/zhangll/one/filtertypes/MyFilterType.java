package annotationlearing.zhangll.one.filtertypes;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilterType implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
            throws IOException {
        metadataReader.getAnnotationMetadata();
        metadataReader.getClass();
        ClassMetadata clazz = metadataReader.getClassMetadata();
        Resource resoucer = metadataReader.getResource();
        System.out.println("路径：" + resoucer.getFilename());// 径：BookController.class
        System.out.println("getDescription：" + resoucer.getDescription());// 径：BookController.class
        System.out.println("classmetadata" + clazz.getClassName()); // aannotationlearing.zhangll.one.service.BookService
        return resoucer.getFilename().contains("Dao") ? true : false;
        // return false;
    }

}