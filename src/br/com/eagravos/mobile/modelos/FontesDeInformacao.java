package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * FontesDeInformacao generated by hbm2java
 */
public class FontesDeInformacao  extends IModel<FontesDeInformacao> implements java.io.Serializable {


     private Integer id;
     private String fonte;

    public FontesDeInformacao() {
    }

    public FontesDeInformacao(String fonte) {
       this.fonte = fonte;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFonte() {
        return this.fonte;
    }
    
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public void copyAttributesOf(FontesDeInformacao copy) {
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


