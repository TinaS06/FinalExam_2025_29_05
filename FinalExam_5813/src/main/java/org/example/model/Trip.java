package org.example.model;
import jakarta.persistence.*;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String departureTime;
    private Long arrivalTime;
    private Long busNumber;

    @ManyToOne
    private Route route;
    @ManyToOne
    private Stop stop;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public Long getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Long busNumber) {
        this.busNumber = busNumber;
    }
}