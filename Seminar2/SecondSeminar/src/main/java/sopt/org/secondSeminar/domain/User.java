package sopt.org.secondSeminar.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String gender;
    private String name;
    private String contact;
    private int age;

    public User(String gender, String name, String contact, int age) {
        this.gender = gender;
        this.name = name;
        this.contact = contact;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "gender: " + this.gender + "\n" +
                "name: " + this.name + "\n" +
                "contact: " + this.contact + "\n" +
                "age: " + this.age;
    }
}
