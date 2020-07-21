package testarConexao;

import org.junit.Test;

import fabricaweb.persistencia.jdbc.SingleConnection;

public class ConexaoTest {

	
	@Test
	public void initConexao(){
		SingleConnection.getConnection();
	}
}
