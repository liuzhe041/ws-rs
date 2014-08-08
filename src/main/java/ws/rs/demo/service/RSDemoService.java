
package ws.rs.demo.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Consumes({ "application/json", "application/xml" })
@Produces({ "application/json;charset=UTF-8", "application/xml;charset=UTF-8" })
public interface RSDemoService {

    
    
}
