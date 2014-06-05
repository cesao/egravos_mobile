package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0


import br.com.eagravos.mobile.interfaces.IModel;
import java.util.HashSet;
import java.util.Set;

/**
 * TiposUnidadeDAO generated by hbm2java
 */
public class TiposUnidade  extends IModel<TiposUnidade> implements java.io.Serializable {


     private Integer id;
     private String codigoTipo;
     private String descricaoTipo;
     //private Set unidadeSaudes = new HashSet(0);

    public TiposUnidade() {
    }

	
    public TiposUnidade(String codigoTipo, String descricaoTipo) {
        this.codigoTipo = codigoTipo;
        this.descricaoTipo = descricaoTipo;
    }
    public TiposUnidade(String codigoTipo, String descricaoTipo, Set unidadeSaudes) {
       this.codigoTipo = codigoTipo;
       this.descricaoTipo = descricaoTipo;
       this.unidadeSaudes = unidadeSaudes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigoTipo() {
        return this.codigoTipo;
    }
    
    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public String getDescricaoTipo() {
        return this.descricaoTipo;
    }
    
    public void setDescricaoTipo(String descricaoTipo) {
        this.descricaoTipo = descricaoTipo;
    }
    public Set getUnidadeSaudes() {
        return this.unidadeSaudes;
    }
    
    public void setUnidadeSaudes(Set unidadeSaudes) {
        this.unidadeSaudes = unidadeSaudes;
    }

    @Override
    public void copyAttributesOf(TiposUnidade copy) {
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


