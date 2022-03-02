package com.example.demo.res;

import com.example.demo.entity.MouldEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsRepository extends ElasticsearchRepository<MouldEntity, Integer> {


    Page<MouldEntity> findByNameOrTagsLike(String keyword, String keyword1, PageRequest pageRequest);

    Page<MouldEntity> findAllBy(PageRequest pageRequest);

    void deleteAll();
}