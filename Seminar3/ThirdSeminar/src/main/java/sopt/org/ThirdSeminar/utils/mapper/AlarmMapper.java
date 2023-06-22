package sopt.org.ThirdSeminar.utils.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sopt.org.ThirdSeminar.controller.dto.response.AlarmResponseDto;
import sopt.org.ThirdSeminar.domain.Alarm;

@Mapper
public interface AlarmMapper {
    AlarmMapper INSTANCE = Mappers.getMapper(AlarmMapper.class);

    @Mapping(target = "userId", expression = "java(alarm.getUser().getId())")
    AlarmResponseDto ToDto(Alarm alarm);
}
