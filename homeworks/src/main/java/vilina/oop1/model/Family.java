package vilina.oop1.model;

import java.util.List;

public class Family {
    private String name;
    private Person father;
    private Person mother;
    private List<Person> children;

    /**
     * задать имя
     * @param name имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * задать отца
     * @param father персона отец
     */
    public void setFather(Person father) {
        this.father = father;
    }

    /**
     * задать маму
     * @param mother персона мать
     */
    public void setMother(Person mother) {
        this.mother = mother;
    }

    /**
     * задать ребенка
     * @param children ребенок
     */
    public void setChildren(List<Person> children) {
        this.children = children;
    }

    /**
     * в строку
     * @return строка
     */
    @Override
    public String toString() {
        return name + " " + father + " " + mother + " " + children;
    }
}