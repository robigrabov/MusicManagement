package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


public class AlbumTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistKlasse() {
        Album k = new Album();
        k.setName("Spengergassen Rock");
        k.setGenre("Rock");
        entityManager().persist(k);
        assertThat(entityManager().contains(k), is(true));
        assertThat(entityManager().find(Album.class, k.getId()), is(notNullValue()));
    }
}
