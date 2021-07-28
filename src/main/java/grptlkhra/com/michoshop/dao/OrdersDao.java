package grptlkhra.com.michoshop.dao;

import grptlkhra.com.michoshop.bean.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao extends JpaRepository<Orders,Long> {
    Orders findByOrderRef(String orderRef);
    int deleteByOrderRef(String orderRef);

}
