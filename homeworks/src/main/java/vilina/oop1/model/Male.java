package vilina.oop1.model;

public class Male extends Person {


    public Male(String firstname, String lastname, String dateBirth, Family family) {
        super(firstname, lastname, dateBirth, family);
    }

    /**
     * вывод данных мужского пола
     */
    @Override
    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth);
    }
}
