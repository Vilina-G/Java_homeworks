package vilina.oop1.model;

public class Female extends Person {


    public Female(String firstname, String lastname, String dateBirth, Family family) {
        super(firstname, lastname, dateBirth, family);
    }

    /**
     * Вывод данных женского пола
     */
    @Override
    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth);
    }
}