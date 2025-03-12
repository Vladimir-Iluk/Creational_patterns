package Prototype;

public class ConcretePrototype implements IPrototype {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ConcretePrototype(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public IPrototype clone() {
        try {
            return (IPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override
    public void  display() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}