package webapp.Artist;

import webapp.ContentPanel;


public class ArtistPanel extends ContentPanel{
    public ArtistPanel(String id)
    {
        super(id);
        add(new ArtistForm("artistForm"));
    }
}
