package constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Developer {

    private String firstName;
    private String lastName;
    private List<String> languages = new ArrayList<>();

    public Developer() {
    }

    public Developer(String firstName, String lastName) {
        this(firstName, lastName, Collections.singletonList("Java"));
    }

    public Developer(String firstName, String lastName, List<String> languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.languages = languages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", languages=" + languages +
                '}';
    }
}
