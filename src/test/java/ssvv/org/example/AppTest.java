package ssvv.org.example;

import domain.Tema;
import org.junit.Test;
import repository.StudentXMLRepository;
import repository.TemaXMLRepository;
import service.Service;
import validation.StudentValidator;
import validation.TemaValidator;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public StudentXMLRepository studentXMLRepository;
    public StudentValidator studentValidator;
    public Service service;

    public TemaXMLRepository temaXMLRepository;
    public TemaValidator temaValidator;

    public AppTest()
    {
        studentValidator = new StudentValidator();
        studentXMLRepository = new StudentXMLRepository(studentValidator, "appTest.xml");

        temaValidator = new TemaValidator();
        temaXMLRepository = new TemaXMLRepository(temaValidator, "appTest2.xml");

        service = new Service(studentXMLRepository, temaXMLRepository, null);

    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

//    @Test
//    public void TC_Final_1()
//    {
//        String id = "bmie2485";
//        String name = "Breje Mihai";
//        int group = 932;
//
//        assertEquals(0,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_2()
//    {
//        String id = "bmil994";
//        String name = "Breje Mihai";
//        int group = 932;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_3()
//    {
//        String id = "bmie2485";
//        String name = "Bre3 Bo$$";
//        int group = 932;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_4()
//    {
//        String id = "bmie2485";
//        String name = "Breje Mihai";
//        int group = 8888;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_5()
//    {
//        String id = "12#dap%p";
//        String name = "Katherina";
//        int group = 932;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_6()
//    {
//        String id = "cgie2491";
//        String name = "Katherina";
//        int group = -1;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_7()
//    {
//        String id = "toir1234";
//        String name = "Vlad_Dracula";
//        int group = 911;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_8()
//    {
//        String id = "toir1234";
//        String name = "Vlad Dracula";
//        int group = 911;
//
//        assertEquals(0,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_9()
//    {
//        String id = "kjig2255";
//        String name = "încă Unu";
//        int group = 909;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_10()
//    {
//        String id = "dair9090";
//        String name = "Toma";
//        int group = 938;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//
//    @Test
//    public void TC_Final_11()
//    {
//        String id = "cgie2491";
//        String name = "Catargiu Georgiana";
//        int group = 910;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_12()
//    {
//        String id = "cgie2491";
//        String name = "Catargiu Georgiana";
//        int group = 912;
//
//        assertEquals(0,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_13()
//    {
//        String id = "cgie2491";
//        String name = "Catargiu Georgiana";
//        int group = 937;
//
//        assertEquals(0,service.saveStudent(id,name,group));
//    }
//
//    @Test
//    public void TC_Final_14()
//    {
//        String id = "cgie2491";
//        String name = "Catargiu Georgiana";
//        int group = 938;
//
//        assertEquals(1,service.saveStudent(id,name,group));
//    }

    @Test
    public void TBW_1()
    {
        String id = "55";
        String description = "descriere frumoasa";
        int deadline = 6;
        int startline = 5;

        assertEquals(0,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_2()
    {
        String id = "";
        String description = "o alta descriere frumoasa";
        int deadline = 7;
        int startline = 3;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_3()
    {
        String id = "12";
        String description = "";
        int deadline = 8;
        int startline = 3;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_4()
    {
        String id = "";
        String description = "";
        int deadline = 8;
        int startline = 3;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_5()
    {
        String id = "13";
        String description = "descr";
        int deadline = 23;
        int startline = 3;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_6()
    {
        String id = "14";
        String description = "descr";
        int deadline = -23;
        int startline = 3;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_7()
    {
        String id = "15";
        String description = "descr";
        int deadline =  3;
        int startline = 43;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_8()
    {
        String id = "16";
        String description = "descr";
        int deadline =  3;
        int startline = -43;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_9()
    {
        String id = "17";
        String description = "descr";
        int deadline =  2;
        int startline = 6;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }

    @Test
    public void TBW_10()
    {
        String id = "18";
        String description = "descriere uau";
        int deadline =  2;
        int startline = 6;

        assertEquals(1,service.saveTema(id,description,deadline, startline));
    }
}
