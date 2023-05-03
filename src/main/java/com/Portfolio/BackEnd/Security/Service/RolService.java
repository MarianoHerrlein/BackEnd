package com.Portfolio.BackEnd.Security.Service;


import com.Portfolio.BackEnd.Security.Entity.Rol;
import com.Portfolio.BackEnd.Security.Enums.RolNombre;
import com.Portfolio.BackEnd.Security.Repository.iRolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getbyRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
