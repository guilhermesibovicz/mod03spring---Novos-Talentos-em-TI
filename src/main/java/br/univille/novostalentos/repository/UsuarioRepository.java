package br.univille.novostalentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.novostalentos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
    Usuario findByNome(String nome);
}
