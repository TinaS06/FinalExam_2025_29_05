package org.example.controller;
import org.example.model.Route;
import org.example.model.Stop;
import org.example.model.Trip;
import org.example.service.RouteService;
import org.example.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    @Autowired
    private final RouteService routeService;
    @Autowired
    private final StopService stopService;

    public TripController(RouteService routeService, StopService stopService){
        this.routeService = routeService;
        this.stopService = stopService;
    }

    @PostMapping("/routes/{routeId}/trips")
    public Route createRoute(@RequestBody Route route){
        return routeService.createRoute(route);
    }

    @PatchMapping("/trips/{tripId}")
    public ResponseEntity<Trip> updateTrip(@PathVariable Long id, @PathVariable Long arrivalTime, @PathVariable Long departureTime){
        return ResponseEntity.ok(updateTrip(id, arrivalTime, departureTime).getBody());
    }

    @GetMapping("/routes/{routeId}/trips?date=2025-06-15")
    public ResponseEntity<Route> getAllRoutes(@PathVariable Long id){
        return ResponseEntity.ok(Route.getAllRoutes(id));
    }


    @GetMapping("/stops/{stopId}/trips?within=30")
    public ResponseEntity<Stop> getStopById(@PathVariable Long id, @PathVariable Long Longitude){
        return ResponseEntity.ok(Stop.getStopById(id, Longitude));
    }

}
