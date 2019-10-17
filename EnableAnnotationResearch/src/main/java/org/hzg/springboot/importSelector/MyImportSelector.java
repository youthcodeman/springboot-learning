package org.hzg.springboot.importSelector;

import org.hzg.springboot.aboutImport.Cat;
import org.hzg.springboot.aboutImport.Jeep;
import org.hzg.springboot.aboutImport.MyConfiguration;
import org.hzg.springboot.enableDemo.MyEnableConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by hzgal on 2019-10-18.
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {Cat.class.getName(), Jeep.class.getName(), MyConfiguration.class.getName(), MyEnableConfiguration.class.getName()};
    }
}
