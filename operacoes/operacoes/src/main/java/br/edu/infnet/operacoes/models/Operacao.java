package br.edu.infnet.operacoes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operacao {

    private int op1;
    private int op2;

    public int Somar() {
        return op1 + op2;
    }

    public int Subtrair() {
        return op1 - op2;
    }

    public int Multiplicar() {
        return op1 * op2;
    }

    public int Dividir() {
        return op1 / op2;
    }

    public double Exponenciar() {
        return Math.pow(op1, op2);
    }
}
