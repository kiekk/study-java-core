package constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Developer {

    private String firstName;
    private String lastName;
    private List<String> languages = new ArrayList<>();

    {
        languages = Arrays.asList("Java", "JavaScript", "C#", "C++");
    }

    /*
    초기화 블록은 생성자보다 먼저 실행
    따라서 기본 생성자는 값을 설정하는 부분이 없기 때문에 초기화 블록에서 설정한 값이 적용

    나머지 생성자는 생성자에서 값을 설정하기 때문에 초기화 블록의 데이터 대신
    생성자에서 설정한 값이 적용
     */

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
