package tn.esprit.tic.ssa.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateDebut ;
    @Column(nullable = false, length = 50)
    private Date dateFin;
    @Column(nullable = false, length = 50)
    private String description;

    @ManyToOne
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;
}


