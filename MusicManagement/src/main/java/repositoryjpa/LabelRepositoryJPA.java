package repositoryjpa;

import domain.Label;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class LabelRepositoryJPA extends AbstractJPARepository<Label> {

    @Override
    public List<Label> findAll() {
        return entityManager().createQuery("SELECT f FROM Label f", Label.class).getResultList();
    }

    @Override
    public Label findById(Long id) {
        return entityManager().find(Label.class, id);
    }
}
