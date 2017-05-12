/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workservicedemo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author kaarelsoot
 */
public class WorkServiceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ADD
        AddWorkerRequest awr = new AddWorkerRequest();
        awr.setToken("nugis");
        awr.setName("Jaanus Pult");
        awr.setOccupation("Lukksepp");
        awr.setAvailability("Available");
        awr.setHourlyRate(BigInteger.valueOf(8));
        addWorker(awr);
        
        //GET
        Scanner bigIntScan = new Scanner(System.in);
        Scanner nameScan = new Scanner(System.in);
        System.out.print("Enter worker ID: ");
        BigInteger workerID = bigIntScan.nextBigInteger();
        System.out.println(workerID);
        System.out.print("Enter worker name: ");
        String name = nameScan.nextLine();
        System.out.println(name);
        GetWorkerRequest wr = new GetWorkerRequest();
        wr.setToken("nugis");
        wr.setName("Jaanus Pult");
        wr.setWorkerID(workerID);
        System.out.println(getWorker(wr));
        
    }
    
    

    private static WorkerType addWorker(workservicedemo.AddWorkerRequest parameter) {
        workservicedemo.WorkService service = new workservicedemo.WorkService();
        workservicedemo.WorkPortType port = service.getWorkPort();
        return port.addWorker(parameter);
    }

    private static WorkerType getWorker(workservicedemo.GetWorkerRequest parameter) {
        workservicedemo.WorkService service = new workservicedemo.WorkService();
        workservicedemo.WorkPortType port = service.getWorkPort();
        return port.getWorker(parameter);
    }
    
    
    
    
}
