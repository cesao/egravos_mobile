package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * MeioDeLocomocaoVitima generated by hbm2java
 */
public class MeioDeLocomocaoVitima  extends IModel<MeioDeLocomocaoVitima> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String meioDeLocomacaoVitima;

    public MeioDeLocomocaoVitima() {
    }

    public MeioDeLocomocaoVitima(String codigo, String meioDeLocomacaoVitima) {
       this.codigo = codigo;
       this.meioDeLocomacaoVitima = meioDeLocomacaoVitima;
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
    public String getMeioDeLocomacaoVitima() {
        return this.meioDeLocomacaoVitima;
    }
    
    public void setMeioDeLocomacaoVitima(String meioDeLocomacaoVitima) {
        this.meioDeLocomacaoVitima = meioDeLocomacaoVitima;
    }

    @Override
    public void copyAttributesOf(MeioDeLocomocaoVitima copy) {
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


