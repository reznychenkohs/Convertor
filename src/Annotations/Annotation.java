package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotation {

        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.METHOD)
        @interface MethodInfo {
            String methodName();
            String returnData();
            String description();
        }

        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.METHOD)
        @interface AuthorInfo {
            String name();
            String surname();
        }
}
