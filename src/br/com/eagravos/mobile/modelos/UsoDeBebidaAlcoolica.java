package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * UsoDeBebidaAlcoolica generated by hbm2java
 */
public class UsoDeBebidaAlcoolica  extends IModel<UsoDeBebidaAlcoolica> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String usoDeBebidaAlcoolica;

    public UsoDeBebidaAlcoolica() {
    }

    public UsoDeBebidaAlcoolica(String codigo, String usoDeBebidaAlcoolica) {
       this.codigo = codigo;
       this.usoDeBebidaAlcoolica = usoDeBebidaAlcoolica;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getUsoDeBebidaAlcoolica() {
        return this.usoDeBebidaAlcoolica;
    }
    
    public void setUsoDeBebidaAlcoolica(String usoDeBebidaAlcoolica) {
        this.usoDeBebidaAlcoolica = usoDeBebidaAlcoolica;
    }

    @Override
    public void copyAttributesOf(UsoDeBebidaAlcoolica copy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsetAttributes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanStringWithNull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String label() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


