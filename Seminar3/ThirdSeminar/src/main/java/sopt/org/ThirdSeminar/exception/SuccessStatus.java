package sopt.org.ThirdSeminar.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {

    /*
    user
     */
    GET_SUCCESS(HttpStatus.OK, "조회 성공"),
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입이 완료되었습니다."),
    CREATE_ALARM_SUCCESS(HttpStatus.CREATED, "알람 생성 완료"),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}