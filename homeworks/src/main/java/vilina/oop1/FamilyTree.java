package vilina.oop1;

import vilina.oop1.model.*;

import java.util.List;

/*
Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим
древом. Идея: описать некоторое количество компонент, например: модель человека компонента
хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и
про отношение, брат, свекровь, сестра и т. д. компонент для проведения исследований
дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения
в файл, получение\построение отдельных моделей человека Под “проведением исследования” можно
понимать получение всех детей выбранного человека.
 */
public class FamilyTree {
    public static void main(String[] args) {
        Family family = new Family();
        Person alla = new Female("Алла", "Алова", "12/10/2020", family);
        Person tolya = new Male("Толя", "Толин", "12/12/2020", family);
        Person vanya = new Male("Ваня", "Алов", "12/12/2020", family);
        Person mike = new Male("Миша", "Мишин", "12/12/2020", family);
        Person jili = new Male("Юля", "Мишина", "12/12/2020", family);
        Person ket = new Female("Катя", "Катина", "12/12/2020", family);
        Person ira = new Female("Ирина", "Толина", "12/10/2020", family);
        Person alik = new Male("Алик", "Ликов", "12/12/2020", family);
        Person lora = new Female("Лора", "Ликова", "12/12/2020", family);
        Person masha = new Female("Маша", "Машова", "12/12/2020", family);
        Person martha = new Female("Марта", "Машова", "12/12/2020", family);
        Person vova = new Female("Вова", "Вовин", "12/12/2020", family);
        Person kolya = new Male("Коля", "Вовин", "12/12/2020", family);
        Person roma = new Male("Рома", "Ромов", "12/12/2020", family);

        tolya.setParents(List.of(vanya, alla));
        alik.setParents(List.of(tolya, ira));
        vanya.setParents(List.of(lora, mike));
        ira.setParents(List.of(jili, ket));
        mike.setParents(List.of(roma, vova));

        tolya.addChildren(alik);
        alik.addChildren(alik);

        lora.addSiblings(martha);
        tolya.addSiblings(kolya);

        family.setName("Алова");
        family.setFather(vanya);
        family.setMother(alla);
        family.setChildren(List.of(tolya, masha));

        System.out.println("\nРанг:");
        Person.printFamilyTree(alik, 0);

        System.out.println("\nДети:");
        tolya.printChildren();

        System.out.println("\nИнфо:");
        alik.printInfo();
        vova.printInfo();
    }
}
