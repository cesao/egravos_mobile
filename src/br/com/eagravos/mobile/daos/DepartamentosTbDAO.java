package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.DepartamentosTb;

public class DepartamentosTbDAO  extends GenericDb4oDAO<DepartamentosTb>{

	@Override
	protected Query getQueryToUniqueObject(DepartamentosTb model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(DepartamentosTb.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
