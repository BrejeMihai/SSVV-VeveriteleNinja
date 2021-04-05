package ssvv.org.example;

import org.junit.Test;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.StudentValidator;
import validation.TemaValidator;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class BigBangTest {

    public StudentXMLRepository studentXMLRepository;
    public StudentValidator studentValidator;
    public Service service;

    public TemaXMLRepository temaXMLRepository;
    public TemaValidator temaValidator;

    public BigBangTest() {
        studentValidator = new StudentValidator();
        studentXMLRepository = new StudentXMLRepository(studentValidator, "appTest.xml");

        temaValidator = new TemaValidator();
        temaXMLRepository = new TemaXMLRepository(temaValidator, "appTest2.xml");

        service = new Service(studentXMLRepository, temaXMLRepository, null);
    }

    @Test
    public void testAddStudent() {
        String id = "cgie2491";
        String name = "Catargiu Georgiana Ecaterina";
        int group = 932;

        assertEquals(0,service.saveStudent(id,name,group));

    }

    @Test
    public void testAddAssignment() {

        String id = "1998";
        String description = "tema noua pe langa cele o mie deja existente, enjoy";
        int deadline = 7;
        int startline = 5;

        assertEquals(0,service.saveTema(id,description,deadline, startline));

    }

    @Test
    public void testAddGrade() {
        String studentID = "5";
        String temaID = "10";
        double valNota = -1;
        int predata = 7;
        String feedback = "Very nice ma boi.";

        assertThat(this.service.saveNota(studentID, temaID, valNota, predata, feedback), anyOf(is(1), is(-1)));
    }

    @Test
    public void testBangBang() {

    }
}
