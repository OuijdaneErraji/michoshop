package grptlkhra.com.michoshop.service.impl;

import grptlkhra.com.michoshop.bean.Medias;
import grptlkhra.com.michoshop.bean.Products;
import grptlkhra.com.michoshop.dao.MediasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MediasServiceImplemnt {
    public Medias findByRef(String ref) {
        return mediasDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        return mediasDao.deleteByRef(ref);
    }

    public List<Medias> findAll() {
        return mediasDao.findAll();
    }

    public int save(Medias medias) {
        if (findByRef(medias.getRef()) != null){
            mediasDao.save(medias);
            return 1;
        }else{
            return -1;
        }
    }
    public int update(Medias medias){
        Medias medias1 = findByRef(medias.getRef());
        Products products = productsServiceImplmnt.findProductsByReference(medias.getProducts().getReference());
        if (medias1 != null){
            medias1.setRef(medias.getRef());
            medias1.setProducts(products);
            return 1;
        }else {
            return -1;
        }
    }

    @Autowired
    MediasDao mediasDao;
    @Autowired
    ProductsServiceImplmnt productsServiceImplmnt;
}
