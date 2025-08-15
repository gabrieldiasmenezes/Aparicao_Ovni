package br.com.fiap.Ovni.Ovni;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OvniService{
    private final OvniRepository ovniRepository;

    public OvniService(OvniRepository ovniRepository){
        this.ovniRepository = ovniRepository;
    }

    public List<Ovni> getAllTasks(){
        List<Ovni> ovnis = ovniRepository.findAll();
        return ovnis;
    }

    public Ovni save(Ovni ovni){
        return ovniRepository.save(ovni);
    }
}

