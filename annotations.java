import java.lang.annotation.*;

// Custom annotation declaration
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

// Class utilizing the custom annotation
class MyClass {
    @MyAnnotation("task, six")
    public void myMethod() {
        System.out.println("Executing myMethod...");
    }
}

// Accessing and using the annotation
class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MyAnnotation annotation = MyClass.class.getMethod("myMethod").getAnnotation(MyAnnotation.class);
        String annotationValue = annotation.value();
        System.out.println(annotationValue);
    }
}
