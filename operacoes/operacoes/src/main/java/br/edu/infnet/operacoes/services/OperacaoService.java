package br.edu.infnet.operacoes.services;

import br.edu.infnet.operacoes.dto.OperacaoDTO;
import br.edu.infnet.operacoes.models.Operacao;
import org.springframework.stereotype.Service;

@Service
public class OperacaoService {

    public String SomarOperandos(OperacaoDTO operacao) {
        Operacao op = new Operacao(operacao.getOp1(), operacao.getOp2());
        double resultado = op.Somar();

        return String.format("A soma entre %d e %d é igual a %f", op.getOp1(), op.getOp2(), resultado);
    }

    public String SubtrairOperandos(OperacaoDTO operacao) {
        Operacao op = new Operacao(operacao.getOp1(), operacao.getOp2());
        double resultado = op.Subtrair();

        return String.format("A subtração entre %d e %d é igual a %f", op.getOp1(), op.getOp2(), resultado);
    }

    public String MultiplicarOperandos(OperacaoDTO operacao) {
        Operacao op = new Operacao(operacao.getOp1(), operacao.getOp2());
        double resultado = op.Multiplicar();

        return String.format("A multiplicação entre %d e %d é igual a %f", op.getOp1(), op.getOp2(), resultado);
    }

    public String DividirOperandos(OperacaoDTO operacao) {
        if (operacao.getOp2() == 0) {
            return "Não é possível dividir por zero.";
        }

        Operacao op = new Operacao(operacao.getOp1(), operacao.getOp2());
        double resultado = op.Dividir();

        return "O resultado da divisão entre " + op.getOp1() + " e " + op.getOp2() + " é igual a " + resultado;
    }

    public String ExponenciarOperandos(OperacaoDTO operacao) {
        Operacao op = new Operacao(operacao.getOp1(), operacao.getOp2());
        double resultado = op.Exponenciar();

        return String.format("A exponeciação de %d sobre %d é igual a %f", op.getOp1(), op.getOp2(), resultado);
    }
}
