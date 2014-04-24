package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class SongTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistSchueler() {
        Song s = new Song();
        s.setTitel("s´geht");
        entityManager().persist(s);
        Song s1 = entityManager().find(Song.class, s.getId());
        assertThat(s.getTitel(), is(s1.getTitel()));
    }
}
