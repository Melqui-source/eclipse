package fabricaweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fabricaweb.entidade.Usuario;

public class UsuarioDao {

	private Connection connection;

	public UsuarioDao() {
		connection = SingleConnection.getConnection();
	}

	public void cadastrar(Usuario usuario) throws SQLException {

		String sql = "insert into usuario(nome, login,senha) values(?,?,?)";
		try {

			PreparedStatement preparador = connection.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());

			preparador.execute();
			preparador.close();
			connection.commit();
			

		} catch (Exception e) {
			connection.rollback();
			e.printStackTrace();
		}
	}
}
