package com.github.ljtfreitas.tdc.mockito.extra;

public class MyType {

	private final FooService myService;

    public MyType(FooService myService) {
        this.myService = myService;
    }

    public void process() {
        myService.foo();

        if (myService instanceof BarService) {
            ((BarService) myService).bar();
        }
    }
}
