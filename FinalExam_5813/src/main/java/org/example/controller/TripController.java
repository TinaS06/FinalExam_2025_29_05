package org.example.controller;
import org.example.model.Route;
import org.example.model.Stop;
import org.example.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    @Autowired
    private final RouteService routeService;
    public TripController(RouteService routeService){
        this.routeService = routeService;
    }

    @PostMapping("/routes/{routeId}/trips")
    public Route createRoute(@RequestBody Route route){
        return routeService.createRoute(route);
    }

    @PatchMapping("/trips/{tripId}")



    @GetMapping("/routes/{routeId}/trips?date=2025-06-15")
    public ResponseEntity<Route> getRouteById(@PathVariable Long id, ){
        return ResponseEntity.ok(Route.getRouteById(id));
    }


    @GetMapping("/stops/{stopId}/trips?within=30")
    public ResponseEntity<Stop> getStopById(@PathVariable Long id, @PathVariable Long Longitude){
        return ResponseEntity.ok(Stop.getStopById(id, Longitude));
    }

}
