/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author s109e8
 */
public class MyNumberException {
    
    private int codigoError;
    
    
    public MyNumberException(int codigoError){
        
        
        this.codigoError = codigoError;
        
        
    }

    MyNumberException(CodigoErrores codigoErrores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getMessage(){
        if(this.codigoError == CodigoErrores.POSITIVOS){
            return "Error, solo se permiten numeros positivos";
        }
        // Codigo 200: para numeros pares
        if(this.codigoError == CodigoErrores.PARES){
            return "Error, solo se permiten numeros positivos";
        }
        // Codigo 300: para numeros impares
        if(this.codigoError == CodigoErrores.IMPARES){
            return "Error, solo se permiten numeros positivos";
        }
        
        return "Error no definido";
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }
    
}
