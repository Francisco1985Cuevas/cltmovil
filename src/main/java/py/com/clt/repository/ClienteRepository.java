package py.com.clt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.clt.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
