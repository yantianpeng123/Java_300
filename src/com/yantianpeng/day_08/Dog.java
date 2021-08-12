/**
 * @ yaitianpeng
 * @date 2021-06-24 上午8:32
 */
package com.yantianpeng.day_08;

import java.util.Objects;

public class Dog {

    String name;
    String color;


    public void shout(){
        System.out.println("汪汪叫....");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color);
    }

}
