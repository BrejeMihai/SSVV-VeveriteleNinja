package ssvv.org.example;

import org.junit.Test;
import repository.StudentXMLRepository;
import service.Service;
import validation.StudentValidator;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public StudentXMLRepository studentXMLRepository;
    public StudentValidator studentValidator;
    public Service service;

    public AppTest()
    {
        studentValidator = new StudentValidator();
        studentXMLRepository = new StudentXMLRepository(studentValidator, "appTest.xml");
        service = new Service(studentXMLRepository, null, null);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void TC_Final_1()
    {
        String id = "bmie2485";
        String name = "Breje Mihai";
        int group = 932;

        assertEquals(0,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_2()
    {
        String id = "bmil994";
        String name = "Breje Mihai";
        int group = 932;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_3()
    {
        String id = "bmie2485";
        String name = "Bre3 Bo$$";
        int group = 932;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_4()
    {
        String id = "bmie2485";
        String name = "Breje Mihai";
        int group = 8888;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_5()
    {
        String id = "12#dap%p";
        String name = "Katherina";
        int group = 932;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_6()
    {
        String id = "cgie2491";
        String name = "Katherina";
        int group = -1;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_7()
    {
        String id = "toir1234";
        String name = "Vlad_Dracula";
        int group = 911;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_8()
    {
        String id = "toir1234";
        String name = "Vlad Dracula";
        int group = 911;

        assertEquals(0,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_9()
    {
        String id = "kjig2255";
        String name = "încă Unu";
        int group = 909;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_10()
    {
        String id = "dair9090";
        String name = "Toma";
        int group = 938;

        assertEquals(1,service.saveStudent(id,name,group));
    }


    @Test
    public void TC_Final_11()
    {
        String id = "cgie2491";
        String name = "Catargiu Georgiana";
        int group = 910;

        assertEquals(1,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_12()
    {
        String id = "cgie2491";
        String name = "Catargiu Georgiana";
        int group = 912;

        assertEquals(0,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_13()
    {
        String id = "cgie2491";
        String name = "Catargiu Georgiana";
        int group = 937;

        assertEquals(0,service.saveStudent(id,name,group));
    }

    @Test
    public void TC_Final_14()
    {
        String id = "cgie2491";
        String name = "Catargiu Georgiana";
        int group = 938;

        assertEquals(1,service.saveStudent(id,name,group));
    }

}
