package ru.geekbrains;

public class Practice {
    private Object RuntimeException;

    @BeforeSuite
    public void begin(){
        System.out.println("This is BeforeSuite");
    }

    @AfterSuite
    public void end() {
        System.out.println("This is AfterSuite");
    }

    @Test
    public void test0(){
        System.out.println("Test 0");
    }

    @Test(priority = 4)
    public void test1(){
        System.out.println("Test 1");
    }
}
