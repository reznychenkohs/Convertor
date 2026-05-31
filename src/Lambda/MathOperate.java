package Lambda;


    @FunctionalInterface
    interface MathOperation {
        int operate (int a, int b);
    }

    @FunctionalInterface
    interface StringManipulator{
        String manipulate (String input);
    }

