package com.project.projectstarter.rest.user;

import com.project.projectstarter.common.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaSpecificationExecutor<User>, PagingAndSortingRepository<User, Long> {
}
