package com.em.SBFirstApi.Service;

import com.em.SBFirstApi.Module.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaService {
    Cinema savemethod(Cinema cn);
    List<Cinema> Displaymethod();
    Optional<Cinema> Displaybyidmethod(Long id);
   Cinema updatemethod(Long id,Cinema cn);
    void deletemethod(Long id);

}

