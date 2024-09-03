package sit.int202.simple;

import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;

public class TestModel {
    public static void main(String[] args) {
        SubjectRepository sr = new SubjectRepository();
        for (Subject s: sr.findAll()){
            System.out.printf("%-6s %-30s %5.2f\n", s.getId(), s.getTitle(), s.getCredit());
        }

        Subject s = sr.findById("INT 202");
        System.out.println("==================================");
        System.out.printf("%-6s %-30s %5.2f\n", s.getId(), s.getTitle(), s.getCredit());
    }
}
