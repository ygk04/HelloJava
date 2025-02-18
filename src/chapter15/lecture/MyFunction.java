package chapter15.lecture;

@FunctionalInterface
interface MyFunction {
   void run();
}

@FunctionalInterface
interface MyCustomFunction {
    int function(int a);
}