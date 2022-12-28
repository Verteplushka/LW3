public class Main {
    public static void main(String[] args) {
        OneKorotishka znaika = new OneKorotishka("Знайка", Place.FLOWERTOWN, Type.UNPREDICTABLE);
        Korotishki korotishki = new Korotishki("Коротышки", Place.FLOWERTOWN);
        znaika.setNewIdea("поехать в Солнечный город");
        Note note = new Note(znaika, "В солнечный город");
        znaika.goTo(Place.SUNNYTOWN);
        Breakfast.eat(korotishki, znaika);
        korotishki.read(note);
        korotishki.understandLocation(znaika, Place.SUNNYTOWN);

        Person person = new Person("Ivan", 3);
        System.out.println(person.age() + " " + person.name());
        person.run();
    }
}

record Person(String name, int age){
    Person{
        if(age<10){
            age = 0;
        }
    }
    public void run(){
        System.out.println("run");
    }
}
