package grptlkhra.com.michoshop.service.impl;

import grptlkhra.com.michoshop.bean.Orders;
import grptlkhra.com.michoshop.bean.Products;
import grptlkhra.com.michoshop.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrdersServiceImplmnt {
    public Orders findByOrderRef(String orderRef) {
        return ordersDao.findByOrderRef(orderRef);
    }

    @Transactional
    public int deleteByOrderRef(String orderRef) {
        return ordersDao.deleteByOrderRef(orderRef);
    }

    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    public int save(Orders orders) {
        if (findByOrderRef(orders.getOrderRef()) != null){
            ordersDao.save(orders);
            return 1;
        }else{
            return -1;
        }
    }

    public int update(Orders orders){
        Orders orders1 = findByOrderRef(orders.getOrderRef());
        Products products = productsServiceImplmnt.findProductsByReference(orders.getProducts().getReference());
        if(orders1 != null){
            orders1.setOrderRef(orders.getOrderRef());
            orders1.setProducts(products);
            return 1;
        }else{
            return -1;
        }
    }

    @Autowired
    OrdersDao ordersDao;
    @Autowired
    ProductsServiceImplmnt productsServiceImplmnt;


}
