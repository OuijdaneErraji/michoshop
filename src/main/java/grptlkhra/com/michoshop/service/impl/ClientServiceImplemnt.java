package grptlkhra.com.michoshop.service.impl;

import grptlkhra.com.michoshop.bean.Client;
import grptlkhra.com.michoshop.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImplemnt {
    public Client findByFullName(String fullName) {
        return clientDao.findByFullName(fullName);
    }

    public int deleteByFullName(String fullName) {
        return clientDao.deleteByFullName(fullName);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public <S extends Client> S save(S s) {
        return clientDao.save(s);
    }

    @Autowired
    ClientDao clientDao;
}
