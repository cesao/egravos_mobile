package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * Perfil generated by hbm2java
 */
public class Perfil  extends IModel<Perfil> implements java.io.Serializable {


     private Long idPerfil;
     private String descricao;

    public Perfil() {
    }

    public Perfil(String descricao) {
       this.descricao = descricao;
    }
   
    public Long getIdPerfil() {
        return this.idPerfil;
    }
    
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void copyAttributesOf(Perfil copy) {
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


