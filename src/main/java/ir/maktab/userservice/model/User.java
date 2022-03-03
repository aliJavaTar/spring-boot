package ir.maktab.userservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String MESSAGE = " is mandatory !";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name" + MESSAGE)
    @Column(name = NAME, nullable = false)
    private String name;

    @NotBlank(message = "Email" + MESSAGE)
    @Column(name = EMAIL, nullable = false)
    private String email;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
