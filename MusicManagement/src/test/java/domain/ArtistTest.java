package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArtistTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistLehrer() {
        Artist l = new Artist("Daniel", "Haberfellner", 12000);
        entityManager().persist(l);
        assertThat(entityManager().contains(l), is(true));
    }
}
