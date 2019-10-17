package org.hzg.springboot.enableDemo;

/**
 * Created by hzgal on 2019-10-17.
 */
public class UserConfiguration {
    private String name;
    private Integer age;

    public UserConfiguration(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserConfiguration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
