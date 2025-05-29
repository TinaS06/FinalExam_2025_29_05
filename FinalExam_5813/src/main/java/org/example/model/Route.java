package org.example.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String name;
    public String originStop;
    public String destinationStop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginStop() {
        return originStop;
    }

    public void setOriginStop(String originStop) {
        this.originStop = originStop;
    }

    public String getDestinationStop() {
        return destinationStop;
    }

    public void setDestinationStop(String destinationStop) {
        this.destinationStop = destinationStop;
    }
}
