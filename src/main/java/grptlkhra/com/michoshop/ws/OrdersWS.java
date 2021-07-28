package grptlkhra.com.michoshop.ws;


import grptlkhra.com.michoshop.bean.Orders;
import grptlkhra.com.michoshop.service.impl.OrdersServiceImplmnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("mishoShop/orders")
public class OrdersWS {
    @GetMapping("/orderRef/{orderRef}")
    public Orders findByOrderRef(@PathVariable String orderRef) {
        return ordersServiceImplmnt.findByOrderRef(orderRef);
    }

    @DeleteMapping("/orderRef/{orderRef}")
    public int deleteByOrderRef(@PathVariable String orderRef) {
        return ordersServiceImplmnt.deleteByOrderRef(orderRef);
    }

    @GetMapping("/")
    public List<Orders> findAll() {
        return ordersServiceImplmnt.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Orders orders) {
        return ordersServiceImplmnt.save(orders);
    }

    @PutMapping("/orders/{orders}")
    public int update(@RequestBody Orders orders) {
        return ordersServiceImplmnt.update(orders);
    }

    @Autowired
    OrdersServiceImplmnt ordersServiceImplmnt;
}
