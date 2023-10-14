package br.com.rhomulomourao.todolist.user;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


// interface é so a interpretação dos metodos ja a class tem os metodos com implementação 
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
    
}
