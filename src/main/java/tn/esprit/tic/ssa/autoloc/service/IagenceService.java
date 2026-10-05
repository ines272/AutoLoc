package tn.esprit.tic.ssa.autoloc.service;

import tn.esprit.tic.ssa.autoloc.domain.Agence;
import tn.esprit.tic.ssa.autoloc.domain.Client;

import java.util.List;

public interface IagenceService {
    List<Agence> retrieveAllClients();
    Agence addAgence(Agence c);
    Agence updateAgence(Agence c);
    Agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
    List<Agence> addAgence (List<Agence> Agences);
}
