package com.atividade.demo.cotroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/")
public class ExeController {

    @GetMapping("/api")
    public String home(){
        return "Ola, Meu site em Spring Boot";

    }

    @GetMapping("/api/teste/{numUm}/{numDois}")
    public int text(@PathVariable int numUm,@PathVariable int numDois){
        int soma = numUm + numDois;
        return soma;
    }

    @GetMapping("/api/teste/{numUm}/{numDois}/{numeroDois}/{numeroUm}")
    public int text(@PathVariable double numeroUm,@PathVariable double numeroDois){
        int subitracao = numeroUm - numeroDois;
        return subitracao;
    }
    
    @GetMapping("/api/teste/{numUm}/{numDois}/{numpar}")
    public int text(@PathVariable int numpar){
        if(numpar % 2 == 1 ){

            System.out.println("Esse numero e " + numpar);


        }else{

            System.out.println("Esse numero não e par");

        }
        return numpar;
    }



}
