package webapp;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

import webapp.Artist.ArtistPage;


public class NavigationPanel extends Panel {
    public NavigationPanel(String id) {
        super(id);
        add(new Link("navigateHelloWorld") {
            @Override
            public void onClick() {
                setResponsePage(HelloWorldPage.class);
            }
        });
        add(new Link("navigateArtist") {
            @Override
            public void onClick() {
                setResponsePage(ArtistPage.class);
            }
        });
    }
}