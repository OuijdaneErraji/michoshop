package grptlkhra.com.michoshop.dao;

import grptlkhra.com.michoshop.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client,Long> {
    Client findByFullName(String fullName);
    int deleteByFullName(String fullName);
}
