package ar.edu.ubp.das.daos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.edu.ubp.das.beans.TipoServicioBean;
import ar.edu.ubp.das.db.Dao;


public class MSSQLTiposServiciosDao extends Dao<TipoServicioBean,Void,Void> {
	
	@Override
	public List<TipoServicioBean> select(Void arg0) throws SQLException {
		this.connect();
		this.setProcedure("dbo.get_tipos_servicios");
		return this.executeQuery();
	}

	@Override
	public TipoServicioBean delete(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoServicioBean insert(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoServicioBean make(ResultSet datoTemporal) throws SQLException {
		// 
		TipoServicioBean dato = new TipoServicioBean();
		dato.setCodTipoServicio( datoTemporal.getString("codTipoServicio") );
		dato.setTipoServicio( datoTemporal.getString("tipoServicio") );
		return dato;
	}

	@Override
	public TipoServicioBean update(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean valid(Void arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
