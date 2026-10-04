package tn.esprit.tic.ssa.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    @Column(nullable = false, length = 20)
    private Date dateSignature;
    @Column(nullable = false, length = 50)
    private Long  montantTotal;
    @Column(nullable = false, length = 50)
    private String valide;

    @OneToOne
    @JoinColumn(name = "idReservation", unique = true)
    private Reservation reservation;

    // Composition: deleting a contract deletes its payments
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paiement> paiements;
}
