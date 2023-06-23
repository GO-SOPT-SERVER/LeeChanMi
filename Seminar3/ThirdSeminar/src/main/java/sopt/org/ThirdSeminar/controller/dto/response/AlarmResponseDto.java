package sopt.org.ThirdSeminar.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AlarmResponseDto {
    private Long id;
    private Long userId;
    private String name;
    public static AlarmResponseDto of(Long id, Long userId, String name) {
        return new AlarmResponseDto(id, userId, name);
    }
}
