package com.mycompany.santo.terco.repository;

import com.mycompany.santo.terco.mural.Intencao;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntencaoJpaRepository extends JpaRepository<Intencao, Long> {

    @Query("SELECT i FROM Intencao i ORDER BY i.criadoEm DESC")
    List<Intencao> findRecentes(Pageable pageable);

    @Query("SELECT i.id FROM Intencao i ORDER BY i.criadoEm DESC")
    List<Long> findAllIdsOrdered();

    default List<Long> findExcedentes(int limite) {
        List<Long> allIds = findAllIdsOrdered();
        if (allIds.size() <= limite) return List.of();
        return allIds.subList(limite, allIds.size());
    }

    @Modifying
    @Query("DELETE FROM Intencao i WHERE i.id IN :ids")
    void deleteByIds(@Param("ids") List<Long> ids);
}
