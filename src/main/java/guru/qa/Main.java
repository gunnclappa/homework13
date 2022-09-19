package guru.qa;

public class Main {
    public static void main(final String[] args) {

        // Реализовал класс Family с помощью 3 разных коллекций

        /*
        Работа с List на примере класса Family
        */
        FamilyList familyList = new FamilyList();
        familyList.add("Father");
        familyList.add("Mother");
        familyList.add("Son");
        familyList.add("Son");

        familyList.print();
        System.out.println();

        System.out.println((familyList.searchFamilyMember("Son")));
        System.out.println((familyList.searchFamilyMember("Sin")));

        familyList.clearFamilyMember("Father");

        familyList.print();
        System.out.println();
        System.out.println();

        /*
        Работа с Set на примере класса Family
        */
        FamilySet familySet = new FamilySet();
        familySet.add("Father");
        familySet.add("Mother");
        familySet.add("Son");
        familySet.add("Son"); // Не добавится

        familySet.print();
        System.out.println();

        System.out.println((familySet.searchFamilyMember("Son")));
        System.out.println((familySet.searchFamilyMember("Sin")));

        familySet.clearFamilyMember("Father");

        familySet.print();
        System.out.println();
        System.out.println();

        /*
        Работа с Map на примере класса Family
        */
        FamilyMap familyMap = new FamilyMap();
        familyMap.add(1, "Father");
        familyMap.add(2, "Mother");
        familyMap.add(3, "Son");
        familyMap.add(4, "Son");

        familyMap.print();
        System.out.println();

        System.out.println(familyMap.searchFamilyMember(3));
        System.out.println(familyMap.searchFamilyMember(5));

        familyMap.clearFamilyMember(1);

        familyMap.print();
    }
}
