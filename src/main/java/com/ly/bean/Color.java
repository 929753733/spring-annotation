package com.ly.bean;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class Color {
    
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
