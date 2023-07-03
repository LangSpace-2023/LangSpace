package br.com.projeto.langspace.service;

import br.com.projeto.langspace.usuario.Usuario;
import br.com.projeto.langspace.usuario.UsuarioRepository;
import br.com.projeto.langspace.usuario.UsuarioUserDetailsImpl;
//import br.com.projeto.langspace.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    public ServiceUsuario(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(email);
        new UsernameNotFoundException("Usuário não encontrado!");
        return new UsuarioUserDetailsImpl(usuario);
    }

    public void salvarUsuario(Usuario usuario){
        //String hashSenha = PasswordUtil.encoder(usuario.getSenha());
        //setSenha(hashSenha);
        repository.save(usuario);
    }

    public Boolean validarSenha(Usuario usuario) {
        String senha = repository.findByEmail(usuario.getEmail()).getSenha();
        Boolean valid = senha.equals(usuario.getSenha());
        return valid;
    }

}
