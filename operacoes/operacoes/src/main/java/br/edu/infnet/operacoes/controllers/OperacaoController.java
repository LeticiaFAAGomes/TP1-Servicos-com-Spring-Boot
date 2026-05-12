package br.edu.infnet.operacoes.controllers;

import br.edu.infnet.operacoes.dto.OperacaoDTO;
import br.edu.infnet.operacoes.services.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/op")
public class OperacaoController {

    @Autowired
    private OperacaoService operacaoService;

    @GetMapping("/somar")
    public String Somar(@RequestParam int op1, @RequestParam int op2) {

        OperacaoDTO dto = new OperacaoDTO(op1, op2);

        return operacaoService.SomarOperandos(dto);
    }

    @PostMapping("/somar")
    public String Somar(@RequestBody OperacaoDTO operacao) {

        return operacaoService.SomarOperandos(operacao);
    }

    @GetMapping("/subtrair")
    public String Subtrair(@RequestParam int op1, @RequestParam int op2) {

        OperacaoDTO dto = new OperacaoDTO(op1, op2);
        return operacaoService.SubtrairOperandos(dto);
    }

    @PostMapping("/subtrair")
    public String Subtrair(@RequestBody OperacaoDTO operacao) {

        return operacaoService.SubtrairOperandos(operacao);
    }

    @GetMapping("/multiplicar")
    public String Multiplicar(@RequestParam int op1, @RequestParam int op2) {

        OperacaoDTO dto = new OperacaoDTO(op1, op2);
        return operacaoService.MultiplicarOperandos(dto);
    }

    @PostMapping("/multiplicar")
    public String Multiplicar(@RequestBody OperacaoDTO operacao) {

        return operacaoService.MultiplicarOperandos(operacao);
    }

    @GetMapping("/dividir")
    public String Dividir(@RequestParam int op1, @RequestParam int op2) {

        OperacaoDTO dto = new OperacaoDTO(op1, op2);
        return operacaoService.DividirOperandos(dto);
    }

    @PostMapping("/dividir")
    public String Dividir(@RequestBody OperacaoDTO operacao) {

        return operacaoService.DividirOperandos(operacao);
    }

    @GetMapping("/exponenciar")
    public String Exponenciar(@RequestParam int op1, @RequestParam int op2) {

        OperacaoDTO dto = new OperacaoDTO(op1, op2);
        return operacaoService.ExponenciarOperandos(dto);
    }

    @PostMapping("/exponenciar")
    public String Exponenciar(@RequestBody OperacaoDTO operacao) {

        return operacaoService.ExponenciarOperandos(operacao);
    }
}
