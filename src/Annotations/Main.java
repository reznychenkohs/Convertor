package Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        ArrayUtils arrayUtils = new ArrayUtils();
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method: methods){
            System.out.println(method.getName());
            method.invoke(arrayUtils);
            Annotation.MethodInfo methodInfo =
                    method.getAnnotation(Annotation.MethodInfo.class);

            if (methodInfo != null) {
                System.out.println("Назва: " + methodInfo.methodName());
                System.out.println("Тип повернення: " + methodInfo.returnData());
                System.out.println("Опис: " + methodInfo.description());
            }

            Annotation.AuthorInfo authorInfo = method.getAnnotation (Annotation.AuthorInfo.class);
            if (authorInfo != null) {
                System.out.println("Автор: " + authorInfo.name() + " " + authorInfo.surname());
            }
        }
    }
}