package com.o2o.action.server.repository;

import com.o2o.action.server.model.UserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, String> {
        List<UserInfo> findAll();
}

