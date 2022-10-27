package tutorial.misionTIC.seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import tutorial.misionTIC.seguridad.models.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String>{
}
