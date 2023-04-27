package vilina.oop4;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\t 3 семинар: отработка комментариев");
        System.out.println("\t         -------------");

        FamilyFree<Human> familyFree = new FamilyFree<>();

        familyFree.addFamilyFree(new Human("Алекс", "муж.", 35));
        familyFree.addFamilyFree(new Human("Аннет", "жен.", 27));
        familyFree.addFamilyFree(new Human("Сири", "муж.", 7,
            familyFree.getByName("Аннет"), familyFree.getByName("алекс"))); // equalsIgnoreCase
        familyFree.addFamilyFree(new Human("Кейт", "жен.", 5,
            familyFree.getByName("Аннет"), familyFree.getByName("алекс")));
        //теперь родителей можно добавлять переменными(в предыдущем задании так) либо методом getByName !
        //родители добовлются автоматически ( и дети родителям тоже )

        familyFree.addFamilyFree(new Human("Алиса", "жен.", 3));
        familyFree.getByName("Алекс").addChild(familyFree.getByName("Алиса"));
        //конструкция говорит о том что Алекс завел ребекна на стороне :D

        //familyFree.getFamilyFree().sort(new HumanComporatorByAge()); // сортировка


        System.out.println(familyFree);                                // печать семьи
        System.out.println("Родитель Алекс | " +
            familyFree.getByName("Алекс").printChildren()); // печать детей объекта

    }
}