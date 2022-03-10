package com.joaosuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaosuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long> {

}
