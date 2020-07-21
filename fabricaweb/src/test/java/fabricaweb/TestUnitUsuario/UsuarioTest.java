package fabricaweb.TestUnitUsuario;

import java.sql.SQLException;

import org.junit.Test;

import fabricaweb.entidade.Usuario;
import fabricaweb.persistencia.jdbc.UsuarioDao;

public class UsuarioTest {

	@Test
   public void salvar() throws SQLException{
	   
	   Usuario usuario = new Usuario();
	   usuario.setNome("jamille nascimento");
	   usuario.setLogin("jamille2020");
	   usuario.setSenha("2020");
	   
	   UsuarioDao dao = new UsuarioDao();
	   dao.cadastrar(usuario);
	   
	   
	   //dao.salvar(usuario);
   }
}
