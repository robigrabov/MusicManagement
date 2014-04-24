package service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class MusicManagementServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    MusicManagementService musicManagementService;

    @Test
    public void test() {
        assertThat(musicManagementService, is(notNullValue()));
    }
}
