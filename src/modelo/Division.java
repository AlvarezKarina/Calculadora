package modelo;

public class Divicion extends Operacion{
    public Divicion(Numero numero1, Numero numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        if (numero2.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return numero1.getValor() / numero2.getValor();
    }
}
