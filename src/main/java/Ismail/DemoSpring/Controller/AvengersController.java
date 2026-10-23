package Ismail.DemoSpring.Controller;


import Ismail.DemoSpring.Model.AvengersModel;
import Ismail.DemoSpring.Service.AvengersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AvengersController {

    @Autowired
    AvengersService avengersService;

    @GetMapping("/home")
    public String allAvengers(){
        return "Avengers assemble";
    }

    @GetMapping("/avengers")
    public List<AvengersModel> avengers(){
         return  avengersService.getall();
    }

    @GetMapping("/{id}")
    public AvengersModel getByid(@PathVariable("id") int no){
        return avengersService.getbyID(no);
    }

    @PostMapping("/add")
    public String addedAvengers(@RequestBody AvengersModel avengersModel){
        return avengersService.addtheAvengers(avengersModel);
    }

    @PutMapping("/")
    public String update(@RequestBody AvengersModel avengersModel){
        return  avengersService.update(avengersModel);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return avengersService.deleteId(id);
    }


}
