package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class LabelTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistFach() {
        Label f = new Label();
        f.setName("Haberfellner Cooperations");
        entityManager().persist(f);
        assertThat(entityManager().contains(f), is(true));
    }
}
