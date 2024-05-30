package swp.internmanagement.internmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swp.internmanagement.internmanagement.entity.Field;
import swp.internmanagement.internmanagement.service.FieldService;

import java.util.List;


@RestController
@RequestMapping("/internbridge/home")
public class HomeController {
    @Autowired
    private FieldService fieldService;

    @GetMapping("/field")
    public List<Field> findAll(){return fieldService.findAll();}
    }
