package sit.int202.simple.entities;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor

public class Subject { //entities and repositories are 'Model' part of MVC

    private String id;
    private String title;
    private double credit;

}
