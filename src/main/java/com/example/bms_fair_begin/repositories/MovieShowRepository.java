package com.example.bms_fair_begin.repositories;

import com.example.bms_fair_begin.models.MovieShow;
import com.example.bms_fair_begin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow,Long> {
}
