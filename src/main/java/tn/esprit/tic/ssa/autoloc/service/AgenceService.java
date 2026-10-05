package tn.esprit.tic.ssa.autoloc.service;

import tn.esprit.tic.ssa.autoloc.domain.Agence;
import tn.esprit.tic.ssa.autoloc.repository.AgenceRepository;
import tn.esprit.tic.ssa.autoloc.repository.ClientRepository;

import java.util.List;

public class AgenceService implements IagenceService {
    AgenceRepository AgenceRepository;
    @Override
    public List<Agence> retrieveAllClients() {
        return AgenceRepository.findAll();
    }

    @Override
    public Agence addAgence(Agence c) {
        return AgenceRepository.save(c);
    }

    @Override
    public Agence updateAgence(Agence c) {
        return AgenceRepository.save(c);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return AgenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        AgenceRepository.deleteById(idAgence);


    }

    @Override
    public List<Agence> addAgence(List<Agence> Agences) {
        return AgenceRepository.saveAll(Agences);
    }
}
