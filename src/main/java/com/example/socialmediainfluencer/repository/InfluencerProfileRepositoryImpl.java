package com.example.socialmediainfluencer.repository;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class InfluencerProfileRepositoryImpl implements InfluencerProfileRepository {


    @Override
    public InfluencerProfile deleteById(Long id) {
        InfluencerProfileEntity profileEntity =
                (findById(String.valueOf(id)) != null) ?
                        findById(String.valueOf(id)).get() : new InfluencerProfileEntity();

        if (profileEntity != null) {
            deleteById(String.valueOf(id));
            InfluencerProfile profile = new InfluencerProfile();
            BeanUtils.copyProperties(profileEntity, profile);
            return profile;
        }
        return new InfluencerProfile();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends InfluencerProfileEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<InfluencerProfileEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public InfluencerProfileEntity getOne(String s) {
        return null;
    }

    @Override
    public InfluencerProfileEntity getById(String s) {
        return null;
    }

    @Override
    public InfluencerProfileEntity getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends InfluencerProfileEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends InfluencerProfileEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends InfluencerProfileEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends InfluencerProfileEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<InfluencerProfileEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<InfluencerProfileEntity> findAll() {
        return null;
    }

    @Override
    public List<InfluencerProfileEntity> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(InfluencerProfileEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends InfluencerProfileEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<InfluencerProfileEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<InfluencerProfileEntity> findAll(Pageable pageable) {
        return null;
    }
}
