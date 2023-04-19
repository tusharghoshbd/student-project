package edu.miu.cs545.api.repository;


import edu.miu.cs545.api.entity.RefreshToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {
    Collection<RefreshToken> findRefreshTokenByUserNameEquals(String name);
}
