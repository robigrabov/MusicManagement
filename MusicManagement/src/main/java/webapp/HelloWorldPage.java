package webapp;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;


public class HelloWorldPage extends WebPage {
    public HelloWorldPage() {
        super();
        add(new Label("Daniel", "Spengergasse"));
    }
}