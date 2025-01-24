package crud.java.apiv1.Controllers;


import crud.java.apiv1.Dtos.DtoMedicos;
import crud.java.apiv1.Entities.MedicosEntity;
import crud.java.apiv1.Repository.MedicosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Medicos")
public class MedicoController {

    @Autowired
    private MedicosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DtoMedicos dados) {

        repository.save(new MedicosEntity(dados));

    }


}
