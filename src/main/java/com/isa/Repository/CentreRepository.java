package com.isa.Repository;

import com.isa.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CentreRepository extends JpaRepository<Centre, Integer> {

    public List<Centre> getAll();
    public Optional<Centre> findCentreById(int id);
    public Optional<Centre> findCentreByName(String name);
    public Optional<Centre> findCentreByAddress(String address);
    public Optional<Centre> searchCentreByName(String name);

    @Query("SELECT DISTINCT sa.name from Centre sa where LOWER(sa.name) like ?2% and LOWER(sa.address) like ?3%")
    List<Centre> searchCentre(String name, String address);
}

