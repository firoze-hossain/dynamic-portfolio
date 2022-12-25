package com.portfolio.service;

import com.portfolio.entity.GenericUserData;

import java.util.List;
import java.util.Optional;

public interface GenericUserDataService {
    <T extends GenericUserData> List<T> getAllObjects(Long id, Class T);

    <T extends GenericUserData> Optional<T> getObject(Long id, Long objectId, Class T);

    <T extends GenericUserData> T postObject(Long id, T object);

    <T extends GenericUserData> T putObject(Long id, Long objectId, T object);

    <T extends GenericUserData> void deleteObject(Long id, Long objectId, Class T);
}
