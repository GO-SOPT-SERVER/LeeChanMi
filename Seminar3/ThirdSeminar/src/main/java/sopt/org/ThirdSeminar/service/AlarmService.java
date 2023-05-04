package sopt.org.ThirdSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.ThirdSeminar.controller.dto.response.AlarmResponseDto;
import sopt.org.ThirdSeminar.domain.Alarm;
import sopt.org.ThirdSeminar.domain.User;
import sopt.org.ThirdSeminar.infrastructure.AlarmRepository;
import sopt.org.ThirdSeminar.infrastructure.UserRepository;
import sopt.org.ThirdSeminar.utils.mapper.AlarmMapper;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlarmService {
    private final AlarmRepository alarmRepository;
    private final UserRepository userRepository;
    @Transactional
    public Long createAlarm(Long id, String name) {
        User user = userRepository.findUserById(id);

        Alarm alarm = Alarm.builder()
                .user(user)
                .name(name)
                .build();

        alarmRepository.save(alarm);

        return alarm.getId();
    }

    public List<AlarmResponseDto> getAlarmByUserId(Long userId) {
        List<Alarm> alarmList = alarmRepository.findByUserId(userId);

        ArrayList<AlarmResponseDto> alarmResponseDtoList = new ArrayList<>();
        for(Alarm alarm : alarmList) {
            alarmResponseDtoList.add(
                    AlarmMapper.INSTANCE.ToDto(alarm)
            );
        }

        return alarmResponseDtoList;
    }

    public Alarm getAlarmById(Long alarmId) {
        Alarm alarm = alarmRepository.findById(alarmId).orElseGet(() -> {return null;});
        return alarm;
    }
}
