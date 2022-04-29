package cz.educanet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    @GET
    public Response getAllUsers(){
        List<User> users = Arrays.asList(
                new User("Martin","martin@martin.cz"),
                new User("Pepík","josef@pepík.com")
        );

        return Response.ok(users).build();
    }
}
