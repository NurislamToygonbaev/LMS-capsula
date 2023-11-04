import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Univarsity[] univarsity = new Univarsity[] {
                new Univarsity("KASI", LocalDate.of(1950,2,4), "Niyzov"),
                new Univarsity("KASI", LocalDate.of(1950,2,4), "Niyzov"),
                new Univarsity("KASI", LocalDate.of(1950,2,4), "Niyzov")
        };
        School[] schools = new School[]{
                new School("Beshkek", "N:5", "moldokulav"),
                new School("Beshkek", "N:5", "moldokulav"),
                new School("Beshkek", "N:5", "moldokulav")
        };
        Car[] cars = new Car[] {
                new Car("BMW", 3, "Japan"),
                new Car("BMW", 3, "Japan"),
                new Car("BMW", 3, "Japan")
        };
        Person[] people = new Person[]{
                new Person("Nuke", "Toigonbaev", LocalDate.of(1998,9,23)),
                new Person("Nuke", "Toigonbaev", LocalDate.of(1998,9,23)),
                new Person("Nuke", "Toigonbaev", LocalDate.of(1998,9,23))
        };

        for (Univarsity univarsitys : univarsity) {
            System.out.println(univarsitys.getInfoOfUniver());
        }
        for (School school : schools) {
            System.out.println(school.getInfoSchool());
        }
        for (Car car : cars) {
            System.out.println(car.getInfoCar());
        }
        for (Person person : people) {
            System.out.println(person.getInfoPerson());
        }
    }
}