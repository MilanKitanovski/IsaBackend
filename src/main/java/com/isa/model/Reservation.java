package com.isa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Reservation extends com.isa.model.Entity {
    @ManyToOne
    private User user;
    @OneToOne
    private Appointment appointment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Reservation that = (Reservation) o;
        return getId() != 0 && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
