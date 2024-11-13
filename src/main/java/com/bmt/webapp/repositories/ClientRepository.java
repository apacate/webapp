package com.bmt.webapp.repositories;

import com.bmt.webapp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	Client findByEmail(String email);

	@Query("SELECT COUNT(c) FROM Client c WHERE YEAR(c.createdAt) = :ano")
	Long countByYear(@Param("ano") int ano);

	@Query("SELECT COUNT(c) FROM Client c WHERE YEAR(c.createdAt) = :ano AND MONTH(c.createdAt) = :mes")
	Long countByMonth(@Param("ano") int ano, @Param("mes") int mes);
}
