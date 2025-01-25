package crud.java.apiv1.Controllers;


import crud.java.apiv1.Dtos.DtoListagemMedicos;
import crud.java.apiv1.Dtos.DtoMedicos;
import crud.java.apiv1.Entities.MedicosEntity;
import crud.java.apiv1.Repository.MedicosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Medicos")
public class MedicoController {

    @Autowired
    private MedicosRepository repository;

    // Cadastra medicos
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DtoMedicos dados) {

        repository.save(new MedicosEntity(dados));

    }

    // Lista Medicos // Listando fazendo a paginação
    @GetMapping
    public Page<DtoListagemMedicos> listarMedicos(Pageable paginacao) {

        return repository.findAll(paginacao).map(DtoListagemMedicos::new);
    }


}
