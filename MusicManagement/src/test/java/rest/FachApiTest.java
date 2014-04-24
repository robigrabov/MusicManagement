package rest;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
@WebAppConfiguration
public class FachApiTest {
    @Resource
    private WebApplicationContext webApplicationContext;

    @Ignore //Returns 404, webapp and rest don't work
    @Test
    public void readFromEmptyListOfArtist() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(get("/web/artist")).
                andExpect(status().isOk());
    }
}