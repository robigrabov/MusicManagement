package webapp.Artist;

import domain.Artist;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.ArtistRepository;


public class ArtistForm extends Form<Artist> {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @SpringBean
    private ArtistRepository artistRepository;

    public ArtistForm(String id) {
        super(id, new CompoundPropertyModel<>(new Artist("Daniel", "haberfellner", 12000)));
        add(new TextField<>("vorname"));
        add(new TextField<>("nachname"));
        add(new TextField<>("gehalt"));
    }

    @Override
    public final void onSubmit()
    {
        Artist artist=getModelObject();
        artistRepository.save(artist);
        logger.error("Artist nach dem Save: "+artist);
    }
}
