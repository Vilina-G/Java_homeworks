package vilina.oop2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable
{
    private String name;
    private String sex;
    private int age;
    private Human mather;
    private Human father;
    private List<Human> children;

    public Human(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        children = new ArrayList<>();
    }



    public Human(String name, String sex, int age, Human mather, Human father)
    {
        this(name, sex, age);
        this.mather = mather;
        this.father = father;
    }



    public void addChild(Human child)
    {
        this.children.add(child);
        if(this.sex == "муж.")
        {
            child.father = this;
        }
        else child.mather = this;
    }

    public String printChildren()
    {
        String res = " Дети: ";
        if (!this.children.isEmpty())
        {
            for (int i = 0; i < children.size(); i++)
            {
                res += children.get(i).name + ",";
            }
        }
        else res += " нет";
        return res;
    }

    @Override
    public String toString()
    {
        String res = "Имя: " + name +  ", Пол: " + sex + ", Возраст: " + age;
        if (this.mather != null)
        {
            res += ", Мать: " + mather.name;
        }
        else res += ", Мать: неизвестна";

        if (this.father != null)
        {
            res += ", Отец: " + father.name;
        }
        else res += ", Отец: неизвестен,";

        res += printChildren();

        return res;

    }


    public String getName()
    {
        return name;
    }

    public Human getFather()
    {
        return father;
    }

    public Human getMather()
    {
        return mather;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public void saveObj(IO save)
    {
        save = new IO();
        save.save("FreeFamily.data", this);
    }
}