package Annotations;

public class ArrayUtils {

    @Annotation.MethodInfo(
            methodName = "Method",
            returnData = "void",
            description = "Виводить повідомлення про анотацію")

    public void Method(){
        System.out.println("Get annotation");
    }

    @Annotation.AuthorInfo(name = "Anna",
            surname = "Reznychenko")

    public void GetInfo() {
        System.out.println("Info");
    }
}
