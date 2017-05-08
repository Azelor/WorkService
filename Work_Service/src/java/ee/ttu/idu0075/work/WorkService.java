/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.work;

import ee.ttu.idu0075._2015.ws.work.AddWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.AddOrderRequest;
import ee.ttu.idu0075._2015.ws.work.GetOrderListRequest;
import ee.ttu.idu0075._2015.ws.work.GetOrderListResponse;
import ee.ttu.idu0075._2015.ws.work.GetOrderRequest;
import ee.ttu.idu0075._2015.ws.work.GetWorkerListRequest;
import ee.ttu.idu0075._2015.ws.work.GetWorkerListResponse;
import ee.ttu.idu0075._2015.ws.work.GetWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.OrderListType;
import ee.ttu.idu0075._2015.ws.work.OrderType;
import ee.ttu.idu0075._2015.ws.work.SetOrderRequest;
import ee.ttu.idu0075._2015.ws.work.SetWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.WorkerListType;
import ee.ttu.idu0075._2015.ws.work.WorkerType;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import java.math.BigInteger;

/**
 *
 * @author kaarelsoot
 */
@WebService(serviceName = "WorkService", portName = "workPort", endpointInterface = "ee.ttu.idu0075._2015.ws.work.WorkPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/work", wsdlLocation = "WEB-INF/wsdl/WorkService/WorkService.wsdl")
public class WorkService {
    
    private int newWorkerID = 1;
    private int newOrderID = 1;
    static List<WorkerType> workerList = new ArrayList<WorkerType>();
    static List<OrderType> orderList = new ArrayList<OrderType>();

    public WorkerType getWorker(GetWorkerRequest parameter) {
        WorkerType wt = null;
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            for (int x=0; x<workerList.size(); x++) {
                if (workerList.get(x).getWorkerID().equals(parameter.getWorkerID())) {
                    wt = workerList.get(x);
                }
            }
        }
        return wt;
    }

    public WorkerType addWorker(AddWorkerRequest parameter) {
        WorkerType wt = new WorkerType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            wt.setName(parameter.getName());
            wt.setOccupation(parameter.getOccupation());
            wt.setAvailability(parameter.getAvailability());
            wt.setHourlyRate(parameter.getHourlyRate());
            wt.setWorkerID(BigInteger.valueOf(newWorkerID++));
            workerList.add(wt);
        }
        return wt;
    }

    public WorkerType setWorker(SetWorkerRequest parameter) {
        WorkerType wt = new WorkerType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }

    public GetWorkerListResponse getWorkerList(GetWorkerListRequest parameter) {
        WorkerListType wlt = new WorkerListType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }

    public OrderType getOrder(GetOrderRequest parameter) {
        OrderType ot = new OrderType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }

    public OrderType addOrder(AddOrderRequest parameter) {
        OrderType ot = new OrderType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }

    public OrderType setOrder(SetOrderRequest parameter) {
        OrderType ot = new OrderType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }

    public GetOrderListResponse getOrderList(GetOrderListRequest parameter) {
        OrderListType olt = new OrderListType();
        if (parameter.getToken().equalsIgnoreCase("nugis")) {
            
        }
        return null;
    }
    
}
