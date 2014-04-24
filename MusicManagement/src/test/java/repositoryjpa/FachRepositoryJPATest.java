package repositoryjpa;

import domain.Label;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;


public class FachRepositoryJPATest extends AbstractJPARepositoryTest {
    @Test
    public void verifyFindByUnknownId() {
        LabelRepositoryJPA labelRepositoryJPA = new LabelRepositoryJPA();
        labelRepositoryJPA.setEntityManager(entityManager);
        assertThat(labelRepositoryJPA.findById(1l), is(nullValue()));
    }

    @Test
    public void verifyFindById() {
        LabelRepositoryJPA labelRepositoryJPA = new LabelRepositoryJPA();
        labelRepositoryJPA.setEntityManager(entityManager);
        Label f = new Label();
        f.setName("Haberfellner Cooperations");
        labelRepositoryJPA.persist(f);
        assertThat(labelRepositoryJPA.findById(f.getId()), is(f));
    }
}
