package com.isa.repository;

import com.isa.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CentreRepository extends JpaRepository<Centre, Integer> {

    public Optional<Centre> findCentreById(int id);
    public Optional<Centre> findCentreByName(String name);
    public Optional<Centre> findCentreByAddress(String address);
    public Optional<Centre> searchCentreByName(String name);

    public List<Centre> findCentreByAvgGrade(int grade);

    public double findCentreByLatitude(double lat);
    public double findCentreByLongitude(double lon);
    @Query("SELECT sa from Centre sa where LOWER(sa.name) like ?1% or LOWER(sa.address) like ?1%")
    List<Centre> searchCentreByNameOrAddress(String search);
}

