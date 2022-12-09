package animal;

public class Main {
    public static void main(String[] args) {
        Animal catVaska = new Animal("Васька", 45, false);
        Animal catVaskaFromNextHouse = new Animal("Васька", 45, false);
        Animal catVaskaFromNextStreet = catVaskaFromNextHouse;
        Animal dogTuzik = new Animal("Тузік", 12, true);
        System.out.println("Наш кіт Васька: \n" + catVaska);
        System.out.println("Сусідський кіт Васька з такими ж параметрами: \n" + catVaskaFromNextHouse);
        System.out.println("Кіт Васька з наступної вулиці: \n" + catVaskaFromNextStreet); // ніхто не знає, але це сусідський кіт
        System.out.println("Наш пес Тузік: \n" + dogTuzik);
        System.out.println("\nhashCode");
        System.out.println("Наш кіт Васька: \n" + catVaska.hashCode());
        System.out.println("Сусідський кіт Васька з такими ж параметрами: \n" + catVaskaFromNextHouse.hashCode());
        System.out.println("Кіт Васька з наступної вулиці: \n" + catVaskaFromNextStreet.hashCode());
        System.out.println("Наш пес Тузік: \n" + dogTuzik.hashCode());
        System.out.println("\nequals");
        System.out.println("Наш кіт Васька і сусідський, порівняння за параметрами: \n" + catVaska.equals(catVaskaFromNextHouse));
        System.out.println("Наш кіт Васька і сусідський, порівняння за посиланням: \n" + (catVaska == catVaskaFromNextHouse));
        System.out.println("Сусідський кіт та кіт з іншої вулиці: \n" + (catVaskaFromNextHouse == catVaskaFromNextStreet));
        System.out.println("Наш пес Тузік і наш кіт Васька, порівняння за параметрами: \n" + dogTuzik.equals(catVaska));
    }
}
