package Pruebas.clone;

public class Person implements Cloneable {
    private Car car;
    private String name;
    public Car getCar()
    {
        return car;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        name = s;
    }
    public Person(String s, String t)
    {
        name = s;
        car = new Car(t);
    }
    public Object clone()
    {
//shallow copy
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}
