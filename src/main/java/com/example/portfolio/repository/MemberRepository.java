package com.example.portfolio.repository;

import com.example.portfolio.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Page<Member> findById(String id, Pageable pageable );

    @Transactional
    @Modifying
    @Query( "UPDATE Member m SET m.name = :name, m.age = :age WHERE m.num = :num" )
    int updateMemberQuery(@Param("num") int num, @Param("name") String name, @Param("age") int age );

}
