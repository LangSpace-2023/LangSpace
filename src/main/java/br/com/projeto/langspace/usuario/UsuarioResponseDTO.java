package br.com.projeto.langspace.usuario;

public record UsuarioResponseDTO(Long id_registro, String nome, String usuario, String email, String senha) {

    public UsuarioResponseDTO(Usuario usuario) {
        this(usuario.getId_registro(), usuario.getNome(), usuario.getUsuario(), usuario.getEmail(), usuario.getSenha());
    }
}

