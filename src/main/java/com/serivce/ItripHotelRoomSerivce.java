package com.serivce;

import com.po.ItripHotelRoom;
import com.util.vo.ItripHotelRoomVO;
import com.util.vo.ItripImageVO;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface ItripHotelRoomSerivce {
    public ItripHotelRoom getItripHotelRoomById( Long id)throws Exception;
    //根据酒店房型ID查询酒店房型图片
    public List<ItripImageVO> getimg(Long targetId)throws Exception;
    //查询酒店房间列表
    public List<ItripHotelRoomVO> getItripHotelRoomListByMap(Map<String, Object> param)throws Exception;
    //查询酒店床型列表
}
