package org.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.team.dto.ReservationDTO;

public interface ReservationMapper {

		// @Select("select * from customer where rnum > 0")
		public List<ReservationDTO> getList();
}