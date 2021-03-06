package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * CadastroAgravosId generated by hbm2java
 */
public class CadastroAgravosId  extends IModel<CadastroAgravosId> implements java.io.Serializable{


     private int id;
     private int sistemasDeInformacaoId;

    public CadastroAgravosId() {
    }

    public CadastroAgravosId(int id, int sistemasDeInformacaoId) {
       this.id = id;
       this.sistemasDeInformacaoId = sistemasDeInformacaoId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getSistemasDeInformacaoId() {
        return this.sistemasDeInformacaoId;
    }
    
    public void setSistemasDeInformacaoId(int sistemasDeInformacaoId) {
        this.sistemasDeInformacaoId = sistemasDeInformacaoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CadastroAgravosId) ) return false;
		 CadastroAgravosId castOther = ( CadastroAgravosId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getSistemasDeInformacaoId()==castOther.getSistemasDeInformacaoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getSistemasDeInformacaoId();
         return result;
   }   

    @Override
    public void copyAttributesOf(CadastroAgravosId copy) {
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


