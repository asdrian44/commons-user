package com.argo.user_commons.User.domain.repositroy;


import com.argo.user_commons.User.domain.User;
import com.argo.user_commons.User.domain.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDetails  extends JpaRepository<UserDetails, User> {
}
