package com.em.SBFirstApi.ServiceImplementation;

import com.em.SBFirstApi.Exception.ResourceNotFoundException;
import com.em.SBFirstApi.Module.Cinema;
import com.em.SBFirstApi.Repository.CinemaRepository;
import com.em.SBFirstApi.Service.CinemaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements CinemaService {

    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public Cinema savemethod(Cinema cn) {
        return cinemaRepository.save(cn);
    }

    @Override
    public List<Cinema> Displaymethod() {
        return cinemaRepository.findAll();
    }

    @Override
    public Optional<Cinema> Displaybyidmethod(Long id) {
        // return cinemaRepository.findById(id);

        Optional<Cinema> cinema = cinemaRepository.findById(id);
        if (cinema.isPresent()) {
            return Optional.of(cinema.get());
        } else {
            throw new ResourceNotFoundException("Cinema", "Id", id);
        }
    }

    @Override
    public Cinema updatemethod( Long idno,Cinema cn) {
        Cinema c = cinemaRepository.findById(idno).orElseThrow(
                () -> new ResourceNotFoundException("Cinema", "id", idno));

        c.setMovieName(cn.getMovieName());
        c.setClassType(cn.getClassType());
        c.setTicketCount(cn.getTicketCount());
        return cinemaRepository.save(c);

    }

    @Override
    public void deletemethod(Long id) {
        cinemaRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cinema","id",id));

        cinemaRepository.deleteById(id);
    }
}



