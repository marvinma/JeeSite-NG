/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author ThinkGem
 * @version 2016-03-30
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}