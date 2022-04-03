package sk.juro;

public class Player {

    String name, surname, country;
    int age;

    public Player() {
    }

    public Player(String name, String surname, String country, int age) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
