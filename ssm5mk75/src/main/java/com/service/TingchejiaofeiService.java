package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchejiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchejiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchejiaofeiView;


/**
 * 停车缴费
 *
 * @author 
 * @email 
 * @date 2021-03-31 18:14:55
 */
public interface TingchejiaofeiService extends IService<TingchejiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchejiaofeiVO> selectListVO(Wrapper<TingchejiaofeiEntity> wrapper);
   	
   	TingchejiaofeiVO selectVO(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
   	
   	List<TingchejiaofeiView> selectListView(Wrapper<TingchejiaofeiEntity> wrapper);
   	
   	TingchejiaofeiView selectView(@Param("ew") Wrapper<TingchejiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchejiaofeiEntity> wrapper);
   	
}

