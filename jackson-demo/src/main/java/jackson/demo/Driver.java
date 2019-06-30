package jackson.demo;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import jackson.demo.core.Student;


public class Driver {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Student firstStudent = mapper.readValue(new File("jackson-demo/src/main/resources/data/student.json"), Student.class);

            System.out.println(firstStudent.getFirstName());
            System.out.println(firstStudent.getLastName());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}