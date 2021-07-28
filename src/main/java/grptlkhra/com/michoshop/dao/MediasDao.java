package grptlkhra.com.michoshop.dao;

import grptlkhra.com.michoshop.bean.Medias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediasDao extends JpaRepository<Medias,Long> {
    Medias findByRef(String ref);
    int deleteByRef(String ref);
}
