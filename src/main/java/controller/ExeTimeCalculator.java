package controller;

import inter.Calculator;

public class ExeTimeCalculator implements Calculator {
    private Calculator delegate;

    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num){
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.println(delegate.getClass().getSimpleName() + ", " + num + ", " + (end-start) );
        return result;
    }
}
