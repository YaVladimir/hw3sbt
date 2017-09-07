package ru.corp.yakovenko.six;

/**
 * Created by 2 on 04.09.2017.
 */
public abstract class Person implements IPerson {
    @ValidLength(min = 3, max = 10)
    String name;
    Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
