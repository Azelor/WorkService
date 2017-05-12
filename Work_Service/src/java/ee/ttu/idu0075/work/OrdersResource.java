/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.work;

import ee.ttu.idu0075._2015.ws.work.AddOrderRequest;
import ee.ttu.idu0075._2015.ws.work.GetOrderListRequest;
import ee.ttu.idu0075._2015.ws.work.GetOrderListResponse;
import ee.ttu.idu0075._2015.ws.work.GetOrderRequest;
import ee.ttu.idu0075._2015.ws.work.OrderType;
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
@Path("orders")
public class OrdersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of OrdersResource
     */
    public OrdersResource() {
    }

    /**
     * Retrieves representation of an instance of ee.ttu.idu0075.work.OrdersResource
     * @return an instance of ee.ttu.idu0075._2015.ws.work.OrderType
     */
    @GET
    @Path("{orderID: \\d+}") 
    @Produces("application/json")
    public OrderType getOrder(@PathParam("orderID") String orderID,
            @QueryParam("token") String token) {
        WorkService os = new WorkService();
        GetOrderRequest request = new GetOrderRequest();
        request.setOrderID(BigInteger.valueOf(Integer.parseInt(orderID)));
        request.setToken(token);
        return os.getOrder(request);
    }
    /*
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public OrderType addOrder (OrderType content,
                            @QueryParam("token") String token) {
        WorkService os = new WorkService();
        AddOrderRequest request = new AddOrderRequest();
        request.setWorkerID(content.getWorkerID());
        request.setStartDate(content.getStartDate());
        request.setEndDate(content.getEndDate());
        request.setStatus(content.getStatus());
        return os.addOrder(request);
    }
    */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public OrderType setOrder (OrderType content,
                            @QueryParam("token") String token) {
        WorkService os = new WorkService();
        AddOrderRequest request = new AddOrderRequest();
        request.setStartDate(content.getStartDate());
        request.setEndDate(content.getEndDate());
        request.setStatus(content.getStatus());
        return os.addOrder(request);
    }
    
    @GET
    @Produces("application/json")
    public GetOrderListResponse getOrderList(@QueryParam("token") String token,
            @QueryParam("status") String status) {
        WorkService os = new WorkService();
        GetOrderListRequest request = new GetOrderListRequest();
        request.setToken(token);
        request.setStatus(status);
        return os.getOrderList(request);
    }
}
