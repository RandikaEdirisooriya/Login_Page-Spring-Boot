package lk.ijse.login.repo;

import lk.ijse.login.entity.Citizan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CitizanRepo extends JpaRepository<Citizan,Integer> {



    @Query(value = "SELECT * FROM citizan WHERE id=?1 AND password =?2", nativeQuery = true)
    Citizan findByFirstNameAndPassword(String id,String password);


}
