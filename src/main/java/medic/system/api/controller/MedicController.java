package medic.system.api.controller;

import medic.system.api.medic.DadosCadastroMedic;
import medic.system.api.medic.Medic;
import medic.system.api.medic.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicController {

    @Autowired
    private MedicRepository repository;

    @PostMapping
    public void cadastrar (@RequestBody DadosCadastroMedic dados){
        repository.save(new Medic(dados));
    }
}
