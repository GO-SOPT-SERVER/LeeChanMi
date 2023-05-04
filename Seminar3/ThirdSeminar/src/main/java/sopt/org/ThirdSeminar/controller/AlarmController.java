package sopt.org.ThirdSeminar.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.ThirdSeminar.common.dto.ApiResponseDto;
import sopt.org.ThirdSeminar.controller.dto.response.AlarmResponseDto;
import sopt.org.ThirdSeminar.domain.Alarm;
import sopt.org.ThirdSeminar.exception.SuccessStatus;
import sopt.org.ThirdSeminar.service.AlarmService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alarms")
public class AlarmController {
    private final AlarmService alarmService;

    // 알람 생성
    @PostMapping("")
    public ApiResponseDto<Long> createAlarm(@RequestParam Long userId, @RequestParam String name) {
        return ApiResponseDto.success(SuccessStatus.CREATE_ALARM_SUCCESS, alarmService.createAlarm(userId, name));
    }

    // 유저 아이디로 알람 가져오기
    @GetMapping("")
    public ApiResponseDto<List<AlarmResponseDto>> getAlarmByUserId(@RequestParam Long userId) {
        return ApiResponseDto.success(SuccessStatus.GET_SUCCESS, alarmService.getAlarmByUserId(userId));
    }

    // 아이디로 알람 가져오기
    @GetMapping("/{alarmId}")
    public ApiResponseDto<Alarm> getAlarmById(@PathVariable Long alarmId) {
        return ApiResponseDto.success(SuccessStatus.GET_SUCCESS, alarmService.getAlarmById(alarmId));
    }
}
