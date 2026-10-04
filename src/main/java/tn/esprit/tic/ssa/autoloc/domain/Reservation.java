package tn.esprit.tic.ssa.autoloc.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tic.ssa.autoloc.domain.StatutReservation;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateDebut;
    @Column(nullable = false, length = 50)
    private Date dateFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutReservation statut;
    @ManyToOne
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;
}
