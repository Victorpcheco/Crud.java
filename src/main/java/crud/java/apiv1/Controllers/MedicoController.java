package crud.java.apiv1.Controllers;


import crud.java.apiv1.Dtos.DtoMedicos;
import crud.java.apiv1.Entities.MedicosEntity;
import crud.java.apiv1.Repository.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Medicos")
public class MedicoController {

    @Autowired
    private MedicosRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DtoMedicos dados) {

        repository.save(new MedicosEntity(dados));

    }


}
