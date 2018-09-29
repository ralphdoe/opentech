package com.pyxisportal.opentech.repositories;

import com.pyxisportal.opentech.models.Talk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TalkJpaRepository extends JpaRepository<Talk, Long> {
    Talk findByName(String name);
}
