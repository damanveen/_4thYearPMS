package sysc4806;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by CraigBook on 2018-03-20.
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProjectControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addNewProject() throws Exception {

    }

    @Test
    public void deleteProjectById() throws Exception {

    }

    @Test
    public void deleteAllProjects() throws Exception {

    }

    @Test
    public void getAllStudents() throws Exception {

    }

    @Test
    public void returnHello() throws Exception {
//            String message = "Welcome to Project Page";
//            String body = this.testRestTemplate.getForObject("/", String.class);
//            assertThat(body).isEqualTo(message);
    }

}