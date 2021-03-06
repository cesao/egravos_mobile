package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * GrauSeveridadeAcidente generated by hbm2java
 */
public class GrauSeveridadeAcidente  extends IModel<GrauSeveridadeAcidente> implements java.io.Serializable {


     private Integer id;
     private String codigo;
     private String severidade;

    public GrauSeveridadeAcidente() {
    }

    public GrauSeveridadeAcidente(String codigo, String severidade) {
       this.codigo = codigo;
       this.severidade = severidade;
    }
   
    public GrauSeveridadeAcidente(JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			this.codigo=jsonObject.getString("codigo");
			this.id=jsonObject.getInt("id");
			this.severidade=jsonObject.getString("severidade");
		}
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
    public String getSeveridade() {
        return this.severidade;
    }
    
    public void setSeveridade(String severidade) {
        this.severidade = severidade;
    }

    @Override
    public void copyAttributesOf(GrauSeveridadeAcidente copy) {
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


