package tn.esprit.tic.ssa.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
@Entity
@Table(name = "Employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    @Column(nullable = false, length = 20)
    private String nom;
    @Column(nullable = false, length = 50)
    private String prenom;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoleEmploye role;
    @ManyToOne
    @JoinColumn(name = "idAgence")
    private Agence agence;
}
