package webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MusicManagementApplication extends WebApplication{
    public Class<? extends Page> getHomePage() {
        return MusicManagementPage.class;
    }

    @Override
    public void init() {
        super.init();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //Scan package for annotated beans
        ctx.scan("webapp");
        ctx.refresh();

        getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx));
    }
}
