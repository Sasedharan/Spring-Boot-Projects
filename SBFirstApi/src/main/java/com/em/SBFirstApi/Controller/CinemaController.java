package com.em.SBFirstApi.Controller;

import com.em.SBFirstApi.Module.Cinema;
import com.em.SBFirstApi.Service.CinemaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Ticket")
public class CinemaController {

    private CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService)
    {
        this.cinemaService = cinemaService;
    }
    @PostMapping
    public ResponseEntity<Cinema> saveTicket(@RequestBody Cinema cinema){
        return new ResponseEntity<>(cinemaService.savemethod(cinema), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Cinema> displayTicket(){
        return  cinemaService.Displaymethod();
    }
    @GetMapping("/{id}")
    public Optional<Cinema> displyIdTicket(@PathVariable("id") Long id){
        return cinemaService.Displaybyidmethod(id);
    }
   @PutMapping("/{id}")
    public ResponseEntity<Cinema> updateTicket(@PathVariable("id")Long idno,@RequestBody Cinema cn){

        return new ResponseEntity<>(cinemaService.updatemethod(idno, cn),HttpStatus.ACCEPTED);
   }
   @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTicket(@PathVariable("id)")Long id){
        cinemaService.deletemethod(id);
        return new ResponseEntity<String>("Ticket Booking Cancelled", HttpStatus.ACCEPTED);
   }
}
