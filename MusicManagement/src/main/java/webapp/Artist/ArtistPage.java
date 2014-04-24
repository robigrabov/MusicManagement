package webapp.Artist;

import org.apache.wicket.Component;
import webapp.MusicManagementPage;


public class ArtistPage extends MusicManagementPage {
    protected Component contentPanel() {
        return new ArtistPanel("artistPanel");
    }
}
