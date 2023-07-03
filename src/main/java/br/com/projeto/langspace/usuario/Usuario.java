package br.com.projeto.langspace.usuario;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuario", schema = "langspace")
@Entity(name = "usuario")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id_registro")
public class Usuario {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Long id_registro;
    @Column(name = "nome", length = 200)
    private String nome;
    @Column(name = "usuario", length = 200)
    private String usuario;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "senha", length = 100)
    private String senha;

    public Usuario(DadosCadastroUsuario data) {
        this.nome = data.nome();
        this.usuario = data.usuario();
        this.email = data.email();
        this.senha = data.senha();
    }

}

