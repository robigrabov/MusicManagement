package webapp;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/web/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "webapp.MusicManagementApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/web/*")})
public class MusicManagementFilter extends WicketFilter {
}
