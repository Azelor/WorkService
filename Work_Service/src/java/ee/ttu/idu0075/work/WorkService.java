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
import ee.ttu.idu0075._2015.ws.work.OrderType;
import ee.ttu.idu0075._2015.ws.work.SetOrderRequest;
import ee.ttu.idu0075._2015.ws.work.SetWorkerRequest;
import ee.ttu.idu0075._2015.ws.work.WorkerType;
import javax.jws.WebService;

/**
 *
 * @author kaarelsoot
 */
@WebService(serviceName = "WorkService", portName = "workPort", endpointInterface = "ee.ttu.idu0075._2015.ws.work.WorkPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/work", wsdlLocation = "WEB-INF/wsdl/WorkService/WorkService.wsdl")
public class WorkService {

    public WorkerType getWorker(GetWorkerRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public WorkerType addWorker(AddWorkerRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public WorkerType setWorker(SetWorkerRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public GetWorkerListResponse getWorkerList(GetWorkerListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public OrderType getOrder(GetOrderRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public OrderType addOrder(AddOrderRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public OrderType setOrder(SetOrderRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public GetOrderListResponse getOrderList(GetOrderListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
