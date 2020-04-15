package src;

/**
 * Write a description of class NumeroRacional here.
 * 
 * @author Mario H. Adaniya
 * @version 0.1
 */
public class NumeroRacional
{
    // instance variables - replace the example below with your own
    private int numerador;
    private int denominador;

    /**
     * Constructor for objects of class NumeroRacional
     */
    public NumeroRacional(int _numerador, int _denominador)
    {
        this.numerador = _numerador;
        this.denominador = _denominador;
    }
    
    public NumeroRacional sum(NumeroRacional _num){
        NumeroRacional result = new NumeroRacional(
            (this.numerador * _num.denominador) +
            (this.denominador * _num.numerador),
            (this.denominador * _num.denominador)
        );
        return result;
    }
    
    public NumeroRacional sub(NumeroRacional _num){
        NumeroRacional result = new NumeroRacional(
            (this.numerador * _num.denominador) -
            (this.denominador * _num.numerador),
            (this.denominador * _num.denominador)
        );
        return result;
    }

    public NumeroRacional mul(NumeroRacional _num){        
        return null;
    }

    public NumeroRacional div(NumeroRacional _num){        
        return null;
    }

    public NumeroRacional simplify(){
        return null;
    }
    
    public float toFloat(){
        return 0;
    }


    public int getNumerador(){
        return this.numerador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
        
}
