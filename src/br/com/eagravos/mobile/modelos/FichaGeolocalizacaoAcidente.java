package br.com.eagravos.mobile.modelos;
// Generated 02/06/2014 08:44:54 by Hibernate Tools 3.6.0

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.interfaces.IModel;




/**
 * FichaGeolocalizacaoAcidente generated by hbm2java
 */
public class FichaGeolocalizacaoAcidente  extends IModel<FichaGeolocalizacaoAcidente> implements java.io.Serializable {


     private int fichaAcidenteIdAcidentadoId;
     private String latitude;
     private String longitude;
     private String idAparelhoNotificador;

    public FichaGeolocalizacaoAcidente() {
    }

    public FichaGeolocalizacaoAcidente(int fichaAcidenteIdAcidentadoId, String latitude, String longitude, String idAparelhoNotificador) {
       this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
       this.latitude = latitude;
       this.longitude = longitude;
       this.idAparelhoNotificador = idAparelhoNotificador;
    }
   
    public FichaGeolocalizacaoAcidente(JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			
			this.fichaAcidenteIdAcidentadoId=jsonObject.getInt("fichaAcidenteIdAcidentadoId");
			this.idAparelhoNotificador=jsonObject.getString("idAparelhoNotificador");
			this.latitude=jsonObject.getString("latitude");
			this.longitude=jsonObject.getString("longitude");
		}
	}

	public int getFichaAcidenteIdAcidentadoId() {
        return this.fichaAcidenteIdAcidentadoId;
    }
    
    public void setFichaAcidenteIdAcidentadoId(int fichaAcidenteIdAcidentadoId) {
        this.fichaAcidenteIdAcidentadoId = fichaAcidenteIdAcidentadoId;
    }
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getIdAparelhoNotificador() {
        return this.idAparelhoNotificador;
    }
    
    public void setIdAparelhoNotificador(String idAparelhoNotificador) {
        this.idAparelhoNotificador = idAparelhoNotificador;
    }

    @Override
    public void copyAttributesOf(FichaGeolocalizacaoAcidente copy) {
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



    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.latitude+" --- "+this.longitude;
    }

}


