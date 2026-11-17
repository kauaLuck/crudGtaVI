package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Carros;
import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.repository.CarrosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carros")
public class CarrosController {

    private final CarrosRepository repository;
    public CarrosController(CarrosRepository repository) {
        this.repository = repository;
    }

    public String criarCarro(@RequestBody Carros carros){
        try{
            return "Carro foi adicionado no sistema" + repository.save(carros);
        }
        catch (Exception e){
            return "Dados invalidos";
        }
    }

    @GetMapping
    public List<Carros> mostrar(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Carros c ){
        Carros carro = repository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setMarca(c.getMarca());
        carro.setTipo(c.getTipo());
        carro.setImagem(c.getImagem());
        carro.setDescricao(c.getDescricao());

    }

}
