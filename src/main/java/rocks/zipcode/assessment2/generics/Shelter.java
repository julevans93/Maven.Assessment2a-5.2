package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Person;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {
    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        Shelter<Person> newShelter = new Shelter();
        try {
            return newShelter.size();
        } catch (Exception e) {

        }
        return newShelter.size();
    }

    public void add(Object object) {
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}