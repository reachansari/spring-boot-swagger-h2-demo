package com.progressivecoder.demo.springbootstarter.repositories;

import com.progressivecoder.demo.springbootstarter.entities.Mobile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "mobiles", path = "mobiles")
public interface MobileRepository extends CrudRepository<Mobile, UUID> {

    List<Mobile> findByMake(@Param("make") String make);
}
