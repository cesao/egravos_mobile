package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * DesrespeitoSemaforo generated by hbm2java
 */
public class DesrespeitoSemaforo  extends IModel<DesrespeitoSemaforo> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String desrespeitoSemaforo;

    public DesrespeitoSemaforo() {
    }

    public DesrespeitoSemaforo(String codigo, String desrespeitoSemaforo) {
       this.codigo = codigo;
       this.desrespeitoSemaforo = desrespeitoSemaforo;
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
    public String getDesrespeitoSemaforo() {
        return this.desrespeitoSemaforo;
    }
    
    public void setDesrespeitoSemaforo(String desrespeitoSemaforo) {
        this.desrespeitoSemaforo = desrespeitoSemaforo;
    }

    @Override
    public void copyAttributesOf(DesrespeitoSemaforo copy) {
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

