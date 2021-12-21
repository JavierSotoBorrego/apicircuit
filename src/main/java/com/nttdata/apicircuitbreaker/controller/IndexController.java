package com.nttdata.apicircuitbreaker.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
//import com.nttdata.starter.Saludo;
 
@RestController
public class IndexController {
 
    @Autowired
    private starter.saludo saludo;

    @GetMapping("/saludo")
    public ResponseEntity<String> saludo(){
        return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
    }
}