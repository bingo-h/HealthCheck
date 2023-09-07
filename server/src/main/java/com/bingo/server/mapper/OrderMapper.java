package com.bingo.server.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

	Integer getOrdersDoneByUserId(String userId);
}
