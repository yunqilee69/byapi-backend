package icu.yunke.byapi.common.exception;

import cn.dev33.satoken.exception.SaTokenException;
import icu.yunke.byapi.common.web.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

/**
 * @author yunqilee
 * @version 1.0
 * @date 2024/12/8 22:07
 * @description: 全局异常处理器，返回错误到前端
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 兜底异常
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result<String> handleRuntimeException(Exception e) {
        e.printStackTrace();
        return Result.fail("系统执行出错");
    }

    /**
     * 统一捕获sql异常
     */
    @ResponseBody
    @ExceptionHandler(SQLException.class)
    public Result<String> handleSqlException(SQLException e) {
        e.printStackTrace();
        return Result.fail("数据库执行出错");
    }

    /**
     * 捕获业务异常
     */
    @ResponseBody
    @ExceptionHandler(BizException.class)
    public Result<String> handleBaseException(BizException e) {
        e.printStackTrace();
        return Result.fail(e.getMessage());
    }

    /**
     * 捕获权限异常
     */
    @ResponseBody
    @ExceptionHandler(SaTokenException.class)
    public ResponseEntity<Result<String>> handleBaseException(SaTokenException e) {
        e.printStackTrace();
        Result<String> result = Result.fail(e.getMessage());
        // 设置状态码为401
        return new ResponseEntity<>(result, HttpStatus.UNAUTHORIZED);
    }
}
