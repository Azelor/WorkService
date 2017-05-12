/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.work;

import ee.ttu.idu0075._2015.ws.work.AddWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.GetWorkerListRequest;
import ee.ttu.idu0075._2015.ws.work.GetWorkerListResponse;
import ee.ttu.idu0075._2015.ws.work.GetWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.WorkerType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author kaarelsoot
 */


@Path("workers")
public class WorkersResource {
    
    

    @Context
    private UriInfo context;

    public WorkersResource() {
    }
    
    @GET
    @Path("{workerID: \\d+}")
    @Produces("application/json")
    public WorkerType getWorker(@PathParam("workerID") String workerID,
            @QueryParam("token") String token) {
        WorkService ws = new WorkService();
        GetWorkerRequest request = new GetWorkerRequest();
        request.setWorkerID(BigInteger.valueOf(Integer.parseInt(workerID)));
        request.setToken(token);
        return ws.getWorker(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public WorkerType addWorker (WorkerType content,
                            @QueryParam("token") String token) {
        WorkService ws = new WorkService();
        AddWorkerRequest request = new AddWorkerRequest();
        request.setToken(token);        
        request.setName(content.getName());
        request.setOccupation(content.getOccupation());
        request.setAvailability(content.getAvailability());
        request.setHourlyRate(content.getHourlyRate());
        return ws.addWorker(request);
    }
    
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public WorkerType setWorker (WorkerType content,
                            @QueryParam("token") String token) {
        WorkService ws = new WorkService();
        AddWorkerRequest request = new AddWorkerRequest();
        request.setToken(token);
        request.setName(content.getName());
        request.setOccupation(content.getOccupation());
        request.setAvailability(content.getAvailability());
        request.setHourlyRate(content.getHourlyRate());
        return ws.addWorker(request);
    }
    
    @GET
    @Produces("application/json")
    public GetWorkerListResponse getWorkerList(@QueryParam("token") String token,
            @QueryParam("availability") String availability, @QueryParam("occupation") String occupation) {
        WorkService ws = new WorkService();
        GetWorkerListRequest request = new GetWorkerListRequest();
        request.setToken(token);
        request.setAvailability(availability);
        request.setOccupation(occupation);
        return ws.getWorkerList(request);
    }

   
}
