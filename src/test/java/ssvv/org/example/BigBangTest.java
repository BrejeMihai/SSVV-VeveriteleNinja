package ssvv.org.example;

import org.junit.Test;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.StudentValidator;
import validation.TemaValidator;

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

    }

    @Test
    public void testAddAssignment() {

    }

    @Test
    public void testAddGrade() {

    }

    @Test
    public void testBangBang() {

    }
}
