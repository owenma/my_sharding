package com.mazhq.web.dao;

import com.mazhq.web.entity.UserAuthEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mazhq
 * @Title: UserAuthDao
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/7/30 16:43
 */
@Repository
public interface UserAuthDao extends JpaRepository<UserAuthEntity, Long> {
}
