
package ws.rs.demo.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ws.rs.demo.model.User;

@Path("/")
public interface UserService {

    @GET
    @Path("/{id:(.)+}")
    @Consumes({ MediaType.TEXT_PLAIN })
    @Produces({ MediaType.APPLICATION_JSON + ";charset=UTF-8" })
    User fetchUser(@PathParam("id")
    String userId);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json;charset=UTF-8" })
    User addUser(User user);

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json;charset=UTF-8" })
    User updateUser(User user);

}
