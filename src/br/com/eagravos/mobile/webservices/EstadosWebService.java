package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.Estados;

public class EstadosWebService extends BaseWebService<Estados>{

	@Override
	protected String getResourceId() {
		// TODO Auto-generated method stub
		return "webServiceEstado";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "Estado";
	}

	@Override
	protected Estados getModel(JSONObject jsonObject) throws JSONException {
		// TODO Auto-generated method stub
		if (jsonObject!= null){

			return new Estados(jsonObject);
		}
		return null;
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "estados";
	}

}
