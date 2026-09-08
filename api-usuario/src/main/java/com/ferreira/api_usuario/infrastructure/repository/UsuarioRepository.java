package com.ferreira.api_usuario.infrastructure.repository;

import com.ferreira.api_usuario.infrastructure.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
