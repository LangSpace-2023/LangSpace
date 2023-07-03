package br.com.projeto.langspace.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("select i from usuario i where i.email = :email")
    public Usuario findByEmail(String email);
}